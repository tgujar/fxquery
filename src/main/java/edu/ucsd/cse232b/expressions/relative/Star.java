package edu.ucsd.cse232b.expressions.relative;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Collections;
import java.util.List;

public class Star implements RelativePath {
    @Override
    public List<Node> solve(List<Node> ctxList) throws Exception {
        List<Node> nodeSet = new java.util.ArrayList<>(Collections.emptyList());
        ctxList.forEach(node -> {
            NodeList children = node.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                nodeSet.add(children.item(i));
            }
        });
        return nodeSet;
    }

    @Override
    public String toString() {
        return "*";
    }
}
