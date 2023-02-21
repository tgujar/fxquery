package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.expressions.relative.RelativePath;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;

public class Paren implements ContextExp {

    private final ContextExp ce;

    public Paren(ContextExp ce) {
        this.ce = ce;
    }

    @Override
    public List<Node> solve(Context c, Document doc) throws Exception {
        return ce.solve(c, doc);
    }

    @Override
    public String toString() {
        return "(" + ce.toString() + ")";
    }
}
