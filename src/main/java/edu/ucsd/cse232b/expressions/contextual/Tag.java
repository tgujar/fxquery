package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Tag implements ContextExp{
    private final ContextExp ce;
    private final String tag;

    public Tag(String tag, ContextExp ce) {
        this.ce = ce;
        this.tag = tag;
    }

    @Override
    public List<Node> solve(Stack<Context> c, Document doc) throws Exception {
        Node parent = doc.createElement(tag);
        ce.solve(c, doc).forEach(node -> {
            Node child = node.cloneNode(true);
            parent.appendChild(child);
        });
        return List.of(parent);
    }

    @Override
    public String toString() {
        return String.format("<%s>{%s}</%s>",tag, ce.toString(), tag);
    }
}
