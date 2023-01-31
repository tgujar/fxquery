package edu.ucsd.cse232b.visitors;


import edu.ucsd.cse232b.expressions.ChildrenRp;
import edu.ucsd.cse232b.expressions.Expression;
import edu.ucsd.cse232b.expressions.NestedRp;
import edu.ucsd.cse232b.expressions.NodeRp;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;

public class ExpressionBuilder extends ExpressionGrammarBaseVisitor<Expression> {

    @Override
    public Expression visitTagNameRp(ExpressionGrammarParser.TagNameRpContext ctx) {
        return new ChildrenRp(ChildrenRp.Type.TagName, ctx.tagName().getText());
    }

    @Override
    public Expression visitStarRp(ExpressionGrammarParser.StarRpContext ctx) {
        return new ChildrenRp(ChildrenRp.Type.Star, "");
    }

    @Override
    public Expression visitTextRp(ExpressionGrammarParser.TextRpContext ctx) {
        return new ChildrenRp(ChildrenRp.Type.Text, "");
    }

    @Override
    public Expression visitSelfRp(ExpressionGrammarParser.SelfRpContext ctx) {
        return new NodeRp(NodeRp.Type.Self, "");
    }

    @Override
    public Expression visitParentRp(ExpressionGrammarParser.ParentRpContext ctx) {
        return new NodeRp(NodeRp.Type.Parent, "");
    }

    @Override
    public Expression visitAttrRp(ExpressionGrammarParser.AttrRpContext ctx) {
        return new NodeRp(NodeRp.Type.Attr, ctx.attName().getText());
    }

    @Override
    public Expression visitPrRp(ExpressionGrammarParser.PrRpContext ctx) {
        Expression rp = visit(ctx.rp());
        return new NodeRp(NodeRp.Type.Pr, "", rp);
    }


    @Override
    public Expression visitSlRp(ExpressionGrammarParser.SlRpContext ctx) {
        Expression parent = visit(ctx.rp(0));
        Expression child = visit(ctx.rp(1));
        return new NestedRp(NestedRp.Type.Sl, parent, child);
    }

    @Override
    public Expression visitDSlRp(ExpressionGrammarParser.DSlRpContext ctx) {
        Expression parent = visit(ctx.rp(0));
        Expression child = visit(ctx.rp(1));
        return new NestedRp(NestedRp.Type.DSl, parent, child);
    }

}