package edu.ucsd.cse232b.expressions.relative;

import org.w3c.dom.Node;

import java.util.List;
import java.util.stream.Collectors;

import static org.w3c.dom.Node.ELEMENT_NODE;

public class TagName implements RelativePath {
    private final String tagname;

    public TagName(String tagname) {
        this.tagname = tagname;
    }

    @Override
    public List<Node> solve(List<Node> ctxList) throws Exception {
        Star st = new Star();
        return st.solve(ctxList).stream().filter(child -> {
            return child.getNodeType() == ELEMENT_NODE && child.getNodeName().equals(tagname);
        }).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return tagname;
    }
}
