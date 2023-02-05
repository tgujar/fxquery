package edu.ucsd.cse232b.expressions.relative;

import org.w3c.dom.Node;

import java.util.List;
import java.util.stream.Collectors;

import static org.w3c.dom.Node.TEXT_NODE;

public class Text implements RelativePath{
    @Override
    public List<Node> solve(List<Node> ctxList) throws Exception {
        Star st = new Star();
        return st.solve(ctxList).stream().filter(child -> {
            return child.getNodeType() == TEXT_NODE;
        }).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "text()";
    }
}
