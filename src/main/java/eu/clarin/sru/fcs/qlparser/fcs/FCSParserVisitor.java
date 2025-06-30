// Generated from eu/clarin/sru/fcs/qlparser/fcs/FCSParser.g4 by ANTLR 4.13.2
package eu.clarin.sru.fcs.qlparser.fcs;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FCSParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FCSParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FCSParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(FCSParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#main_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_query(FCSParser.Main_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#query_disjunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_disjunction(FCSParser.Query_disjunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#query_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_sequence(FCSParser.Query_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#query_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_group(FCSParser.Query_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#query_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_simple(FCSParser.Query_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#quantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifier(FCSParser.QuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#query_implicit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_implicit(FCSParser.Query_implicitContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#query_segment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_segment(FCSParser.Query_segmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#within_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_part(FCSParser.Within_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#within_part_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_part_simple(FCSParser.Within_part_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FCSParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#expression_or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_or(FCSParser.Expression_orContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#expression_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_and(FCSParser.Expression_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#expression_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_group(FCSParser.Expression_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#expression_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_not(FCSParser.Expression_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#expression_basic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_basic(FCSParser.Expression_basicContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(FCSParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifier(FCSParser.QualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(FCSParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#regexp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexp(FCSParser.RegexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#regexp_pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexp_pattern(FCSParser.Regexp_patternContext ctx);
	/**
	 * Visit a parse tree produced by {@link FCSParser#regexp_flag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexp_flag(FCSParser.Regexp_flagContext ctx);
}