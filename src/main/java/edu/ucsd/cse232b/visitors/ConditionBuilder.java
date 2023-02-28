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

    public ConditionBuilder(Stack<Context> st, Document doc) {
        this.st = st;
        this.doc = doc;
    }

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
        ContextExp exp = (new ContextExpressionBuilder(st, doc)).visit(ctx.x());
        return new EmptyC(exp);
    }

    @Override
    public Condition visitEqCond(ExpressionGrammarParser.EqCondContext ctx) {
        ContextExp ce1 = (new ContextExpressionBuilder(st, doc)).visit(ctx.x(0));
        ContextExp ce2 = (new ContextExpressionBuilder(st, doc)).visit(ctx.x(1));
        return new xEqxC(ce1, ce2);
    }

    @Override
    public Condition visitIsCond(ExpressionGrammarParser.IsCondContext ctx) {
        ContextExp ce1 = (new ContextExpressionBuilder(st, doc)).visit(ctx.x(0));
        ContextExp ce2 = (new ContextExpressionBuilder(st, doc)).visit(ctx.x(1));
        return new xIsxC(ce1, ce2);
    }

    @Override
    public Condition visitSatisfiesCond(ExpressionGrammarParser.SatisfiesCondContext ctx) {
        List<ExpressionGrammarParser.VarContext> vars = ctx.var();
        List<ExpressionGrammarParser.XContext> xs = ctx.x();
        Context newContext = new Context(st.peek());
        st.push(newContext);
        SatisfiesC c = null;
        try {
            c = new SatisfiesC(iterateSatisfies(ctx, vars, xs, 0).solve(st, doc));
        } catch (Exception e) {
            throw new RuntimeException("Error solving expression", e);
        }
        st.pop();
        return c;
    }

    private Condition iterateSatisfies(ExpressionGrammarParser.SatisfiesCondContext ctx, List<ExpressionGrammarParser.VarContext> vars, List<ExpressionGrammarParser.XContext> xs, int index) {
        if (index == vars.size()) {
            return visit(ctx.cond());
        }
        try {
            List<Node> nodes = (new ContextExpressionBuilder(st, doc)).visit(xs.get(index)).solve(st, doc);
            st.peek().putVar(vars.get(index).ID().getText(), nodes);
            return iterateSatisfies(ctx, vars, xs, index + 1);
        } catch (Exception e) {
            throw new RuntimeException("Error solving expression", e);
        }
    }
}

