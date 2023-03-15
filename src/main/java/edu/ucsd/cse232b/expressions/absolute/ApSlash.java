package edu.ucsd.cse232b.expressions.absolute;

import edu.ucsd.cse232b.expressions.relative.RelativePath;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.print.Doc;
import java.util.List;

public class ApSlash implements AbsolutePath {

    private final RelativePath child;

    public ApSlash(RelativePath child) {
        this.child = child;
    }

    @Override
    public List<Node> solve(List<Node> ctxList, Document doc) throws Exception {
        return child.solve(ctxList);
    }

    @Override
    public String toString() {
        return "/" + child.toString();
    }
}