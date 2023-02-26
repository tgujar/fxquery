package edu.ucsd.cse232b.visitors;


import edu.ucsd.cse232b.expressions.relative.RelativePath;
import edu.ucsd.cse232b.filters.*;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;

public class FilterBuilder extends ExpressionGrammarBaseVisitor<Filter> {

    @Override
    public Filter visitRpFilter(ExpressionGrammarParser.RpFilterContext ctx) {
        RelativePath rp = (new RelativePathBuilder()).visit(ctx.rp());
        return new RpF(rp);
    }

    @Override
    public Filter visitEqFilter(ExpressionGrammarParser.EqFilterContext ctx) {
        RelativePath rp1 = (new RelativePathBuilder()).visit(ctx.rp(0));
        RelativePath rp2 = (new RelativePathBuilder()).visit(ctx.rp(1));
        return new RpEqRpF(rp1, rp2);
    }

    @Override
    public Filter visitIsFilter(ExpressionGrammarParser.IsFilterContext ctx) {
        RelativePath rp1 = (new RelativePathBuilder()).visit(ctx.rp(0));
        RelativePath rp2 = (new RelativePathBuilder()).visit(ctx.rp(1));
        return new RpIsRpF(rp1, rp2);
    }

    @Override
    public Filter visitStrConstRp(ExpressionGrammarParser.StrConstRpContext ctx) {
        String sc = ctx.strConst().getText();
        RelativePath rp = (new RelativePathBuilder()).visit(ctx.rp());
        return new RpEqStringF(rp, sc.substring(1, sc.length() - 1));
    }

    @Override
    public Filter visitPrFilter(ExpressionGrammarParser.PrFilterContext ctx) {
        Filter f = visit(ctx.f());
        return new ParenF(f);
    }

    @Override
    public Filter visitAndFilter(ExpressionGrammarParser.AndFilterContext ctx) {
        Filter f1 = visit(ctx.f(0));
        Filter f2 = visit(ctx.f(1));
        return new AndF(f1, f2);
    }

    @Override
    public Filter visitOrFilter(ExpressionGrammarParser.OrFilterContext ctx) {
        Filter f1 = visit(ctx.f(0));
        Filter f2 = visit(ctx.f(1));
        return new OrF(f1, f2);
    }

    @Override
    public Filter visitNotFilter(ExpressionGrammarParser.NotFilterContext ctx) {
        Filter f = visit(ctx.f());
        return new NotF(f);
    }
}

