package edu.ucsd.cse232b.visitors;


import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.conditions.*;
import edu.ucsd.cse232b.expressions.contextual.ContextExp;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Stack;

public class ConditionBuilder extends ExpressionGrammarBaseVisitor<Condition> {

    Stack<Context> st;
    Document doc;

    @Override
    public Condition visitAndCond(ExpressionGrammarParser.AndCondContext ctx) {
        Condition c1 = visit(ctx.cond(0));
        Condition c2 = visit(ctx.cond(1));
        return new AndC(c1, c2);
    }

    @Override
    public Condition visitOrCond(ExpressionGrammarParser.OrCondContext ctx) {
        Condition c1 = visit(ctx.cond(0));
        Condition c2 = visit(ctx.cond(1));
        return new OrC(c1, c2);
    }

    @Override
    public Condition visitNotCond(ExpressionGrammarParser.NotCondContext ctx) {
        Condition c = visit(ctx.cond());
        return new NotC(c);
    }

    @Override
    public Condition visitPrCond(ExpressionGrammarParser.PrCondContext ctx) {
        Condition c = visit(ctx.cond());
        return new ParenC(c);
    }

    @Override
    public Condition visitEmptyCond(ExpressionGrammarParser.EmptyCondContext ctx) {
        ContextExp exp = (new ContextExpressionBuilder()).visit(ctx.x());
        return new EmptyC(exp);
    }

    @Override
    public Condition visitSatisfiesCond(ExpressionGrammarParser.SatisfiesCondContext ctx) {
        List<ExpressionGrammarParser.VarContext> vars = ctx.var();
        List<ExpressionGrammarParser.XContext> xs = ctx.x();
        return iterateSatisfies(ctx, vars, xs, 0);
    }

    private Condition iterateSatisfies(ExpressionGrammarParser.SatisfiesCondContext ctx, List<ExpressionGrammarParser.VarContext> vars, List<ExpressionGrammarParser.XContext> xs, int index) {
        if (index == vars.size()) {
            return visit(ctx.cond());
        }
        Context newContext = new Context(st.peek());
        try {
            List<Node> nodes = (new ContextExpressionBuilder()).visit(xs.get(index)).solve(st, doc);
            newContext.putVar(vars.get(index).ID().getText(), nodes);
            st.push(newContext);
            Condition intermediateCondition = iterateSatisfies(ctx, vars, xs, index + 1);
            st.pop();
            return intermediateCondition;
        } catch (Exception e) {
            throw new RuntimeException("Error solving expression", e);
        }
    }
}

