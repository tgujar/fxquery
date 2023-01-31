package edu.ucsd.cse232b.expressions;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Collections;
import java.util.List;
import java.util.Set;

public class NodeRp implements Expression {

    final private Type type;
    final private String param;

    public NodeRp(Type type, String param) {
        this.type = type;
        this.param = param;
    }

    public enum Type {
        Self, Parent, Attr
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.NodeRp;
    }

    @Override
    public List<Node> solve(List<Node> ctxList) {
        List<Node> nodeSet = new java.util.ArrayList<>(Collections.emptyList());
        ctxList.forEach(node -> {
            switch (type) {
                case Self -> nodeSet.add(node);
                case Parent -> nodeSet.add(node.getParentNode());
                case Attr -> nodeSet.add(node.getAttributes().getNamedItem(param));
            }

        });
        return nodeSet;
    }

    @Override
    public String toString() {
        return getExpressionKind().toString() + " ( type = " + type + ", param = " + param + " ) ";
    }

}
