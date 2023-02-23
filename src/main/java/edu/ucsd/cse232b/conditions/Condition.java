package edu.ucsd.cse232b.conditions;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;


public interface Condition {
    boolean solve(Context c, Document doc) throws Exception;

    String toString();
}
