package edu.ucsd.cse232b.expressions.relative;

import org.w3c.dom.Node;

import java.util.List;

public class Comma implements RelativePath {

    private final RelativePath rp1;
    private final RelativePath rp2;

    public Comma(RelativePath rp1, RelativePath rp2) {
        this.rp1 = rp1;
        this.rp2 = rp2;
    }

    @Override
    public List<Node> solve(List<Node> ctxList) throws Exception {
        List<Node> l1 = rp1.solve(ctxList);
        l1.addAll(rp2.solve(ctxList));
        return l1;
    }

    @Override
    public String toString() {
        return rp1.toString() + "," + rp2.toString();
    }
}
