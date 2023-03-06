package edu.ucsd.cse232b.conditions;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.expressions.contextual.ContextExp;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Stack;

public class xEqxC implements Condition {
    final private ContextExp x1;
    final private ContextExp x2;

    public xEqxC(ContextExp x1, ContextExp x2) {
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public boolean solve(Stack<Context> c, Document doc) throws Exception {
        List<Node> l1 = x1.solve(c, doc);
        List<Node> l2 = x2.solve(c, doc);
        return l1.stream().anyMatch(n1 -> l2.stream().anyMatch(n1::isEqualNode));
    }

    @Override
    public String toString() {
        return String.format("%s eq %s", x1.toString(), x2.toString());
    }
}
