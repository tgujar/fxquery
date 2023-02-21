grammar ExpressionGrammar ;

@header {
package edu.ucsd.cse232b.parsers;
}

/*


Grammar

(absolute path) ap → doc(fileName)/rp | doc(fileName)//rp
(relative path) rp → tagName|∗|.|..|text()|@attName| (rp) | rp1/rp2 | rp1//rp2 | rp[f] | rp1,rp2
(pathfilter) f → rp|rp1 =rp2 |rp1 eqrp2 |rp1 ==rp2 |rp1 isrp2 |rp=StringConstant (f)|f1 andf2 |f1 orf2 |notf

*/

/*Rules*/
//TODO: fix milestone 1
ap  :  doc DSL rp      #DSlAp
    | doc SL rp       #SlAp;

rp  :
        LPR rp RPR      #PrRp
    |   rp LSQ f RSQ    #FilterRp
    |   rp DSL rp       #DSlRp
    |   rp SL rp        #SlRp
    |   rp COMMA rp     #CommaRp
    |   tagName         #TagNameRp
    |   STAR            #StarRp
    |   'text()'        #TextRp
    |   DDOT            #ParentRp
    |   DOT             #SelfRp
    |   AT attName      #AttrRp;

f
    :   LPR f RPR       #PrFilter
    |   NOT f           #NotFilter
    |   f AND f         #AndFilter
    |   f OR f          #OrFilter
    |   rp IS rp        #IsFilter
    |   rp EQ rp        #EqFilter
    |   rp EQ strConst  #StrConstRp
    |   rp              #RpFilter ;


// XQuery

x
    : LCR DOLLAR ID                  RCR    #VarX
    | LCR MT LPR strConst RPR        RCR    #TextX
    | LCR ap                         RCR    #ApX
    | LCR LPR x RPR                  RCR    #PrX
    | LCR x COMMA x                  RCR    #CommaX
    | LCR x SL rp                    RCR    #CSlRpX
    | LCR x DSL rp                   RCR    #DSLRpX
    | LCR tagOpen LCR x RCR tagClose RCR    #TagX
    | LCR x EQ x                     RCR    #EqX
    | LCR x IS x                     RCR    #IsX;


doc : DOC LPR DQ fileName DQ RPR;

strConst    : DQ ID DQ;
fileName    : ID ;
tagName     : ID ;
attName     : ID ;
tagOpen     : LAG tagName RAG;
tagClose    : LAG SL tagName RAG;

/*Tokens*/
STAR: '*';
DOLLAR: '$';
AT: '@';
NOT: [nN][oO][tT];
AND: [aA][nN][dD];
OR: [oO][rR];
COMMA: ',';
SL: '/';
DSL: '//';
DOT: '.';
DQ: '"';
DDOT: DOT DOT;
LSQ: '[';
RSQ: ']';
LPR: '(';
RPR: ')';
LAG: '<';
RAG: '>';
LCR: '{';
RCR: '}';
EQ: '=' | 'eq';
IS: '==' | 'is';
DOC: [dD][oO][cC] | [dD][oO][cC][uU][mM][eE][nN][tT];
ID: [a-zA-Z][a-zA-Z0-9_.-]*;
MT: 'makeText';
WS : [ \t\r\n]+ -> skip ;