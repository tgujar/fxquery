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

ap  :   doc SL rp       #SlAp
    |   doc DSL rp      #DSlAp;

rp  :   tagName         #TagNameRp          // ChildrenRp
    |   STAR            #StarRp      // ChildrenRp
    |   'text()'        #TextRp             // ChildrenRp
    |   DOT             #SelfRp             // NodeRp
    |   DDOT            #ParentRp           // NodeRp
    |   AT attName      #AttrRp             // NodeRp
    |   LPR rp LPR      #PrRp
    |   rp SL rp        #SlRp
    |   rp DSL rp       #DSlRp
    |   rp LSQ f RSQ    #FilterRp
    |   rp COMMA rp     #CommaRp ;

f   :   rp              #RpFilter
    |   rp EQ rp        #EqFilter
    |   rp IS rp        #IsFilter
    |   rp EQ strConst  #StrConstRp
    |   LPR f RPR       #PrFilter
    |   f AND f         #AndFilter
    |   f OR f          #OrFilter
    |   NOT f           #NotFilter ;


doc : DOC LPR DQ fileName DQ RPR;

strConst    : DQ ID DQ ; // Figure out spaces here
fileName    : ID ;
tagName     : ID ;
attName     : ID ;

/*Tokens*/
STAR: '*';
AT: '@';
AND: [aA][nN][dD];
OR: [oO][rR];
NOT: [nN][oO][tT];
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
EQ: '=' | 'eq';
IS: '==' | 'is';
DOC: [dD][oO][cC] | [dD][oO][cC][uU][mM][eE][nN][tT];
ID: [a-zA-Z][a-zA-Z0-9_.-]*;