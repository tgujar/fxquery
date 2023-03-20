package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.expressions.absolute.AbsolutePath;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Ap implements ContextExp {
    private final AbsolutePath ap;
    private final List<Node> ctxList;
    private final Set<String> deps;

    public Ap (AbsolutePath ap, List<Node> ctxList) {
        this.ap = ap;
        this.ctxList = ctxList;
        this.deps = new HashSet<>();
    }

    @Override
    public List<Node> solve(Stack<Context> ctx, Document doc) throws Exception {
        return ap.solve(this.ctxList, doc);
    }

    @Override
    public String toString() {
        return ap.toString();
    }

    @Override
    public Set<String>getDeps() {
        return this.deps;
    }

    @Override
    public String rewrite() {
        return this.ap.toString();
    }
}
