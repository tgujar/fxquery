package edu.ucsd.cse232b.expressions;

import org.w3c.dom.Node;

import java.util.Collections;
import java.util.List;

import static edu.ucsd.cse232b.expressions.NodeRp.Type.Pr;

public class NodeRp implements Expression {

    final private Type type;
    final private String param;
    final private Expression rp;

    public NodeRp(Type type, String param) {
        this.type = type;
        this.param = param;
        this.rp = null;
    }

    public NodeRp(Type type, String param, Expression rp) {
        this.type = type;
        this.param = param;
        this.rp = rp;
    }

    public enum Type {
        Self, Parent, Attr, Pr
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.NodeRp;
    }

    @Override
    public List<Node> solve(List<Node> ctxList) throws Exception {
        if (type == Pr) {
            assert rp != null;
            return rp.solve(ctxList);
        }
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
