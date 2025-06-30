/**
 * This software is copyright (c) 2013-2022 by
 *  - Leibniz-Institut fuer Deutsche Sprache (http://www.ids-mannheim.de)
 * This is free software. You can redistribute it
 * and/or modify it under the terms described in
 * the GNU General Public License v3 of which you
 * should have received a copy. Otherwise you can download
 * it from
 *
 *   http://www.gnu.org/licenses/gpl-3.0.txt
 *
 * @copyright Leibniz-Institut fuer Deutsche Sprache (http://www.ids-mannheim.de)
 *
 * @license http://www.gnu.org/licenses/gpl-3.0.txt
 *  GNU General Public License v3
 */
package eu.clarin.sru.fcs.qlparser.fcs;

import eu.clarin.sru.fcs.qlparser.AbstractQueryNode.AbstractQueryNodeType;

/**
 * Node types of FCS-QL expression tree nodes.
 */
public enum QueryNodeType implements AbstractQueryNodeType {
    /**
     * segment query
     */
    QUERY_SEGMENT {
        @Override
        public String toDisplayString() {
            return "QuerySegment";
        }
    },
    /**
     * group query
     */
    QUERY_GROUP {
        @Override
        public String toDisplayString() {
            return "QueryGroup";
        }
    },
    /**
     * sequence query
     */
    QUERY_SEQUENCE {
        @Override
        public String toDisplayString() {
            return "QuerySequence";
        }
    },
    /**
     * or query
     */
    QUERY_DISJUNCTION {
        @Override
        public String toDisplayString() {
            return "QueryDisjunction";
        }
    },
    /**
     * query with within part
     */
    QUERY_WITH_WITHIN {
        @Override
        public String toDisplayString() {
            return "QueryWithWithin";
        }
    },
    /**
     * simple expression
     */
    EXPRESSION {
        @Override
        public String toDisplayString() {
            return "Expression";
        }
    },
    /**
     * wildcard expression
     */
    EXPRESSION_WILDCARD {
        @Override
        public String toDisplayString() {
            return "Wildcard";
        }
    },
    /**
     * group expression
     */
    EXPRESSION_GROUP {
        @Override
        public String toDisplayString() {
            return "Group";
        }
    },
    /**
     * or expression
     */
    EXPRESSION_OR {
        @Override
        public String toDisplayString() {
            return "Or";
        }
    },
    /**
     * and expression
     */
    EXPRESSION_AND {
        @Override
        public String toDisplayString() {
            return "And";
        }
    },
    /**
     * not expression
     */
    EXPRESSION_NOT {
        @Override
        public String toDisplayString() {
            return "Not";
        }
    },
    /**
     * simple within part
     */
    SIMPLE_WITHIN {
        @Override
        public String toDisplayString() {
            return "SimpleWithin";
        }
    };

} // enum QueryNodeType
