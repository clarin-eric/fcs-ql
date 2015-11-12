parser grammar FCSParser;
options { tokenVocab=FCSLexer; }
/* 
 * Parser for FCS Core FCS-QL version 2.0
 * 20150501- /ljo
 */ 
query
    : main_query within_part?
    ;

/* for debugging */
parse
  :  (t=.   
          {System.out.printf("text: %-7s  type: %s \n",  
           $t.text, tokenNames[$t.type]);}  
     )*
  ;

//main_query
//    : simple_query 
//    | main_query OR main_query     /* or */
//    | main_query main_query         /* sequence */
//    | main_query QUANTIFIER         /* quatification */ 
//    ;

main_query
    : simple_query 
    | simple_query OR main_query     /* or */
    | simple_query main_query         /* sequence */
    | simple_query QUANTIFIER         /* quatification */ 
    ;

/*
simple_query
    : implicit_query
    | segment_query 
    ;
*/

simple_query
    : LPAREN main_query RPAREN            /* grouping */
    | implicit_query
    | segment_query 
    ;

implicit_query
    : flagged_regexp
    ;

segment_query
    : L_SQUARE_BRACKET expression? R_SQUARE_BRACKET     /* [ expression? ] */
    ;

within_part
    : simple_within_part
    ;

simple_within_part
    : WITHIN SIMPLE_WITHIN_SCOPE
    ;

//expression
//    : basic_expression          # basicExpression
//    | expression OR expression  # orExpression /* or */
//    | expression AND expression # andExpression /* and */
//    | LPAREN expression RPAREN  # groupedExpression /* grouping */
//    | NOT expression            # notExpression /* not */ 
//    ;

expression
    : basic_expression          # basicExpression
    | expression OR expression  # orExpression /* or */
    | expression AND expression # andExpression /* and */
    ;

/*
basic_expression
    : attribute OPERATOR flagged_regexp
    ;
*/

basic_expression
    : LPAREN expression RPAREN  # groupedExpression /* grouping */
    | NOT expression            # notExpression /* not */ 
    | attribute OPERATOR flagged_regexp #basicAttrOpFlaggedRegex
    ;


attribute
    : SIMPLE_ATTRIBUTE    # simpleAttribute
    | QUALIFIED_ATTRIBUTE # qualifiedAttribute
    ;

flagged_regexp
    : REGEXP         # regexp
    | FLAGGED_REGEXP # flaggedRegexp 
    ;
