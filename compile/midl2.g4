/** Grammars always start with a grammar header. This grammar is called
 *  ArrayInit and must match the filename: ArrayInit.g4
 */
grammar midl2;

/** A rule called init that matches comma-separated values between {...}. */
//init  : '{' value (',' value)* '}' ;  // must match at least one value

/** A value can be either a nested array/struct or a simple integer (INT) */
//value : init
//      | INT
//      ;

// parser rules start with lowercase letters, lexer rules with uppercase
//INT :   [0-9]+ ;             // Define token INT as one or more digits
//WS  :   [ \t\r\n]+ -> skip ; // Define whitespace rule, toss it out

//中括号用？
//花括号用*
//重复一次再花括号用+
specification : definition+ ;
definition : type_decl SEMICOLON | module SEMICOLON ;
module : kw_module identifier LEFT_BRACE definition+ RIGHT_BRACE;
type_decl : struct_type | kw_struct identifier ;
struct_type : kw_struct identifier LEFT_BRACE member_list RIGHT_BRACE;
identifier : ID;
member_list : (type_spec declarators SEMICOLON)*;
type_spec : scoped_name | base_type_spec | struct_type ;
scoped_name : DOUBLE_COLON? identifier ( DOUBLE_COLON identifier)*;
base_type_spec : floating_pt_type | integer_type | kw_char | kw_string | kw_boolaen ;
floating_pt_type : kw_float | kw_double | kw_long_double;
integer_type : signed_int | unsigned_int ;
signed_int : ( kw_short | kw_int16) | ( kw_long | kw_int32)
             | (kw_long kw_long | kw_int64) | kw_int8;
unsigned_int : (kw_unsigned kw_short | kw_uint16)|
(kw_unsigned kw_long | kw_uint32)|(kw_unsigned kw_long kw_long | kw_uint64)|kw_uint8;
declarators : declarator (COMMA declarator)*;
declarator : simple_declarator | array_declarator;
simple_declarator : identifier ( EQUAL or_expr)?;
array_declarator : identifier LEFT_SQUARE_BRACKET or_expr RIGHT_SQUARE_BRACKET ( EQUAL exp_list)?;
exp_list : LEFT_SQUARE_BRACKET or_expr (COMMA or_expr)* RIGHT_SQUARE_BRACKET;
or_expr : xor_expr (PIPE xor_expr)*;
xor_expr : and_expr (CARET and_expr)*;
and_expr : shift_expr (AMPERSAND shift_expr)*;
shift_expr : add_expr ((RIGHT_SHIFT|LEFT_SHIFT) add_expr)*;
add_expr : mult_expr ((PLUS|MINUS) mult_expr)*;
mult_expr : unary_expr ((STAR|SLASH|PERCENT) unary_expr)*;
unary_expr : (MINUS|PLUS|TILDE)? literal;
literal : integer | floating_pt | char | string | boolean ;
integer:INTEGER;
floating_pt:FLOATING_PT;
char:CHAR;
string:STRING;
boolean:BOOLEAN;
kw_module:KW_MODULE;
kw_struct:KW_STRUCT;
kw_char:KW_CHAR;
kw_string:KW_STRING;
kw_boolaen:KW_BOOLEAN;
kw_float:KW_FLOAT;
kw_double:KW_DOUBLE;
kw_long_double:KW_LONG_DOUBLE;
kw_short:KW_SHORT;
kw_int16:KW_INT16;
kw_long:KW_LONG;
kw_int32:KW_INT32;
kw_int64:KW_INT64;
kw_int8:KW_INT8;
kw_uint32:KW_UINT32;
kw_uint64:KW_UINT64;
kw_uint8:KW_UINT8;
kw_uint16:KW_UINT16;
kw_unsigned:KW_UNSIGNED;






LETTER : [a-z]|[A-Z];
DIGIT : [0-9];
UNDERLINE : '_';
INTEGER_TYPE_SUFFIX :   'l' | 'L';
INTEGER : ('0' | [1-9] [0-9]*) INTEGER_TYPE_SUFFIX?;
EXPONENT : ( 'e' | 'E') ( '+' | '-' )? [0-9]+;
fragment FLOAT_TYPE_SUFFIX :  ('f' | 'F' | 'd' | 'D');
FLOATING_PT : [0-9]+ '.' [0-9]*  EXPONENT?  FLOAT_TYPE_SUFFIX?
   				|  '.' [0-9]+  EXPONENT?  FLOAT_TYPE_SUFFIX?
   				|  [0-9]+  EXPONENT  FLOAT_TYPE_SUFFIX?
   				|  [0-9]+  EXPONENT?  FLOAT_TYPE_SUFFIX;
ESCAPE_SEQUENCE :  '\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '"' | '\'' | '\\' ) -> skip;
CHAR: '\''(ESCAPE_SEQUENCE |  (~'\\' | ~'\'') )'\'';
STRING :    '"' (ESCAPE_SEQUENCE |  (~'\\' | ~'"') )* '"';
BOOLEAN : 'TRUE' | 'true' | 'FALSE' | 'false';
WS  :   [ \t\r\n]+ -> skip;
SEMICOLON
   : ';'
   ;


COLON
   : ':'
   ;


COMMA
   : ','
   ;


LEFT_BRACE
   : '{'
   ;


RIGHT_BRACE
   : '}'
   ;


LEFT_BRACKET
   : '('
   ;


RIGHT_BRACKET
   : ')'
   ;


LEFT_SQUARE_BRACKET
   : '['
   ;


RIGHT_SQUARE_BRACKET
   : ']'
   ;


TILDE
   : '~'
   ;


SLASH
   : '/'
   ;


LEFT_ANG_BRACKET
   : '<'
   ;


RIGHT_ANG_BRACKET
   : '>'
   ;


STAR
   : '*'
   ;


PLUS
   : '+'
   ;


MINUS
   : '-'
   ;


CARET
   : '^'
   ;


AMPERSAND
   : '&'
   ;


PIPE
   : '|'
   ;


EQUAL
   : '='
   ;


PERCENT
   : '%'
   ;


DOUBLE_COLON
   : '::'
   ;


RIGHT_SHIFT
   : '>>'
   ;


LEFT_SHIFT
   : '<<'
   ;


AT : '@'
   ;

KW_SETRAISES
   : 'setraises'
   ;


KW_OUT
   : 'out'
   ;


KW_EMITS
   : 'emits'
   ;


KW_STRING
   : 'string'
   ;


KW_SWITCH
   : 'switch'
   ;


KW_PUBLISHES
   : 'publishes'
   ;


KW_TYPEDEF
   : 'typedef'
   ;


KW_USES
   : 'uses'
   ;


KW_PRIMARYKEY
   : 'primarykey'
   ;


KW_CUSTOM
   : 'custom'
   ;


KW_OCTET
   : 'octet'
   ;


KW_SEQUENCE
   : 'sequence'
   ;


KW_IMPORT
   : 'import'
   ;


KW_STRUCT
   : 'struct'
   ;


KW_NATIVE
   : 'native'
   ;


KW_READONLY
   : 'readonly'
   ;


KW_FINDER
   : 'finder'
   ;


KW_RAISES
   : 'raises'
   ;


KW_VOID
   : 'void'
   ;


KW_PRIVATE
   : 'private'
   ;


KW_EVENTTYPE
   : 'eventtype'
   ;


KW_WCHAR
   : 'wchar'
   ;


KW_IN
   : 'in'
   ;


KW_DEFAULT
   : 'default'
   ;


KW_PUBLIC
   : 'public'
   ;


KW_SHORT
   : 'short'
   ;


KW_LONG
   : 'long'
   ;


KW_ENUM
   : 'enum'
   ;


KW_WSTRING
   : 'wstring'
   ;


KW_CONTEXT
   : 'context'
   ;


KW_HOME
   : 'home'
   ;


KW_FACTORY
   : 'factory'
   ;


KW_EXCEPTION
   : 'exception'
   ;


KW_GETRAISES
   : 'getraises'
   ;


KW_CONST
   : 'const'
   ;


KW_VALUEBASE
   : 'ValueBase'
   ;


KW_VALUETYPE
   : 'valuetype'
   ;


KW_SUPPORTS
   : 'supports'
   ;


KW_MODULE
   : 'module'
   ;


KW_OBJECT
   : 'Object'
   ;


KW_TRUNCATABLE
   : 'truncatable'
   ;


KW_UNSIGNED
   : 'unsigned'
   ;


KW_FIXED
   : 'fixed'
   ;


KW_UNION
   : 'union'
   ;


KW_ONEWAY
   : 'oneway'
   ;


KW_ANY
   : 'any'
   ;


KW_CHAR
   : 'char'
   ;


KW_CASE
   : 'case'
   ;


KW_FLOAT
   : 'float'
   ;

KW_LONG_DOUBLE
   : 'long double'
   ;

KW_BOOLEAN
   : 'boolean'
   ;


KW_MULTIPLE
   : 'multiple'
   ;


KW_ABSTRACT
   : 'abstract'
   ;


KW_INOUT
   : 'inout'
   ;


KW_PROVIDES
   : 'provides'
   ;


KW_CONSUMES
   : 'consumes'
   ;


KW_DOUBLE
   : 'double'
   ;


KW_TYPEPREFIX
   : 'typeprefix'
   ;


KW_TYPEID
   : 'typeid'
   ;


KW_ATTRIBUTE
   : 'attribute'
   ;


KW_LOCAL
   : 'local'
   ;


KW_MANAGES
   : 'manages'
   ;


KW_INTERFACE
   : 'interface'
   ;


KW_COMPONENT
   : 'component'
   ;

KW_SET
   : 'set'
   ;

KW_MAP
   : 'map'
   ;

KW_BITFIELD
   : 'bitfield'
   ;

KW_BITSET
   : 'bitset'
   ;

KW_BITMASK
   : 'bitmask'
   ;

KW_INT8
   : 'int8'
   ;

KW_UINT8
   : 'uint8'
   ;

KW_INT16
   : 'int16'
   ;

KW_UINT16
   : 'uint16'
   ;

KW_INT32
   : 'int32'
   ;

KW_UINT32
   : 'uint32'
   ;

KW_INT64
   : 'int64'
   ;

KW_UINT64
   : 'uint64'
   ;

KW_AT_ANNOTATION
   : '@annotation'
   ;
ID :  LETTER (UNDERLINE?( LETTER | DIGIT))*;