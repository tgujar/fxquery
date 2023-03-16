package edu.ucsd.cse232b.rewriter;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.expressions.absolute.AbsolutePath;
import edu.ucsd.cse232b.expressions.contextual.*;
import edu.ucsd.cse232b.expressions.relative.RelativePath;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;
import edu.ucsd.cse232b.visitors.AbsolutePathBuilder;
import edu.ucsd.cse232b.visitors.ConditionBuilder;
import edu.ucsd.cse232b.visitors.ContextExpressionBuilder;
import edu.ucsd.cse232b.visitors.RelativePathBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
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
        AbsolutePath ap = (new AbsolutePathBuilder()).visit(ctx.ap());
        List<Node> ctxList = new ArrayList<>();
        ctxList.add(doc);
        return new Ap(ap, ctxList).toString();
    }

    @Override
    public String visitTagX(ExpressionGrammarParser.TagXContext ctx) {
        ContextExp ce = (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx.x());
        return new Tag(ctx.tagOpen().tagName().getText(), ce).toString();
    }

    @Override
    public String visitVarX(ExpressionGrammarParser.VarXContext ctx) {
        return new Var(ctx.var().ID().getText()).toString();
    }

    @Override
    public String visitTextX(ExpressionGrammarParser.TextXContext ctx) {
        String str = ctx.strConst().STR().getText();
        return new StrConst(str.substring(1, str.length() - 1)).toString();
    }

    @Override
    public String visitPrX(ExpressionGrammarParser.PrXContext ctx) {
        ContextExp exp = (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx.x());
        return new Paren(exp).toString();
    }

    @Override
    public String visitCommaX(ExpressionGrammarParser.CommaXContext ctx) {
        ContextExp exp1 = (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx.x(0));
        ContextExp exp2 = (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx.x(1));
        return new Comma(exp1, exp2).toString();
    }

    @Override
    public String visitCSlRpX(ExpressionGrammarParser.CSlRpXContext ctx) {
        RelativePath rp = (new RelativePathBuilder()).visit(ctx.rp());
        ContextExp exp = (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx.x());
        return new Slash(rp, exp).toString();
    }

    @Override
    public String visitDSLRpX(ExpressionGrammarParser.DSLRpXContext ctx) {
        RelativePath rp = (new RelativePathBuilder()).visit(ctx.rp());
        ContextExp exp = (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx.x());
        return new DoubleSlash(rp, exp).toString();
    }

    @Override
    public String visitLetX(ExpressionGrammarParser.LetXContext ctx) {
//        List<ExpressionGrammarParser.VarContext> vars = ctx.letClause().var();
//        List<ExpressionGrammarParser.XContext> xs = ctx.letClause().x();
        return (new ContextExpressionBuilder(this.st, this.doc)).visit(ctx.x()).toString();
    }

    @Override
    public String visitForX(ExpressionGrammarParser.ForXContext ctx) {
//        List<ExpressionGrammarParser.VarContext> vars = ctx.forClause().var();
//        List<ExpressionGrammarParser.XContext> xs = ctx.forClause().x();
        For f = new For();
//        try {
//            Context newContext = new Context(st.peek());
//            st.push(newContext);
//            st.pop();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return f.toString();
    }
}