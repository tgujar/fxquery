package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class For implements ContextExp {
    private List<Node> l;

    public For() {
        this.l = new ArrayList<>();
    }

    @Override
    public List<Node> solve(Stack<Context> c, Document doc) throws Exception {
        return l;
    }

    public void add(List<Node> results) {
        l.addAll(results);
    }

    @Override
    public String toString() {
        return "for expression";
    }

//    public String rewrite() {
//
//    }
}
