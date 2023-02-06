package edu.ucsd.cse232b.expressions.relative;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Collections;
import java.util.List;

public class Self implements RelativePath{
    @Override
    public List<Node> solve(List<Node> ctxList) throws Exception {
        return ctxList;
    }

    @Override
    public String toString() {
        return ".";
    }
}
