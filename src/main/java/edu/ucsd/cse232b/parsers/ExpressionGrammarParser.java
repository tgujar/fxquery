// Generated from ExpressionGrammar.g4 by ANTLR 4.7.2

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, STAR=2, DOLLAR=3, AT=4, NOT=5, AND=6, OR=7, COMMA=8, SL=9, DSL=10, 
		DOT=11, DQ=12, DDOT=13, LSQ=14, RSQ=15, LPR=16, RPR=17, LAG=18, RAG=19, 
		LCR=20, RCR=21, EQ=22, IS=23, DOC=24, MT=25, FOR=26, LET=27, IN=28, ASSIGN=29, 
		WHERE=30, RETURN=31, EMPTY=32, SOME=33, SATISFIES=34, ID=35, STR=36, WS=37;
	public static final int
		RULE_ap = 0, RULE_rp = 1, RULE_f = 2, RULE_x = 3, RULE_forClause = 4, 
		RULE_letClause = 5, RULE_whereClause = 6, RULE_returnClause = 7, RULE_r = 8, 
		RULE_cond = 9, RULE_doc = 10, RULE_var = 11, RULE_strConst = 12, RULE_fileName = 13, 
		RULE_tagName = 14, RULE_attName = 15, RULE_tagOpen = 16, RULE_tagClose = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"ap", "rp", "f", "x", "forClause", "letClause", "whereClause", "returnClause", 
			"r", "cond", "doc", "var", "strConst", "fileName", "tagName", "attName", 
			"tagOpen", "tagClose"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'text()'", "'*'", "'$'", "'@'", null, null, null, "','", "'/'", 
			"'//'", "'.'", "'\"'", null, "'['", "']'", "'('", "')'", "'<'", "'>'", 
			"'{'", "'}'", null, null, null, "'makeText'", "'for'", "'let'", "'in'", 
			"':='", "'where'", "'return'", "'empty'", "'some'", "'satisfies'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "STAR", "DOLLAR", "AT", "NOT", "AND", "OR", "COMMA", "SL", 
			"DSL", "DOT", "DQ", "DDOT", "LSQ", "RSQ", "LPR", "RPR", "LAG", "RAG", 
			"LCR", "RCR", "EQ", "IS", "DOC", "MT", "FOR", "LET", "IN", "ASSIGN", 
			"WHERE", "RETURN", "EMPTY", "SOME", "SATISFIES", "ID", "STR", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ExpressionGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressionGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ApContext extends ParserRuleContext {
		public ApContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ap; }
	 
		public ApContext() { }
		public void copyFrom(ApContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DSlApContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public TerminalNode DSL() { return getToken(ExpressionGrammarParser.DSL, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public DSlApContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterDSlAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitDSlAp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitDSlAp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SlApContext extends ApContext {
		public DocContext doc() {
			return getRuleContext(DocContext.class,0);
		}
		public TerminalNode SL() { return getToken(ExpressionGrammarParser.SL, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public SlApContext(ApContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterSlAp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitSlAp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitSlAp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ApContext ap() throws RecognitionException {
		ApContext _localctx = new ApContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_ap);
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new DSlApContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				doc();
				setState(37);
				match(DSL);
				setState(38);
				rp(0);
				}
				break;
			case 2:
				_localctx = new SlApContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				doc();
				setState(41);
				match(SL);
				setState(42);
				rp(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RpContext extends ParserRuleContext {
		public RpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rp; }
	 
		public RpContext() { }
		public void copyFrom(RpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SlRpContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode SL() { return getToken(ExpressionGrammarParser.SL, 0); }
		public SlRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterSlRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitSlRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitSlRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarRpContext extends RpContext {
		public TerminalNode STAR() { return getToken(ExpressionGrammarParser.STAR, 0); }
		public StarRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterStarRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitStarRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitStarRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextRpContext extends RpContext {
		public TextRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterTextRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitTextRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitTextRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrRpContext extends RpContext {
		public TerminalNode LPR() { return getToken(ExpressionGrammarParser.LPR, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode RPR() { return getToken(ExpressionGrammarParser.RPR, 0); }
		public PrRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterPrRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitPrRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitPrRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FilterRpContext extends RpContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode LSQ() { return getToken(ExpressionGrammarParser.LSQ, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode RSQ() { return getToken(ExpressionGrammarParser.RSQ, 0); }
		public FilterRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterFilterRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitFilterRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitFilterRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AttrRpContext extends RpContext {
		public TerminalNode AT() { return getToken(ExpressionGrammarParser.AT, 0); }
		public AttNameContext attName() {
			return getRuleContext(AttNameContext.class,0);
		}
		public AttrRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterAttrRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitAttrRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitAttrRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParentRpContext extends RpContext {
		public TerminalNode DDOT() { return getToken(ExpressionGrammarParser.DDOT, 0); }
		public ParentRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterParentRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitParentRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitParentRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommaRpContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ExpressionGrammarParser.COMMA, 0); }
		public CommaRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterCommaRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitCommaRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitCommaRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelfRpContext extends RpContext {
		public TerminalNode DOT() { return getToken(ExpressionGrammarParser.DOT, 0); }
		public SelfRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterSelfRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitSelfRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitSelfRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DSlRpContext extends RpContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode DSL() { return getToken(ExpressionGrammarParser.DSL, 0); }
		public DSlRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterDSlRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitDSlRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitDSlRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagNameRpContext extends RpContext {
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TagNameRpContext(RpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterTagNameRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitTagNameRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitTagNameRp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RpContext rp() throws RecognitionException {
		return rp(0);
	}

	private RpContext rp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RpContext _localctx = new RpContext(_ctx, _parentState);
		RpContext _prevctx = _localctx;
		int _startState = 2;
		enterRecursionRule(_localctx, 2, RULE_rp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPR:
				{
				_localctx = new PrRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(47);
				match(LPR);
				setState(48);
				rp(0);
				setState(49);
				match(RPR);
				}
				break;
			case ID:
				{
				_localctx = new TagNameRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(51);
				tagName();
				}
				break;
			case STAR:
				{
				_localctx = new StarRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(52);
				match(STAR);
				}
				break;
			case T__0:
				{
				_localctx = new TextRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(53);
				match(T__0);
				}
				break;
			case DDOT:
				{
				_localctx = new ParentRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(54);
				match(DDOT);
				}
				break;
			case DOT:
				{
				_localctx = new SelfRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(55);
				match(DOT);
				}
				break;
			case AT:
				{
				_localctx = new AttrRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(56);
				match(AT);
				setState(57);
				attName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(76);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(74);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
					case 1:
						{
						_localctx = new DSlRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(60);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(61);
						match(DSL);
						setState(62);
						rp(10);
						}
						break;
					case 2:
						{
						_localctx = new SlRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(63);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(64);
						match(SL);
						setState(65);
						rp(9);
						}
						break;
					case 3:
						{
						_localctx = new CommaRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(66);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(67);
						match(COMMA);
						setState(68);
						rp(8);
						}
						break;
					case 4:
						{
						_localctx = new FilterRpContext(new RpContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_rp);
						setState(69);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(70);
						match(LSQ);
						setState(71);
						f(0);
						setState(72);
						match(RSQ);
						}
						break;
					}
					} 
				}
				setState(78);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class FContext extends ParserRuleContext {
		public FContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f; }
	 
		public FContext() { }
		public void copyFrom(FContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndFilterContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public TerminalNode AND() { return getToken(ExpressionGrammarParser.AND, 0); }
		public AndFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterAndFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitAndFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitAndFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsFilterContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode IS() { return getToken(ExpressionGrammarParser.IS, 0); }
		public IsFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterIsFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitIsFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitIsFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotFilterContext extends FContext {
		public TerminalNode NOT() { return getToken(ExpressionGrammarParser.NOT, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public NotFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterNotFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitNotFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitNotFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StrConstRpContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public TerminalNode EQ() { return getToken(ExpressionGrammarParser.EQ, 0); }
		public StrConstContext strConst() {
			return getRuleContext(StrConstContext.class,0);
		}
		public StrConstRpContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterStrConstRp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitStrConstRp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitStrConstRp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrFilterContext extends FContext {
		public TerminalNode LPR() { return getToken(ExpressionGrammarParser.LPR, 0); }
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TerminalNode RPR() { return getToken(ExpressionGrammarParser.RPR, 0); }
		public PrFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterPrFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitPrFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitPrFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqFilterContext extends FContext {
		public List<RpContext> rp() {
			return getRuleContexts(RpContext.class);
		}
		public RpContext rp(int i) {
			return getRuleContext(RpContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ExpressionGrammarParser.EQ, 0); }
		public EqFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterEqFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitEqFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitEqFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrFilterContext extends FContext {
		public List<FContext> f() {
			return getRuleContexts(FContext.class);
		}
		public FContext f(int i) {
			return getRuleContext(FContext.class,i);
		}
		public TerminalNode OR() { return getToken(ExpressionGrammarParser.OR, 0); }
		public OrFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterOrFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitOrFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitOrFilter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RpFilterContext extends FContext {
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public RpFilterContext(FContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterRpFilter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitRpFilter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitRpFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FContext f() throws RecognitionException {
		return f(0);
	}

	private FContext f(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		FContext _localctx = new FContext(_ctx, _parentState);
		FContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_f, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				_localctx = new PrFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(80);
				match(LPR);
				setState(81);
				f(0);
				setState(82);
				match(RPR);
				}
				break;
			case 2:
				{
				_localctx = new NotFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(NOT);
				setState(85);
				f(7);
				}
				break;
			case 3:
				{
				_localctx = new IsFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(86);
				rp(0);
				setState(87);
				match(IS);
				setState(88);
				rp(0);
				}
				break;
			case 4:
				{
				_localctx = new EqFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				rp(0);
				setState(91);
				match(EQ);
				setState(92);
				rp(0);
				}
				break;
			case 5:
				{
				_localctx = new StrConstRpContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(94);
				rp(0);
				setState(95);
				match(EQ);
				setState(96);
				strConst();
				}
				break;
			case 6:
				{
				_localctx = new RpFilterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(98);
				rp(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(109);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(107);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new AndFilterContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(101);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(102);
						match(AND);
						setState(103);
						f(7);
						}
						break;
					case 2:
						{
						_localctx = new OrFilterContext(new FContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_f);
						setState(104);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(105);
						match(OR);
						setState(106);
						f(6);
						}
						break;
					}
					} 
				}
				setState(111);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class XContext extends ParserRuleContext {
		public XContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_x; }
	 
		public XContext() { }
		public void copyFrom(XContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DSLRpXContext extends XContext {
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public TerminalNode DSL() { return getToken(ExpressionGrammarParser.DSL, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public DSLRpXContext(XContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterDSLRpX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitDSLRpX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitDSLRpX(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TextXContext extends XContext {
		public StrConstContext strConst() {
			return getRuleContext(StrConstContext.class,0);
		}
		public TextXContext(XContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterTextX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitTextX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitTextX(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CSlRpXContext extends XContext {
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public TerminalNode SL() { return getToken(ExpressionGrammarParser.SL, 0); }
		public RpContext rp() {
			return getRuleContext(RpContext.class,0);
		}
		public CSlRpXContext(XContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterCSlRpX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitCSlRpX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitCSlRpX(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrXContext extends XContext {
		public TerminalNode LPR() { return getToken(ExpressionGrammarParser.LPR, 0); }
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public TerminalNode RPR() { return getToken(ExpressionGrammarParser.RPR, 0); }
		public PrXContext(XContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterPrX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitPrX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitPrX(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommaXContext extends XContext {
		public List<XContext> x() {
			return getRuleContexts(XContext.class);
		}
		public XContext x(int i) {
			return getRuleContext(XContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ExpressionGrammarParser.COMMA, 0); }
		public CommaXContext(XContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterCommaX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitCommaX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitCommaX(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApXContext extends XContext {
		public ApContext ap() {
			return getRuleContext(ApContext.class,0);
		}
		public ApXContext(XContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterApX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitApX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitApX(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarXContext extends XContext {
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public VarXContext(XContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterVarX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitVarX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitVarX(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagXContext extends XContext {
		public TagOpenContext tagOpen() {
			return getRuleContext(TagOpenContext.class,0);
		}
		public TerminalNode LCR() { return getToken(ExpressionGrammarParser.LCR, 0); }
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public TerminalNode RCR() { return getToken(ExpressionGrammarParser.RCR, 0); }
		public TagCloseContext tagClose() {
			return getRuleContext(TagCloseContext.class,0);
		}
		public TagXContext(XContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterTagX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitTagX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitTagX(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LetXContext extends XContext {
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public LetXContext(XContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterLetX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitLetX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitLetX(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqXContext extends XContext {
		public List<XContext> x() {
			return getRuleContexts(XContext.class);
		}
		public XContext x(int i) {
			return getRuleContext(XContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ExpressionGrammarParser.EQ, 0); }
		public EqXContext(XContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterEqX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitEqX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitEqX(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForXContext extends XContext {
		public ForClauseContext forClause() {
			return getRuleContext(ForClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public LetClauseContext letClause() {
			return getRuleContext(LetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ForXContext(XContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterForX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitForX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitForX(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsXContext extends XContext {
		public List<XContext> x() {
			return getRuleContexts(XContext.class);
		}
		public XContext x(int i) {
			return getRuleContext(XContext.class,i);
		}
		public TerminalNode IS() { return getToken(ExpressionGrammarParser.IS, 0); }
		public IsXContext(XContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterIsX(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitIsX(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitIsX(this);
			else return visitor.visitChildren(this);
		}
	}

	public final XContext x() throws RecognitionException {
		return x(0);
	}

	private XContext x(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		XContext _localctx = new XContext(_ctx, _parentState);
		XContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_x, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOLLAR:
				{
				_localctx = new VarXContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(113);
				var();
				}
				break;
			case STR:
				{
				_localctx = new TextXContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(114);
				strConst();
				}
				break;
			case DOC:
				{
				_localctx = new ApXContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(115);
				ap();
				}
				break;
			case LPR:
				{
				_localctx = new PrXContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(116);
				match(LPR);
				setState(117);
				x(0);
				setState(118);
				match(RPR);
				}
				break;
			case LAG:
				{
				_localctx = new TagXContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				tagOpen();
				setState(121);
				match(LCR);
				setState(122);
				x(0);
				setState(123);
				match(RCR);
				setState(124);
				tagClose();
				}
				break;
			case FOR:
				{
				_localctx = new ForXContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(126);
				forClause();
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LET) {
					{
					setState(127);
					letClause();
					}
				}

				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(130);
					whereClause();
					}
				}

				setState(133);
				returnClause();
				}
				break;
			case LET:
				{
				_localctx = new LetXContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				letClause();
				setState(136);
				x(1);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(157);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(155);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new CommaXContext(new XContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_x);
						setState(140);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(141);
						match(COMMA);
						setState(142);
						x(7);
						}
						break;
					case 2:
						{
						_localctx = new EqXContext(new XContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_x);
						setState(143);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(144);
						match(EQ);
						setState(145);
						x(5);
						}
						break;
					case 3:
						{
						_localctx = new IsXContext(new XContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_x);
						setState(146);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(147);
						match(IS);
						setState(148);
						x(4);
						}
						break;
					case 4:
						{
						_localctx = new CSlRpXContext(new XContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_x);
						setState(149);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(150);
						match(SL);
						setState(151);
						rp(0);
						}
						break;
					case 5:
						{
						_localctx = new DSLRpXContext(new XContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_x);
						setState(152);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(153);
						match(DSL);
						setState(154);
						rp(0);
						}
						break;
					}
					} 
				}
				setState(159);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ForClauseContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(ExpressionGrammarParser.FOR, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> IN() { return getTokens(ExpressionGrammarParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(ExpressionGrammarParser.IN, i);
		}
		public List<XContext> x() {
			return getRuleContexts(XContext.class);
		}
		public XContext x(int i) {
			return getRuleContext(XContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExpressionGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExpressionGrammarParser.COMMA, i);
		}
		public ForClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterForClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitForClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitForClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForClauseContext forClause() throws RecognitionException {
		ForClauseContext _localctx = new ForClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(FOR);
			setState(161);
			var();
			setState(162);
			match(IN);
			setState(163);
			x(0);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(164);
				match(COMMA);
				setState(165);
				var();
				setState(166);
				match(IN);
				setState(167);
				x(0);
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LetClauseContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(ExpressionGrammarParser.LET, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> ASSIGN() { return getTokens(ExpressionGrammarParser.ASSIGN); }
		public TerminalNode ASSIGN(int i) {
			return getToken(ExpressionGrammarParser.ASSIGN, i);
		}
		public List<XContext> x() {
			return getRuleContexts(XContext.class);
		}
		public XContext x(int i) {
			return getRuleContext(XContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExpressionGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExpressionGrammarParser.COMMA, i);
		}
		public LetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_letClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterLetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitLetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitLetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetClauseContext letClause() throws RecognitionException {
		LetClauseContext _localctx = new LetClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_letClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(LET);
			setState(175);
			var();
			setState(176);
			match(ASSIGN);
			setState(177);
			x(0);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				match(COMMA);
				setState(179);
				var();
				setState(180);
				match(ASSIGN);
				setState(181);
				x(0);
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(ExpressionGrammarParser.WHERE, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(WHERE);
			setState(189);
			cond(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnClauseContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(ExpressionGrammarParser.RETURN, 0); }
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(RETURN);
			setState(192);
			r(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RContext extends ParserRuleContext {
		public RContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_r; }
	 
		public RContext() { }
		public void copyFrom(RContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CommaReturnContext extends RContext {
		public List<RContext> r() {
			return getRuleContexts(RContext.class);
		}
		public RContext r(int i) {
			return getRuleContext(RContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(ExpressionGrammarParser.COMMA, 0); }
		public CommaReturnContext(RContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterCommaReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitCommaReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitCommaReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TagReturnContext extends RContext {
		public TagOpenContext tagOpen() {
			return getRuleContext(TagOpenContext.class,0);
		}
		public RContext r() {
			return getRuleContext(RContext.class,0);
		}
		public TagCloseContext tagClose() {
			return getRuleContext(TagCloseContext.class,0);
		}
		public TagReturnContext(RContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterTagReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitTagReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitTagReturn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class XReturnContext extends RContext {
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public XReturnContext(RContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterXReturn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitXReturn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitXReturn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RContext r() throws RecognitionException {
		return r(0);
	}

	private RContext r(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RContext _localctx = new RContext(_ctx, _parentState);
		RContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_r, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				_localctx = new XReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(195);
				x(0);
				}
				break;
			case 2:
				{
				_localctx = new TagReturnContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(196);
				tagOpen();
				setState(197);
				r(0);
				setState(198);
				tagClose();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(207);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CommaReturnContext(new RContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_r);
					setState(202);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(203);
					match(COMMA);
					setState(204);
					r(3);
					}
					} 
				}
				setState(209);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class CondContext extends ParserRuleContext {
		public CondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond; }
	 
		public CondContext() { }
		public void copyFrom(CondContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrCondContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public TerminalNode OR() { return getToken(ExpressionGrammarParser.OR, 0); }
		public OrCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterOrCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitOrCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitOrCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndCondContext extends CondContext {
		public List<CondContext> cond() {
			return getRuleContexts(CondContext.class);
		}
		public CondContext cond(int i) {
			return getRuleContext(CondContext.class,i);
		}
		public TerminalNode AND() { return getToken(ExpressionGrammarParser.AND, 0); }
		public AndCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterAndCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitAndCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitAndCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotCondContext extends CondContext {
		public TerminalNode NOT() { return getToken(ExpressionGrammarParser.NOT, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public NotCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterNotCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitNotCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitNotCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqCondContext extends CondContext {
		public List<XContext> x() {
			return getRuleContexts(XContext.class);
		}
		public XContext x(int i) {
			return getRuleContext(XContext.class,i);
		}
		public TerminalNode EQ() { return getToken(ExpressionGrammarParser.EQ, 0); }
		public EqCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterEqCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitEqCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitEqCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmptyCondContext extends CondContext {
		public TerminalNode EMPTY() { return getToken(ExpressionGrammarParser.EMPTY, 0); }
		public TerminalNode LPR() { return getToken(ExpressionGrammarParser.LPR, 0); }
		public XContext x() {
			return getRuleContext(XContext.class,0);
		}
		public TerminalNode RPR() { return getToken(ExpressionGrammarParser.RPR, 0); }
		public EmptyCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterEmptyCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitEmptyCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitEmptyCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsCondContext extends CondContext {
		public List<XContext> x() {
			return getRuleContexts(XContext.class);
		}
		public XContext x(int i) {
			return getRuleContext(XContext.class,i);
		}
		public TerminalNode IS() { return getToken(ExpressionGrammarParser.IS, 0); }
		public IsCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterIsCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitIsCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitIsCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SatisfiesCondContext extends CondContext {
		public TerminalNode SOME() { return getToken(ExpressionGrammarParser.SOME, 0); }
		public List<VarContext> var() {
			return getRuleContexts(VarContext.class);
		}
		public VarContext var(int i) {
			return getRuleContext(VarContext.class,i);
		}
		public List<TerminalNode> IN() { return getTokens(ExpressionGrammarParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(ExpressionGrammarParser.IN, i);
		}
		public List<XContext> x() {
			return getRuleContexts(XContext.class);
		}
		public XContext x(int i) {
			return getRuleContext(XContext.class,i);
		}
		public TerminalNode SATISFIES() { return getToken(ExpressionGrammarParser.SATISFIES, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(ExpressionGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ExpressionGrammarParser.COMMA, i);
		}
		public SatisfiesCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterSatisfiesCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitSatisfiesCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitSatisfiesCond(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrCondContext extends CondContext {
		public TerminalNode LPR() { return getToken(ExpressionGrammarParser.LPR, 0); }
		public CondContext cond() {
			return getRuleContext(CondContext.class,0);
		}
		public TerminalNode RPR() { return getToken(ExpressionGrammarParser.RPR, 0); }
		public PrCondContext(CondContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterPrCond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitPrCond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitPrCond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondContext cond() throws RecognitionException {
		return cond(0);
	}

	private CondContext cond(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondContext _localctx = new CondContext(_ctx, _parentState);
		CondContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_cond, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new EqCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(211);
				x(0);
				setState(212);
				match(EQ);
				setState(213);
				x(0);
				}
				break;
			case 2:
				{
				_localctx = new IsCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(215);
				x(0);
				setState(216);
				match(IS);
				setState(217);
				x(0);
				}
				break;
			case 3:
				{
				_localctx = new EmptyCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(219);
				match(EMPTY);
				setState(220);
				match(LPR);
				setState(221);
				x(0);
				setState(222);
				match(RPR);
				}
				break;
			case 4:
				{
				_localctx = new SatisfiesCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(224);
				match(SOME);
				setState(225);
				var();
				setState(226);
				match(IN);
				setState(227);
				x(0);
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(228);
					match(COMMA);
					setState(229);
					var();
					setState(230);
					match(IN);
					setState(231);
					x(0);
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(238);
				match(SATISFIES);
				setState(239);
				cond(5);
				}
				break;
			case 5:
				{
				_localctx = new PrCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(241);
				match(LPR);
				setState(242);
				cond(0);
				setState(243);
				match(RPR);
				}
				break;
			case 6:
				{
				_localctx = new NotCondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(245);
				match(NOT);
				setState(246);
				cond(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(257);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(255);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new AndCondContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(249);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(250);
						match(AND);
						setState(251);
						cond(4);
						}
						break;
					case 2:
						{
						_localctx = new OrCondContext(new CondContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_cond);
						setState(252);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(253);
						match(OR);
						setState(254);
						cond(3);
						}
						break;
					}
					} 
				}
				setState(259);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DocContext extends ParserRuleContext {
		public TerminalNode DOC() { return getToken(ExpressionGrammarParser.DOC, 0); }
		public TerminalNode LPR() { return getToken(ExpressionGrammarParser.LPR, 0); }
		public List<TerminalNode> DQ() { return getTokens(ExpressionGrammarParser.DQ); }
		public TerminalNode DQ(int i) {
			return getToken(ExpressionGrammarParser.DQ, i);
		}
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public TerminalNode RPR() { return getToken(ExpressionGrammarParser.RPR, 0); }
		public DocContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterDoc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitDoc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitDoc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DocContext doc() throws RecognitionException {
		DocContext _localctx = new DocContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_doc);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(DOC);
			setState(261);
			match(LPR);
			setState(262);
			match(DQ);
			setState(263);
			fileName();
			setState(264);
			match(DQ);
			setState(265);
			match(RPR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode DOLLAR() { return getToken(ExpressionGrammarParser.DOLLAR, 0); }
		public TerminalNode ID() { return getToken(ExpressionGrammarParser.ID, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_var);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(DOLLAR);
			setState(268);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrConstContext extends ParserRuleContext {
		public TerminalNode STR() { return getToken(ExpressionGrammarParser.STR, 0); }
		public StrConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strConst; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterStrConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitStrConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitStrConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrConstContext strConst() throws RecognitionException {
		StrConstContext _localctx = new StrConstContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_strConst);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(STR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpressionGrammarParser.ID, 0); }
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitFileName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitFileName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpressionGrammarParser.ID, 0); }
		public TagNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterTagName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitTagName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitTagName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagNameContext tagName() throws RecognitionException {
		TagNameContext _localctx = new TagNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tagName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(ExpressionGrammarParser.ID, 0); }
		public AttNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterAttName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitAttName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitAttName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttNameContext attName() throws RecognitionException {
		AttNameContext _localctx = new AttNameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_attName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagOpenContext extends ParserRuleContext {
		public TerminalNode LAG() { return getToken(ExpressionGrammarParser.LAG, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode RAG() { return getToken(ExpressionGrammarParser.RAG, 0); }
		public TagOpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagOpen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterTagOpen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitTagOpen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitTagOpen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagOpenContext tagOpen() throws RecognitionException {
		TagOpenContext _localctx = new TagOpenContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tagOpen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(LAG);
			setState(279);
			tagName();
			setState(280);
			match(RAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TagCloseContext extends ParserRuleContext {
		public TerminalNode LAG() { return getToken(ExpressionGrammarParser.LAG, 0); }
		public TerminalNode SL() { return getToken(ExpressionGrammarParser.SL, 0); }
		public TagNameContext tagName() {
			return getRuleContext(TagNameContext.class,0);
		}
		public TerminalNode RAG() { return getToken(ExpressionGrammarParser.RAG, 0); }
		public TagCloseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tagClose; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).enterTagClose(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressionGrammarListener ) ((ExpressionGrammarListener)listener).exitTagClose(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ExpressionGrammarVisitor ) return ((ExpressionGrammarVisitor<? extends T>)visitor).visitTagClose(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagCloseContext tagClose() throws RecognitionException {
		TagCloseContext _localctx = new TagCloseContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tagClose);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(LAG);
			setState(283);
			match(SL);
			setState(284);
			tagName();
			setState(285);
			match(RAG);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 1:
			return rp_sempred((RpContext)_localctx, predIndex);
		case 2:
			return f_sempred((FContext)_localctx, predIndex);
		case 3:
			return x_sempred((XContext)_localctx, predIndex);
		case 8:
			return r_sempred((RContext)_localctx, predIndex);
		case 9:
			return cond_sempred((CondContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean rp_sempred(RpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean f_sempred(FContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean x_sempred(XContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 6);
		case 7:
			return precpred(_ctx, 4);
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		}
		return true;
	}
	private boolean r_sempred(RContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean cond_sempred(CondContext _localctx, int predIndex) {
		switch (predIndex) {
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0122\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2/\n\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3=\n\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3M\n\3\f\3\16\3P\13\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4f\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\7\4n\n\4\f\4\16\4q\13\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0083\n\5\3\5\5\5\u0086"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\5\5\u008d\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u009e\n\5\f\5\16\5\u00a1\13\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6\u00ac\n\6\f\6\16\6\u00af\13\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00ba\n\7\f\7\16\7\u00bd\13\7\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00cb\n\n\3\n\3\n\3\n\7\n"+
		"\u00d0\n\n\f\n\16\n\u00d3\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\7\13\u00ec\n\13\f\13\16\13\u00ef\13\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\5\13\u00fa\n\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13"+
		"\u0102\n\13\f\13\16\13\u0105\13\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\2\7\4\6\b\22\24\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\2\2\u013a\2.\3\2\2\2\4<\3\2\2\2\6e\3\2\2\2\b\u008c"+
		"\3\2\2\2\n\u00a2\3\2\2\2\f\u00b0\3\2\2\2\16\u00be\3\2\2\2\20\u00c1\3\2"+
		"\2\2\22\u00ca\3\2\2\2\24\u00f9\3\2\2\2\26\u0106\3\2\2\2\30\u010d\3\2\2"+
		"\2\32\u0110\3\2\2\2\34\u0112\3\2\2\2\36\u0114\3\2\2\2 \u0116\3\2\2\2\""+
		"\u0118\3\2\2\2$\u011c\3\2\2\2&\'\5\26\f\2\'(\7\f\2\2()\5\4\3\2)/\3\2\2"+
		"\2*+\5\26\f\2+,\7\13\2\2,-\5\4\3\2-/\3\2\2\2.&\3\2\2\2.*\3\2\2\2/\3\3"+
		"\2\2\2\60\61\b\3\1\2\61\62\7\22\2\2\62\63\5\4\3\2\63\64\7\23\2\2\64=\3"+
		"\2\2\2\65=\5\36\20\2\66=\7\4\2\2\67=\7\3\2\28=\7\17\2\29=\7\r\2\2:;\7"+
		"\6\2\2;=\5 \21\2<\60\3\2\2\2<\65\3\2\2\2<\66\3\2\2\2<\67\3\2\2\2<8\3\2"+
		"\2\2<9\3\2\2\2<:\3\2\2\2=N\3\2\2\2>?\f\13\2\2?@\7\f\2\2@M\5\4\3\fAB\f"+
		"\n\2\2BC\7\13\2\2CM\5\4\3\13DE\f\t\2\2EF\7\n\2\2FM\5\4\3\nGH\f\f\2\2H"+
		"I\7\20\2\2IJ\5\6\4\2JK\7\21\2\2KM\3\2\2\2L>\3\2\2\2LA\3\2\2\2LD\3\2\2"+
		"\2LG\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\5\3\2\2\2PN\3\2\2\2QR\b\4"+
		"\1\2RS\7\22\2\2ST\5\6\4\2TU\7\23\2\2Uf\3\2\2\2VW\7\7\2\2Wf\5\6\4\tXY\5"+
		"\4\3\2YZ\7\31\2\2Z[\5\4\3\2[f\3\2\2\2\\]\5\4\3\2]^\7\30\2\2^_\5\4\3\2"+
		"_f\3\2\2\2`a\5\4\3\2ab\7\30\2\2bc\5\32\16\2cf\3\2\2\2df\5\4\3\2eQ\3\2"+
		"\2\2eV\3\2\2\2eX\3\2\2\2e\\\3\2\2\2e`\3\2\2\2ed\3\2\2\2fo\3\2\2\2gh\f"+
		"\b\2\2hi\7\b\2\2in\5\6\4\tjk\f\7\2\2kl\7\t\2\2ln\5\6\4\bmg\3\2\2\2mj\3"+
		"\2\2\2nq\3\2\2\2om\3\2\2\2op\3\2\2\2p\7\3\2\2\2qo\3\2\2\2rs\b\5\1\2s\u008d"+
		"\5\30\r\2t\u008d\5\32\16\2u\u008d\5\2\2\2vw\7\22\2\2wx\5\b\5\2xy\7\23"+
		"\2\2y\u008d\3\2\2\2z{\5\"\22\2{|\7\26\2\2|}\5\b\5\2}~\7\27\2\2~\177\5"+
		"$\23\2\177\u008d\3\2\2\2\u0080\u0082\5\n\6\2\u0081\u0083\5\f\7\2\u0082"+
		"\u0081\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0086\5\16"+
		"\b\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2\2\2\u0087"+
		"\u0088\5\20\t\2\u0088\u008d\3\2\2\2\u0089\u008a\5\f\7\2\u008a\u008b\5"+
		"\b\5\3\u008b\u008d\3\2\2\2\u008cr\3\2\2\2\u008ct\3\2\2\2\u008cu\3\2\2"+
		"\2\u008cv\3\2\2\2\u008cz\3\2\2\2\u008c\u0080\3\2\2\2\u008c\u0089\3\2\2"+
		"\2\u008d\u009f\3\2\2\2\u008e\u008f\f\b\2\2\u008f\u0090\7\n\2\2\u0090\u009e"+
		"\5\b\5\t\u0091\u0092\f\6\2\2\u0092\u0093\7\30\2\2\u0093\u009e\5\b\5\7"+
		"\u0094\u0095\f\5\2\2\u0095\u0096\7\31\2\2\u0096\u009e\5\b\5\6\u0097\u0098"+
		"\f\16\2\2\u0098\u0099\7\13\2\2\u0099\u009e\5\4\3\2\u009a\u009b\f\r\2\2"+
		"\u009b\u009c\7\f\2\2\u009c\u009e\5\4\3\2\u009d\u008e\3\2\2\2\u009d\u0091"+
		"\3\2\2\2\u009d\u0094\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u009a\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\t\3\2\2\2"+
		"\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\34\2\2\u00a3\u00a4\5\30\r\2\u00a4\u00a5"+
		"\7\36\2\2\u00a5\u00ad\5\b\5\2\u00a6\u00a7\7\n\2\2\u00a7\u00a8\5\30\r\2"+
		"\u00a8\u00a9\7\36\2\2\u00a9\u00aa\5\b\5\2\u00aa\u00ac\3\2\2\2\u00ab\u00a6"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae"+
		"\13\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7\35\2\2\u00b1\u00b2\5\30"+
		"\r\2\u00b2\u00b3\7\37\2\2\u00b3\u00bb\5\b\5\2\u00b4\u00b5\7\n\2\2\u00b5"+
		"\u00b6\5\30\r\2\u00b6\u00b7\7\37\2\2\u00b7\u00b8\5\b\5\2\u00b8\u00ba\3"+
		"\2\2\2\u00b9\u00b4\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb"+
		"\u00bc\3\2\2\2\u00bc\r\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7 \2\2"+
		"\u00bf\u00c0\5\24\13\2\u00c0\17\3\2\2\2\u00c1\u00c2\7!\2\2\u00c2\u00c3"+
		"\5\22\n\2\u00c3\21\3\2\2\2\u00c4\u00c5\b\n\1\2\u00c5\u00cb\5\b\5\2\u00c6"+
		"\u00c7\5\"\22\2\u00c7\u00c8\5\22\n\2\u00c8\u00c9\5$\23\2\u00c9\u00cb\3"+
		"\2\2\2\u00ca\u00c4\3\2\2\2\u00ca\u00c6\3\2\2\2\u00cb\u00d1\3\2\2\2\u00cc"+
		"\u00cd\f\4\2\2\u00cd\u00ce\7\n\2\2\u00ce\u00d0\5\22\n\5\u00cf\u00cc\3"+
		"\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\23\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\b\13\1\2\u00d5\u00d6\5\b\5"+
		"\2\u00d6\u00d7\7\30\2\2\u00d7\u00d8\5\b\5\2\u00d8\u00fa\3\2\2\2\u00d9"+
		"\u00da\5\b\5\2\u00da\u00db\7\31\2\2\u00db\u00dc\5\b\5\2\u00dc\u00fa\3"+
		"\2\2\2\u00dd\u00de\7\"\2\2\u00de\u00df\7\22\2\2\u00df\u00e0\5\b\5\2\u00e0"+
		"\u00e1\7\23\2\2\u00e1\u00fa\3\2\2\2\u00e2\u00e3\7#\2\2\u00e3\u00e4\5\30"+
		"\r\2\u00e4\u00e5\7\36\2\2\u00e5\u00ed\5\b\5\2\u00e6\u00e7\7\n\2\2\u00e7"+
		"\u00e8\5\30\r\2\u00e8\u00e9\7\36\2\2\u00e9\u00ea\5\b\5\2\u00ea\u00ec\3"+
		"\2\2\2\u00eb\u00e6\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7$"+
		"\2\2\u00f1\u00f2\5\24\13\7\u00f2\u00fa\3\2\2\2\u00f3\u00f4\7\22\2\2\u00f4"+
		"\u00f5\5\24\13\2\u00f5\u00f6\7\23\2\2\u00f6\u00fa\3\2\2\2\u00f7\u00f8"+
		"\7\7\2\2\u00f8\u00fa\5\24\13\3\u00f9\u00d4\3\2\2\2\u00f9\u00d9\3\2\2\2"+
		"\u00f9\u00dd\3\2\2\2\u00f9\u00e2\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00fa\u0103\3\2\2\2\u00fb\u00fc\f\5\2\2\u00fc\u00fd\7\b\2\2\u00fd"+
		"\u0102\5\24\13\6\u00fe\u00ff\f\4\2\2\u00ff\u0100\7\t\2\2\u0100\u0102\5"+
		"\24\13\5\u0101\u00fb\3\2\2\2\u0101\u00fe\3\2\2\2\u0102\u0105\3\2\2\2\u0103"+
		"\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\25\3\2\2\2\u0105\u0103\3\2\2"+
		"\2\u0106\u0107\7\32\2\2\u0107\u0108\7\22\2\2\u0108\u0109\7\16\2\2\u0109"+
		"\u010a\5\34\17\2\u010a\u010b\7\16\2\2\u010b\u010c\7\23\2\2\u010c\27\3"+
		"\2\2\2\u010d\u010e\7\5\2\2\u010e\u010f\7%\2\2\u010f\31\3\2\2\2\u0110\u0111"+
		"\7&\2\2\u0111\33\3\2\2\2\u0112\u0113\7%\2\2\u0113\35\3\2\2\2\u0114\u0115"+
		"\7%\2\2\u0115\37\3\2\2\2\u0116\u0117\7%\2\2\u0117!\3\2\2\2\u0118\u0119"+
		"\7\24\2\2\u0119\u011a\5\36\20\2\u011a\u011b\7\25\2\2\u011b#\3\2\2\2\u011c"+
		"\u011d\7\24\2\2\u011d\u011e\7\13\2\2\u011e\u011f\5\36\20\2\u011f\u0120"+
		"\7\25\2\2\u0120%\3\2\2\2\26.<LNemo\u0082\u0085\u008c\u009d\u009f\u00ad"+
		"\u00bb\u00ca\u00d1\u00ed\u00f9\u0101\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}