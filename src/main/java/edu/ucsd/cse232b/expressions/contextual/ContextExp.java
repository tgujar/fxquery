package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.util.List;
import java.util.Stack;

public interface ContextExp {
        List<Node> solve(Stack<Context> c, Document doc) throws Exception;
        String toString();
}
