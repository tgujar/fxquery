package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.conditions.Condition;
import edu.ucsd.cse232b.visitors.ConditionBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class For implements ContextExp {
    List<String> for_vars;
    List<ContextExp> for_exp;
    ContextExp let_exp;
    Condition cond;
    ContextExp ret;

    public For(List<String> for_vars, List<ContextExp> for_exp, ContextExp let_exp, Condition cond, ContextExp ret) {
        this.for_exp = for_exp;
        this.for_vars = for_vars;
        this.let_exp = let_exp;
        this.cond = cond;
        this.ret = ret;
    }

    private List<Node> iterate(Stack<Context> c, Document doc, int idx) throws Exception {
        Context newContext = new Context(c.peek());
        c.push(newContext);
        List<Node> res = new ArrayList<>();
        List<Node> values = for_exp.get(idx).solve(c, doc);
        for (int i = 0; i < values.size(); i++) {
            c.peek().putVar(for_vars.get(idx), List.of(values.get(i)));
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
        return "for expression";
    }

}
