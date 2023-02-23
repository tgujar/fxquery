package edu.ucsd.cse232b.visitors;


import edu.ucsd.cse232b.conditions.*;
import edu.ucsd.cse232b.expressions.contextual.ContextExp;
import edu.ucsd.cse232b.expressions.contextual.Let;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;

import java.util.List;

public class ConditionBuilder extends ExpressionGrammarBaseVisitor<Condition> {

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
        List<String> varNames = vars.stream().map(var -> var.ID().toString()).toList();
        List<ContextExp> ctXExpressions = xs.stream().map((new ContextExpressionBuilder())::visit).toList();
        Condition c = visit(ctx.cond());
        return new SatisfiesC(varNames, ctXExpressions), c;
    }

}

