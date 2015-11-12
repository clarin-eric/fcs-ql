/*

*/
package eu.clarin.sru.fcs.qlparser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;
/**
   A test runner for queries in files or on STDIN.
   20150515 /ljo
*/
public class FCSTest {
    public static void main(String[] args) throws Exception {
        String inputFile = null; 
        if (args.length > 0) {
	    inputFile = args[0];
	}
        InputStream is = System.in;
        if (inputFile!=null) {
	    is = new FileInputStream(inputFile);
	}
        ANTLRInputStream input = new ANTLRInputStream(is); 
        FCSLexer lexer = new FCSLexer(input); 
        CommonTokenStream tokens = new CommonTokenStream(lexer); 
        FCSParser parser = new FCSParser(tokens); 
        ParseTree tree = parser.query();
        System.out.println(tree.toStringTree(parser));
    }
}
