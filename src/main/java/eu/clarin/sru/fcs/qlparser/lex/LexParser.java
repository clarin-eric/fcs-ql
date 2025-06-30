// Generated from eu/clarin/sru/fcs/qlparser/lex/LexParser.g4 by ANTLR 4.13.2
package eu.clarin.sru.fcs.qlparser.lex;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LexParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		L_PAREN=1, R_PAREN=2, EQUAL=3, GREATER=4, LESSER=5, GREATER_EQUAL=6, LESSER_EQUAL=7, 
		NOT_EQUAL=8, EQUAL_EQUAL=9, SLASH=10, AND=11, OR=12, NOT=13, DOT=14, QUOTED_STRING=15, 
		SIMPLE_STRING=16, WS=17;
	public static final int
		RULE_query = 0, RULE_boolean_query = 1, RULE_subquery = 2, RULE_search_clause = 3, 
		RULE_search_term = 4, RULE_index = 5, RULE_relation_modified = 6, RULE_relation = 7, 
		RULE_relation_name = 8, RULE_relation_symbol = 9, RULE_boolean_modified = 10, 
		RULE_r_boolean = 11, RULE_modifier_list = 12, RULE_modifier = 13, RULE_modifier_name = 14, 
		RULE_modifier_relation = 15, RULE_modifier_value = 16, RULE_prefix_name = 17, 
		RULE_prefix = 18, RULE_simple_name = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "boolean_query", "subquery", "search_clause", "search_term", 
			"index", "relation_modified", "relation", "relation_name", "relation_symbol", 
			"boolean_modified", "r_boolean", "modifier_list", "modifier", "modifier_name", 
			"modifier_relation", "modifier_value", "prefix_name", "prefix", "simple_name"
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

	@Override
	public String getGrammarFileName() { return "LexParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LexParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public Boolean_queryContext boolean_query() {
			return getRuleContext(Boolean_queryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LexParser.EOF, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			boolean_query();
			setState(41);
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
	public static class Boolean_queryContext extends ParserRuleContext {
		public List<SubqueryContext> subquery() {
			return getRuleContexts(SubqueryContext.class);
		}
		public SubqueryContext subquery(int i) {
			return getRuleContext(SubqueryContext.class,i);
		}
		public List<Boolean_modifiedContext> boolean_modified() {
			return getRuleContexts(Boolean_modifiedContext.class);
		}
		public Boolean_modifiedContext boolean_modified(int i) {
			return getRuleContext(Boolean_modifiedContext.class,i);
		}
		public Boolean_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterBoolean_query(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitBoolean_query(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitBoolean_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_queryContext boolean_query() throws RecognitionException {
		Boolean_queryContext _localctx = new Boolean_queryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_boolean_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			subquery();
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) {
				{
				{
				setState(44);
				boolean_modified();
				setState(45);
				subquery();
				}
				}
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class SubqueryContext extends ParserRuleContext {
		public TerminalNode L_PAREN() { return getToken(LexParser.L_PAREN, 0); }
		public Boolean_queryContext boolean_query() {
			return getRuleContext(Boolean_queryContext.class,0);
		}
		public TerminalNode R_PAREN() { return getToken(LexParser.R_PAREN, 0); }
		public Search_clauseContext search_clause() {
			return getRuleContext(Search_clauseContext.class,0);
		}
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_subquery);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case L_PAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(L_PAREN);
				setState(53);
				boolean_query();
				setState(54);
				match(R_PAREN);
				}
				break;
			case QUOTED_STRING:
			case SIMPLE_STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				search_clause();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Search_clauseContext extends ParserRuleContext {
		public Search_termContext search_term() {
			return getRuleContext(Search_termContext.class,0);
		}
		public IndexContext index() {
			return getRuleContext(IndexContext.class,0);
		}
		public Relation_modifiedContext relation_modified() {
			return getRuleContext(Relation_modifiedContext.class,0);
		}
		public Search_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterSearch_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitSearch_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitSearch_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_clauseContext search_clause() throws RecognitionException {
		Search_clauseContext _localctx = new Search_clauseContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_search_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(59);
				index();
				setState(60);
				relation_modified();
				}
				break;
			}
			setState(64);
			search_term();
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
	public static class Search_termContext extends ParserRuleContext {
		public TerminalNode SIMPLE_STRING() { return getToken(LexParser.SIMPLE_STRING, 0); }
		public TerminalNode QUOTED_STRING() { return getToken(LexParser.QUOTED_STRING, 0); }
		public Search_termContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterSearch_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitSearch_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitSearch_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Search_termContext search_term() throws RecognitionException {
		Search_termContext _localctx = new Search_termContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_search_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_STRING || _la==SIMPLE_STRING) ) {
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
	public static class IndexContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public Prefix_nameContext prefix_name() {
			return getRuleContext(Prefix_nameContext.class,0);
		}
		public IndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexContext index() throws RecognitionException {
		IndexContext _localctx = new IndexContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_index);
		try {
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(68);
				simple_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				prefix_name();
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
	public static class Relation_modifiedContext extends ParserRuleContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public Modifier_listContext modifier_list() {
			return getRuleContext(Modifier_listContext.class,0);
		}
		public Relation_modifiedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_modified; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterRelation_modified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitRelation_modified(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitRelation_modified(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_modifiedContext relation_modified() throws RecognitionException {
		Relation_modifiedContext _localctx = new Relation_modifiedContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_relation_modified);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			relation();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(73);
				modifier_list();
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
	public static class RelationContext extends ParserRuleContext {
		public Relation_nameContext relation_name() {
			return getRuleContext(Relation_nameContext.class,0);
		}
		public Relation_symbolContext relation_symbol() {
			return getRuleContext(Relation_symbolContext.class,0);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_relation);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SIMPLE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				relation_name();
				}
				break;
			case EQUAL:
			case GREATER:
			case LESSER:
			case GREATER_EQUAL:
			case LESSER_EQUAL:
			case NOT_EQUAL:
			case EQUAL_EQUAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				relation_symbol();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class Relation_nameContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public Prefix_nameContext prefix_name() {
			return getRuleContext(Prefix_nameContext.class,0);
		}
		public Relation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterRelation_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitRelation_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitRelation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_nameContext relation_name() throws RecognitionException {
		Relation_nameContext _localctx = new Relation_nameContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_relation_name);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				simple_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				prefix_name();
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
	public static class Relation_symbolContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(LexParser.EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(LexParser.GREATER, 0); }
		public TerminalNode LESSER() { return getToken(LexParser.LESSER, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(LexParser.GREATER_EQUAL, 0); }
		public TerminalNode LESSER_EQUAL() { return getToken(LexParser.LESSER_EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(LexParser.NOT_EQUAL, 0); }
		public TerminalNode EQUAL_EQUAL() { return getToken(LexParser.EQUAL_EQUAL, 0); }
		public Relation_symbolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation_symbol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterRelation_symbol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitRelation_symbol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitRelation_symbol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Relation_symbolContext relation_symbol() throws RecognitionException {
		Relation_symbolContext _localctx = new Relation_symbolContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_relation_symbol);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1016L) != 0)) ) {
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
	public static class Boolean_modifiedContext extends ParserRuleContext {
		public R_booleanContext r_boolean() {
			return getRuleContext(R_booleanContext.class,0);
		}
		public Modifier_listContext modifier_list() {
			return getRuleContext(Modifier_listContext.class,0);
		}
		public Boolean_modifiedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean_modified; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterBoolean_modified(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitBoolean_modified(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitBoolean_modified(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Boolean_modifiedContext boolean_modified() throws RecognitionException {
		Boolean_modifiedContext _localctx = new Boolean_modifiedContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_boolean_modified);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			r_boolean();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SLASH) {
				{
				setState(87);
				modifier_list();
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
	public static class R_booleanContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(LexParser.AND, 0); }
		public TerminalNode OR() { return getToken(LexParser.OR, 0); }
		public TerminalNode NOT() { return getToken(LexParser.NOT, 0); }
		public R_booleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r_boolean; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterR_boolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitR_boolean(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitR_boolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final R_booleanContext r_boolean() throws RecognitionException {
		R_booleanContext _localctx = new R_booleanContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_r_boolean);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 14336L) != 0)) ) {
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
	public static class Modifier_listContext extends ParserRuleContext {
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public Modifier_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterModifier_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitModifier_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitModifier_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Modifier_listContext modifier_list() throws RecognitionException {
		Modifier_listContext _localctx = new Modifier_listContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_modifier_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(92);
				modifier();
				}
				}
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SLASH );
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
	public static class ModifierContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(LexParser.SLASH, 0); }
		public Modifier_nameContext modifier_name() {
			return getRuleContext(Modifier_nameContext.class,0);
		}
		public Modifier_relationContext modifier_relation() {
			return getRuleContext(Modifier_relationContext.class,0);
		}
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_modifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(SLASH);
			setState(98);
			modifier_name();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1016L) != 0)) {
				{
				setState(99);
				modifier_relation();
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
	public static class Modifier_nameContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public Modifier_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterModifier_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitModifier_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitModifier_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Modifier_nameContext modifier_name() throws RecognitionException {
		Modifier_nameContext _localctx = new Modifier_nameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_modifier_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			simple_name();
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
	public static class Modifier_relationContext extends ParserRuleContext {
		public Relation_symbolContext relation_symbol() {
			return getRuleContext(Relation_symbolContext.class,0);
		}
		public Modifier_valueContext modifier_value() {
			return getRuleContext(Modifier_valueContext.class,0);
		}
		public Modifier_relationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterModifier_relation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitModifier_relation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitModifier_relation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Modifier_relationContext modifier_relation() throws RecognitionException {
		Modifier_relationContext _localctx = new Modifier_relationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_modifier_relation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			relation_symbol();
			setState(105);
			modifier_value();
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
	public static class Modifier_valueContext extends ParserRuleContext {
		public TerminalNode SIMPLE_STRING() { return getToken(LexParser.SIMPLE_STRING, 0); }
		public TerminalNode QUOTED_STRING() { return getToken(LexParser.QUOTED_STRING, 0); }
		public Modifier_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterModifier_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitModifier_value(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitModifier_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Modifier_valueContext modifier_value() throws RecognitionException {
		Modifier_valueContext _localctx = new Modifier_valueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_modifier_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !(_la==QUOTED_STRING || _la==SIMPLE_STRING) ) {
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
	public static class Prefix_nameContext extends ParserRuleContext {
		public PrefixContext prefix() {
			return getRuleContext(PrefixContext.class,0);
		}
		public TerminalNode DOT() { return getToken(LexParser.DOT, 0); }
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public Prefix_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterPrefix_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitPrefix_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitPrefix_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Prefix_nameContext prefix_name() throws RecognitionException {
		Prefix_nameContext _localctx = new Prefix_nameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_prefix_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			prefix();
			setState(110);
			match(DOT);
			setState(111);
			simple_name();
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
	public static class PrefixContext extends ParserRuleContext {
		public Simple_nameContext simple_name() {
			return getRuleContext(Simple_nameContext.class,0);
		}
		public PrefixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterPrefix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitPrefix(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitPrefix(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrefixContext prefix() throws RecognitionException {
		PrefixContext _localctx = new PrefixContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_prefix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			simple_name();
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
	public static class Simple_nameContext extends ParserRuleContext {
		public TerminalNode SIMPLE_STRING() { return getToken(LexParser.SIMPLE_STRING, 0); }
		public Simple_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).enterSimple_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LexParserListener ) ((LexParserListener)listener).exitSimple_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LexParserVisitor ) return ((LexParserVisitor<? extends T>)visitor).visitSimple_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_nameContext simple_name() throws RecognitionException {
		Simple_nameContext _localctx = new Simple_nameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_simple_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(SIMPLE_STRING);
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
		"\u0004\u0001\u0011v\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00010\b\u0001\n\u0001\f\u0001"+
		"3\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002:\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"?\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0003\u0005G\b\u0005\u0001\u0006\u0001\u0006\u0003\u0006"+
		"K\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007O\b\u0007\u0001\b\u0001\b"+
		"\u0003\bS\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0003\nY\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0004\f^\b\f\u000b\f\f\f_\u0001\r\u0001\r\u0001\r"+
		"\u0003\re\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0000"+
		"\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&\u0000\u0003\u0001\u0000\u000f\u0010\u0001\u0000"+
		"\u0003\t\u0001\u0000\u000b\rk\u0000(\u0001\u0000\u0000\u0000\u0002+\u0001"+
		"\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006>\u0001\u0000\u0000"+
		"\u0000\bB\u0001\u0000\u0000\u0000\nF\u0001\u0000\u0000\u0000\fH\u0001"+
		"\u0000\u0000\u0000\u000eN\u0001\u0000\u0000\u0000\u0010R\u0001\u0000\u0000"+
		"\u0000\u0012T\u0001\u0000\u0000\u0000\u0014V\u0001\u0000\u0000\u0000\u0016"+
		"Z\u0001\u0000\u0000\u0000\u0018]\u0001\u0000\u0000\u0000\u001aa\u0001"+
		"\u0000\u0000\u0000\u001cf\u0001\u0000\u0000\u0000\u001eh\u0001\u0000\u0000"+
		"\u0000 k\u0001\u0000\u0000\u0000\"m\u0001\u0000\u0000\u0000$q\u0001\u0000"+
		"\u0000\u0000&s\u0001\u0000\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0005"+
		"\u0000\u0000\u0001*\u0001\u0001\u0000\u0000\u0000+1\u0003\u0004\u0002"+
		"\u0000,-\u0003\u0014\n\u0000-.\u0003\u0004\u0002\u0000.0\u0001\u0000\u0000"+
		"\u0000/,\u0001\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u00002\u0003\u0001\u0000\u0000\u0000"+
		"31\u0001\u0000\u0000\u000045\u0005\u0001\u0000\u000056\u0003\u0002\u0001"+
		"\u000067\u0005\u0002\u0000\u00007:\u0001\u0000\u0000\u00008:\u0003\u0006"+
		"\u0003\u000094\u0001\u0000\u0000\u000098\u0001\u0000\u0000\u0000:\u0005"+
		"\u0001\u0000\u0000\u0000;<\u0003\n\u0005\u0000<=\u0003\f\u0006\u0000="+
		"?\u0001\u0000\u0000\u0000>;\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@A\u0003\b\u0004\u0000A\u0007\u0001\u0000"+
		"\u0000\u0000BC\u0007\u0000\u0000\u0000C\t\u0001\u0000\u0000\u0000DG\u0003"+
		"&\u0013\u0000EG\u0003\"\u0011\u0000FD\u0001\u0000\u0000\u0000FE\u0001"+
		"\u0000\u0000\u0000G\u000b\u0001\u0000\u0000\u0000HJ\u0003\u000e\u0007"+
		"\u0000IK\u0003\u0018\f\u0000JI\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000K\r\u0001\u0000\u0000\u0000LO\u0003\u0010\b\u0000MO\u0003\u0012"+
		"\t\u0000NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000O\u000f\u0001"+
		"\u0000\u0000\u0000PS\u0003&\u0013\u0000QS\u0003\"\u0011\u0000RP\u0001"+
		"\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S\u0011\u0001\u0000\u0000"+
		"\u0000TU\u0007\u0001\u0000\u0000U\u0013\u0001\u0000\u0000\u0000VX\u0003"+
		"\u0016\u000b\u0000WY\u0003\u0018\f\u0000XW\u0001\u0000\u0000\u0000XY\u0001"+
		"\u0000\u0000\u0000Y\u0015\u0001\u0000\u0000\u0000Z[\u0007\u0002\u0000"+
		"\u0000[\u0017\u0001\u0000\u0000\u0000\\^\u0003\u001a\r\u0000]\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000"+
		"_`\u0001\u0000\u0000\u0000`\u0019\u0001\u0000\u0000\u0000ab\u0005\n\u0000"+
		"\u0000bd\u0003\u001c\u000e\u0000ce\u0003\u001e\u000f\u0000dc\u0001\u0000"+
		"\u0000\u0000de\u0001\u0000\u0000\u0000e\u001b\u0001\u0000\u0000\u0000"+
		"fg\u0003&\u0013\u0000g\u001d\u0001\u0000\u0000\u0000hi\u0003\u0012\t\u0000"+
		"ij\u0003 \u0010\u0000j\u001f\u0001\u0000\u0000\u0000kl\u0007\u0000\u0000"+
		"\u0000l!\u0001\u0000\u0000\u0000mn\u0003$\u0012\u0000no\u0005\u000e\u0000"+
		"\u0000op\u0003&\u0013\u0000p#\u0001\u0000\u0000\u0000qr\u0003&\u0013\u0000"+
		"r%\u0001\u0000\u0000\u0000st\u0005\u0010\u0000\u0000t\'\u0001\u0000\u0000"+
		"\u0000\n19>FJNRX_d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}