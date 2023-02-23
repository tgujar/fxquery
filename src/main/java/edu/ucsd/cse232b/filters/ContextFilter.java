package edu.ucsd.cse232b.filters;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;


public interface ContextFilter {
    boolean solve(Context c, Document doc) throws Exception;

    String toString();
}
