package edu.ucsd.cse232b.conditions;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;

import java.util.Stack;

public class SatisfiesC implements Condition {
    private final boolean b;

    public SatisfiesC(boolean b) {
        this.b = b;
    }

    @Override
    public boolean solve(Stack<Context> c, Document doc) throws Exception {
        return b;
    }

    @Override
    public String toString() {
        return String.format("Satsifies %s and %s", b);
    }
}
