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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.slf4j.Logger;

public abstract class AbstractQueryParser<Q extends AbstractQueryNode<Q, T, V>, T extends AbstractQueryNode.AbstractQueryNodeType, V extends AbstractQueryNode.AbstractQueryVisitor> {

    /**
     * Parse query.
     *
     * @param query
     *            the query
     * @return a query expression tree
     * @throws QueryParserException
     *             if an error occurred
     */
    public abstract Q parse(String query) throws QueryParserException;


    protected static final class ErrorListener extends BaseErrorListener {
        private final Logger logger;
        private final String query;
        private List<String> errors = null;


        public ErrorListener(Logger logger, String query) {
            this.logger = logger;
            this.query = query;
        }


        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                Object offendingSymbol, int line, int charPositionInLine,
                String msg, RecognitionException e) {
            if (errors == null) {
                errors = new ArrayList<>();
            }

            /*
             * FIXME: additional information of error should not be logged
             * but added to the list of errors; that list probably needs
             * to be enhanced to store supplementary information
             * Furthermore, a sophisticated errorlist implementation could
             * also be used by the QueryVistor to add addition query error
             * information
             */
            if (logger.isDebugEnabled()) {
                if (offendingSymbol instanceof Token) {
                    final Token t = (Token) offendingSymbol;
                    int pos = t.getStartIndex();
                    if (pos != -1) {
                        StringBuilder x = new StringBuilder();
                        while (pos-- > 0) {
                            x.append(" ");
                        }
                        x.append("^- ").append(msg);
                        logger.debug("query: {}", query);
                        logger.debug("       {}", x.toString());
                    }
                }
            }

            errors.add(msg);
        }


        public boolean hasErrors() {
            return (errors != null) && !errors.isEmpty();
        }


        public List<String> getErrors() {
            if (errors != null) {
                return errors;
            } else {
                return Collections.emptyList();
            }
        }
    }


    @SuppressWarnings("serial")
    protected static final class ExpressionTreeBuilderException
            extends RuntimeException {
        public ExpressionTreeBuilderException(String message,
                Throwable cause) {
            super(message, cause);
        }


        public ExpressionTreeBuilderException(String message) {
            this(message, null);
        }
    }

}
