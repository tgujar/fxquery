package edu.ucsd.cse232b.conditions;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.expressions.contextual.ContextExp;
import org.w3c.dom.Document;

import java.util.List;
import java.util.Stack;

public class SatisfiesC implements Condition {
    List<String> var;
    List<ContextExp> exp;
    Condition cond;

    public SatisfiesC(List<String> var, List<ContextExp> exp, Condition cond) {
        this.var = var;
        this.exp = exp;
        this.cond = cond;
    }

    @Override
    public boolean solve(Stack<Context> c, Document doc) throws Exception {
        c.push(new Context(c.peek()));
        for (int i = 0; i < exp.size(); i++) {
            c.peek().putVar(var.get(i), exp.get(i).solve(c, doc));
        }
        boolean ret = cond.solve(c, doc);
        c.pop();
        return ret;
    }

    @Override
    public String toString() {
        return String.format("Satsifies");
    }
}
