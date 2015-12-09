parser grammar FCSParser;
options { tokenVocab=FCSLexer; }
/* 
 * Parser for FCS Core FCS-QL version 2.0
 * 20150501- /ljo
 */ 
query
    : main_query (WITHIN within_part)? EOF
    ;

/* for debugging */
parse
  :  (t=.   
          {System.out.printf("text: %-7s  type: %s \n",  
           $t.text, tokenNames[$t.type]);}  
     )*
  ;


main_query
    : query_simple /* #simpleQuery */
    | query_group /* #queryGroup */
    | query_sequence /* #querySequence */
    | query_disjunction /* #queryDisjunction */
    ;


query_disjunction
    : (query_simple | query_sequence | query_group)
            (OR (query_simple | query_sequence | query_group))+
    ;


query_sequence
    : (query_simple | query_group)+
    ;


query_group
    : L_PAREN (query_disjunction | query_sequence) R_PAREN quantifier?
    ;


query_simple
    : (query_implicit | query_segment) quantifier?
    ;


quantifier
    : (Q_ONE_OR_MORE | Q_ZERO_OR_MORE | Q_ZERO_OR_ONE |
        ( L_CURLY_BRACKET
            (INTEGER |
             INTEGER? Q_COMMA INTEGER |
             INTEGER Q_COMMA INTEGER?) R_CURLY_BRACKET))
    ;


query_implicit
    : flagged_regexp
    ;


query_segment
    : L_SQUARE_BRACKET expression? R_SQUARE_BRACKET     /* [ expression? ] */
    ;


within_part
    : simple_within_part
    ;


simple_within_part
    : SIMPLE_WITHIN_SCOPE
    ;


expression
    : expression_basic
    | expression_not
    | expression_group
    | expression_or
    | expression_and
    ;


expression_or
    : (expression_basic | expression_group | expression_not | expression_and) 
        (OR (expression_basic | expression_group | expression_not | expression_and))+ 
    ;    


expression_and
    : (expression_basic | expression_group | expression_not)
        (AND (expression_basic | expression_group | expression_not))+ 
    ;    



expression_group
    : L_PAREN (expression_basic | expression_not | expression_or | expression_and) R_PAREN
    ;


expression_not
    : NOT (expression_basic | expression_not | expression_or | expression_and)
    ;


expression_basic
    : attribute (OPERATOR_EQ | OPERATOR_NE) flagged_regexp
    ;

attribute
    : (qualifier COLON)? identifier
    ; 

qualifier
    : (IDENTIFIER | WITHIN | SIMPLE_WITHIN_SCOPE | REGEXP_FLAGS)
    ;

identifier
    : (IDENTIFIER | WITHIN | SIMPLE_WITHIN_SCOPE | REGEXP_FLAGS)
    ;

flagged_regexp
    : REGEXP (FWD_SLASH REGEXP_FLAGS)? 
    ;
