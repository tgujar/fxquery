package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.expressions.relative.RelativePath;
import edu.ucsd.cse232b.expressions.relative.Self;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class DoubleSlash implements ContextExp{
    private final RelativePath child;
    private final ContextExp ce;


    public DoubleSlash(RelativePath child, ContextExp ce) {
        this.child = child;
        this.ce = ce;
    }

    @Override
    public List<Node> solve(Stack<Context> c, Document doc) throws Exception {
        return ce.solve(c, doc).stream().map(node -> {
            try {
                return new edu.ucsd.cse232b.expressions.relative.DoubleSlash(new Self(), child).solve(List.of(node));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).flatMap(List::stream).distinct().collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return ce.toString() + "//" + child.toString();
    }
}
