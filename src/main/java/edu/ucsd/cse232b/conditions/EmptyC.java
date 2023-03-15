package edu.ucsd.cse232b.conditions;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.expressions.contextual.ContextExp;
import org.w3c.dom.Document;

import java.util.Stack;

public class EmptyC implements Condition {
    private final ContextExp ce;

    public EmptyC(ContextExp ce) {
        this.ce = ce;
    }

    @Override
    public boolean solve(Stack<Context> c, Document doc) throws Exception {
        return this.ce.solve(c, doc).isEmpty();
    }

    @Override
    public String toString() {
        return String.format("not %s", ce.toString());
    }
}
