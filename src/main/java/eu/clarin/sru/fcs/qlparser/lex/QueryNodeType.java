/**
 * This software is copyright (c) 2013-2025 by
 *  - Saxon Academy of Sciences and Humanities in Leipzig (https://www.saw-leipzig.de)
 * This is free software. You can redistribute it
 * and/or modify it under the terms described in
 * the GNU General Public License v3 of which you
 * should have received a copy. Otherwise you can download
 * it from
 *
 *   http://www.gnu.org/licenses/gpl-3.0.txt
 *
 * @copyright Saxon Academy of Sciences and Humanities in Leipzig (https://www.saw-leipzig.de)
 *
 * @license http://www.gnu.org/licenses/gpl-3.0.txt
 *  GNU General Public License v3
 */
package eu.clarin.sru.fcs.qlparser.lex;

import eu.clarin.sru.fcs.qlparser.AbstractQueryNode.AbstractQueryNodeType;

/**
 * Node types of LexCQL expression tree nodes.
 */
public enum QueryNodeType implements AbstractQueryNodeType {
    /**
     * search clause group (either nested search clause groups or search clauses,
     * with binary boolean relation)
     */
    SEARCH_CLAUSE_GROUP {
        @Override
        public String toDisplayString() {
            return "SearchClauseGroup";
        }
    },
    /**
     * subquery (either with nested query/search_clause_group in parentheses) or a search_clause
     */
    SUBQUERY {
        @Override
        public String toDisplayString() {
            return "Subquery";
        }
    },
    /**
     * search clause
     */
    SEARCH_CLAUSE {
        @Override
        public String toDisplayString() {
            return "SearchClause";
        }
    },
    /**
     * relation
     */
    RELATION {
        @Override
        public String toDisplayString() {
            return "Relation";
        }
    },
    /**
     * modifier
     */
    MODIFIER {
        @Override
        public String toDisplayString() {
            return "Modifier";
        }
    };

} // enum QueryNodeType
