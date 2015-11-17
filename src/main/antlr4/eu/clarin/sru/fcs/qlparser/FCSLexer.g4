lexer grammar FCSLexer;

/*
 * Lexer part of parser for FCS Core FCS-QL version 2.0
 * default mode
 * 20150501- /ljo 
 */

SIMPLE_WITHIN_SCOPE
    : 'sentence'
    | 's'
    | 'utterance'
    | 'u'
    | 'paragraph'
    | 'p'
    | 'turn'
    | 't'
    | 'text'
    | 'session'
    ;

WITHIN: 'within';

LPAREN: '(';
RPAREN: ')';
L_SQUARE_BRACKET: '[';
R_SQUARE_BRACKET: ']';
OR: '|';
AND: '&';
NOT: '!';
FWD_SLASH: '/';

OPERATOR
    : '='
    | '!='
    ;

QUANTIFIER
    : '+'                           /* one-or-more */
    | '*'                           /* zero-or-more */
    | '?'                           /* zero-or-one */
    | '{' INTEGER '}'               /* exactly n-times */
    | '{' INTEGER? ',' INTEGER '}'  /* at most */
    | '{' INTEGER ',' INTEGER? '}'  /* min-max */
    ;   

REGEXP
    : QUOTED_STRING
    ;

REGEXP_FLAG
    : 'i'  /* case-insensitive; Poliqarp/Perl compat */
    | 'I'  /* case-sensitive; Poliqarp compat */
    | 'c'  /* case-insensitive, CQP compat */
    | 'C'  /* case-sensitive */
    | 'l'  /* literal matching, CQP compat*/
    | 'd'  /* diacritic agnostic matching, CQP compat */
    ;

SIMPLE_ATTRIBUTE
    : IDENTIFIER
    ;
QUALIFIED_ATTRIBUTE
    :  IDENTIFIER ':' IDENTIFIER
    ;

IDENTIFIER
    : IDENTIFIER_FIRST_CHAR IDENTIFIER_CHAR*
    ;  

fragment IDENTIFIER_FIRST_CHAR
    : [a-zA-Z]
    ;

fragment IDENTIFIER_CHAR
    : [a-zA-Z0-9\-]
    ;

INTEGER
    : [0-9+]
    ;

/* // doesnt work
QUOTED_STRING
    : '\'' (CHAR | WS)*? '\''
    | '"' (CHAR | WS)*? '"'
    ;
*/

QUOTED_STRING
    : '\'' (ESCAPED_CHAR | ~['\\])* '\''
    | '"' (ESCAPED_CHAR | ~["\\])* '"'
    ;

fragment CHAR
    : ESCAPED_CHAR
    | ~('\u0009' | '\u000A' | '\u000B' | '\u000C' | '\u000D' | '\u0020' | '\u0085'
        | '\u00A0' | '\u1680' | '\u2000' | '\u2001' | '\u2002' | '\u2003' | '\u2004'
        | '\u2005' | '\u2006' | '\u2007' | '\u2008' | '\u2009' | '\u200A' | '\u2028'
        | '\u2029' | '\u202F' | '\u205F' | '\u3000' ) //anything but white space 
        
    ;

/* any unicode whitespace */
fragment WS: '\u0009' | '\u000A' | '\u000B' | '\u000C' | '\u000D' | '\u0020' | '\u0085'
  | '\u00A0' | '\u1680' | '\u2000' | '\u2001' | '\u2002' | '\u2003' | '\u2004'
  | '\u2005' | '\u2006' | '\u2007' | '\u2008' | '\u2009' | '\u200A' | '\u2028'
  | '\u2029' | '\u202F' | '\u205F' | '\u3000' 
  ;

fragment ESCAPED_CHAR
    : '\\'
       ( '\\'
        | '\''
        | '"'
        | 'n'
        | 't'
        | 'x' HEX HEX
        | 'u' HEX HEX HEX HEX
        | 'U' HEX HEX HEX HEX HEX HEX HEX HEX
      )
    ;

fragment HEX
    : [0-9a-fA-F]
    ;

Space
    : WS -> skip
    ;

