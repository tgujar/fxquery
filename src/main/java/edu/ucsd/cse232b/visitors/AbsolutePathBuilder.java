package edu.ucsd.cse232b.visitors;

import edu.ucsd.cse232b.expressions.absolute.AbsolutePath;
import edu.ucsd.cse232b.expressions.absolute.ApDoubleSlash;
import edu.ucsd.cse232b.expressions.absolute.ApSlash;
import edu.ucsd.cse232b.expressions.relative.RelativePath;
import edu.ucsd.cse232b.parsers.ExpressionGrammarBaseVisitor;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;

public class AbsolutePathBuilder extends ExpressionGrammarBaseVisitor<AbsolutePath> {
    @Override
    public AbsolutePath visitSlAp(ExpressionGrammarParser.SlApContext ctx) {
        RelativePath rp = (new RelativePathBuilder()).visit(ctx.rp());
        return new ApSlash(rp, ctx.doc().getText());
    }

    @Override
    public AbsolutePath visitDSlAp(ExpressionGrammarParser.DSlApContext ctx) {
        RelativePath rp = (new RelativePathBuilder()).visit(ctx.rp());
        return new ApDoubleSlash(rp, ctx.doc().getText());
    }
}
