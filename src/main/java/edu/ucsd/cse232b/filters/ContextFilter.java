package edu.ucsd.cse232b.filters;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;

import java.util.Stack;

@Deprecated
public interface ContextFilter {
    boolean solve(Stack<Context> c, Document doc) throws Exception;

    String toString();
}
