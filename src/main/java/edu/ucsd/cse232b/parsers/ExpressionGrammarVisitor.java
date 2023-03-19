// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ExpressionGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ExpressionGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code DSlAp}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDSlAp(ExpressionGrammarParser.DSlApContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SlAp}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlAp(ExpressionGrammarParser.SlApContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SlRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlRp(ExpressionGrammarParser.SlRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StarRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStarRp(ExpressionGrammarParser.StarRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextRp(ExpressionGrammarParser.TextRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrRp(ExpressionGrammarParser.PrRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FilterRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterRp(ExpressionGrammarParser.FilterRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttrRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrRp(ExpressionGrammarParser.AttrRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParentRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentRp(ExpressionGrammarParser.ParentRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommaRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaRp(ExpressionGrammarParser.CommaRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelfRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfRp(ExpressionGrammarParser.SelfRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DSlRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDSlRp(ExpressionGrammarParser.DSlRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagNameRp}
	 * labeled alternative in {@link ExpressionGrammarParser#rp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagNameRp(ExpressionGrammarParser.TagNameRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndFilter(ExpressionGrammarParser.AndFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsFilter(ExpressionGrammarParser.IsFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFilter(ExpressionGrammarParser.NotFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StrConstRp}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrConstRp(ExpressionGrammarParser.StrConstRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrFilter(ExpressionGrammarParser.PrFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqFilter(ExpressionGrammarParser.EqFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrFilter(ExpressionGrammarParser.OrFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RpFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRpFilter(ExpressionGrammarParser.RpFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DSLRpX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDSLRpX(ExpressionGrammarParser.DSLRpXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TextX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextX(ExpressionGrammarParser.TextXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CSlRpX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCSlRpX(ExpressionGrammarParser.CSlRpXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CommaX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommaX(ExpressionGrammarParser.CommaXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinX(ExpressionGrammarParser.JoinXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ApX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApX(ExpressionGrammarParser.ApXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqX(ExpressionGrammarParser.EqXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForX(ExpressionGrammarParser.ForXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsX(ExpressionGrammarParser.IsXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrX(ExpressionGrammarParser.PrXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TagX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagX(ExpressionGrammarParser.TagXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LetX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetX(ExpressionGrammarParser.LetXContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarX}
	 * labeled alternative in {@link ExpressionGrammarParser#x}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarX(ExpressionGrammarParser.VarXContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#forClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForClause(ExpressionGrammarParser.ForClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#letClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetClause(ExpressionGrammarParser.LetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(ExpressionGrammarParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(ExpressionGrammarParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#joinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinClause(ExpressionGrammarParser.JoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#idList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdList(ExpressionGrammarParser.IdListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OrCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCond(ExpressionGrammarParser.OrCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCond(ExpressionGrammarParser.AndCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotCond(ExpressionGrammarParser.NotCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqCond(ExpressionGrammarParser.EqCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EmptyCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyCond(ExpressionGrammarParser.EmptyCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IsCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsCond(ExpressionGrammarParser.IsCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SatisfiesCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSatisfiesCond(ExpressionGrammarParser.SatisfiesCondContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrCond}
	 * labeled alternative in {@link ExpressionGrammarParser#cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrCond(ExpressionGrammarParser.PrCondContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(ExpressionGrammarParser.DocContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(ExpressionGrammarParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#strConst}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrConst(ExpressionGrammarParser.StrConstContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#fileName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileName(ExpressionGrammarParser.FileNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#tagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagName(ExpressionGrammarParser.TagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#attName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttName(ExpressionGrammarParser.AttNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#tagOpen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagOpen(ExpressionGrammarParser.TagOpenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#tagClose}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTagClose(ExpressionGrammarParser.TagCloseContext ctx);
}