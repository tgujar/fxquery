package edu.ucsd.cse232b.visitors;

import edu.ucsd.cse232b.expressions.relative.*;
import edu.ucsd.cse232b.filters.Filter;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;

public class RelativePathBuilder extends ExpressionGrammarBaseVisitor<RelativePath> {

    @Override
    public RelativePath visitTagNameRp(ExpressionGrammarParser.TagNameRpContext ctx) {
        return new TagName(ctx.tagName().getText());
    }

    @Override
    public RelativePath visitStarRp(ExpressionGrammarParser.StarRpContext ctx) {
        return new Star();
    }

    @Override
    public RelativePath visitTextRp(ExpressionGrammarParser.TextRpContext ctx) {
        return new Text();
    }

    @Override
    public RelativePath visitSelfRp(ExpressionGrammarParser.SelfRpContext ctx) {
        return new Self();
    }

    @Override
    public RelativePath visitParentRp(ExpressionGrammarParser.ParentRpContext ctx) {
        return new Parent();
    }

    @Override
    public RelativePath visitAttrRp(ExpressionGrammarParser.AttrRpContext ctx) {
        return new Attr(ctx.attName().getText());
    }

    @Override
    public RelativePath visitPrRp(ExpressionGrammarParser.PrRpContext ctx) {
        RelativePath rp = visit(ctx.rp());
        return new Paren(rp);
    }


    @Override
    public RelativePath visitSlRp(ExpressionGrammarParser.SlRpContext ctx) {
        RelativePath parent = visit(ctx.rp(0));
        RelativePath child = visit(ctx.rp(1));
        return new Slash(parent, child);
    }

    @Override
    public RelativePath visitDSlRp(ExpressionGrammarParser.DSlRpContext ctx) {
        RelativePath parent = visit(ctx.rp(0));
        RelativePath child = visit(ctx.rp(1));
        return new DoubleSlash(parent, child);
    }

    @Override
    public RelativePath visitFilterRp(ExpressionGrammarParser.FilterRpContext ctx) {
        RelativePath rp = visit(ctx.rp());
        Filter f = (new FilterBuilder()).visit(ctx.f());
        return new RpFilter(f, rp);
    }

    @Override
    public RelativePath visitCommaRp(ExpressionGrammarParser.CommaRpContext ctx) {
        RelativePath rp1 = visit(ctx.rp(0));
        RelativePath rp2 = visit(ctx.rp(1));
        return new Comma(rp1, rp2);
    }
}
