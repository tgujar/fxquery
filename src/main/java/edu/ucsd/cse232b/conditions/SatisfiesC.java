package edu.ucsd.cse232b.conditions;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.expressions.contextual.ContextExp;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;

public class SatisfiesC implements Condition {
    private final List<String> vars;
    private final List<ContextExp> exps;

    public SatisfiesC(List<String> vars, List<ContextExp> exps) {
        this.vars = vars;
        this.exps = exps;
    }

    @Override
    public boolean solve(Context c, Document doc) throws Exception {
        for (int i = 0; i<vars.size(); i++) {
            List<Node> val = c.getAllVars().get(vars.get(i));
            if (exps.get(i).solve(c, doc).stream().anyMatch(val);
        }
        exps.forEach(exp -> exp.solve(c, doc).contains());
    }

    @Override
    public String toString() {
        return String.format("%s and %s", c1.toString(), c2.toString());
    }
}
