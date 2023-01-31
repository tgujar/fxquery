package edu.ucsd.cse232b.expressions;

import org.w3c.dom.Node;

import java.util.List;

public interface Expression {
    enum ExpressionKind {
        Ap, ChildrenRp, NodeRp,
    }

    ExpressionKind getExpressionKind();

    List<Node> solve(List<Node> ctxList) throws Exception;

    String toString();
}