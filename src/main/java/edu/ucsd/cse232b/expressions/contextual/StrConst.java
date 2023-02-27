package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class StrConst implements ContextExp {
    private final String str;

    public StrConst(String str) {
        this.str = str;
    }

    @Override
    public List<Node> solve(Stack<Context> ctx, Document doc) throws Exception {
        return Collections.singletonList(doc.createTextNode(this.str));
    }

    @Override
    public String toString() {
        return "{" + "\"" + str + "\"" + "}";
    }
}
