package edu.ucsd.cse232b.expressions.relative;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DoubleSlash implements RelativePath {
    private final RelativePath parent, child;

    public DoubleSlash(RelativePath parent, RelativePath child) {
        this.parent = parent;
        this.child = child;
    }

    @Override
    public List<Node> solve(List<Node> ctxList) throws Exception {
        if (ctxList.isEmpty()) return new ArrayList<>(Collections.emptyList());
        List<Node> self = (new Slash(parent, child)).solve(ctxList);
        List<Node> nodes = parent.solve(ctxList);
        List<Node> descendants = (new DoubleSlash(new Star(), child)).solve(nodes);
        self.addAll(descendants);
        return self.stream().distinct().collect(Collectors.toList());
    }

    private List<Node> solveWithParent(List<Node> parent) throws Exception {
        if (parent.isEmpty()) return new ArrayList<>(Collections.emptyList());
        List<Node> self = child.solve(parent);
        List<Node> children = (new Star()).solve(parent);
        self.addAll(solveWithParent(children));
        return self;
    }

    @Override
    public String toString() {
        return parent.toString() + "//" + child.toString();
    }
}
