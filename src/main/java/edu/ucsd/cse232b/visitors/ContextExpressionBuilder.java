package edu.ucsd.cse232b.visitors;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.conditions.Condition;
import edu.ucsd.cse232b.expressions.absolute.AbsolutePath;
import edu.ucsd.cse232b.expressions.contextual.*;
import edu.ucsd.cse232b.expressions.relative.RelativePath;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class ContextExpressionBuilder extends ExpressionGrammarBaseVisitor<ContextExp> {

    Stack<Context> st;
    Document doc;

    public ContextExpressionBuilder(Stack<Context> st, Document doc) {
        this.st = st;
        this.doc = doc;
    }

    @Override
    public ContextExp visitApX(ExpressionGrammarParser.ApXContext ctx) {
        AbsolutePath ap = (new AbsolutePathBuilder()).visit(ctx.ap());
        List<Node> ctxList = new ArrayList<>();
        ctxList.add(doc);
        return new Ap(ap, ctxList);
    }

    @Override
    public ContextExp visitTagX(ExpressionGrammarParser.TagXContext ctx) {
        ContextExp ce = visit(ctx.x());
        return new Tag(ctx.tagOpen().tagName().getText(), ce);
    }

    @Override
    public ContextExp visitVarX(ExpressionGrammarParser.VarXContext ctx) {
        return new Var(ctx.var().ID().getText());
    }

    @Override
    public ContextExp visitTextX(ExpressionGrammarParser.TextXContext ctx) {
        String str = ctx.strConst().STR().getText();
        return new StrConst(str.substring(1, str.length() - 1));
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
        List<String> vars = ctx.letClause().var().stream().map(v -> v.ID().getText()).collect(Collectors.toList());
        List<ContextExp> xs = ctx.letClause().x().stream().map(this::visit).collect(Collectors.toList());
        ContextExp x = visit(ctx.x());
        return new Let(vars, xs, x);
    }

    @Override
    public ContextExp visitForX(ExpressionGrammarParser.ForXContext ctx) {
        List<Var> for_vars = ctx.forClause().var().stream().map(v -> new Var(v.ID().getText())).collect(Collectors.toList());
        List<ContextExp> for_exp = ctx.forClause().x().stream().map(this::visit).collect(Collectors.toList());


        ContextExp let_exp = null;
        if (ctx.letClause() != null) {
            List<String> vars = ctx.letClause().var().stream().map(v -> v.ID().getText()).collect(Collectors.toList());
            List<ContextExp> xs = ctx.letClause().x().stream().map(this::visit).collect(Collectors.toList());
            let_exp = new Let(vars, xs, null);
        }

        Condition cond = ctx.whereClause() != null ? (new ConditionBuilder(this.st, this.doc)).visit(ctx.whereClause()) : null;
        ContextExp ret = visit(ctx.returnClause().x());
        return new For(for_vars, for_exp, let_exp, cond, ret);
    }

    @Override
    public ContextExp visitJoinX(ExpressionGrammarParser.JoinXContext ctx) {
        ContextExp exp1 = visit(ctx.joinClause().x(0));
        ContextExp exp2 = visit(ctx.joinClause().x(1));
        List<String> attList1 = ctx.joinClause().idList(0).ID().stream().map(ParseTree::getText).toList();
        List<String> attList2 = ctx.joinClause().idList(1).ID().stream().map(ParseTree::getText).toList();
        return new Join(exp1, exp2, attList1, attList2);
    }
}
