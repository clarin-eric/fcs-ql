// Generated from eu/clarin/sru/fcs/qlparser/fcs/FCSParser.g4 by ANTLR 4.13.2
package eu.clarin.sru.fcs.qlparser.fcs;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FCSParser}.
 */
public interface FCSParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FCSParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(FCSParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(FCSParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#main_query}.
	 * @param ctx the parse tree
	 */
	void enterMain_query(FCSParser.Main_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#main_query}.
	 * @param ctx the parse tree
	 */
	void exitMain_query(FCSParser.Main_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#query_disjunction}.
	 * @param ctx the parse tree
	 */
	void enterQuery_disjunction(FCSParser.Query_disjunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#query_disjunction}.
	 * @param ctx the parse tree
	 */
	void exitQuery_disjunction(FCSParser.Query_disjunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#query_sequence}.
	 * @param ctx the parse tree
	 */
	void enterQuery_sequence(FCSParser.Query_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#query_sequence}.
	 * @param ctx the parse tree
	 */
	void exitQuery_sequence(FCSParser.Query_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#query_group}.
	 * @param ctx the parse tree
	 */
	void enterQuery_group(FCSParser.Query_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#query_group}.
	 * @param ctx the parse tree
	 */
	void exitQuery_group(FCSParser.Query_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#query_simple}.
	 * @param ctx the parse tree
	 */
	void enterQuery_simple(FCSParser.Query_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#query_simple}.
	 * @param ctx the parse tree
	 */
	void exitQuery_simple(FCSParser.Query_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void enterQuantifier(FCSParser.QuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#quantifier}.
	 * @param ctx the parse tree
	 */
	void exitQuantifier(FCSParser.QuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#query_implicit}.
	 * @param ctx the parse tree
	 */
	void enterQuery_implicit(FCSParser.Query_implicitContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#query_implicit}.
	 * @param ctx the parse tree
	 */
	void exitQuery_implicit(FCSParser.Query_implicitContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#query_segment}.
	 * @param ctx the parse tree
	 */
	void enterQuery_segment(FCSParser.Query_segmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#query_segment}.
	 * @param ctx the parse tree
	 */
	void exitQuery_segment(FCSParser.Query_segmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#within_part}.
	 * @param ctx the parse tree
	 */
	void enterWithin_part(FCSParser.Within_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#within_part}.
	 * @param ctx the parse tree
	 */
	void exitWithin_part(FCSParser.Within_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#within_part_simple}.
	 * @param ctx the parse tree
	 */
	void enterWithin_part_simple(FCSParser.Within_part_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#within_part_simple}.
	 * @param ctx the parse tree
	 */
	void exitWithin_part_simple(FCSParser.Within_part_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FCSParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FCSParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#expression_or}.
	 * @param ctx the parse tree
	 */
	void enterExpression_or(FCSParser.Expression_orContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#expression_or}.
	 * @param ctx the parse tree
	 */
	void exitExpression_or(FCSParser.Expression_orContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#expression_and}.
	 * @param ctx the parse tree
	 */
	void enterExpression_and(FCSParser.Expression_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#expression_and}.
	 * @param ctx the parse tree
	 */
	void exitExpression_and(FCSParser.Expression_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#expression_group}.
	 * @param ctx the parse tree
	 */
	void enterExpression_group(FCSParser.Expression_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#expression_group}.
	 * @param ctx the parse tree
	 */
	void exitExpression_group(FCSParser.Expression_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#expression_not}.
	 * @param ctx the parse tree
	 */
	void enterExpression_not(FCSParser.Expression_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#expression_not}.
	 * @param ctx the parse tree
	 */
	void exitExpression_not(FCSParser.Expression_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#expression_basic}.
	 * @param ctx the parse tree
	 */
	void enterExpression_basic(FCSParser.Expression_basicContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#expression_basic}.
	 * @param ctx the parse tree
	 */
	void exitExpression_basic(FCSParser.Expression_basicContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(FCSParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(FCSParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#qualifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifier(FCSParser.QualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#qualifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifier(FCSParser.QualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(FCSParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(FCSParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#regexp}.
	 * @param ctx the parse tree
	 */
	void enterRegexp(FCSParser.RegexpContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#regexp}.
	 * @param ctx the parse tree
	 */
	void exitRegexp(FCSParser.RegexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#regexp_pattern}.
	 * @param ctx the parse tree
	 */
	void enterRegexp_pattern(FCSParser.Regexp_patternContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#regexp_pattern}.
	 * @param ctx the parse tree
	 */
	void exitRegexp_pattern(FCSParser.Regexp_patternContext ctx);
	/**
	 * Enter a parse tree produced by {@link FCSParser#regexp_flag}.
	 * @param ctx the parse tree
	 */
	void enterRegexp_flag(FCSParser.Regexp_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link FCSParser#regexp_flag}.
	 * @param ctx the parse tree
	 */
	void exitRegexp_flag(FCSParser.Regexp_flagContext ctx);
}