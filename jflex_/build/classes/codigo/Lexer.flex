package codigo;
import java_cup.runtime.*;

%%
%class Lexer
%type java_cup.runtime.Symbol
%unicode
%cup
%line
%column
%char

%{
StringBuffer string = new StringBuffer();

private Symbol symbol(int type) {
return new Symbol(type, yyline, yycolumn);
}
private Symbol symbol(int type, Object value) {
return new Symbol(type, yyline, yycolumn, value);
}
%}

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
WhiteSpace     = {LineTerminator} | [ \t\f]

    /* comments */
Comment = {TraditionalComment} | {EndOfLineComment} | {DocumentationComment}

TraditionalComment   = "/*" [^*] ~"*/" | "/*" "*"+ "/"
    // Comment can be the last line of the file, without line terminator.
EndOfLineComment     = "//" {InputCharacter}* {LineTerminator}?
DocumentationComment = "/**" {CommentContent} "*"+ "/"
CommentContent       = ( [^*] | \*+ [^/*] )*

Identifier = [:jletter:] [:jletterdigit:]*
Variable = [$]*
DecIntegerLiteral = 0 | [1-9][0-9]*

%state STRING
%%

        /* Reservadas */
<YYINITIAL>"halt_compiler" { return new Symbol(sym.HALT_COMPILER,yytext()); }
<YYINITIAL>"abstract" { return new Symbol(sym.ABSTRACT,yytext()); }
<YYINITIAL>"and" { return new Symbol(sym.AND,yytext()); }
<YYINITIAL>"array" { return new Symbol(sym.ARRAY,yytext()); }
<YYINITIAL>"as" { return new Symbol(sym.AS,yytext()); }
<YYINITIAL>"break" { return new Symbol(sym.BREAK,yytext()); }
<YYINITIAL>"callable" { return new Symbol(sym.CALLABLE,yytext()); }
<YYINITIAL>"case" { return new Symbol(sym.CASE,yytext()); }
<YYINITIAL>"catch" { return new Symbol(sym.CATCH,yytext()); }
<YYINITIAL>"class" { return new Symbol(sym.CLASS,yytext()); }
<YYINITIAL>"clone" { return new Symbol(sym.CLONE,yytext()); }
<YYINITIAL>"const" { return new Symbol(sym.CONST,yytext()); }
<YYINITIAL>"continue" { return new Symbol(sym.CONTINUE,yytext()); }
<YYINITIAL>"declare" { return new Symbol(sym.DECLARE,yytext()); }
<YYINITIAL>"default" { return new Symbol(sym.DEFAULT,yytext()); }
<YYINITIAL>"die" { return new Symbol(sym.DIE,yytext()); }
<YYINITIAL>"echo" { return new Symbol(sym.ECHO,yytext()); }
<YYINITIAL>"empty" { return new Symbol(sym.EMPTY,yytext()); }
<YYINITIAL>"elseif" { return new Symbol(sym.ELSEIF,yytext()); }
<YYINITIAL>"enddeclare" { return new Symbol(sym.ENDDECLARE,yytext()); }
<YYINITIAL>"endfor" { return new Symbol(sym.ENDFOR,yytext()); }
<YYINITIAL>"endforeach" { return new Symbol(sym.ENDFOREACH,yytext()); }
<YYINITIAL>"endif" { return new Symbol(sym.ENDIF,yytext()); }
<YYINITIAL>"endswitch" { return new Symbol(sym.ENDSWITCH,yytext()); }
<YYINITIAL>"endwhile" { return new Symbol(sym.ENDWHILE,yytext()); }
<YYINITIAL>"eval" { return new Symbol(sym.EVAL,yytext()); }
<YYINITIAL>"exit" { return new Symbol(sym.EXIT,yytext()); }
<YYINITIAL>"extends" { return new Symbol(sym.EXTENDS,yytext()); }
<YYINITIAL>"final" { return new Symbol(sym.FINAL,yytext()); }
<YYINITIAL>"finally" { return new Symbol(sym.FINALLY,yytext()); }
<YYINITIAL>"function" { return new Symbol(sym.FUNCTION,yytext()); }
<YYINITIAL>"global" { return new Symbol(sym.GLOBAL,yytext()); }
<YYINITIAL>"goto" { return new Symbol(sym.GOTO,yytext()); }
<YYINITIAL>"implements" { return new Symbol(sym.IMPLEMENTS,yytext()); }
<YYINITIAL>"include" { return new Symbol(sym.INCLUDE,yytext()); }
<YYINITIAL>"include_once" { return new Symbol(sym.INCLUDE_ONCE,yytext()); }
<YYINITIAL>"instanceof" { return new Symbol(sym.INSTANCEOF,yytext()); }
<YYINITIAL>"insteadof" { return new Symbol(sym.INSTEADOF,yytext()); }
<YYINITIAL>"interface" { return new Symbol(sym.INTERFACE,yytext()); }
<YYINITIAL>"isset" { return new Symbol(sym.ISSET,yytext()); }
<YYINITIAL>"list" { return new Symbol(sym.LIST,yytext()); }
<YYINITIAL>"match" { return new Symbol(sym.MATCH,yytext()); }
<YYINITIAL>"namespace" { return new Symbol(sym.NAMESPACE,yytext()); }
<YYINITIAL>"new" { return new Symbol(sym.NEW,yytext()); }
<YYINITIAL>"or" { return new Symbol(sym.OR,yytext()); }
<YYINITIAL>"print" { return new Symbol(sym.PRINT,yytext()); }
<YYINITIAL>"private" { return new Symbol(sym.PRIVATE,yytext()); }
<YYINITIAL>"protected" { return new Symbol(sym.PROTECTED,yytext()); }
<YYINITIAL>"public" { return new Symbol(sym.PUBLIC,yytext()); }
<YYINITIAL>"require" { return new Symbol(sym.REQUIRE,yytext()); }
<YYINITIAL>"require_once" { return new Symbol(sym.REQUIRE_ONCE,yytext()); }
<YYINITIAL>"return" { return new Symbol(sym.RETURN,yytext()); }
<YYINITIAL>"static" { return new Symbol(sym.STATIC,yytext()); }
<YYINITIAL>"switch" { return new Symbol(sym.SWITCH,yytext()); }
<YYINITIAL>"throw" { return new Symbol(sym.THROW,yytext()); }
<YYINITIAL>"trait" { return new Symbol(sym.TRAIT,yytext()); }
<YYINITIAL>"try" { return new Symbol(sym.TRY,yytext()); }
<YYINITIAL>"unset" { return new Symbol(sym.UNSET,yytext()); }
<YYINITIAL>"use" { return new Symbol(sym.USE,yytext()); }
<YYINITIAL>"var" { return new Symbol(sym.VAR,yytext()); }
<YYINITIAL>"xor" { return new Symbol(sym.XOR,yytext()); }
<YYINITIAL>"yield" { return new Symbol(sym.YIELD,yytext()); }
<YYINITIAL>"from" { return new Symbol(sym.FROM,yytext()); }

/* Accion Reservada */
<YYINITIAL>"if" { return new Symbol(sym.IF,yytext()); }
<YYINITIAL>"else" { return new Symbol(sym.ELSE,yytext()); }
<YYINITIAL>"do" { return new Symbol(sym.DO,yytext()); }
<YYINITIAL>"while" { return new Symbol(sym.WHILE,yytext()); }
<YYINITIAL>"for" { return new Symbol(sym.FOR,yytext()); }
<YYINITIAL>"each" { return new Symbol(sym.EACH,yytext()); }
<YYINITIAL>"php" { return new Symbol(sym.PHP_I,yytext()); }

<YYINITIAL> {
/* identifiers */ 
{Variable}{Identifier}                   { return symbol(sym.IDENTIFIER,yytext()); }
{DecIntegerLiteral}            { return symbol(sym.DECINT,yytext()); }
      /* operators */
" $" { return new Symbol(sym.VARIABLE,yytext()); }
"," { return new Symbol(sym.COMA,yytext()); }
"'" { return new Symbol(sym.APOSTROFE,yytext()); }
":" { return new Symbol(sym.DOSPUNTOS,yytext()); }
"<" { return new Symbol(sym.MENORQ,yytext()); }
">" {return new Symbol(sym.MAYORQ,yytext()); }
"?" { return new Symbol(sym.PREGUNTA_A,yytext()); }
";" { return new Symbol(sym.P_COMA,yytext()); }
"+" { return new Symbol(sym.SUMA,yytext()); }
"-" { return new Symbol(sym.RESTA,yytext()); }
"*" { return new Symbol(sym.MULTIPLICA,yytext()); }
"&&" | "||" | "!" | "&" | "|" { return new Symbol(sym.OP_LOGICO,yytext()); }
"==" | "!=" | ">=" | "<=" | "<<" | ">>" { return new Symbol(sym.OP_RELACIONAL,yytext()); }
"+=" | "-="  | "*=" | "/=" | "%=" | "=" { return new Symbol(sym.OP_ATRIBUCION,yytext()); }
"++" | "--" { return new Symbol(sym.OP_INCREODEC,yytext()); }
"(" { return new Symbol(sym.PARENTESIS_A,yytext()); }
")" { return new Symbol(sym.PARENTESIS_C,yytext()); }
"{" { return new Symbol(sym.LLAVE_A,yytext()); }
"}" { return new Symbol(sym.LLAVE_C,yytext()); }
"[" { return new Symbol(sym.CORCHETE_A,yytext()); }
"]" { return new Symbol(sym.CORCHETE_C,yytext()); }
"\"" { return new Symbol(sym.COMILLAS,yytext()); }
" true" | " false" { return new Symbol(sym.OP_BOOL,yytext()); }
/* comments */
{Comment}                      { /* ignore */ } 
/* whitespace */
{WhiteSpace}                   { /* ignore */ }
}

<STRING> {
\"                             
[^\n\r\"\\]+                   { string.append( yytext()); }
\\t                            { string.append('\t'); }
\\n                            { string.append('\n'); }
\\r                            { string.append('\r'); }
\\\"                           { string.append('\"'); }
\\                             { string.append('\\'); }
}

/* error fallback */
[^]                              { throw new Error("Illegal character <"+
yytext()+">"); }
