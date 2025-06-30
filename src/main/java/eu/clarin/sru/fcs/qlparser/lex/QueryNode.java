/**
 * This software is copyright (c) 2013-2025 by
 *  - Leibniz-Institut fuer Deutsche Sprache (http://www.ids-mannheim.de)
 *  - Saxon Academy of Sciences and Humanities in Leipzig (https://www.saw-leipzig.de)
 * This is free software. You can redistribute it
 * and/or modify it under the terms described in
 * the GNU General Public License v3 of which you
 * should have received a copy. Otherwise you can download
 * it from
 *
 *   http://www.gnu.org/licenses/gpl-3.0.txt
 *
 * @copyright Leibniz-Institut fuer Deutsche Sprache (http://www.ids-mannheim.de)
 * @copyright Saxon Academy of Sciences and Humanities in Leipzig (https://www.saw-leipzig.de)
 *
 * @license http://www.gnu.org/licenses/gpl-3.0.txt
 *  GNU General Public License v3
 */
package eu.clarin.sru.fcs.qlparser.lex;

import java.util.List;

import eu.clarin.sru.fcs.qlparser.AbstractQueryNode;

/**
 * Base class for LexCQL expression tree nodes.
 */
public abstract class QueryNode extends AbstractQueryNode<QueryNode, QueryNodeType, QueryVisitor> {
    

    /**
     * Constructor.
     *
     * @param nodeType the type of the node
     * @param children the children of this node or <code>null</code> if none
     */
    protected QueryNode(QueryNodeType nodeType, List<QueryNode> children) {
        super(nodeType, children);
    }

    /**
     * Constructor.
     *
     * @param nodeType the type of the node
     * @param child    the child of this node or <code>null</code> if none
     */
    protected QueryNode(QueryNodeType nodeType, QueryNode child) {
        super(nodeType, child);
    }

    /**
     * Constructor.
     *
     * @param nodeType the type of the node
     */
    protected QueryNode(QueryNodeType nodeType) {
        super(nodeType);
    }

} // abstract class QueryNode
