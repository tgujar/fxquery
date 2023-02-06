package edu.ucsd.cse232b.expressions.relative;

import org.w3c.dom.Node;

import java.util.List;

public interface RelativePath {
    List<Node> solve(List<Node> ctxList) throws Exception;

    String toString();
}
