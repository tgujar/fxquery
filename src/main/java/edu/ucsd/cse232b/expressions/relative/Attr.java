package edu.ucsd.cse232b.expressions.relative;

import org.w3c.dom.Node;

import java.util.List;
import java.util.stream.Collectors;

public class Attr implements RelativePath {

    private final String attrName;

    public Attr(String attrName) {
        this.attrName = attrName;
    }

    @Override
    public List<Node> solve(List<Node> ctxList) throws Exception {
        return ctxList.stream().map(node -> node.getAttributes().getNamedItem(attrName)).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "@" + attrName;
    }
}