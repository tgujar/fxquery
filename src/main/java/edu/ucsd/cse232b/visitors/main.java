package edu.ucsd.cse232b.visitors;

import edu.ucsd.cse232b.expressions.absolute.AbsolutePath;
import edu.ucsd.cse232b.parsers.ExpressionGrammarLexer;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    private static final String DOCROOT = "j_caesar.xml";

    public static Document loadXMLFrom(String filename) throws Exception {
        // ref: https://docs.oracle.com/javase/tutorial/jaxp/dom/readingXML.html
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        return db.parse(new File(filename));
    }

    public static Document createDoc(List<Node> result) throws Exception {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

        // root element
        Document doc = docBuilder.newDocument();
        Element rootElement = doc.createElement("RESULT");
        doc.appendChild(rootElement);
        result.forEach(node -> {
            rootElement.appendChild(doc.importNode(node, true));
        });
        return doc;
    }

    public static void writeResult(Document doc, OutputStream o) throws Exception {
        TransformerFactory tfFactory = TransformerFactory.newInstance();
        Transformer transformer = tfFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes"); // omit xml version tag
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.METHOD, "html");
        StreamResult out = new StreamResult(o);
        DOMSource source = new DOMSource(doc);
        transformer.transform(source, out);
    }


    public static String readFile(String filename) {
        StringBuilder res = new StringBuilder();
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                res.append(myReader.nextLine());
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Invalid file path");
        }
        return res.toString();
    }

    public static void main(String[] args) throws Exception {
        start(args);
    }

    public static void start(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Format: <Input_XPath_File name, for example XPath.txt> <output file name, for example, output.xml>");
        }
        String query = readFile(args[0]);
        String output_file = args[1];

        Document xmlDoc = loadXMLFrom(DOCROOT);
        // ref: https://github.com/vishalkks/antlr-tutorial
        final ExpressionGrammarLexer lexer = new ExpressionGrammarLexer(CharStreams.fromString(query));
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final ExpressionGrammarParser parser = new ExpressionGrammarParser(tokens);
        final ParserRuleContext tree = parser.ap();
        final AbsolutePathBuilder programBuilder = new AbsolutePathBuilder();
        final AbsolutePath program = programBuilder.visit(tree);

        List<Node> ctxList = new ArrayList<>();
        ctxList.add(xmlDoc);
        List<Node> result = program.solve(ctxList, xmlDoc);

        FileOutputStream f = new FileOutputStream(output_file);
        Document doc = createDoc(result);
        writeResult(doc, f);
    }
}