package edu.ucsd.cse232b.filters;

import org.w3c.dom.Node;

import java.util.List;

public class ParenF implements Filter {

    private final Filter f;

    public ParenF(Filter f) {
        this.f = f;
    }

    @Override
    public boolean solve(List<Node> ctxList) throws Exception {
        return f.solve(ctxList);
    }

    @Override
    public String toString() {
        return String.format("(%s)", f.toString());
    }
}
