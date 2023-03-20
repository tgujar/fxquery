package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.expressions.SubsetGrammar;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.*;

public class StrConst implements ContextExp, SubsetGrammar{
    private final String str;
    private final Set<String> deps;
    public StrConst(String str) {
        this.deps = new HashSet<>();
        this.str = str;
    }

    @Override
    public List<Node> solve(Stack<Context> ctx, Document doc) throws Exception {
        return List.of(doc.createTextNode(this.str));
    }

    @Override
    public String toString() {
        return "\"" + str + "\"" ;
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

