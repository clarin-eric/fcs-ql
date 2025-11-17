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

package eu.clarin.sru.fcs.qlparser;

import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class AbstractQueryNode<Q extends AbstractQueryNode<Q, T, V>, T extends AbstractQueryNode.AbstractQueryNodeType, V extends AbstractQueryNode.AbstractQueryVisitor> {

    /**
     * Interface for node types of query expression tree nodes.
     */
    public static interface AbstractQueryNodeType {
        /* EMPTY */

        String toDisplayString();
    }


    /**
     * Interface implementing a Visitor pattern for query expression trees.
     */
    public static interface AbstractQueryVisitor {
        /* EMPTY */
    }


    /**
     * Source information wrapping start and stop offsets in the query text for a
     * query node.
     */
    public static class SourceLocation {
        final int start;
        final int stop;


        public SourceLocation(int start, int stop) {
            this.start = start;
            this.stop = stop;
        }


        public static SourceLocation fromParserRuleContext(ParserRuleContext ctx) {
            if (ctx == null) {
                return null;
            }

            // start and stop tokens might be null (maybe due to errors)
            if (ctx.getStart() == null || ctx.getStop() == null) {
                return null;
            }

            int start = ctx.getStart().getStartIndex();
            int stop = ctx.getStop().getStopIndex() + 1;
            // NOTE: stop+1 for Java string indexing
            return new SourceLocation(start, stop);
        }


        public int getStart() {
            return start;
        }


        public int getStop() {
            return stop;
        }
    }


    protected final T nodeType;
    protected final List<Q> children;
    protected Q parent;
    protected SourceLocation location;


    /**
     * Constructor.
     *
     * @param nodeType
     *            the type of the node
     * @param children
     *            the children of this node or <code>null</code> if none
     */
    @SuppressWarnings("unchecked")
    protected AbstractQueryNode(T nodeType, List<Q> children) {
        this.nodeType = nodeType;
        if ((children != null) && !children.isEmpty()) {
            for (Q child : children) {
                child.setParent((Q) this);
            }
            this.children = Collections.unmodifiableList(children);
        } else {
            this.children = Collections.emptyList();
        }
    }


    /**
     * Constructor.
     *
     * @param nodeType
     *            the type of the node
     * @param child
     *            the child of this node or <code>null</code> if none
     */
    @SuppressWarnings("unchecked")
    protected AbstractQueryNode(T nodeType, Q child) {
        this.nodeType = nodeType;
        if (child != null) {
            child.setParent((Q) this);
            this.children = Collections.singletonList(child);
        } else {
            this.children = Collections.emptyList();
        }
    }


    /**
     * Constructor.
     *
     * @param nodeType
     *            the type of the node
     */
    protected AbstractQueryNode(T nodeType) {
        this.nodeType = nodeType;
        this.children = Collections.emptyList();
    }


    /**
     * Get the node type of this node.
     *
     * @return the node type
     */
    public T getNodeType() {
        return nodeType;
    }


    /**
     * Check, if node if of given type.
     *
     * @param nodeType
     *            type to check against
     * @return <code>true</code> if node is of given type, <code>false</code>
     *         otherwise
     */
    public boolean hasNodeType(T nodeType) {
        if (nodeType == null) {
            throw new NullPointerException("nodeType == null");
        }
        return this.nodeType == nodeType;
    }


    /**
     * Get the parent node of this node.
     *
     * @return the parent node or <code>null</code> if this is the root node
     */
    public Q getParent() {
        return parent;
    }


    protected final void setParent(Q parent) {
        this.parent = parent;
    }


    /**
     * The children of this node.
     *
     * @return the list of children of this node
     */
    public List<Q> getChildren() {
        return children;
    }


    /**
     * Get the number of children of this node.
     *
     * @return the number of children of this node
     */
    public int getChildCount() {
        final List<Q> children = getChildren();
        return (children != null) ? children.size() : 0;
    }


    /**
     * Get a child node by index.
     *
     * @param idx
     *            the index of the child node
     * @return the child node of this node or <code>null</code> if index is out
     *         of bounds
     */
    public Q getChild(int idx) {
        final List<Q> children = getChildren();
        if ((children != null) && !children.isEmpty()) {
            if ((idx >= 0) && (idx < children.size())) {
                return children.get(idx);
            }
        }
        return null;
    }


    /**
     * Get this first child node.
     *
     * @return the first child node of this node or <code>null</code> if none
     */
    public Q getFirstChild() {
        return getChild(0);
    }


    /**
     * Get this last child node.
     *
     * @return the last child node of this node or <code>null</code> if none
     */
    public Q getLastChild() {
        return getChild(getChildCount() - 1);
    }


    /**
     * Get a child node of specified type by index. Only child nodes of the
     * requested type are counted.
     *
     * @param <X>
     *            the class of the nodes to be considered
     * @param clazz
     *            the type to nodes to be considered
     * @param idx
     *            the index of the child node
     * @return the child node of this node or <code>null</code> if no child was
     *         found
     */
    public <X extends Q> X getChild(Class<X> clazz, int idx) {
        final List<Q> children = getChildren();
        if (!children.isEmpty()) {
            int pos = 0;
            for (Q child : children) {
                if (clazz.isInstance(child)) {
                    if (pos == idx) {
                        return clazz.cast(child);
                    }
                    pos++;
                }
            }
        }
        return null;
    }


    /**
     * Get a first child node of specified type.
     *
     * @param <X>
     *            the class of the nodes to be considered
     * @param clazz
     *            the type to nodes to be considered
     * @return the child node of this node or <code>null</code> if no child was
     *         found
     */
    public <X extends Q> X getFirstChild(Class<X> clazz) {
            return getChild(clazz, 0);
    }


    /**
     * Get source location information about start/stop offsets for this query node
     * in the query text content.
     *
     * @return the location information with the span convering the query node in
     *         the query
     */
    public SourceLocation getLocation() {
        return location;
    }


    /**
     * Set source location information.
     *
     * @param location
     *            the location information with the span convering the query 
     *            node in the query
     */
    public final void setLocation(SourceLocation location) {
        this.location = location;
    }


    public abstract void accept(V visitor);


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(').append(nodeType.toDisplayString());
        if (!children.isEmpty()) {
            for (Q child : children) {
                sb.append(' ').append(child);
            }
        }
        sb.append(')');
        if (location != null) {
            sb.append('@').append(location.getStart()).append(':').append(location.getStop());
        }
        return sb.toString();
    }

}
