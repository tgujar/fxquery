package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.*;

public class Join implements ContextExp{
    private final ContextExp ce1;
    private final ContextExp ce2;
    private final List<String> attr1;
    private final List<String> attr2;

    private final Set<String> deps;


    public Join(ContextExp ce1, ContextExp ce2, List<String> attr1, List<String> attr2) {
        this.ce1 = ce1;
        this.ce2 = ce2;
        this.attr1 = attr1;
        this.attr2 = attr2;
        this.deps = new HashSet<>();
        this.deps.addAll(ce1.getDeps());
        this.deps.addAll(ce2.getDeps());
    }



    @Override
    public List<Node> solve(Stack<Context> c, Document doc) throws Exception {
        return new ArrayList<>(); // temp
    }

    @Override
    public String toString() {
        String s_attr1 = this.attr1.toString();
        String s_attr2 = this.attr2.toString();
        return String.format("join (\n %s,\n %s,\n %s,\n %s)", this.ce1.toString(), this.ce2.toString(), s_attr1, s_attr2);
    }

    @Override
    public Set<String> getDeps() {
        return this.deps;
    }

    @Override
    public String rewrite() {
        return this.toString();
    }
}
