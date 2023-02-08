package edu.ucsd.cse232b.expressions.relative;

import org.w3c.dom.Node;

import java.util.List;
import java.util.stream.Collectors;

public class Slash implements RelativePath {

    private final RelativePath parent, child;

    public Slash(RelativePath parent, RelativePath child) {
        this.parent = parent;
        this.child = child;
    }

    @Override
    public List<Node> solve(List<Node> ctxList) throws Exception {
        return child.solve(parent.solve(ctxList)).stream().distinct().collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return parent.toString() + "/" + child.toString();
    }
}
