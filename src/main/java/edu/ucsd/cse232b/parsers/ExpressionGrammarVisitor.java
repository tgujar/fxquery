// Generated from ExpressionGrammar.g4 by ANTLR 4.7.2

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
	 * Visit a parse tree produced by the {@code SlAp}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSlAp(ExpressionGrammarParser.SlApContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DSlAp}
	 * labeled alternative in {@link ExpressionGrammarParser#ap}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDSlAp(ExpressionGrammarParser.DSlApContext ctx);
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
	 * Visit a parse tree produced by the {@code StrConstRp}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrConstRp(ExpressionGrammarParser.StrConstRpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotFilter}
	 * labeled alternative in {@link ExpressionGrammarParser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotFilter(ExpressionGrammarParser.NotFilterContext ctx);
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
	 * Visit a parse tree produced by {@link ExpressionGrammarParser#doc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoc(ExpressionGrammarParser.DocContext ctx);
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
}