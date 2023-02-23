package edu.ucsd.cse232b.visitors;

import edu.ucsd.cse232b.expressions.absolute.AbsolutePath;
import edu.ucsd.cse232b.expressions.contextual.*;
import edu.ucsd.cse232b.expressions.relative.RelativePath;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;

import java.util.Collections;
import java.util.List;

public class ContextExpressionBuilder extends ExpressionGrammarBaseVisitor<ContextExp> {

    @Override
    public ContextExp visitApX(ExpressionGrammarParser.ApXContext ctx) {
        AbsolutePath ap = (new AbsolutePathBuilder()).visit(ctx.ap());
        return new Ap(ap, Collections.emptyList());
    }

    @Override
    public ContextExp visitVarX(ExpressionGrammarParser.VarXContext ctx) {
        return new Var(ctx.var().ID().getText());
    }

    @Override
    public ContextExp visitTextX(ExpressionGrammarParser.TextXContext ctx) {
        return new StrConst(ctx.strConst().ID().getText());
    }

    @Override
    public ContextExp visitPrX(ExpressionGrammarParser.PrXContext ctx) {
        ContextExp exp = visit(ctx.x());
        return new Paren(exp);
    }

    @Override
    public ContextExp visitCommaX(ExpressionGrammarParser.CommaXContext ctx) {
        ContextExp exp1 = visit(ctx.x(0));
        ContextExp exp2 = visit(ctx.x(1));
        return new Comma(exp1, exp2);
    }

    @Override
    public ContextExp visitCSlRpX(ExpressionGrammarParser.CSlRpXContext ctx) {
        RelativePath rp = (new RelativePathBuilder()).visit(ctx.rp());
        ContextExp exp = visit(ctx.x());
        return new Slash(rp, exp);
    }

    @Override
    public ContextExp visitDSLRpX(ExpressionGrammarParser.DSLRpXContext ctx) {
        RelativePath rp = (new RelativePathBuilder()).visit(ctx.rp());
        ContextExp exp = visit(ctx.x());
        return new DoubleSlash(rp, exp);
    }

    @Override
    public ContextExp visitLetX(ExpressionGrammarParser.LetXContext ctx) {
        List<ExpressionGrammarParser.VarContext> vars = ctx.letClause().var();
        List<ExpressionGrammarParser.XContext> xs = ctx.letClause().x();
        List<String> varNames = vars.stream().map(var -> var.ID().toString()).toList();
        List<ContextExp> ctXExpressions = xs.stream().map(this::visit).toList();
        ContextExp ce = visit(ctx.x());
        return new Let(varNames, ctXExpressions, ce);
    }
}
