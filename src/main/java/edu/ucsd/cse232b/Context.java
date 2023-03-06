package edu.ucsd.cse232b;

import org.w3c.dom.Node;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Context {
    private HashMap<String, List<Node>> vars = new HashMap<>();

    public Context() {}

    public Context(Context c) {
        this.vars = c.getAllVars();
    }

    public HashMap<String, List<Node>> getAllVars() {
        return (HashMap<String, List<Node>>) (this.vars).clone();
    }

    public List<Node> getVar(String p) {
        return vars.get(p);
    }

    public void putVar(String p, List<Node> vals) {
        this.vars.put(p, vals);
    }
}
