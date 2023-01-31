package edu.ucsd.cse232b.expressions;

import org.w3c.dom.Node;

import java.util.Collections;
import java.util.List;

public class NestedRp implements Expression {

    final private Type type;
    final private Expression parent;
    final private Expression child;

    public NestedRp(Type type, Expression parent, Expression child) {
        this.type = type;
        this.parent = parent;
        this.child = child;
    }

    public enum Type {
        Sl, DSl
    }

    @Override
    public ExpressionKind getExpressionKind() {
        return ExpressionKind.NodeRp;
    }

    @Override
    public List<Node> solve(List<Node> ctxList) throws Exception {
        List<Node> nodeSet = new java.util.ArrayList<>(Collections.emptyList());
        List<Node> subResult = parent.solve(ctxList);
        List<Node> result = child.solve(subResult);
        nodeSet.addAll(result);
        return nodeSet;
    }

    @Override
    public String toString() {
        return getExpressionKind().toString() + " ( parent = " + parent.toString() + ", child = " + child.toString() + " ) ";
    }
}
