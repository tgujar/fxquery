package edu.ucsd.cse232b.expressions.contextual;

import edu.ucsd.cse232b.Context;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.*;
import java.util.stream.Collectors;

public class Join implements ContextExp {
    private final ContextExp ce1;
    private final ContextExp ce2;
    private List<String> attList1;
    private List<String> attList2;
    private final Set<String> deps;

    public Join(ContextExp ce1, ContextExp ce2, List<String> attList1, List<String> attList2) {
        this.ce1 = ce1;
        this.ce2 = ce2;
        this.attList1 = attList1;
        this.attList2 = attList2;
        this.deps = new HashSet<>();
        this.deps.addAll(ce1.getDeps());
        this.deps.addAll(ce2.getDeps());
    }

    private String encode(List<String> hashAtts, Node tuple) {
        //TODO:: Hash the generated string to minimize string comparision cost
        return nodeListToList(tuple.getChildNodes())
                .stream()
                .filter(it -> hashAtts.contains(it.getNodeName()))
                .map(n -> n.getFirstChild().getTextContent())
                .collect(Collectors.joining("#"));
    }

    public static List<Node> nodeListToList(NodeList nodeList) {
        List<Node> nodeSet = new ArrayList<>(Collections.emptyList());
        for (int i = 0; i < nodeList.getLength(); i++) {
            nodeSet.add(nodeList.item(i));
        }
        return nodeSet;
    }

    private HashMap<String, List<Node>> constructHashMap(List<Node> tuples, List<String> hashAtts) {
        HashMap<String, List<Node>> hashMap = new HashMap<>();
        tuples.forEach(tuple -> {
            String key = encode(hashAtts, tuple);
            if (hashMap.containsKey(key)) {
                hashMap.get(key).add(tuple);
            } else {
                hashMap.put(key, new ArrayList<>(List.of(tuple)));
            }
        });
        return hashMap;
    }

    @Override
    public List<Node> solve(Stack<Context> c, Document doc) throws Exception {
        List<Node> leftTuples = this.ce1.solve(c, doc);
        List<Node> rightTuples = this.ce2.solve(c, doc);
        HashMap<String, List<Node>> hashMap = constructHashMap(leftTuples, this.attList1);
        List<Node> result = new ArrayList<>(Collections.emptyList());
        rightTuples.forEach(rightTuple -> {
            String key = encode(this.attList2, rightTuple);
            List<Node> joinCandidates = hashMap.getOrDefault(key, Collections.emptyList());
            joinCandidates.forEach(left -> {
                Node resultTuple = doc.createElement("tuple");
                nodeListToList(left.getChildNodes()).forEach(node -> resultTuple.appendChild(node.cloneNode(true)));
                nodeListToList(rightTuple.getChildNodes()).forEach(node -> resultTuple.appendChild(node.cloneNode(true)));
                result.add(resultTuple);
            });
        });
        return result;
    }


    @Override
    public String toString() {
        String s_attr1 = this.attList1.toString();
        String s_attr2 = this.attList2.toString();
        return String.format("join (\n %s,\n %s,\n %s,\n %s)", this.ce1.toString(), this.ce2.toString(), s_attr1, s_attr2);
    }

    @Override
    public Set<String> getDeps() {
        return this.deps;
    }

    @Override
    public String rewrite() {
        return this.toString();
    }
}
