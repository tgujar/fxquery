package edu.ucsd.cse232b.rewriter;


import edu.ucsd.cse232b.expressions.relative.RelativePath;
import edu.ucsd.cse232b.filters.*;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;
import edu.ucsd.cse232b.visitors.FilterBuilder;
import edu.ucsd.cse232b.visitors.RelativePathBuilder;

public class FilterRewriter extends ExpressionGrammarBaseVisitor<String> {

    @Override
    public String visitRpFilter(ExpressionGrammarParser.RpFilterContext ctx) {
        RelativePath rp = (new RelativePathBuilder()).visit(ctx.rp());
        return new RpF(rp).toString();
    }

    @Override
    public String visitEqFilter(ExpressionGrammarParser.EqFilterContext ctx) {
        RelativePath rp1 = (new RelativePathBuilder()).visit(ctx.rp(0));
        RelativePath rp2 = (new RelativePathBuilder()).visit(ctx.rp(1));
        return new RpEqRpF(rp1, rp2).toString();
    }

    @Override
    public String visitIsFilter(ExpressionGrammarParser.IsFilterContext ctx) {
        RelativePath rp1 = (new RelativePathBuilder()).visit(ctx.rp(0));
        RelativePath rp2 = (new RelativePathBuilder()).visit(ctx.rp(1));
        return new RpIsRpF(rp1, rp2).toString();
    }

    @Override
    public String visitStrConstRp(ExpressionGrammarParser.StrConstRpContext ctx) {
        String sc = ctx.strConst().getText();
        RelativePath rp = (new RelativePathBuilder()).visit(ctx.rp());
        return new RpEqStringF(rp, sc.substring(1, sc.length() - 1)).toString();
    }

    @Override
    public String visitPrFilter(ExpressionGrammarParser.PrFilterContext ctx) {
        Filter f = (new FilterBuilder()).visit(ctx.f());
        return new ParenF(f).toString();
    }

    @Override
    public String visitAndFilter(ExpressionGrammarParser.AndFilterContext ctx) {
        Filter f1 = (new FilterBuilder()).visit(ctx.f(0));
        Filter f2 = (new FilterBuilder()).visit(ctx.f(1));
        return new AndF(f1, f2).toString();
    }

    @Override
    public String visitOrFilter(ExpressionGrammarParser.OrFilterContext ctx) {
        Filter f1 = (new FilterBuilder()).visit(ctx.f(0));
        Filter f2 = (new FilterBuilder()).visit(ctx.f(1));
        return new OrF(f1, f2).toString();
    }

    @Override
    public String visitNotFilter(ExpressionGrammarParser.NotFilterContext ctx) {
        Filter f = (new FilterBuilder()).visit(ctx.f());
        return new NotF(f).toString();
    }
}

