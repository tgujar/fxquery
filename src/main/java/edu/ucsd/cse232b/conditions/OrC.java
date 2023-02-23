package edu.ucsd.cse232b.conditions;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;

public class OrC implements Condition {
    private final Condition c1;
    private final Condition c2;

    public OrC(Condition c1, Condition c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean solve(Context c, Document doc) throws Exception {
        return c1.solve(c, doc) || c2.solve(c, doc);
    }

    @Override
    public String toString() {
        return String.format("%s and %s", c1.toString(), c2.toString());
    }
}
