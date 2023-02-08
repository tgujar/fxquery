package edu.ucsd.cse232b.filters;

import org.w3c.dom.Node;

import java.util.List;

public interface Filter {
    boolean solve(List<Node> ctxList) throws Exception;

    String toString();
}
