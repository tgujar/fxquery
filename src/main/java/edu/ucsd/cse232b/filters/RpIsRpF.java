package edu.ucsd.cse232b.filters;

import edu.ucsd.cse232b.expressions.relative.RelativePath;
import org.w3c.dom.Node;

import java.util.List;

public class RpIsRpF implements Filter {
    final private RelativePath rp1;
    final private RelativePath rp2;

    public RpIsRpF(RelativePath rp1, RelativePath rp2) {

        this.rp1 = rp1;
        this.rp2 = rp2;
    }

    @Override
    public boolean solve(List<Node> ctxList) throws Exception {
        List<Node> l1 = rp1.solve(ctxList);
        List<Node> l2 = rp2.solve(ctxList);
        return l1.stream().anyMatch(n1 -> l2.stream().anyMatch(n1::isSameNode));
    }

    @Override
    public String toString() {
        return String.format("%s is %s", rp1.toString(), rp2.toString());
    }
}
