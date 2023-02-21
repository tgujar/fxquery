package edu.ucsd.cse232b;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Context {
    private HashMap<String, List<Node>> vars;

    public Context(Context c) {
        this.vars = c.getAllVars();
    }

    public HashMap<String, List<Node>> getAllVars() {
        return (HashMap<String, List<Node>>) (this.vars).clone();
    }

    public List<Node> getVar(String p) {
        return vars.get(p);
    }

    public void putVar(String p, List<Node> nl) {
        this.vars.put(p, nl);
    }
}
