package edu.ucsd.cse232b.conditions;

import edu.ucsd.cse232b.expressions.contextual.ContextExp;

import java.util.List;

public interface SubsetCond extends Condition {
    List<List<ContextExp>> getEqCompares();
}
