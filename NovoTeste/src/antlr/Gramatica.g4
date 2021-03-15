grammar Gramatica;

@header{
    package antlr;
}

prog: (attr|soma|sub)+ EOF        #Programa
    ;
attr: ID '=' NUM ';'    #Atribuicao
    ;
soma: NUM '+' NUM ';' #Somato
    ;
sub: NUM '-' NUM ';' #Subta
    ;

ID: ([a-z]|[A-Z])+;
NUM: [0-9]+;
WS:[ \r\t\n]* ->skip;