package edu.ucsd.cse232b.rewriter;

import edu.ucsd.cse232b.Context;
import edu.ucsd.cse232b.expressions.contextual.ContextExp;
import edu.ucsd.cse232b.parsers.ExpressionGrammarLexer;
import edu.ucsd.cse232b.parsers.ExpressionGrammarParser;
import edu.ucsd.cse232b.visitors.ContextExpressionBuilder;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

import java.io.FileOutputStream;
import java.util.List;
import java.util.Stack;

import static edu.ucsd.cse232b.visitors.main.*;

public class main {
    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Format: <Input_XQuery name, for example Input_XQuery.txt> <output file name, for example, output.xml>");
        }
        String query = readFile(args[0]);
        String output_file = args[1];

        Document xmlDoc = loadXMLFrom(DOCROOT);
        // ref: https://github.com/vishalkks/antlr-tutorial
        final ExpressionGrammarLexer lexer = new ExpressionGrammarLexer(CharStreams.fromString(query));
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final ExpressionGrammarParser parser = new ExpressionGrammarParser(tokens);
        final ParserRuleContext tree = parser.x();
        Stack<Context> st = new Stack<>();
        Context init = new Context();
        st.push(init);

        final ContextExpressionRewriter programBuilder = new ContextExpressionRewriter(st, xmlDoc);
        final String program = programBuilder.visit(tree);
//        List<Node> result = program.solve(st, xmlDoc);
        FileOutputStream f = new FileOutputStream(output_file);
//        Document doc = createDoc(result);
//        writeResult(doc, f);
        byte[] bytes = program.getBytes();
        f.write(bytes);
        f.close();
    }
}
