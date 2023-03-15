package edu.ucsd.cse232b.expressions.relative;

import edu.ucsd.cse232b.filters.Filter;
import org.w3c.dom.Node;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RpFilter implements RelativePath {

    private final Filter f;
    private final RelativePath rp;

    public RpFilter(Filter f, RelativePath rp) {
        this.f = f;
        this.rp = rp;
    }

    @Override
    public List<Node> solve(List<Node> ctxList) throws Exception {
        List<Node> nodes = rp.solve(ctxList);
        return nodes.stream().filter(node -> {
            try {
                return f.solve(List.of(node));
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return rp.toString() + "[" + f.toString() + "]";
    }
}
