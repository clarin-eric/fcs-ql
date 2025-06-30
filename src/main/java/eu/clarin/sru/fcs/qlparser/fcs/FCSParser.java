// Generated from eu/clarin/sru/fcs/qlparser/fcs/FCSParser.g4 by ANTLR 4.13.2
package eu.clarin.sru.fcs.qlparser.fcs;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FCSParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		L_PAREN=1, R_PAREN=2, L_SQUARE_BRACKET=3, R_SQUARE_BRACKET=4, OR=5, AND=6, 
		NOT=7, FWD_SLASH=8, L_CURLY_BRACKET=9, R_CURLY_BRACKET=10, Q_ONE_OR_MORE=11, 
		Q_ZERO_OR_MORE=12, Q_ZERO_OR_ONE=13, Q_COMMA=14, OPERATOR_EQ=15, OPERATOR_NE=16, 
		COLON=17, WITHIN=18, SIMPLE_WITHIN_SCOPE=19, REGEXP_FLAGS=20, IDENTIFIER=21, 
		INTEGER=22, REGEXP=23, QUOTED_STRING=24, Space=25;
	public static final int
		RULE_query = 0, RULE_main_query = 1, RULE_query_disjunction = 2, RULE_query_sequence = 3, 
		RULE_query_group = 4, RULE_query_simple = 5, RULE_quantifier = 6, RULE_query_implicit = 7, 
		RULE_query_segment = 8, RULE_within_part = 9, RULE_within_part_simple = 10, 
		RULE_expression = 11, RULE_expression_or = 12, RULE_expression_and = 13, 
		RULE_expression_group = 14, RULE_expression_not = 15, RULE_expression_basic = 16, 
		RULE_attribute = 17, RULE_qualifier = 18, RULE_identifier = 19, RULE_regexp = 20, 
		RULE_regexp_pattern = 21, RULE_regexp_flag = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "main_query", "query_disjunction", "query_sequence", "query_group", 
			"query_simple", "quantifier", "query_implicit", "query_segment", "within_part", 
			"within_part_simple", "expression", "expression_or", "expression_and", 
			"expression_group", "expression_not", "expression_basic", "attribute", 
			"qualifier", "identifier", "regexp", "regexp_pattern", "regexp_flag"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'['", "']'", "'|'", "'&'", "'!'", "'/'", "'{'", 
			"'}'", "'+'", "'*'", "'?'", "','", "'='", "'!='", "':'", "'within'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "L_PAREN", "R_PAREN", "L_SQUARE_BRACKET", "R_SQUARE_BRACKET", "OR", 
			"AND", "NOT", "FWD_SLASH", "L_CURLY_BRACKET", "R_CURLY_BRACKET", "Q_ONE_OR_MORE", 
			"Q_ZERO_OR_MORE", "Q_ZERO_OR_ONE", "Q_COMMA", "OPERATOR_EQ", "OPERATOR_NE", 
			"COLON", "WITHIN", "SIMPLE_WITHIN_SCOPE", "REGEXP_FLAGS", "IDENTIFIER", 
			"INTEGER", "REGEXP", "QUOTED_STRING", "Space"
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

	@Override
	public String getGrammarFileName() { return "FCSParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FCSParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public Main_queryContext main_query() {
			return getRuleContext(Main_queryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(FCSParser.EOF, 0); }
		public TerminalNode WITHIN() { return getToken(FCSParser.WITHIN, 0); }
		public Within_partContext within_part() {
			return getRuleContext(Within_partContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			main_query();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITHIN) {
				{
				setState(47);
				match(WITHIN);
				setState(48);
				within_part();
				}
			}

			setState(51);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Main_queryContext extends ParserRuleContext {
		public Query_simpleContext query_simple() {
			return getRuleContext(Query_simpleContext.class,0);
		}
		public Query_groupContext query_group() {
			return getRuleContext(Query_groupContext.class,0);
		}
		public Query_sequenceContext query_sequence() {
			return getRuleContext(Query_sequenceContext.class,0);
		}
		public Query_disjunctionContext query_disjunction() {
			return getRuleContext(Query_disjunctionContext.class,0);
		}
		public Main_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterMain_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitMain_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitMain_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_queryContext main_query() throws RecognitionException {
		Main_queryContext _localctx = new Main_queryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_query);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(53);
				query_simple();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				query_group();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				query_sequence();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56);
				query_disjunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_disjunctionContext extends ParserRuleContext {
		public List<Query_simpleContext> query_simple() {
			return getRuleContexts(Query_simpleContext.class);
		}
		public Query_simpleContext query_simple(int i) {
			return getRuleContext(Query_simpleContext.class,i);
		}
		public List<Query_sequenceContext> query_sequence() {
			return getRuleContexts(Query_sequenceContext.class);
		}
		public Query_sequenceContext query_sequence(int i) {
			return getRuleContext(Query_sequenceContext.class,i);
		}
		public List<Query_groupContext> query_group() {
			return getRuleContexts(Query_groupContext.class);
		}
		public Query_groupContext query_group(int i) {
			return getRuleContext(Query_groupContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(FCSParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FCSParser.OR, i);
		}
		public Query_disjunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_disjunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterQuery_disjunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitQuery_disjunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitQuery_disjunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_disjunctionContext query_disjunction() throws RecognitionException {
		Query_disjunctionContext _localctx = new Query_disjunctionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_query_disjunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(59);
				query_simple();
				}
				break;
			case 2:
				{
				setState(60);
				query_sequence();
				}
				break;
			case 3:
				{
				setState(61);
				query_group();
				}
				break;
			}
			setState(70); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(64);
				match(OR);
				setState(68);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(65);
					query_simple();
					}
					break;
				case 2:
					{
					setState(66);
					query_sequence();
					}
					break;
				case 3:
					{
					setState(67);
					query_group();
					}
					break;
				}
				}
				}
				setState(72); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==OR );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_sequenceContext extends ParserRuleContext {
		public List<Query_simpleContext> query_simple() {
			return getRuleContexts(Query_simpleContext.class);
		}
		public Query_simpleContext query_simple(int i) {
			return getRuleContext(Query_simpleContext.class,i);
		}
		public List<Query_groupContext> query_group() {
			return getRuleContexts(Query_groupContext.class);
		}
		public Query_groupContext query_group(int i) {
			return getRuleContext(Query_groupContext.class,i);
		}
		public Query_sequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_sequence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterQuery_sequence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitQuery_sequence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitQuery_sequence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_sequenceContext query_sequence() throws RecognitionException {
		Query_sequenceContext _localctx = new Query_sequenceContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_query_sequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(76);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case L_SQUARE_BRACKET:
				case REGEXP:
					{
					setState(74);
					query_simple();
					}
					break;
				case L_PAREN:
					{
					setState(75);
					query_group();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(78); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 8388618L) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_groupContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(FCSParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(FCSParser.R_PAREN, 0); }
		public Query_disjunctionContext query_disjunction() {
			return getRuleContext(Query_disjunctionContext.class,0);
		}
		public Query_sequenceContext query_sequence() {
			return getRuleContext(Query_sequenceContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public Query_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterQuery_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitQuery_group(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitQuery_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_groupContext query_group() throws RecognitionException {
		Query_groupContext _localctx = new Query_groupContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_query_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(L_PAREN);
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(81);
				query_disjunction();
				}
				break;
			case 2:
				{
				setState(82);
				query_sequence();
				}
				break;
			}
			setState(85);
			match(R_PAREN);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14848L) != 0)) {
				{
				setState(86);
				quantifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_simpleContext extends ParserRuleContext {
		public Query_implicitContext query_implicit() {
			return getRuleContext(Query_implicitContext.class,0);
		}
		public Query_segmentContext query_segment() {
			return getRuleContext(Query_segmentContext.class,0);
		}
		public QuantifierContext quantifier() {
			return getRuleContext(QuantifierContext.class,0);
		}
		public Query_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterQuery_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitQuery_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitQuery_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_simpleContext query_simple() throws RecognitionException {
		Query_simpleContext _localctx = new Query_simpleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_query_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REGEXP:
				{
				setState(89);
				query_implicit();
				}
				break;
			case L_SQUARE_BRACKET:
				{
				setState(90);
				query_segment();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14848L) != 0)) {
				{
				setState(93);
				quantifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuantifierContext extends ParserRuleContext {
		public TerminalNode Q_ONE_OR_MORE() { return getToken(FCSParser.Q_ONE_OR_MORE, 0); }
		public TerminalNode Q_ZERO_OR_MORE() { return getToken(FCSParser.Q_ZERO_OR_MORE, 0); }
		public TerminalNode Q_ZERO_OR_ONE() { return getToken(FCSParser.Q_ZERO_OR_ONE, 0); }
		public TerminalNode L_CURLY_BRACKET() { return getToken(FCSParser.L_CURLY_BRACKET, 0); }
		public TerminalNode R_CURLY_BRACKET() { return getToken(FCSParser.R_CURLY_BRACKET, 0); }
		public List<TerminalNode> INTEGER() { return getTokens(FCSParser.INTEGER); }
		public TerminalNode INTEGER(int i) {
			return getToken(FCSParser.INTEGER, i);
		}
		public TerminalNode Q_COMMA() { return getToken(FCSParser.Q_COMMA, 0); }
		public QuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuantifierContext quantifier() throws RecognitionException {
		QuantifierContext _localctx = new QuantifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_quantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Q_ONE_OR_MORE:
				{
				setState(96);
				match(Q_ONE_OR_MORE);
				}
				break;
			case Q_ZERO_OR_MORE:
				{
				setState(97);
				match(Q_ZERO_OR_MORE);
				}
				break;
			case Q_ZERO_OR_ONE:
				{
				setState(98);
				match(Q_ZERO_OR_ONE);
				}
				break;
			case L_CURLY_BRACKET:
				{
				{
				setState(99);
				match(L_CURLY_BRACKET);
				setState(111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(100);
					match(INTEGER);
					}
					break;
				case 2:
					{
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INTEGER) {
						{
						setState(101);
						match(INTEGER);
						}
					}

					setState(104);
					match(Q_COMMA);
					setState(105);
					match(INTEGER);
					}
					break;
				case 3:
					{
					setState(106);
					match(INTEGER);
					setState(107);
					match(Q_COMMA);
					setState(109);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==INTEGER) {
						{
						setState(108);
						match(INTEGER);
						}
					}

					}
					break;
				}
				setState(113);
				match(R_CURLY_BRACKET);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_implicitContext extends ParserRuleContext {
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public Query_implicitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_implicit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterQuery_implicit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitQuery_implicit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitQuery_implicit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_implicitContext query_implicit() throws RecognitionException {
		Query_implicitContext _localctx = new Query_implicitContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_query_implicit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			regexp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Query_segmentContext extends ParserRuleContext {
		public TerminalNode L_SQUARE_BRACKET() { return getToken(FCSParser.L_SQUARE_BRACKET, 0); }
		public TerminalNode R_SQUARE_BRACKET() { return getToken(FCSParser.R_SQUARE_BRACKET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Query_segmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_segment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterQuery_segment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitQuery_segment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitQuery_segment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_segmentContext query_segment() throws RecognitionException {
		Query_segmentContext _localctx = new Query_segmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_query_segment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(L_SQUARE_BRACKET);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932290L) != 0)) {
				{
				setState(119);
				expression();
				}
			}

			setState(122);
			match(R_SQUARE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Within_partContext extends ParserRuleContext {
		public Within_part_simpleContext within_part_simple() {
			return getRuleContext(Within_part_simpleContext.class,0);
		}
		public Within_partContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_within_part; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterWithin_part(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitWithin_part(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitWithin_part(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Within_partContext within_part() throws RecognitionException {
		Within_partContext _localctx = new Within_partContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_within_part);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			within_part_simple();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Within_part_simpleContext extends ParserRuleContext {
		public TerminalNode SIMPLE_WITHIN_SCOPE() { return getToken(FCSParser.SIMPLE_WITHIN_SCOPE, 0); }
		public Within_part_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_within_part_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterWithin_part_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitWithin_part_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitWithin_part_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Within_part_simpleContext within_part_simple() throws RecognitionException {
		Within_part_simpleContext _localctx = new Within_part_simpleContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_within_part_simple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(SIMPLE_WITHIN_SCOPE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression_basicContext expression_basic() {
			return getRuleContext(Expression_basicContext.class,0);
		}
		public Expression_groupContext expression_group() {
			return getRuleContext(Expression_groupContext.class,0);
		}
		public Expression_orContext expression_or() {
			return getRuleContext(Expression_orContext.class,0);
		}
		public Expression_andContext expression_and() {
			return getRuleContext(Expression_andContext.class,0);
		}
		public Expression_notContext expression_not() {
			return getRuleContext(Expression_notContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_expression);
		try {
			setState(133);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				expression_basic();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				expression_group();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				expression_or();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				expression_and();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(132);
				expression_not();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_orContext extends ParserRuleContext {
		public List<Expression_basicContext> expression_basic() {
			return getRuleContexts(Expression_basicContext.class);
		}
		public Expression_basicContext expression_basic(int i) {
			return getRuleContext(Expression_basicContext.class,i);
		}
		public List<Expression_groupContext> expression_group() {
			return getRuleContexts(Expression_groupContext.class);
		}
		public Expression_groupContext expression_group(int i) {
			return getRuleContext(Expression_groupContext.class,i);
		}
		public List<Expression_andContext> expression_and() {
			return getRuleContexts(Expression_andContext.class);
		}
		public Expression_andContext expression_and(int i) {
			return getRuleContext(Expression_andContext.class,i);
		}
		public List<Expression_notContext> expression_not() {
			return getRuleContexts(Expression_notContext.class);
		}
		public Expression_notContext expression_not(int i) {
			return getRuleContext(Expression_notContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(FCSParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(FCSParser.OR, i);
		}
		public Expression_orContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_or; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterExpression_or(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitExpression_or(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitExpression_or(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_orContext expression_or() throws RecognitionException {
		Expression_orContext _localctx = new Expression_orContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_expression_or);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(135);
				expression_basic();
				}
				break;
			case 2:
				{
				setState(136);
				expression_group();
				}
				break;
			case 3:
				{
				setState(137);
				expression_and();
				}
				break;
			case 4:
				{
				setState(138);
				expression_not();
				}
				break;
			}
			setState(148); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(141);
					match(OR);
					setState(146);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(142);
						expression_basic();
						}
						break;
					case 2:
						{
						setState(143);
						expression_group();
						}
						break;
					case 3:
						{
						setState(144);
						expression_and();
						}
						break;
					case 4:
						{
						setState(145);
						expression_not();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_andContext extends ParserRuleContext {
		public List<Expression_basicContext> expression_basic() {
			return getRuleContexts(Expression_basicContext.class);
		}
		public Expression_basicContext expression_basic(int i) {
			return getRuleContext(Expression_basicContext.class,i);
		}
		public List<Expression_groupContext> expression_group() {
			return getRuleContexts(Expression_groupContext.class);
		}
		public Expression_groupContext expression_group(int i) {
			return getRuleContext(Expression_groupContext.class,i);
		}
		public List<Expression_notContext> expression_not() {
			return getRuleContexts(Expression_notContext.class);
		}
		public Expression_notContext expression_not(int i) {
			return getRuleContext(Expression_notContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(FCSParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(FCSParser.AND, i);
		}
		public List<Expression_orContext> expression_or() {
			return getRuleContexts(Expression_orContext.class);
		}
		public Expression_orContext expression_or(int i) {
			return getRuleContext(Expression_orContext.class,i);
		}
		public Expression_andContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterExpression_and(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitExpression_and(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitExpression_and(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_andContext expression_and() throws RecognitionException {
		Expression_andContext _localctx = new Expression_andContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expression_and);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITHIN:
			case SIMPLE_WITHIN_SCOPE:
			case REGEXP_FLAGS:
			case IDENTIFIER:
				{
				setState(152);
				expression_basic();
				}
				break;
			case L_PAREN:
				{
				setState(153);
				expression_group();
				}
				break;
			case NOT:
				{
				setState(154);
				expression_not();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(164); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(157);
					match(AND);
					setState(162);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						setState(158);
						expression_basic();
						}
						break;
					case 2:
						{
						setState(159);
						expression_group();
						}
						break;
					case 3:
						{
						setState(160);
						expression_or();
						}
						break;
					case 4:
						{
						setState(161);
						expression_not();
						}
						break;
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(166); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_groupContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(FCSParser.L_PAREN, 0); }
		public TerminalNode R_PAREN() { return getToken(FCSParser.R_PAREN, 0); }
		public Expression_basicContext expression_basic() {
			return getRuleContext(Expression_basicContext.class,0);
		}
		public Expression_groupContext expression_group() {
			return getRuleContext(Expression_groupContext.class,0);
		}
		public Expression_orContext expression_or() {
			return getRuleContext(Expression_orContext.class,0);
		}
		public Expression_andContext expression_and() {
			return getRuleContext(Expression_andContext.class,0);
		}
		public Expression_notContext expression_not() {
			return getRuleContext(Expression_notContext.class,0);
		}
		public Expression_groupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterExpression_group(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitExpression_group(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitExpression_group(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_groupContext expression_group() throws RecognitionException {
		Expression_groupContext _localctx = new Expression_groupContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression_group);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(L_PAREN);
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(169);
				expression_basic();
				}
				break;
			case 2:
				{
				setState(170);
				expression_group();
				}
				break;
			case 3:
				{
				setState(171);
				expression_or();
				}
				break;
			case 4:
				{
				setState(172);
				expression_and();
				}
				break;
			case 5:
				{
				setState(173);
				expression_not();
				}
				break;
			}
			setState(176);
			match(R_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_notContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(FCSParser.NOT, 0); }
		public Expression_basicContext expression_basic() {
			return getRuleContext(Expression_basicContext.class,0);
		}
		public Expression_groupContext expression_group() {
			return getRuleContext(Expression_groupContext.class,0);
		}
		public Expression_notContext expression_not() {
			return getRuleContext(Expression_notContext.class,0);
		}
		public Expression_orContext expression_or() {
			return getRuleContext(Expression_orContext.class,0);
		}
		public Expression_andContext expression_and() {
			return getRuleContext(Expression_andContext.class,0);
		}
		public Expression_notContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_not; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterExpression_not(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitExpression_not(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitExpression_not(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_notContext expression_not() throws RecognitionException {
		Expression_notContext _localctx = new Expression_notContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_expression_not);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(NOT);
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(179);
				expression_basic();
				}
				break;
			case 2:
				{
				setState(180);
				expression_group();
				}
				break;
			case 3:
				{
				setState(181);
				expression_not();
				}
				break;
			case 4:
				{
				setState(182);
				expression_or();
				}
				break;
			case 5:
				{
				setState(183);
				expression_and();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Expression_basicContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public RegexpContext regexp() {
			return getRuleContext(RegexpContext.class,0);
		}
		public TerminalNode OPERATOR_EQ() { return getToken(FCSParser.OPERATOR_EQ, 0); }
		public TerminalNode OPERATOR_NE() { return getToken(FCSParser.OPERATOR_NE, 0); }
		public Expression_basicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_basic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterExpression_basic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitExpression_basic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitExpression_basic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_basicContext expression_basic() throws RecognitionException {
		Expression_basicContext _localctx = new Expression_basicContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression_basic);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			attribute();
			setState(187);
			_la = _input.LA(1);
			if ( !(_la==OPERATOR_EQ || _la==OPERATOR_NE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(188);
			regexp();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifierContext qualifier() {
			return getRuleContext(QualifierContext.class,0);
		}
		public TerminalNode COLON() { return getToken(FCSParser.COLON, 0); }
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(190);
				qualifier();
				setState(191);
				match(COLON);
				}
				break;
			}
			setState(195);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QualifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FCSParser.IDENTIFIER, 0); }
		public TerminalNode WITHIN() { return getToken(FCSParser.WITHIN, 0); }
		public TerminalNode SIMPLE_WITHIN_SCOPE() { return getToken(FCSParser.SIMPLE_WITHIN_SCOPE, 0); }
		public TerminalNode REGEXP_FLAGS() { return getToken(FCSParser.REGEXP_FLAGS, 0); }
		public QualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifierContext qualifier() throws RecognitionException {
		QualifierContext _localctx = new QualifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FCSParser.IDENTIFIER, 0); }
		public TerminalNode WITHIN() { return getToken(FCSParser.WITHIN, 0); }
		public TerminalNode SIMPLE_WITHIN_SCOPE() { return getToken(FCSParser.SIMPLE_WITHIN_SCOPE, 0); }
		public TerminalNode REGEXP_FLAGS() { return getToken(FCSParser.REGEXP_FLAGS, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3932160L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegexpContext extends ParserRuleContext {
		public Regexp_patternContext regexp_pattern() {
			return getRuleContext(Regexp_patternContext.class,0);
		}
		public TerminalNode FWD_SLASH() { return getToken(FCSParser.FWD_SLASH, 0); }
		public Regexp_flagContext regexp_flag() {
			return getRuleContext(Regexp_flagContext.class,0);
		}
		public RegexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterRegexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitRegexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitRegexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegexpContext regexp() throws RecognitionException {
		RegexpContext _localctx = new RegexpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_regexp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			regexp_pattern();
			setState(204);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FWD_SLASH) {
				{
				setState(202);
				match(FWD_SLASH);
				setState(203);
				regexp_flag();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Regexp_patternContext extends ParserRuleContext {
		public TerminalNode REGEXP() { return getToken(FCSParser.REGEXP, 0); }
		public Regexp_patternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexp_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterRegexp_pattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitRegexp_pattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitRegexp_pattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Regexp_patternContext regexp_pattern() throws RecognitionException {
		Regexp_patternContext _localctx = new Regexp_patternContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_regexp_pattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(REGEXP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Regexp_flagContext extends ParserRuleContext {
		public TerminalNode REGEXP_FLAGS() { return getToken(FCSParser.REGEXP_FLAGS, 0); }
		public Regexp_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regexp_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).enterRegexp_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FCSParserListener ) ((FCSParserListener)listener).exitRegexp_flag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FCSParserVisitor ) return ((FCSParserVisitor<? extends T>)visitor).visitRegexp_flag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Regexp_flagContext regexp_flag() throws RecognitionException {
		Regexp_flagContext _localctx = new Regexp_flagContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_regexp_flag);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(REGEXP_FLAGS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u00d3\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0000\u0003"+
		"\u00002\b\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001:\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002?\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002E\b\u0002\u0004\u0002G\b\u0002\u000b\u0002\f\u0002H"+
		"\u0001\u0003\u0001\u0003\u0004\u0003M\b\u0003\u000b\u0003\f\u0003N\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004T\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004X\b\u0004\u0001\u0005\u0001\u0005\u0003\u0005\\\b\u0005"+
		"\u0001\u0005\u0003\u0005_\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006g\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006n\b\u0006"+
		"\u0003\u0006p\b\u0006\u0001\u0006\u0003\u0006s\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0003\by\b\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0086\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u008c"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0093\b\f\u0004\f"+
		"\u0095\b\f\u000b\f\f\f\u0096\u0001\r\u0001\r\u0001\r\u0003\r\u009c\b\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00a3\b\r\u0004\r\u00a5"+
		"\b\r\u000b\r\f\r\u00a6\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u00af\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00b9\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00c2\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u00cd\b\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,\u0000\u0002\u0001\u0000\u000f\u0010\u0001\u0000\u0012\u0015\u00ed"+
		"\u0000.\u0001\u0000\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0004>"+
		"\u0001\u0000\u0000\u0000\u0006L\u0001\u0000\u0000\u0000\bP\u0001\u0000"+
		"\u0000\u0000\n[\u0001\u0000\u0000\u0000\fr\u0001\u0000\u0000\u0000\u000e"+
		"t\u0001\u0000\u0000\u0000\u0010v\u0001\u0000\u0000\u0000\u0012|\u0001"+
		"\u0000\u0000\u0000\u0014~\u0001\u0000\u0000\u0000\u0016\u0085\u0001\u0000"+
		"\u0000\u0000\u0018\u008b\u0001\u0000\u0000\u0000\u001a\u009b\u0001\u0000"+
		"\u0000\u0000\u001c\u00a8\u0001\u0000\u0000\u0000\u001e\u00b2\u0001\u0000"+
		"\u0000\u0000 \u00ba\u0001\u0000\u0000\u0000\"\u00c1\u0001\u0000\u0000"+
		"\u0000$\u00c5\u0001\u0000\u0000\u0000&\u00c7\u0001\u0000\u0000\u0000("+
		"\u00c9\u0001\u0000\u0000\u0000*\u00ce\u0001\u0000\u0000\u0000,\u00d0\u0001"+
		"\u0000\u0000\u0000.1\u0003\u0002\u0001\u0000/0\u0005\u0012\u0000\u0000"+
		"02\u0003\u0012\t\u00001/\u0001\u0000\u0000\u000012\u0001\u0000\u0000\u0000"+
		"23\u0001\u0000\u0000\u000034\u0005\u0000\u0000\u00014\u0001\u0001\u0000"+
		"\u0000\u00005:\u0003\n\u0005\u00006:\u0003\b\u0004\u00007:\u0003\u0006"+
		"\u0003\u00008:\u0003\u0004\u0002\u000095\u0001\u0000\u0000\u000096\u0001"+
		"\u0000\u0000\u000097\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000"+
		":\u0003\u0001\u0000\u0000\u0000;?\u0003\n\u0005\u0000<?\u0003\u0006\u0003"+
		"\u0000=?\u0003\b\u0004\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>=\u0001\u0000\u0000\u0000?F\u0001\u0000\u0000\u0000@D\u0005\u0005"+
		"\u0000\u0000AE\u0003\n\u0005\u0000BE\u0003\u0006\u0003\u0000CE\u0003\b"+
		"\u0004\u0000DA\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DC\u0001"+
		"\u0000\u0000\u0000EG\u0001\u0000\u0000\u0000F@\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000I\u0005\u0001\u0000\u0000\u0000JM\u0003\n\u0005\u0000KM\u0003\b"+
		"\u0004\u0000LJ\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000MN\u0001"+
		"\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"O\u0007\u0001\u0000\u0000\u0000PS\u0005\u0001\u0000\u0000QT\u0003\u0004"+
		"\u0002\u0000RT\u0003\u0006\u0003\u0000SQ\u0001\u0000\u0000\u0000SR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000UW\u0005\u0002\u0000\u0000"+
		"VX\u0003\f\u0006\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"X\t\u0001\u0000\u0000\u0000Y\\\u0003\u000e\u0007\u0000Z\\\u0003\u0010"+
		"\b\u0000[Y\u0001\u0000\u0000\u0000[Z\u0001\u0000\u0000\u0000\\^\u0001"+
		"\u0000\u0000\u0000]_\u0003\f\u0006\u0000^]\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_\u000b\u0001\u0000\u0000\u0000`s\u0005\u000b\u0000"+
		"\u0000as\u0005\f\u0000\u0000bs\u0005\r\u0000\u0000co\u0005\t\u0000\u0000"+
		"dp\u0005\u0016\u0000\u0000eg\u0005\u0016\u0000\u0000fe\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hi\u0005\u000e"+
		"\u0000\u0000ip\u0005\u0016\u0000\u0000jk\u0005\u0016\u0000\u0000km\u0005"+
		"\u000e\u0000\u0000ln\u0005\u0016\u0000\u0000ml\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000od\u0001\u0000\u0000"+
		"\u0000of\u0001\u0000\u0000\u0000oj\u0001\u0000\u0000\u0000pq\u0001\u0000"+
		"\u0000\u0000qs\u0005\n\u0000\u0000r`\u0001\u0000\u0000\u0000ra\u0001\u0000"+
		"\u0000\u0000rb\u0001\u0000\u0000\u0000rc\u0001\u0000\u0000\u0000s\r\u0001"+
		"\u0000\u0000\u0000tu\u0003(\u0014\u0000u\u000f\u0001\u0000\u0000\u0000"+
		"vx\u0005\u0003\u0000\u0000wy\u0003\u0016\u000b\u0000xw\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z{\u0005\u0004"+
		"\u0000\u0000{\u0011\u0001\u0000\u0000\u0000|}\u0003\u0014\n\u0000}\u0013"+
		"\u0001\u0000\u0000\u0000~\u007f\u0005\u0013\u0000\u0000\u007f\u0015\u0001"+
		"\u0000\u0000\u0000\u0080\u0086\u0003 \u0010\u0000\u0081\u0086\u0003\u001c"+
		"\u000e\u0000\u0082\u0086\u0003\u0018\f\u0000\u0083\u0086\u0003\u001a\r"+
		"\u0000\u0084\u0086\u0003\u001e\u000f\u0000\u0085\u0080\u0001\u0000\u0000"+
		"\u0000\u0085\u0081\u0001\u0000\u0000\u0000\u0085\u0082\u0001\u0000\u0000"+
		"\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0017\u0001\u0000\u0000\u0000\u0087\u008c\u0003 \u0010\u0000"+
		"\u0088\u008c\u0003\u001c\u000e\u0000\u0089\u008c\u0003\u001a\r\u0000\u008a"+
		"\u008c\u0003\u001e\u000f\u0000\u008b\u0087\u0001\u0000\u0000\u0000\u008b"+
		"\u0088\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008a\u0001\u0000\u0000\u0000\u008c\u0094\u0001\u0000\u0000\u0000\u008d"+
		"\u0092\u0005\u0005\u0000\u0000\u008e\u0093\u0003 \u0010\u0000\u008f\u0093"+
		"\u0003\u001c\u000e\u0000\u0090\u0093\u0003\u001a\r\u0000\u0091\u0093\u0003"+
		"\u001e\u000f\u0000\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u008f\u0001"+
		"\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u008d\u0001"+
		"\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u0019\u0001"+
		"\u0000\u0000\u0000\u0098\u009c\u0003 \u0010\u0000\u0099\u009c\u0003\u001c"+
		"\u000e\u0000\u009a\u009c\u0003\u001e\u000f\u0000\u009b\u0098\u0001\u0000"+
		"\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009a\u0001\u0000"+
		"\u0000\u0000\u009c\u00a4\u0001\u0000\u0000\u0000\u009d\u00a2\u0005\u0006"+
		"\u0000\u0000\u009e\u00a3\u0003 \u0010\u0000\u009f\u00a3\u0003\u001c\u000e"+
		"\u0000\u00a0\u00a3\u0003\u0018\f\u0000\u00a1\u00a3\u0003\u001e\u000f\u0000"+
		"\u00a2\u009e\u0001\u0000\u0000\u0000\u00a2\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u009d\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u001b\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ae\u0005\u0001\u0000\u0000\u00a9\u00af\u0003 \u0010\u0000\u00aa"+
		"\u00af\u0003\u001c\u000e\u0000\u00ab\u00af\u0003\u0018\f\u0000\u00ac\u00af"+
		"\u0003\u001a\r\u0000\u00ad\u00af\u0003\u001e\u000f\u0000\u00ae\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ae\u00aa\u0001\u0000\u0000\u0000\u00ae\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00ae\u00ad\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u00b1\u0005"+
		"\u0002\u0000\u0000\u00b1\u001d\u0001\u0000\u0000\u0000\u00b2\u00b8\u0005"+
		"\u0007\u0000\u0000\u00b3\u00b9\u0003 \u0010\u0000\u00b4\u00b9\u0003\u001c"+
		"\u000e\u0000\u00b5\u00b9\u0003\u001e\u000f\u0000\u00b6\u00b9\u0003\u0018"+
		"\f\u0000\u00b7\u00b9\u0003\u001a\r\u0000\u00b8\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b4\u0001\u0000\u0000\u0000\u00b8\u00b5\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b6\u0001\u0000\u0000\u0000\u00b8\u00b7\u0001\u0000\u0000"+
		"\u0000\u00b9\u001f\u0001\u0000\u0000\u0000\u00ba\u00bb\u0003\"\u0011\u0000"+
		"\u00bb\u00bc\u0007\u0000\u0000\u0000\u00bc\u00bd\u0003(\u0014\u0000\u00bd"+
		"!\u0001\u0000\u0000\u0000\u00be\u00bf\u0003$\u0012\u0000\u00bf\u00c0\u0005"+
		"\u0011\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00be\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c4\u0003&\u0013\u0000\u00c4#\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0007\u0001\u0000\u0000\u00c6%\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c8\u0007\u0001\u0000\u0000\u00c8\'\u0001\u0000\u0000\u0000\u00c9"+
		"\u00cc\u0003*\u0015\u0000\u00ca\u00cb\u0005\b\u0000\u0000\u00cb\u00cd"+
		"\u0003,\u0016\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd)\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u0017"+
		"\u0000\u0000\u00cf+\u0001\u0000\u0000\u0000\u00d0\u00d1\u0005\u0014\u0000"+
		"\u0000\u00d1-\u0001\u0000\u0000\u0000\u001b19>DHLNSW[^fmorx\u0085\u008b"+
		"\u0092\u0096\u009b\u00a2\u00a6\u00ae\u00b8\u00c1\u00cc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}