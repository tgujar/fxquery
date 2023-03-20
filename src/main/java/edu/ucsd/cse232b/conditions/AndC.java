package edu.ucsd.cse232b.conditions;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.expressions.contextual.ContextExp;
import org.w3c.dom.Document;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AndC implements Condition, SubsetCond {
    private final Condition c1;
    private final Condition c2;

    public AndC(Condition c1, Condition c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean solve(Stack<Context> c, Document doc) throws Exception {
        return c1.solve(c, doc) && c2.solve(c, doc);
    }

    @Override
    public String toString() {
        return String.format("%s and %s", c1.toString(), c2.toString());
    }

    @Override
    public List<List<ContextExp>>getEqCompares() {
        if (!(c2 instanceof SubsetCond && c1 instanceof SubsetCond)) {
            throw new RuntimeException("Subset grammar only implements Eq for Vars and And operator");
        }
        List<List<ContextExp>> res = new ArrayList<>();
        res.addAll(((SubsetCond) c1).getEqCompares());
        res.addAll(((SubsetCond) c2).getEqCompares());
        return res;
    }
}
