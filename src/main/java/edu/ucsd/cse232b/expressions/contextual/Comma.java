package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Comma implements ContextExp{
    private final ContextExp ce1;
    private final ContextExp ce2;
    private final Set<String> deps;


    public Comma(ContextExp ce1, ContextExp ce2) {
        this.ce1 = ce1;
        this.ce2 = ce2;
        this.deps = new HashSet<>();
        deps.addAll(ce1.getDeps());
        deps.addAll(ce2.getDeps());
    }

    @Override
    public List<Node> solve(Stack<Context> c, Document doc) throws Exception {
        List<Node> l1 = ce1.solve(c, doc);
        List<Node> l2 = ce2.solve(c, doc);
        return Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return ce1.toString() + "," + ce2.toString();
    }
    @Override
    public Set<String>getDeps() {
        return this.deps;
    }

    @Override
    public String rewrite() {
        return ce1.rewrite() + ',' + ce2.rewrite();
    }

}
