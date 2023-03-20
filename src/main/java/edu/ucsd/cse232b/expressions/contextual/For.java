package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.conditions.AndC;
import edu.ucsd.cse232b.conditions.Condition;
import edu.ucsd.cse232b.conditions.SubsetCond;
import edu.ucsd.cse232b.conditions.xEqxC;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.*;
import java.util.stream.IntStream;

public class For implements ContextExp{
    public final List<Var> for_vars;
    public final List<ContextExp> for_exp;
    public final ContextExp let_exp;
    public Condition cond;
    public ContextExp ret;

    public final Set<String> deps;


    public For(List<Var> for_vars, List<ContextExp> for_exp, ContextExp let_exp, Condition cond, ContextExp ret) {
        this.for_vars = for_vars;
        this.for_exp = for_exp;
        this.let_exp = let_exp;
        this.cond = cond;
        this.ret = ret;

        this.deps = new HashSet<>();
        for (int i = 0; i < for_exp.size(); i++) {
            this.deps.add(for_vars.get(i).toString());
            this.deps.addAll(for_exp.get(i).getDeps());
        }
        if (let_exp != null) {
            this.deps.addAll(let_exp.getDeps());
        }
    }

    private List<Node> iterate(Stack<Context> c, Document doc, int idx) throws Exception {
        Context newContext = new Context(c.peek());
        c.push(newContext);
        List<Node> res = new ArrayList<>();
        List<Node> values = for_exp.get(idx).solve(c, doc);
        for (Node value : values) {
            c.peek().putVar(for_vars.get(idx).toString(), List.of(value));
            if (idx == (this.for_vars.size() - 1)) {
                if (let_exp != null) {
                    let_exp.solve(c, doc); // add more vars
                }
                if (cond == null || cond.solve(c, doc)) {
                    res.addAll(ret.solve(c, doc));
                }
            } else {
                res.addAll(iterate(c, doc, idx + 1));
            }
        }
        c.pop();
        return res;
    }

    @Override
    public List<Node> solve(Stack<Context> c, Document doc) throws Exception {
        return iterate(c, doc, 0);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("for ");
        res.append(this.for_vars.get(0).toString()).append(" in ").append(this.for_exp.get(0).toString());
        for (int i = 1; i < this.for_vars.size(); i++) {
            res.append(", \n").append(this.for_vars.get(i).toString()).append(" in ").append(this.for_exp.get(i).toString());
        }
        if (this.let_exp != null) res.append(" \n").append(this.let_exp);
        if (this.cond != null) res.append(" \nwhere ").append(this.cond);
        res.append(" \nreturn ").append(this.ret.toString());
        return res.toString();
    }

    @Override
    public Set<String> getDeps() {
        return this.deps;
    }


    @Override
    public String rewrite() {
        if (!(this.cond instanceof SubsetCond)) {
            throw new RuntimeException("Condition does not satisfy subset grammar");
        }
        List<List<ContextExp>> compares = ((SubsetCond)cond).getEqCompares();

        Map<String, Integer> varToIdx = new HashMap<>();
        for (int i = 0; i < this.for_vars.size(); i++) {
            varToIdx.put(this.for_vars.get(i).toString(), i); // variable to index
        }

        UnionFind uf = new UnionFind(this.for_vars.size());
        gen_graph(uf, varToIdx);
        List<Set<Integer>> dep_groups = getDepGroups(uf, varToIdx, compares);
        Map<Integer, For> groups = getGroups(uf, dep_groups, compares);
        Map<Integer, ContextExp> joined = doJoins(uf, groups, dep_groups, compares);

        List<Var> tupleVars = new ArrayList<>();
        List<ContextExp> tupleExps= new ArrayList<>();
        for (Map.Entry<Integer, ContextExp> m: joined.entrySet()) {
            tupleVars.add(new Var("tuple"+ uf.find(m.getKey())));
            tupleExps.add(m.getValue());
        }
        // Condition on the join will always be nil, since we cant define variables outside for

        String tupleReturn = this.ret.rewrite();
        System.out.println(tupleReturn);
        for (int i = 0; i < this.for_vars.size(); i++) { // hack
            Var v = this.for_vars.get(i);
            System.out.println(v.toString());
             tupleReturn = tupleReturn.replace(v.toString(),  "$tuple"+ uf.find(i)+ "/" + v.getVarName() + "/*");
        }

        StringBuilder res = new StringBuilder("for ");
        res.append(tupleVars.get(0).toString()).append(" in ").append(tupleExps.get(0).toString());
        for (int i = 1; i < tupleVars.size(); i++) {
            res.append(", \n").append(tupleVars.get(i).toString()).append(" in ").append(tupleExps.get(i).toString());
        }
        res.append(" \n");
        res.append("return ").append(tupleReturn);
        return res.toString();
    }

    private void mergeExp(Var var, ContextExp exp) {
        this.for_vars.add(var);
        this.for_exp.add(exp);
    }

    private void mergeCond(SubsetCond ncond) {
        if (this.cond == null) {
             this.cond = ncond;
             return;
        }
        this.cond = new AndC(this.cond, ncond);
    }

    private void mergeRet(ContextExp nret) {
        if (this.ret == null) {
            this.ret = nret;
            return;
        }
        this.ret = new Comma(this.ret, nret);
    }

    private List<Set<Integer>> getDepGroups(UnionFind uf, Map<String, Integer> varToIdx, List<List<ContextExp>> compares) {
        List<Set<Integer>> joins = new ArrayList<>();
        for (List<ContextExp> p: compares) {
            int dep1 = varToIdx.containsKey(p.get(0).toString()) ? uf.find(varToIdx.get(p.get(0).toString())) : -1;
            int dep2 = varToIdx.containsKey(p.get(1).toString()) ? uf.find(varToIdx.get(p.get(1).toString())) : -1;
            Set<Integer> s = new HashSet<>();
            if (dep1 == -1 && dep2 == -1) s.add(-1);
            else if (dep1 == -1 ) s.add(dep2);
            else if (dep2 == -1) s.add(dep1);
            else {
                s.add(dep1);
                s.add(dep2);
            }
            joins.add(s);
        }
        return joins;
    }

    private Map<Integer, ContextExp> doJoins(UnionFind uf, Map<Integer, For> groups, List<Set<Integer>> dep_groups, List<List<ContextExp>> compares) {
        Map<Set<Integer>, List<List<ContextExp>>> join_map = new HashMap<>();

        Map<Integer, ContextExp> res = new HashMap<>(groups);
        // get group to variable mapping for joins
        for (int i = 0; i < dep_groups.size(); i++) {
            Set<Integer> join_parents = dep_groups.get(i);
            if (join_parents.size() == 2) {
                List<ContextExp> compare_pair= compares.get(i);
                if (!join_map.containsKey(join_parents)) join_map.put(join_parents, new ArrayList<>());
                join_map.get(join_parents).add(compare_pair);
            }
        }

        for (Map.Entry<Set<Integer>, List<List<ContextExp>>> g1g2: join_map.entrySet()) {
            List<Integer> arr = new ArrayList<>(g1g2.getKey());
            arr.set(0, uf.find(arr.get(0)));
            arr.set(1, uf.find(arr.get(1)));
            // if a merge happened before, e.g (1,2), (2,3), (3, 1){1 and 3 are already merged}
            if (!uf.union(arr.get(0), arr.get(1))) {
                continue;
            }
            List<String> attr1 = new ArrayList<>(), attr2 = new ArrayList<>();
            g1g2.getValue().forEach(p -> {
                attr1.add(((Var)(p.get(0))).getVarName());
                attr2.add(((Var)(p.get(1))).getVarName());
            });
            Join j = new Join(groups.get(arr.get(0)), groups.get(arr.get(1)), attr1, attr2);
            res.remove(arr.get(0)); // remove old values, they are now joined
            res.remove(arr.get(1));
            res.put(uf.find(arr.get(0)), j); // add the join to the map
        }
        return res;
    }

    private Map<Integer, For> getGroups(UnionFind uf, List<Set<Integer>> dep_groups, List<List<ContextExp>> compares) {
        Map<Integer, For> rewritten_exps = new HashMap<>();

        // add vars and their exp to a group for expression
        for (int i = 0; i < uf.parent.length; i++) {
            if (!rewritten_exps.containsKey(uf.find(i))) {
                rewritten_exps.put(uf.find(i), new For(new ArrayList<>(), new ArrayList<>(), null, null, null));
            }
            For f = rewritten_exps.get(uf.find(i));
            f.mergeExp(this.for_vars.get(i), this.for_exp.get(i));
            rewritten_exps.put(uf.find(i), f);
        }

        // add condtions to group for exps in case they depend on a single group
        for (int i = 0; i < compares.size(); i++) {
            Set<Integer> s = dep_groups.get(i);
            List<ContextExp> exp_pair = compares.get(i);
            if (s.size() == 1 && !s.contains(-1)) { // depends on only 1 group
                int idx = uf.find(s.iterator().next());
                For f = rewritten_exps.get(idx);
                f.mergeCond(new xEqxC(exp_pair.get(0), exp_pair.get(1)));
                rewritten_exps.put(idx, f);
            }
        }

        // add return statements for each group
        for (Map.Entry<Integer, For> entry : rewritten_exps.entrySet()) {
            For for_exp = entry.getValue();
            List<Tag> children = new ArrayList<>();


            // iterate over all the variables to put in the return block
            for (int i = 0; i < for_exp.for_vars.size(); i++) {
                Var v =  for_exp.for_vars.get(i);
                children.add(new Tag(v.getVarName(), v)); // create tag with var name, add tag inside
            }
            ContextExp childBlock = children.get(0);
            for (int i = 1; i < children.size(); i++) {
                childBlock = new Comma(childBlock, children.get(i));
            }

            for_exp.mergeRet(new Tag("tuple", childBlock)); // parent tag with name "tuple"
        }
        return rewritten_exps;
    }

    private void gen_graph(UnionFind uf, Map<String, Integer> varToIdx) {
        for (int i = 0; i < this.for_vars.size(); i++) {
            Set<String> deps = this.for_exp.get(i).getDeps();
            Integer var = varToIdx.get(this.for_vars.get(i).toString());
            for (String dep: deps) {
                if (varToIdx.containsKey(dep)) {
                    uf.union(var, varToIdx.get(dep));
                }
            }
        }
    }
}

class UnionFind {
    public int[] parent;
    public int[] rank;
    public int[] size;
    public UnionFind(int n) {
        parent = IntStream.range(0, n).toArray();
        rank = new int[n];
        size = new int[n];
        Arrays.fill(rank, 1);
        Arrays.fill(size, 1);
    }
    public int find(int n) {
        if (parent[n] == n) return n;
        return parent[n] = find(parent[n]);
    }
    public boolean union(int x, int y) {
        int px = find(x);
        int py = find(y);
        if (px == py) return false;
        if (rank[px] > rank[py]) {
            parent[py] = px;
            size[px] += size[py];
        } else if (rank[py] > rank[px]) {
            parent[px] = py;
            size[py] += size[px];
        } else {
            parent[px] = py;
            rank[py]++;
            size[py] += size[px];
        }
        return true;
    }
}
