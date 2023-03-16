package edu.ucsd.cse232b.rewriter;

import edu.ucsd.cse232b.expressions.absolute.AbsolutePath;
import edu.ucsd.cse232b.expressions.absolute.ApDoubleSlash;
import edu.ucsd.cse232b.expressions.absolute.ApSlash;
import edu.ucsd.cse232b.expressions.relative.RelativePath;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;
import edu.ucsd.cse232b.visitors.RelativePathBuilder;

public class AbsolutePathRewriter extends ExpressionGrammarBaseVisitor<String> {
    @Override
    public String visitSlAp(ExpressionGrammarParser.SlApContext ctx) {
        RelativePath rp = (new RelativePathBuilder()).visit(ctx.rp());
        System.out.println(ctx.doc().getText());
        return new ApSlash(rp, ctx.doc().getText()).toString();
    }

    @Override
    public String visitDSlAp(ExpressionGrammarParser.DSlApContext ctx) {
        RelativePath rp = (new RelativePathBuilder()).visit(ctx.rp());
        System.out.println(ctx.doc().getText());
        return new ApDoubleSlash(rp, ctx.doc().getText()).toString();
    }
}
