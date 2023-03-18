package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;
import edu.ucsd.cse232b.visitors.ContextExpressionBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Stack;

public class Let implements ContextExp{
    List<String> var;
    List<ContextExp> exp;

    public Let(List<String> var, List<ContextExp> exp) {
        this.var = var;
        this.exp = exp;
    }
    @Override
    public List<Node> solve(Stack<Context> c, Document doc) throws Exception {
        for (int i = 0; i < exp.size(); i++) {
            c.peek().putVar(var.get(i), exp.get(i).solve(c, doc));
        }
        return null;
    }
}
