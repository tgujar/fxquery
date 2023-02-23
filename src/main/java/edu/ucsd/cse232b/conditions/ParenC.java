package edu.ucsd.cse232b.conditions;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;

public class ParenC implements Condition {
    private final Condition c;

    public ParenC(Condition c) {
        this.c = c;
    }

    @Override
    public boolean solve(Context c, Document doc) throws Exception {
        return this.c.solve(c, doc);
    }

    @Override
    public String toString() {
        return String.format("not %s", c.toString());
    }
}
