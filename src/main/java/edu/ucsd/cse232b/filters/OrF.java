package edu.ucsd.cse232b.filters;

import org.w3c.dom.Node;

import java.util.List;

public class OrF implements Filter{
    private final Filter f1;
    private final Filter f2;

    public OrF(Filter f1, Filter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    @Override
    public boolean solve(List<Node> ctxList) throws Exception {
        return f1.solve(ctxList) || f2.solve(ctxList);
    }
    @Override
    public String toString() { return String.format("%s or %s", f1.toString(), f2.toString());}
}

