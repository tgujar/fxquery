package edu.ucsd.cse232b.expressions.absolute;

import edu.ucsd.cse232b.expressions.relative.DoubleSlash;
import edu.ucsd.cse232b.expressions.relative.RelativePath;
import edu.ucsd.cse232b.expressions.relative.Self;
import org.w3c.dom.Node;

import java.util.List;

public class ApDoubleSlash implements AbsolutePath {

    private final RelativePath child;

    public ApDoubleSlash(RelativePath child) {
        this.child = child;
    }

    @Override
    public List<Node> solve(List<Node> ctxList) throws Exception {
        return (new DoubleSlash(new Self(), child)).solve(ctxList);
    }

    @Override
    public String toString() {
        return ".//" + child.toString();
    }
}