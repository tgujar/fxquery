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
}