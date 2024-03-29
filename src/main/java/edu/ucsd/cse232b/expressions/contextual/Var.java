package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Stack;

public class Var implements ContextExp {
    private final String varName;

    public Var(String varName) {
        this.varName = varName;
    }

    @Override
    public List<Node> solve(Stack<Context> ctx, Document doc) throws Exception {
        return ctx.peek().getVar(varName);
    }

    @Override
    public String toString() {
        return "{" + "$" + varName + "}";
    }
}
