package edu.ucsd.cse232b.filters;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.expressions.contextual.ContextExp;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;

public class ConEqF implements ContextFilter{

    final private ContextExp ce1;
    final private ContextExp ce2;

    public ConEqF(ContextExp ce1, ContextExp ce2) {

        this.ce1 = ce1;
        this.ce2 = ce2;
    }

    @Override
    public boolean solve(Context c, Document doc) throws Exception {
        List<Node> l1 = ce1.solve(c, doc);
        List<Node> l2 = ce2.solve(c, doc);
        return l1.stream().anyMatch(n1 -> l2.stream().anyMatch(n1::isEqualNode));
    }

    @Override
    public String toString() {
        return String.format("%s eq %s", ce1.toString(), ce2.toString());
    }
}
