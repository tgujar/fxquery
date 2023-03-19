// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExpressionGrammarParser}.
 */
public interface ExpressionGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code DSlAp}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterDSlAp(ExpressionGrammarParser.DSlApContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DSlAp}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitDSlAp(ExpressionGrammarParser.DSlApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SlAp}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void enterSlAp(ExpressionGrammarParser.SlApContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SlAp}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 */
	void exitSlAp(ExpressionGrammarParser.SlApContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SlRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSlRp(ExpressionGrammarParser.SlRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SlRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSlRp(ExpressionGrammarParser.SlRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StarRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterStarRp(ExpressionGrammarParser.StarRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StarRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitStarRp(ExpressionGrammarParser.StarRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTextRp(ExpressionGrammarParser.TextRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTextRp(ExpressionGrammarParser.TextRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterPrRp(ExpressionGrammarParser.PrRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitPrRp(ExpressionGrammarParser.PrRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterFilterRp(ExpressionGrammarParser.FilterRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitFilterRp(ExpressionGrammarParser.FilterRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttrRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterAttrRp(ExpressionGrammarParser.AttrRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttrRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitAttrRp(ExpressionGrammarParser.AttrRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParentRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterParentRp(ExpressionGrammarParser.ParentRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParentRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitParentRp(ExpressionGrammarParser.ParentRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommaRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterCommaRp(ExpressionGrammarParser.CommaRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommaRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitCommaRp(ExpressionGrammarParser.CommaRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelfRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterSelfRp(ExpressionGrammarParser.SelfRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelfRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitSelfRp(ExpressionGrammarParser.SelfRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DSlRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterDSlRp(ExpressionGrammarParser.DSlRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DSlRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitDSlRp(ExpressionGrammarParser.DSlRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagNameRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void enterTagNameRp(ExpressionGrammarParser.TagNameRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagNameRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 */
	void exitTagNameRp(ExpressionGrammarParser.TagNameRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterAndFilter(ExpressionGrammarParser.AndFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitAndFilter(ExpressionGrammarParser.AndFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterIsFilter(ExpressionGrammarParser.IsFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitIsFilter(ExpressionGrammarParser.IsFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterNotFilter(ExpressionGrammarParser.NotFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitNotFilter(ExpressionGrammarParser.NotFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StrConstRp}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterStrConstRp(ExpressionGrammarParser.StrConstRpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StrConstRp}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitStrConstRp(ExpressionGrammarParser.StrConstRpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterPrFilter(ExpressionGrammarParser.PrFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitPrFilter(ExpressionGrammarParser.PrFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterEqFilter(ExpressionGrammarParser.EqFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitEqFilter(ExpressionGrammarParser.EqFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterOrFilter(ExpressionGrammarParser.OrFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitOrFilter(ExpressionGrammarParser.OrFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void enterRpFilter(ExpressionGrammarParser.RpFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 */
	void exitRpFilter(ExpressionGrammarParser.RpFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DSLRpX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void enterDSLRpX(ExpressionGrammarParser.DSLRpXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DSLRpX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void exitDSLRpX(ExpressionGrammarParser.DSLRpXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TextX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void enterTextX(ExpressionGrammarParser.TextXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TextX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void exitTextX(ExpressionGrammarParser.TextXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CSlRpX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void enterCSlRpX(ExpressionGrammarParser.CSlRpXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CSlRpX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void exitCSlRpX(ExpressionGrammarParser.CSlRpXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CommaX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void enterCommaX(ExpressionGrammarParser.CommaXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CommaX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void exitCommaX(ExpressionGrammarParser.CommaXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void enterJoinX(ExpressionGrammarParser.JoinXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void exitJoinX(ExpressionGrammarParser.JoinXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ApX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void enterApX(ExpressionGrammarParser.ApXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ApX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void exitApX(ExpressionGrammarParser.ApXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void enterEqX(ExpressionGrammarParser.EqXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void exitEqX(ExpressionGrammarParser.EqXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ForX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void enterForX(ExpressionGrammarParser.ForXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ForX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void exitForX(ExpressionGrammarParser.ForXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void enterIsX(ExpressionGrammarParser.IsXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void exitIsX(ExpressionGrammarParser.IsXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void enterPrX(ExpressionGrammarParser.PrXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void exitPrX(ExpressionGrammarParser.PrXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TagX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void enterTagX(ExpressionGrammarParser.TagXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TagX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void exitTagX(ExpressionGrammarParser.TagXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LetX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void enterLetX(ExpressionGrammarParser.LetXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LetX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void exitLetX(ExpressionGrammarParser.LetXContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void enterVarX(ExpressionGrammarParser.VarXContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 */
	void exitVarX(ExpressionGrammarParser.VarXContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void enterForClause(ExpressionGrammarParser.ForClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#forClause}.
	 * @param ctx the parse tree
	 */
	void exitForClause(ExpressionGrammarParser.ForClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#letClause}.
	 * @param ctx the parse tree
	 */
	void enterLetClause(ExpressionGrammarParser.LetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#letClause}.
	 * @param ctx the parse tree
	 */
	void exitLetClause(ExpressionGrammarParser.LetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(ExpressionGrammarParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(ExpressionGrammarParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(ExpressionGrammarParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(ExpressionGrammarParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinClause(ExpressionGrammarParser.JoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#joinClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinClause(ExpressionGrammarParser.JoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#idList}.
	 * @param ctx the parse tree
	 */
	void enterIdList(ExpressionGrammarParser.IdListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#idList}.
	 * @param ctx the parse tree
	 */
	void exitIdList(ExpressionGrammarParser.IdListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterOrCond(ExpressionGrammarParser.OrCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitOrCond(ExpressionGrammarParser.OrCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterAndCond(ExpressionGrammarParser.AndCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitAndCond(ExpressionGrammarParser.AndCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterNotCond(ExpressionGrammarParser.NotCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitNotCond(ExpressionGrammarParser.NotCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterEqCond(ExpressionGrammarParser.EqCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitEqCond(ExpressionGrammarParser.EqCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EmptyCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterEmptyCond(ExpressionGrammarParser.EmptyCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EmptyCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitEmptyCond(ExpressionGrammarParser.EmptyCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IsCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterIsCond(ExpressionGrammarParser.IsCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IsCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitIsCond(ExpressionGrammarParser.IsCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SatisfiesCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterSatisfiesCond(ExpressionGrammarParser.SatisfiesCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SatisfiesCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitSatisfiesCond(ExpressionGrammarParser.SatisfiesCondContext ctx);
	/**
	 * Enter a parse tree produced by the {@code PrCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterPrCond(ExpressionGrammarParser.PrCondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code PrCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitPrCond(ExpressionGrammarParser.PrCondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#doc}.
	 * @param ctx the parse tree
	 */
	void enterDoc(ExpressionGrammarParser.DocContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#doc}.
	 * @param ctx the parse tree
	 */
	void exitDoc(ExpressionGrammarParser.DocContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(ExpressionGrammarParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(ExpressionGrammarParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#strConst}.
	 * @param ctx the parse tree
	 */
	void enterStrConst(ExpressionGrammarParser.StrConstContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#strConst}.
	 * @param ctx the parse tree
	 */
	void exitStrConst(ExpressionGrammarParser.StrConstContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(ExpressionGrammarParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(ExpressionGrammarParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#tagName}.
	 * @param ctx the parse tree
	 */
	void enterTagName(ExpressionGrammarParser.TagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#tagName}.
	 * @param ctx the parse tree
	 */
	void exitTagName(ExpressionGrammarParser.TagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#attName}.
	 * @param ctx the parse tree
	 */
	void enterAttName(ExpressionGrammarParser.AttNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#attName}.
	 * @param ctx the parse tree
	 */
	void exitAttName(ExpressionGrammarParser.AttNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#tagOpen}.
	 * @param ctx the parse tree
	 */
	void enterTagOpen(ExpressionGrammarParser.TagOpenContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#tagOpen}.
	 * @param ctx the parse tree
	 */
	void exitTagOpen(ExpressionGrammarParser.TagOpenContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExpressionGrammarParser#tagClose}.
	 * @param ctx the parse tree
	 */
	void enterTagClose(ExpressionGrammarParser.TagCloseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExpressionGrammarParser#tagClose}.
	 * @param ctx the parse tree
	 */
	void exitTagClose(ExpressionGrammarParser.TagCloseContext ctx);
}