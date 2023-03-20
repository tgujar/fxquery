package edu.ucsd.cse232b.rewriter;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;
import edu.ucsd.cse232b.visitors.ContextExpressionBuilder;
import org.w3c.dom.Document;
import java.util.Stack;


public class ContextExpressionRewriter extends ExpressionGrammarBaseVisitor<String> {

    Stack<Context> st;
    Document doc;

    public ContextExpressionRewriter(Stack<Context> st, Document doc) {
        this.st = st;
        this.doc = doc;
    }

    @Override
    public String visitApX(ExpressionGrammarParser.ApXContext ctx) {
        return (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx).rewrite();
    }

    @Override
    public String visitTagX(ExpressionGrammarParser.TagXContext ctx) {
        return (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx).rewrite();
    }

    @Override
    public String visitVarX(ExpressionGrammarParser.VarXContext ctx) {
        return (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx).rewrite();
    }

    @Override
    public String visitTextX(ExpressionGrammarParser.TextXContext ctx) {
        return (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx).rewrite();
    }

    @Override
    public String visitPrX(ExpressionGrammarParser.PrXContext ctx) {
        return (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx).rewrite();
    }

    @Override
    public String visitCommaX(ExpressionGrammarParser.CommaXContext ctx) {
        return (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx).rewrite();
    }

    @Override
    public String visitCSlRpX(ExpressionGrammarParser.CSlRpXContext ctx) {
        return (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx).rewrite();
    }

    @Override
    public String visitDSLRpX(ExpressionGrammarParser.DSLRpXContext ctx) {
        return (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx).rewrite();
    }

    @Override
    public String visitLetX(ExpressionGrammarParser.LetXContext ctx) {
        return (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx).rewrite();
    }

    @Override
    public String visitForX(ExpressionGrammarParser.ForXContext ctx) {
        return (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx).rewrite();
    }
}