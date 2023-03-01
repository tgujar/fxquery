package edu.ucsd.cse232b.visitors;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.expressions.absolute.AbsolutePath;
import edu.ucsd.cse232b.expressions.contextual.*;
import edu.ucsd.cse232b.expressions.relative.RelativePath;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public ContextExp visitCommaReturn(ExpressionGrammarParser.CommaReturnContext ctx) {
        ContextExp exp1 = visit(ctx.r(0));
        ContextExp exp2 = visit(ctx.r(1));
        return new Comma(exp1, exp2);
    }

    @Override
    public ContextExp visitXReturn(ExpressionGrammarParser.XReturnContext ctx) {
        return visit(ctx.x());
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
        iterateLet(ctx, vars, xs, 0);
        return visit(ctx.x());
    }

    @Override
    public ContextExp visitForX(ExpressionGrammarParser.ForXContext ctx) {
        List<ExpressionGrammarParser.VarContext> vars = ctx.forClause().var();
        List<ExpressionGrammarParser.XContext> xs = ctx.forClause().x();
        For f = new For();
        try {
            Context newContext = new Context(st.peek());
            st.push(newContext);
            iterateFor(ctx, vars, xs, 0, f);
            st.pop();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return f;
    }

    private void iterateFor(ExpressionGrammarParser.ForXContext ctx, List<ExpressionGrammarParser.VarContext> vars, List<ExpressionGrammarParser.XContext> xs, int index, For f) throws Exception {
        if (index == ctx.forClause().var().size()) {
            if (ctx.letClause() != null) visit(ctx.letClause());
            if (ctx.whereClause() != null) {
                if ((new ConditionBuilder(st, doc)).visit(ctx.whereClause()).solve(st, doc)) {
                    ContextExp exp = visit(ctx.returnClause());
                    f.add(exp.solve(st, doc));
                }
            } else {
                ContextExp exp = visit(ctx.returnClause());
                f.add(exp.solve(st, doc));
            }
            return;
        }
        try {
            List<Node> nodes = (new ContextExpressionBuilder(st, doc)).visit(xs.get(index)).solve(st, doc);
            for (Node node : nodes) {
                st.peek().putVar(vars.get(index).ID().getText(), List.of(node));
                iterateFor(ctx, vars, xs, index + 1, f);
            }
        } catch (Exception e) {
            throw new RuntimeException("Error solving expression", e);
        }
    }

    private void iterateLet(ExpressionGrammarParser.LetXContext ctx, List<ExpressionGrammarParser.VarContext> vars, List<ExpressionGrammarParser.XContext> xs, int index) {
        if (index == vars.size()) {
            return;
        }
        try {
            List<Node> nodes = (new ContextExpressionBuilder(st, doc)).visit(xs.get(index)).solve(st, doc);
            st.peek().putVar(vars.get(index).ID().getText(), nodes);
            iterateLet(ctx, vars, xs, index + 1);
        } catch (Exception e) {
            throw new RuntimeException("Error solving expression", e);
        }
    }
}
