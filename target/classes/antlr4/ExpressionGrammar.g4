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

ap  :   doc SL rp       #SlAp               // Ap
    |   doc DSL rp      #DSlAp;             // Ap

rp  :   tagName         #TagNameRp          // ChildrenRp
    |   STAR            #StarRp             // ChildrenRp
    |   'text()'        #TextRp             // ChildrenRp
    |   DOT             #SelfRp             // NodeRp
    |   DDOT            #ParentRp           // NodeRp
    |   AT attName      #AttrRp             // NodeRp
    |   LPR rp LPR      #PrRp               // NodeRp
    |   rp SL rp        #SlRp               // NestedRp
    |   rp DSL rp       #DSlRp              // NestedRp
    |   rp LSQ f RSQ    #FilterRp           // TODO
    |   rp COMMA rp     #CommaRp ;          // TODO

f   :   rp              #RpFilter          // TODO
    |   rp EQ rp        #EqFilter          // TODO
    |   rp IS rp        #IsFilter          // TODO
    |   rp EQ strConst  #StrConstRp        // TODO
    |   LPR f RPR       #PrFilter          // TODO
    |   f AND f         #AndFilter         // TODO
    |   f OR f          #OrFilter          // TODO
    |   NOT f           #NotFilter ;       // TODO


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