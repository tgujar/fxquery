package edu.ucsd.cse232b.expressions.relative;

import org.w3c.dom.Node;

import java.util.List;
import java.util.stream.Collectors;

public class Parent implements RelativePath{
    @Override
    public List<Node> solve(List<Node> ctxList) throws Exception {
        return ctxList.stream().map(node -> node.getParentNode()).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "..";
    }
}