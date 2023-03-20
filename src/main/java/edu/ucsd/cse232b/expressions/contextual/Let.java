package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.Collections;

public class Let implements ContextExp {
    private final List<String> var;
    private final List<ContextExp> exps;
    private final ContextExp exp;

    private final Set<String> deps;

    public Let(List<String> var, List<ContextExp> exps, ContextExp exp) {
        this.var = var;
        this.exps = exps;
        this.exp = exp;
        this.deps = new HashSet<>();
        for (int i = 0; i < var.size(); i++) {
            this.deps.addAll(exps.get(i).getDeps());
            this.deps.add(var.get(i));
        }
    }

    @Override
    public List<Node> solve(Stack<Context> c, Document doc) throws Exception {
        for (int i = 0; i < exps.size(); i++) {
            c.peek().putVar(var.get(i), exps.get(i).solve(c, doc));
        }
        return exp == null ? Collections.emptyList() : exp.solve(c, doc);
    }

    @Override
    public Set<String> getDeps() {
        return this.deps;
    }

    @Override
    public String rewrite() {
        StringBuilder res = new StringBuilder();
        res.append(this.var.get(0));
        res.append(this.exps.get(0).rewrite());
        for (int i = 1; i < this.var.size(); i++) {
            res.append(", ");
            res.append(this.var.get(i));
            res.append(this.exps.get(i).rewrite());
        }
        return res.toString();
    }
}
