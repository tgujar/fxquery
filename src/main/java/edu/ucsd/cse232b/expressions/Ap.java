package edu.ucsd.cse232b.expressions;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Collections;
import java.util.List;

public class Ap implements Expression {

    final private Ap.Type type;
    final private Expression rp;

    public Ap(Type type, Expression rp) {
        this.type = type;
        this.rp = rp;
    }

    public enum Type {
        Sl, DSl
    }

    @Override
    public Expression.ExpressionKind getExpressionKind() {
        return Expression.ExpressionKind.Ap;
    }

    @Override
    public List<Node> solve(List<Node> ctxList) throws Exception {
        if (type == Type.Sl) {
            // In case it is a single slash - solve for children
            return rp.solve(ctxList);
        } else {
            // In case it is a double single slash - solve for grandchildren
            List<Node> grandChildren = new java.util.ArrayList<>(Collections.emptyList());
            ctxList.forEach(node -> {
                NodeList children = node.getChildNodes();
                for (int i = 0; i < children.getLength(); i++) {
                    grandChildren.add(children.item(i));
                }
            });
            return rp.solve(grandChildren);
        }
    }
}