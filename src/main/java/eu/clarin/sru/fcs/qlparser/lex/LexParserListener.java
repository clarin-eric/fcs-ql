// Generated from eu/clarin/sru/fcs/qlparser/lex/LexParser.g4 by ANTLR 4.13.2
package eu.clarin.sru.fcs.qlparser.lex;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LexParser}.
 */
public interface LexParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LexParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(LexParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(LexParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#boolean_query}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_query(LexParser.Boolean_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#boolean_query}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_query(LexParser.Boolean_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(LexParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(LexParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void enterSearch_clause(LexParser.Search_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#search_clause}.
	 * @param ctx the parse tree
	 */
	void exitSearch_clause(LexParser.Search_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#search_term}.
	 * @param ctx the parse tree
	 */
	void enterSearch_term(LexParser.Search_termContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#search_term}.
	 * @param ctx the parse tree
	 */
	void exitSearch_term(LexParser.Search_termContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#index}.
	 * @param ctx the parse tree
	 */
	void enterIndex(LexParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#index}.
	 * @param ctx the parse tree
	 */
	void exitIndex(LexParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#relation_modified}.
	 * @param ctx the parse tree
	 */
	void enterRelation_modified(LexParser.Relation_modifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#relation_modified}.
	 * @param ctx the parse tree
	 */
	void exitRelation_modified(LexParser.Relation_modifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(LexParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(LexParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#relation_name}.
	 * @param ctx the parse tree
	 */
	void enterRelation_name(LexParser.Relation_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#relation_name}.
	 * @param ctx the parse tree
	 */
	void exitRelation_name(LexParser.Relation_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#relation_symbol}.
	 * @param ctx the parse tree
	 */
	void enterRelation_symbol(LexParser.Relation_symbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#relation_symbol}.
	 * @param ctx the parse tree
	 */
	void exitRelation_symbol(LexParser.Relation_symbolContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#boolean_modified}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_modified(LexParser.Boolean_modifiedContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#boolean_modified}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_modified(LexParser.Boolean_modifiedContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#r_boolean}.
	 * @param ctx the parse tree
	 */
	void enterR_boolean(LexParser.R_booleanContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#r_boolean}.
	 * @param ctx the parse tree
	 */
	void exitR_boolean(LexParser.R_booleanContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#modifier_list}.
	 * @param ctx the parse tree
	 */
	void enterModifier_list(LexParser.Modifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#modifier_list}.
	 * @param ctx the parse tree
	 */
	void exitModifier_list(LexParser.Modifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(LexParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(LexParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#modifier_name}.
	 * @param ctx the parse tree
	 */
	void enterModifier_name(LexParser.Modifier_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#modifier_name}.
	 * @param ctx the parse tree
	 */
	void exitModifier_name(LexParser.Modifier_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#modifier_relation}.
	 * @param ctx the parse tree
	 */
	void enterModifier_relation(LexParser.Modifier_relationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#modifier_relation}.
	 * @param ctx the parse tree
	 */
	void exitModifier_relation(LexParser.Modifier_relationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#modifier_value}.
	 * @param ctx the parse tree
	 */
	void enterModifier_value(LexParser.Modifier_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#modifier_value}.
	 * @param ctx the parse tree
	 */
	void exitModifier_value(LexParser.Modifier_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#prefix_name}.
	 * @param ctx the parse tree
	 */
	void enterPrefix_name(LexParser.Prefix_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#prefix_name}.
	 * @param ctx the parse tree
	 */
	void exitPrefix_name(LexParser.Prefix_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(LexParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(LexParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link LexParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void enterSimple_name(LexParser.Simple_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link LexParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void exitSimple_name(LexParser.Simple_nameContext ctx);
}