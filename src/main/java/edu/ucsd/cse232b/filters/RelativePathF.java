package edu.ucsd.cse232b.filters;

import edu.ucsd.cse232b.expressions.relative.RelativePath;
import org.w3c.dom.Node;

import java.util.List;

public class RelativePathF implements Filter {
    final private RelativePath rp;
    public RelativePathF(RelativePath rp) {
        this.rp = rp;
    }
    @Override
    public boolean solve(List<Node> ctxList) throws Exception {
        return rp.solve(ctxList).isEmpty();
    }

    @Override
    public String toString() { return String.format("[%s]", rp.toString());}
}
