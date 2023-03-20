package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Paren implements ContextExp {

    private final ContextExp ce;
    private final Set<String> deps;

    public Paren(ContextExp ce) {
        this.ce = ce;
        this.deps = ce.getDeps();
    }

    @Override
    public List<Node> solve(Stack<Context> c, Document doc) throws Exception {
        return ce.solve(c, doc);
    }

    @Override
    public String toString() {
        return "(" + ce.toString() + ")";
    }

    @Override
    public Set<String> getDeps() {
        return this.deps;
    }

    @Override
    public String rewrite() {
        return "(" + ce.rewrite() + ")";
    }
}
