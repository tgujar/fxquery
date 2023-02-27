package edu.ucsd.cse232b.conditions;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;

import java.util.Stack;


public interface Condition {
    boolean solve(Stack<Context> c, Document doc) throws Exception;

    String toString();
}
