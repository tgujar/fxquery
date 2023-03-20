package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.expressions.SubsetGrammar;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Var implements ContextExp, SubsetGrammar {
    private final String varName;
    private final Set<String> deps;

    public Var(String varName) {

        this.varName = varName;
        this.deps = new HashSet<>();
        this.deps.add(this.toString());
    }

    @Override
    public List<Node> solve(Stack<Context> ctx, Document doc) throws Exception {
        return ctx.peek().getVar(varName);
    }

    @Override
    public String toString() {
        return "$" + varName;
    }

    @Override
    public Set<String> getDeps() {
        return this.deps;
    }

    @Override
    public String rewrite() {
        return this.toString();
    }

    public String getVarName() {
        return this.varName;
    }
}
