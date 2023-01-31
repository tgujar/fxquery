package edu.ucsd.cse232b.visitors;

import edu.ucsd.cse232b.expressions.Ap;
import edu.ucsd.cse232b.expressions.Expression;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;

public class ProgramBuilder extends ExpressionGrammarBaseVisitor<Ap> {
    @Override
    public Ap visitSlAp(ExpressionGrammarParser.SlApContext ctx) {
        final ExpressionBuilder expressionBuilder = new ExpressionBuilder();
        final Expression expression = expressionBuilder.visit(ctx.rp());
        return new Ap(Ap.Type.Sl, expression);
    }

    @Override
    public Ap visitDSlAp(ExpressionGrammarParser.DSlApContext ctx) {
        final ExpressionBuilder expressionBuilder = new ExpressionBuilder();
        final Expression expression = expressionBuilder.visit(ctx.rp());
        return new Ap(Ap.Type.DSl, expression);
    }
}