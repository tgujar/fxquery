package edu.ucsd.cse232b.rewriter;

import edu.ucsd.cse232b.expressions.relative.*;
import edu.ucsd.cse232b.filters.Filter;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;
import edu.ucsd.cse232b.visitors.FilterBuilder;
import edu.ucsd.cse232b.visitors.RelativePathBuilder;

public class RelativePathRewriter extends ExpressionGrammarBaseVisitor<String> {

    @Override
    public String visitTagNameRp(ExpressionGrammarParser.TagNameRpContext ctx) {
        return new TagName(ctx.tagName().getText()).toString();
    }

    @Override
    public String visitStarRp(ExpressionGrammarParser.StarRpContext ctx) {
        return new Star().toString();
    }

    @Override
    public String visitTextRp(ExpressionGrammarParser.TextRpContext ctx) {
        return new Text().toString();
    }

    @Override
    public String visitSelfRp(ExpressionGrammarParser.SelfRpContext ctx) {
        return new Self().toString();
    }

    @Override
    public String visitParentRp(ExpressionGrammarParser.ParentRpContext ctx) {
        return new Parent().toString();
    }

    @Override
    public String visitAttrRp(ExpressionGrammarParser.AttrRpContext ctx) {
        return new Attr(ctx.attName().getText()).toString();
    }

    @Override
    public String visitPrRp(ExpressionGrammarParser.PrRpContext ctx) {
        RelativePath rp = (new RelativePathBuilder()).visit(ctx.rp());
        return new Paren(rp).toString();
    }


    @Override
    public String visitSlRp(ExpressionGrammarParser.SlRpContext ctx) {
        RelativePath parent = (new RelativePathBuilder()).visit(ctx.rp(0));
        RelativePath child = (new RelativePathBuilder()).visit(ctx.rp(1));
        return new Slash(parent, child).toString();
    }

    @Override
    public String visitDSlRp(ExpressionGrammarParser.DSlRpContext ctx) {
        RelativePath parent = (new RelativePathBuilder()).visit(ctx.rp(0));
        RelativePath child = (new RelativePathBuilder()).visit(ctx.rp(1));
        return new DoubleSlash(parent, child).toString();
    }

    @Override
    public String visitFilterRp(ExpressionGrammarParser.FilterRpContext ctx) {
        RelativePath rp = (new RelativePathBuilder()).visit(ctx.rp());
        Filter f = (new FilterBuilder()).visit(ctx.f());
        return new RpFilter(f, rp).toString();
    }

    @Override
    public String visitCommaRp(ExpressionGrammarParser.CommaRpContext ctx) {
        RelativePath rp1 = (new RelativePathBuilder()).visit(ctx.rp(0));
        RelativePath rp2 = (new RelativePathBuilder()).visit(ctx.rp(1));
        return new Comma(rp1, rp2).toString();
    }
}
