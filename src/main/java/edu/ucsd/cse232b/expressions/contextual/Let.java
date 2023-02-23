package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;

public class Let implements ContextExp {
    private final List<String> varNames;
    private final List<ContextExp> exps;
    private final ContextExp ce;

    public Let(List<String> varNames, List<ContextExp> exps, ContextExp ce) {
        this.varNames = varNames;
        this.exps = exps;
        this.ce = ce;
    }

    @Override
    public List<Node> solve(Context ctx, Document doc) throws Exception {
        for(int i = 0; i<varNames.size();i++) {
            List<Node> nodes = exps.get(i).solve(ctx, doc);
            ctx.putVar(varNames.get(i), nodes);
        }
        return ce.solve(ctx, doc);
    }

    @Override
    public String toString() {
        return "{" + "$" + varNames + "}";
    }
}
