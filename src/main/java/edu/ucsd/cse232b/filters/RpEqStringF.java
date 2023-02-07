package edu.ucsd.cse232b.filters;

import edu.ucsd.cse232b.expressions.relative.RelativePath;
import org.w3c.dom.Node;

import java.util.List;

public class RpEqStringF implements Filter{
    final private RelativePath rp;
    final private String sc;
    public RpEqStringF(RelativePath rp, String sc) {

        this.rp = rp;
        this.sc = sc;
    }
    @Override
    public boolean solve(List<Node> ctxList) throws Exception {
        List<Node> nodes = rp.solve(ctxList);
        return nodes.stream().anyMatch(n ->  n.getTextContent().equals(sc));
    }

    @Override
    public String toString() { return String.format("%s = %s", rp.toString(), sc);}
}
