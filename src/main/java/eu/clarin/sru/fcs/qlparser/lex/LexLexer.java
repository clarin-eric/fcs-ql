// Generated from eu/clarin/sru/fcs/qlparser/lex/LexLexer.g4 by ANTLR 4.13.2
package eu.clarin.sru.fcs.qlparser.lex;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LexLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		L_PAREN=1, R_PAREN=2, EQUAL=3, GREATER=4, LESSER=5, GREATER_EQUAL=6, LESSER_EQUAL=7, 
		NOT_EQUAL=8, EQUAL_EQUAL=9, SLASH=10, AND=11, OR=12, NOT=13, DOT=14, QUOTED_STRING=15, 
		SIMPLE_STRING=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"L_PAREN", "R_PAREN", "EQUAL", "GREATER", "LESSER", "GREATER_EQUAL", 
			"LESSER_EQUAL", "NOT_EQUAL", "EQUAL_EQUAL", "SLASH", "AND", "OR", "NOT", 
			"DOT", "QUOTED_STRING", "SIMPLE_STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'='", "'>'", "'<'", "'>='", "'<='", "'<>'", "'=='", 
			"'/'", null, null, null, "'.'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "L_PAREN", "R_PAREN", "EQUAL", "GREATER", "LESSER", "GREATER_EQUAL", 
			"LESSER_EQUAL", "NOT_EQUAL", "EQUAL_EQUAL", "SLASH", "AND", "OR", "NOT", 
			"DOT", "QUOTED_STRING", "SIMPLE_STRING", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public LexLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0011\\\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000eM\b\u000e\n\u000e"+
		"\f\u000eP\t\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004\u000fU\b\u000f"+
		"\u000b\u000f\f\u000fV\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0000\u0000\u0011\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005"+
		"\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019"+
		"\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011\u0001\u0000\t\u0002\u0000"+
		"AAaa\u0002\u0000NNnn\u0002\u0000DDdd\u0002\u0000OOoo\u0002\u0000RRrr\u0002"+
		"\u0000TTtt\u0002\u0000\"\"\\\\\b\u0000\t\n\r\r  \"\"()//<>\\\\\u0003\u0000"+
		"\t\n\r\r  ^\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0001#\u0001\u0000\u0000\u0000\u0003%"+
		"\u0001\u0000\u0000\u0000\u0005\'\u0001\u0000\u0000\u0000\u0007)\u0001"+
		"\u0000\u0000\u0000\t+\u0001\u0000\u0000\u0000\u000b-\u0001\u0000\u0000"+
		"\u0000\r0\u0001\u0000\u0000\u0000\u000f3\u0001\u0000\u0000\u0000\u0011"+
		"6\u0001\u0000\u0000\u0000\u00139\u0001\u0000\u0000\u0000\u0015;\u0001"+
		"\u0000\u0000\u0000\u0017?\u0001\u0000\u0000\u0000\u0019B\u0001\u0000\u0000"+
		"\u0000\u001bF\u0001\u0000\u0000\u0000\u001dH\u0001\u0000\u0000\u0000\u001f"+
		"T\u0001\u0000\u0000\u0000!X\u0001\u0000\u0000\u0000#$\u0005(\u0000\u0000"+
		"$\u0002\u0001\u0000\u0000\u0000%&\u0005)\u0000\u0000&\u0004\u0001\u0000"+
		"\u0000\u0000\'(\u0005=\u0000\u0000(\u0006\u0001\u0000\u0000\u0000)*\u0005"+
		">\u0000\u0000*\b\u0001\u0000\u0000\u0000+,\u0005<\u0000\u0000,\n\u0001"+
		"\u0000\u0000\u0000-.\u0005>\u0000\u0000./\u0005=\u0000\u0000/\f\u0001"+
		"\u0000\u0000\u000001\u0005<\u0000\u000012\u0005=\u0000\u00002\u000e\u0001"+
		"\u0000\u0000\u000034\u0005<\u0000\u000045\u0005>\u0000\u00005\u0010\u0001"+
		"\u0000\u0000\u000067\u0005=\u0000\u000078\u0005=\u0000\u00008\u0012\u0001"+
		"\u0000\u0000\u00009:\u0005/\u0000\u0000:\u0014\u0001\u0000\u0000\u0000"+
		";<\u0007\u0000\u0000\u0000<=\u0007\u0001\u0000\u0000=>\u0007\u0002\u0000"+
		"\u0000>\u0016\u0001\u0000\u0000\u0000?@\u0007\u0003\u0000\u0000@A\u0007"+
		"\u0004\u0000\u0000A\u0018\u0001\u0000\u0000\u0000BC\u0007\u0001\u0000"+
		"\u0000CD\u0007\u0003\u0000\u0000DE\u0007\u0005\u0000\u0000E\u001a\u0001"+
		"\u0000\u0000\u0000FG\u0005.\u0000\u0000G\u001c\u0001\u0000\u0000\u0000"+
		"HN\u0005\"\u0000\u0000IJ\u0005\\\u0000\u0000JM\u0007\u0006\u0000\u0000"+
		"KM\b\u0006\u0000\u0000LI\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000"+
		"MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005\"\u0000"+
		"\u0000R\u001e\u0001\u0000\u0000\u0000SU\b\u0007\u0000\u0000TS\u0001\u0000"+
		"\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000W \u0001\u0000\u0000\u0000XY\u0007\b\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z[\u0006\u0010\u0000\u0000[\"\u0001\u0000\u0000\u0000"+
		"\u0004\u0000LNV\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}