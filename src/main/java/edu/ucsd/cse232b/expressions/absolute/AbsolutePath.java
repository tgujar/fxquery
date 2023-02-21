package edu.ucsd.cse232b.expressions.absolute;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;

public interface AbsolutePath {
    List<Node> solve(List<Node> ctxList, Document doc) throws Exception;

    String toString();
}