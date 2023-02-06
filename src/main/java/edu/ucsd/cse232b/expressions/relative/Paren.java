package edu.ucsd.cse232b.expressions.relative;

import org.w3c.dom.Node;

import java.util.List;
import java.util.stream.Collectors;

public class Paren implements RelativePath{

    private final RelativePath rp;

    public Paren(RelativePath rp) {
        this.rp = rp;
    }

    @Override
    public List<Node> solve(List<Node> ctxList) throws Exception {
        return rp.solve(ctxList);
    }

    @Override
    public String toString() {
        return "(" + rp.toString() +")";
    }
}
