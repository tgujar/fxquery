package edu.ucsd.cse232b.visitors;


import edu.ucsd.cse232b.expressions.ChildrenRp;
import edu.ucsd.cse232b.expressions.Expression;
import edu.ucsd.cse232b.expressions.NodeRp;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;

public class ExpressionBuilder extends ExpressionGrammarBaseVisitor<Expression> {

// TODO:: Everything except TagNameRp,StarRp,TextRp,SelfRp,ParentRp,AttrRp

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

}