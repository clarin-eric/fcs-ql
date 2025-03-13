package eu.clarin.sru.fcs.qlparser;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * A test runner for queries in files or on STDIN.
 */
public class LexTest {
    public static void main(String[] args) throws Exception {
        String inputFile = null; 
        if (args.length > 0) {
            inputFile = args[0];
        }
        InputStream is = System.in;
        if (inputFile != null) {
            is = new FileInputStream(inputFile);
        }
        CharStream input = CharStreams.fromStream(is);
        LexLexer lexer = new LexLexer(input); 
        CommonTokenStream tokens = new CommonTokenStream(lexer); 
        LexParser parser = new LexParser(tokens); 
        ParseTree tree = parser.query();
        System.out.println(tree.toStringTree(parser));
    }
}
