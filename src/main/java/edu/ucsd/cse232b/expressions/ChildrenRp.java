package edu.ucsd.cse232b.expressions;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import static org.w3c.dom.Node.ELEMENT_NODE;
import static org.w3c.dom.Node.TEXT_NODE;

public class ChildrenRp implements Expression {

    final private Type type;
    final private String param;

    public ChildrenRp(Type type, String param) {
        this.type = type;
        this.param = param;
    }

    public enum Type {
        TagName, Star, Text
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.NodeRp;
    }

    @Override
    public List<Node> solve(List<Node> ctxList) {
        List<Node> nodeSet = new java.util.ArrayList<>(Collections.emptyList());
        ctxList.forEach(node -> {
            NodeList children = node.getChildNodes();
            for (int i = 0; i < children.getLength(); i++) {
                Node child = children.item(i);
                switch (type) {
                    case TagName -> {
                        if (child.getNodeType() == ELEMENT_NODE && child.getNodeName().equals(param))
                            nodeSet.add(child);
                    }
                    case Star -> nodeSet.add(child);
                    case Text -> {
                        if (child.getNodeType() == TEXT_NODE) nodeSet.add(child);
                    }
                }
            }
        });
        return nodeSet;
    }

    @Override
    public String toString() {
        return getExpressionKind().toString() + " ( type = " + type + ", param = " + param + " ) ";
    }
}
