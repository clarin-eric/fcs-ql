// Generated from eu/clarin/sru/fcs/qlparser/lex/LexParser.g4 by ANTLR 4.13.2
package eu.clarin.sru.fcs.qlparser.lex;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LexParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LexParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(LexParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#boolean_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_query(LexParser.Boolean_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(LexParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#search_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_clause(LexParser.Search_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#search_term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_term(LexParser.Search_termContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(LexParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#relation_modified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_modified(LexParser.Relation_modifiedContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(LexParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#relation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_name(LexParser.Relation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#relation_symbol}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation_symbol(LexParser.Relation_symbolContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#boolean_modified}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_modified(LexParser.Boolean_modifiedContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#r_boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitR_boolean(LexParser.R_booleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#modifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier_list(LexParser.Modifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#modifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier(LexParser.ModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#modifier_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier_name(LexParser.Modifier_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#modifier_relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier_relation(LexParser.Modifier_relationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#modifier_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModifier_value(LexParser.Modifier_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#prefix_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix_name(LexParser.Prefix_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix(LexParser.PrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link LexParser#simple_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_name(LexParser.Simple_nameContext ctx);
}