package edu.ucsd.cse232b.visitors;

import edu.ucsd.cse232b.expressions.Ap;
import edu.ucsd.cse232b.parsers.ExpressionGrammarLexer;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static Document loadXMLFrom(String filename) throws Exception {
        // ref: https://docs.oracle.com/javase/tutorial/jaxp/dom/readingXML.html
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.parse(new File(filename));
    }

    // TODO:: Fix bug for multiple nodes written to file
    public static void format(List<Node> result) throws Exception {
        // ref: https://docs.oracle.com/javase/tutorial/jaxp/xslt/writingDom.html
        TransformerFactory tfFactory = TransformerFactory.newInstance();
        Transformer transformer = tfFactory.newTransformer();
        StreamResult out = new StreamResult(new File("xresults.xml"));
        result.forEach(node -> {
            DOMSource source = new DOMSource(node);
            // Uncomment this line to print on terminal
//            StreamResult out = new StreamResult(System.out);
            try {
                transformer.transform(source, out);
            } catch (TransformerException e) {
                e.printStackTrace();
            }
        });
    }

    public static void main(String[] args) throws Exception {

        String query = "doc(\"j_caesar.xml\")/PLAY/FM";
        String DOC_ROOT = "j_caesar.xml";

        Document xmlDoc = loadXMLFrom(DOC_ROOT);
        // ref: https://github.com/vishalkks/antlr-tutorial
        final ExpressionGrammarLexer lexer = new ExpressionGrammarLexer(CharStreams.fromString(query));
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final ExpressionGrammarParser parser = new ExpressionGrammarParser(tokens);
        final ParserRuleContext tree = parser.ap();
        final ProgramBuilder programBuilder = new ProgramBuilder();
        final Ap program = programBuilder.visit(tree);
        List<Node> ctxList = new ArrayList<>();
        ctxList.add(xmlDoc);
        List<Node> result = program.solve(ctxList);
        format(result);
    }
}