grammar MiniJava;

goal
    :   mainClassDeclaration
        classDeclaration*
        EOF
    ;

mainClassDeclaration
    :   'class' ID
        mainClassBody
    ;

classDeclaration
    :   'class' ID ('extends' mytype)?
        classBody
    ;

mainClassBody
    :   '{' mainMethod '}'
    ;

mainMethod
    :   mainMethodDeclaration '{' statement '}'
    ;

mainMethodDeclaration
    :   'public' 'static' 'void' 'main' '(' 'String' '[' ']' ID ')'
    ;

classBody
    :   '{' fieldDeclaration*
            methodDeclaration* '}'
    ;

fieldDeclaration
    :   mytype ID ';'
    ;

varDeclaration
    :   mytype ID ';'
    ;

methodDeclaration
    :   ( 'public' mytype ID formalParameters
        /* illegal method declarations */
        |          mytype ID formalParameters
            {notifyErrorListeners("method declaration without public");}
        | 'public'      ID formalParameters
            {notifyErrorListeners("method declaration without return mytype");}
        | 'public' mytype    formalParameters
            {notifyErrorListeners("method declaration without method name");}
        | 'public' mytype ID
            {notifyErrorListeners("method declaration without argument list");}
        )
        methodBody
    ;

methodBody
    :   '{'
            varDeclaration*
            statement+
        '}'
    ;

formalParameters
    :   '(' formalParameterList? ')'
    ;

formalParameterList
    :   formalParameter (',' formalParameter)*
    ;

formalParameter
    :   mytype ID
    ;

mytype
    :   intArrayType
    |   booleanType
    |   intType
    |   ID
    ;

statement
    :   '{' statement* '}'
    # nestedStatement
    |   'if' '(' expression ')'
            statement
        'else'
            statement
    # ifElseStatement
    |   'while' '(' expression ')'
            statement
    # whileStatement
    |   'System.out.println' '(' expression ')' ';'
    # printStatement
    |   ID '=' expression ';'
    # assignStatement
    |   ID '[' expression ']' '=' expression ';'
    # arrayAssignStatement
    |   'return' expression ';'
    # returnStatement
    |   'recur' expression '?' methodArgumentList ':' expression ';'
    # recurStatement
    ;

expression
    :   expression '[' expression ']'
    # arrayAccessExpression
    |   expression '.' 'length'
    # arrayLengthExpression
    |   expression '.' ID methodArgumentList
    # methodCallExpression
    |   '-' expression
    # negExpression
    |   '!' expression
    # notExpression
    |   'new' 'int' '[' expression ']'
    # arrayInstantiationExpression
    |   'new' ID '(' ')'
    # objectInstantiationExpression
    |   expression '*'  expression
    # mulExpression
    |   expression '/'  expression
    # divExpression
    |   expression '+'  expression
    # addExpression
    |   expression '-'  expression
    # subExpression
    |   expression '<'  expression
    # ltExpression
    |   expression '&&' expression
    # andExpression
    |   INT
    # intLitExpression
    |   BOOL
    # booleanLitExpression
    |   ID
    # identifierExpression
    |   'this'
    # thisExpression
    |   '(' expression ')'
    # parenExpression
    ;

methodArgumentList
    :   '(' (expression (',' expression)*)? ')'
    ;

intArrayType
    :   'int' '[' ']'
    ;

booleanType
    :   'boolean'
    ;

intType
    :   'int'
    ;

INT
    :   ('0' | [1-9][0-9]*)
    ;

BOOL
    :   'true'
    |   'false'
    ;

ID
    :   [a-zA-Z_][0-9a-zA-Z_]*
    ;

WS
    :   [ \r\t\n]+ -> skip
    ;

COMMENT
    : '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
    ;