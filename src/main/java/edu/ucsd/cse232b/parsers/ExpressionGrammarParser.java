// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;


@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExpressionGrammarParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, STAR = 2, AT = 3, NOT = 4, AND = 5, OR = 6, COMMA = 7, SL = 8, DSL = 9, DOT = 10,
            DQ = 11, DDOT = 12, LSQ = 13, RSQ = 14, LPR = 15, RPR = 16, EQ = 17, IS = 18, DOC = 19,
            ID = 20, WS = 21;
    public static final int
            RULE_ap = 0, RULE_rp = 1, RULE_f = 2, RULE_doc = 3, RULE_strConst = 4,
            RULE_fileName = 5, RULE_tagName = 6, RULE_attName = 7;

    private static String[] makeRuleNames() {
        return new String[]{
                "ap", "rp", "f", "doc", "strConst", "fileName", "tagName", "attName"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'text()'", "'*'", "'@'", null, null, null, "','", "'/'", "'//'",
                "'.'", "'\"'", null, "'['", "']'", "'('", "')'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, "STAR", "AT", "NOT", "AND", "OR", "COMMA", "SL", "DSL", "DOT",
                "DQ", "DDOT", "LSQ", "RSQ", "LPR", "RPR", "EQ", "IS", "DOC", "ID", "WS"
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
    public String getGrammarFileName() {
        return "java-escape";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public ExpressionGrammarParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ApContext extends ParserRuleContext {
        public ApContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ap;
        }

        public ApContext() {
        }

        public void copyFrom(ApContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DSlApContext extends ApContext {
        public DocContext doc() {
            return getRuleContext(DocContext.class, 0);
        }

        public TerminalNode DSL() {
            return getToken(ExpressionGrammarParser.DSL, 0);
        }

        public RpContext rp() {
            return getRuleContext(RpContext.class, 0);
        }

        public DSlApContext(ApContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).enterDSlAp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).exitDSlAp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitDSlAp(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SlApContext extends ApContext {
        public DocContext doc() {
            return getRuleContext(DocContext.class, 0);
        }

        public TerminalNode SL() {
            return getToken(ExpressionGrammarParser.SL, 0);
        }

        public RpContext rp() {
            return getRuleContext(RpContext.class, 0);
        }

        public SlApContext(ApContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).enterSlAp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).exitSlAp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitSlAp(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ApContext ap() throws RecognitionException {
        ApContext _localctx = new ApContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_ap);
        try {
            setState(24);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                case 1:
                    _localctx = new DSlApContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(16);
                    doc();
                    setState(17);
                    match(DSL);
                    setState(18);
                    rp(0);
                }
                break;
                case 2:
                    _localctx = new SlApContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(20);
                    doc();
                    setState(21);
                    match(SL);
                    setState(22);
                    rp(0);
                }
                break;
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RpContext extends ParserRuleContext {
        public RpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rp;
        }

        public RpContext() {
        }

        public void copyFrom(RpContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SlRpContext extends RpContext {
        public List<RpContext> rp() {
            return getRuleContexts(RpContext.class);
        }

        public RpContext rp(int i) {
            return getRuleContext(RpContext.class, i);
        }

        public TerminalNode SL() {
            return getToken(ExpressionGrammarParser.SL, 0);
        }

        public SlRpContext(RpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).enterSlRp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).exitSlRp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitSlRp(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StarRpContext extends RpContext {
        public TerminalNode STAR() {
            return getToken(ExpressionGrammarParser.STAR, 0);
        }

        public StarRpContext(RpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).enterStarRp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).exitStarRp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitStarRp(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TextRpContext extends RpContext {
        public TextRpContext(RpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).enterTextRp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).exitTextRp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitTextRp(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PrRpContext extends RpContext {
        public TerminalNode LPR() {
            return getToken(ExpressionGrammarParser.LPR, 0);
        }

        public RpContext rp() {
            return getRuleContext(RpContext.class, 0);
        }

        public TerminalNode RPR() {
            return getToken(ExpressionGrammarParser.RPR, 0);
        }

        public PrRpContext(RpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).enterPrRp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).exitPrRp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitPrRp(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FilterRpContext extends RpContext {
        public RpContext rp() {
            return getRuleContext(RpContext.class, 0);
        }

        public TerminalNode LSQ() {
            return getToken(ExpressionGrammarParser.LSQ, 0);
        }

        public FContext f() {
            return getRuleContext(FContext.class, 0);
        }

        public TerminalNode RSQ() {
            return getToken(ExpressionGrammarParser.RSQ, 0);
        }

        public FilterRpContext(RpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).enterFilterRp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).exitFilterRp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitFilterRp(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AttrRpContext extends RpContext {
        public TerminalNode AT() {
            return getToken(ExpressionGrammarParser.AT, 0);
        }

        public AttNameContext attName() {
            return getRuleContext(AttNameContext.class, 0);
        }

        public AttrRpContext(RpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).enterAttrRp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).exitAttrRp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitAttrRp(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ParentRpContext extends RpContext {
        public TerminalNode DDOT() {
            return getToken(ExpressionGrammarParser.DDOT, 0);
        }

        public ParentRpContext(RpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).enterParentRp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).exitParentRp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitParentRp(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class CommaRpContext extends RpContext {
        public List<RpContext> rp() {
            return getRuleContexts(RpContext.class);
        }

        public RpContext rp(int i) {
            return getRuleContext(RpContext.class, i);
        }

        public TerminalNode COMMA() {
            return getToken(ExpressionGrammarParser.COMMA, 0);
        }

        public CommaRpContext(RpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).enterCommaRp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).exitCommaRp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitCommaRp(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class SelfRpContext extends RpContext {
        public TerminalNode DOT() {
            return getToken(ExpressionGrammarParser.DOT, 0);
        }

        public SelfRpContext(RpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).enterSelfRp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).exitSelfRp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitSelfRp(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DSlRpContext extends RpContext {
        public List<RpContext> rp() {
            return getRuleContexts(RpContext.class);
        }

        public RpContext rp(int i) {
            return getRuleContext(RpContext.class, i);
        }

        public TerminalNode DSL() {
            return getToken(ExpressionGrammarParser.DSL, 0);
        }

        public DSlRpContext(RpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).enterDSlRp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).exitDSlRp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitDSlRp(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TagNameRpContext extends RpContext {
        public TagNameContext tagName() {
            return getRuleContext(TagNameContext.class, 0);
        }

        public TagNameRpContext(RpContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).enterTagNameRp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).exitTagNameRp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitTagNameRp(this);
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
                setState(38);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case LPR: {
                        _localctx = new PrRpContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(27);
                        match(LPR);
                        setState(28);
                        rp(0);
                        setState(29);
                        match(RPR);
                    }
                    break;
                    case ID: {
                        _localctx = new TagNameRpContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(31);
                        tagName();
                    }
                    break;
                    case STAR: {
                        _localctx = new StarRpContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(32);
                        match(STAR);
                    }
                    break;
                    case T__0: {
                        _localctx = new TextRpContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(33);
                        match(T__0);
                    }
                    break;
                    case DOT: {
                        _localctx = new SelfRpContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(34);
                        match(DOT);
                    }
                    break;
                    case DDOT: {
                        _localctx = new ParentRpContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(35);
                        match(DDOT);
                    }
                    break;
                    case AT: {
                        _localctx = new AttrRpContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(36);
                        match(AT);
                        setState(37);
                        attName();
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                _ctx.stop = _input.LT(-1);
                setState(56);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(54);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
                                case 1: {
                                    _localctx = new DSlRpContext(new RpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_rp);
                                    setState(40);
                                    if (!(precpred(_ctx, 9)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                                    setState(41);
                                    match(DSL);
                                    setState(42);
                                    rp(10);
                                }
                                break;
                                case 2: {
                                    _localctx = new SlRpContext(new RpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_rp);
                                    setState(43);
                                    if (!(precpred(_ctx, 8)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 8)");
                                    setState(44);
                                    match(SL);
                                    setState(45);
                                    rp(9);
                                }
                                break;
                                case 3: {
                                    _localctx = new CommaRpContext(new RpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_rp);
                                    setState(46);
                                    if (!(precpred(_ctx, 7)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 7)");
                                    setState(47);
                                    match(COMMA);
                                    setState(48);
                                    rp(8);
                                }
                                break;
                                case 4: {
                                    _localctx = new FilterRpContext(new RpContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_rp);
                                    setState(49);
                                    if (!(precpred(_ctx, 10)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 10)");
                                    setState(50);
                                    match(LSQ);
                                    setState(51);
                                    f(0);
                                    setState(52);
                                    match(RSQ);
                                }
                                break;
                            }
                        }
                    }
                    setState(58);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FContext extends ParserRuleContext {
        public FContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_f;
        }

        public FContext() {
        }

        public void copyFrom(FContext ctx) {
            super.copyFrom(ctx);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AndFilterContext extends FContext {
        public List<FContext> f() {
            return getRuleContexts(FContext.class);
        }

        public FContext f(int i) {
            return getRuleContext(FContext.class, i);
        }

        public TerminalNode AND() {
            return getToken(ExpressionGrammarParser.AND, 0);
        }

        public AndFilterContext(FContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).enterAndFilter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).exitAndFilter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitAndFilter(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class IsFilterContext extends FContext {
        public List<RpContext> rp() {
            return getRuleContexts(RpContext.class);
        }

        public RpContext rp(int i) {
            return getRuleContext(RpContext.class, i);
        }

        public TerminalNode IS() {
            return getToken(ExpressionGrammarParser.IS, 0);
        }

        public IsFilterContext(FContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).enterIsFilter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).exitIsFilter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitIsFilter(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class NotFilterContext extends FContext {
        public TerminalNode NOT() {
            return getToken(ExpressionGrammarParser.NOT, 0);
        }

        public FContext f() {
            return getRuleContext(FContext.class, 0);
        }

        public NotFilterContext(FContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).enterNotFilter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).exitNotFilter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitNotFilter(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StrConstRpContext extends FContext {
        public RpContext rp() {
            return getRuleContext(RpContext.class, 0);
        }

        public TerminalNode EQ() {
            return getToken(ExpressionGrammarParser.EQ, 0);
        }

        public StrConstContext strConst() {
            return getRuleContext(StrConstContext.class, 0);
        }

        public StrConstRpContext(FContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).enterStrConstRp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).exitStrConstRp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitStrConstRp(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class PrFilterContext extends FContext {
        public TerminalNode LPR() {
            return getToken(ExpressionGrammarParser.LPR, 0);
        }

        public FContext f() {
            return getRuleContext(FContext.class, 0);
        }

        public TerminalNode RPR() {
            return getToken(ExpressionGrammarParser.RPR, 0);
        }

        public PrFilterContext(FContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).enterPrFilter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).exitPrFilter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitPrFilter(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class EqFilterContext extends FContext {
        public List<RpContext> rp() {
            return getRuleContexts(RpContext.class);
        }

        public RpContext rp(int i) {
            return getRuleContext(RpContext.class, i);
        }

        public TerminalNode EQ() {
            return getToken(ExpressionGrammarParser.EQ, 0);
        }

        public EqFilterContext(FContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).enterEqFilter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).exitEqFilter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitEqFilter(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class OrFilterContext extends FContext {
        public List<FContext> f() {
            return getRuleContexts(FContext.class);
        }

        public FContext f(int i) {
            return getRuleContext(FContext.class, i);
        }

        public TerminalNode OR() {
            return getToken(ExpressionGrammarParser.OR, 0);
        }

        public OrFilterContext(FContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).enterOrFilter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).exitOrFilter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitOrFilter(this);
            else return visitor.visitChildren(this);
        }
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RpFilterContext extends FContext {
        public RpContext rp() {
            return getRuleContext(RpContext.class, 0);
        }

        public RpFilterContext(FContext ctx) {
            copyFrom(ctx);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).enterRpFilter(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).exitRpFilter(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitRpFilter(this);
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
                setState(79);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
                    case 1: {
                        _localctx = new PrFilterContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;

                        setState(60);
                        match(LPR);
                        setState(61);
                        f(0);
                        setState(62);
                        match(RPR);
                    }
                    break;
                    case 2: {
                        _localctx = new NotFilterContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(64);
                        match(NOT);
                        setState(65);
                        f(7);
                    }
                    break;
                    case 3: {
                        _localctx = new IsFilterContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(66);
                        rp(0);
                        setState(67);
                        match(IS);
                        setState(68);
                        rp(0);
                    }
                    break;
                    case 4: {
                        _localctx = new EqFilterContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(70);
                        rp(0);
                        setState(71);
                        match(EQ);
                        setState(72);
                        rp(0);
                    }
                    break;
                    case 5: {
                        _localctx = new StrConstRpContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(74);
                        rp(0);
                        setState(75);
                        match(EQ);
                        setState(76);
                        strConst();
                    }
                    break;
                    case 6: {
                        _localctx = new RpFilterContext(_localctx);
                        _ctx = _localctx;
                        _prevctx = _localctx;
                        setState(78);
                        rp(0);
                    }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(89);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            setState(87);
                            _errHandler.sync(this);
                            switch (getInterpreter().adaptivePredict(_input, 5, _ctx)) {
                                case 1: {
                                    _localctx = new AndFilterContext(new FContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_f);
                                    setState(81);
                                    if (!(precpred(_ctx, 6)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 6)");
                                    setState(82);
                                    match(AND);
                                    setState(83);
                                    f(7);
                                }
                                break;
                                case 2: {
                                    _localctx = new OrFilterContext(new FContext(_parentctx, _parentState));
                                    pushNewRecursionContext(_localctx, _startState, RULE_f);
                                    setState(84);
                                    if (!(precpred(_ctx, 5)))
                                        throw new FailedPredicateException(this, "precpred(_ctx, 5)");
                                    setState(85);
                                    match(OR);
                                    setState(86);
                                    f(6);
                                }
                                break;
                            }
                        }
                    }
                    setState(91);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 6, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class DocContext extends ParserRuleContext {
        public TerminalNode DOC() {
            return getToken(ExpressionGrammarParser.DOC, 0);
        }

        public TerminalNode LPR() {
            return getToken(ExpressionGrammarParser.LPR, 0);
        }

        public List<TerminalNode> DQ() {
            return getTokens(ExpressionGrammarParser.DQ);
        }

        public TerminalNode DQ(int i) {
            return getToken(ExpressionGrammarParser.DQ, i);
        }

        public FileNameContext fileName() {
            return getRuleContext(FileNameContext.class, 0);
        }

        public TerminalNode RPR() {
            return getToken(ExpressionGrammarParser.RPR, 0);
        }

        public DocContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_doc;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).enterDoc(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).exitDoc(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitDoc(this);
            else return visitor.visitChildren(this);
        }
    }

    public final DocContext doc() throws RecognitionException {
        DocContext _localctx = new DocContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_doc);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(92);
                match(DOC);
                setState(93);
                match(LPR);
                setState(94);
                match(DQ);
                setState(95);
                fileName();
                setState(96);
                match(DQ);
                setState(97);
                match(RPR);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StrConstContext extends ParserRuleContext {
        public List<TerminalNode> DQ() {
            return getTokens(ExpressionGrammarParser.DQ);
        }

        public TerminalNode DQ(int i) {
            return getToken(ExpressionGrammarParser.DQ, i);
        }

        public TerminalNode ID() {
            return getToken(ExpressionGrammarParser.ID, 0);
        }

        public StrConstContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_strConst;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).enterStrConst(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).exitStrConst(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitStrConst(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StrConstContext strConst() throws RecognitionException {
        StrConstContext _localctx = new StrConstContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_strConst);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(99);
                match(DQ);
                setState(100);
                match(ID);
                setState(101);
                match(DQ);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class FileNameContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(ExpressionGrammarParser.ID, 0);
        }

        public FileNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_fileName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).enterFileName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).exitFileName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitFileName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final FileNameContext fileName() throws RecognitionException {
        FileNameContext _localctx = new FileNameContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_fileName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(103);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class TagNameContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(ExpressionGrammarParser.ID, 0);
        }

        public TagNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_tagName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).enterTagName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).exitTagName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitTagName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final TagNameContext tagName() throws RecognitionException {
        TagNameContext _localctx = new TagNameContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_tagName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(105);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class AttNameContext extends ParserRuleContext {
        public TerminalNode ID() {
            return getToken(ExpressionGrammarParser.ID, 0);
        }

        public AttNameContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_attName;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener)
                ((ExpressionGrammarListener) listener).enterAttName(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ExpressionGrammarListener) ((ExpressionGrammarListener) listener).exitAttName(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ExpressionGrammarVisitor)
                return ((ExpressionGrammarVisitor<? extends T>) visitor).visitAttName(this);
            else return visitor.visitChildren(this);
        }
    }

    public final AttNameContext attName() throws RecognitionException {
        AttNameContext _localctx = new AttNameContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_attName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(107);
                match(ID);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 1:
                return rp_sempred((RpContext) _localctx, predIndex);
            case 2:
                return f_sempred((FContext) _localctx, predIndex);
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

    public static final String _serializedATN =
            "\u0004\u0001\u0015n\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002" +
                    "\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001" +
                    "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001" +
                    "\u0000\u0001\u0000\u0003\u0000\u0019\b\u0000\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\'\b\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0005\u00017\b\u0001\n\u0001\f\u0001:\t\u0001\u0001" +
                    "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001" +
                    "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001" +
                    "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001" +
                    "\u0002\u0001\u0002\u0003\u0002P\b\u0002\u0001\u0002\u0001\u0002\u0001" +
                    "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002X\b\u0002\n\u0002" +
                    "\f\u0002[\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001" +
                    "\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001" +
                    "\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001" +
                    "\u0007\u0001\u0007\u0000\u0002\u0002\u0004\b\u0000\u0002\u0004\u0006\b" +
                    "\n\f\u000e\u0000\u0000w\u0000\u0018\u0001\u0000\u0000\u0000\u0002&\u0001" +
                    "\u0000\u0000\u0000\u0004O\u0001\u0000\u0000\u0000\u0006\\\u0001\u0000" +
                    "\u0000\u0000\bc\u0001\u0000\u0000\u0000\ng\u0001\u0000\u0000\u0000\fi" +
                    "\u0001\u0000\u0000\u0000\u000ek\u0001\u0000\u0000\u0000\u0010\u0011\u0003" +
                    "\u0006\u0003\u0000\u0011\u0012\u0005\t\u0000\u0000\u0012\u0013\u0003\u0002" +
                    "\u0001\u0000\u0013\u0019\u0001\u0000\u0000\u0000\u0014\u0015\u0003\u0006" +
                    "\u0003\u0000\u0015\u0016\u0005\b\u0000\u0000\u0016\u0017\u0003\u0002\u0001" +
                    "\u0000\u0017\u0019\u0001\u0000\u0000\u0000\u0018\u0010\u0001\u0000\u0000" +
                    "\u0000\u0018\u0014\u0001\u0000\u0000\u0000\u0019\u0001\u0001\u0000\u0000" +
                    "\u0000\u001a\u001b\u0006\u0001\uffff\uffff\u0000\u001b\u001c\u0005\u000f" +
                    "\u0000\u0000\u001c\u001d\u0003\u0002\u0001\u0000\u001d\u001e\u0005\u0010" +
                    "\u0000\u0000\u001e\'\u0001\u0000\u0000\u0000\u001f\'\u0003\f\u0006\u0000" +
                    " \'\u0005\u0002\u0000\u0000!\'\u0005\u0001\u0000\u0000\"\'\u0005\n\u0000" +
                    "\u0000#\'\u0005\f\u0000\u0000$%\u0005\u0003\u0000\u0000%\'\u0003\u000e" +
                    "\u0007\u0000&\u001a\u0001\u0000\u0000\u0000&\u001f\u0001\u0000\u0000\u0000" +
                    "& \u0001\u0000\u0000\u0000&!\u0001\u0000\u0000\u0000&\"\u0001\u0000\u0000" +
                    "\u0000&#\u0001\u0000\u0000\u0000&$\u0001\u0000\u0000\u0000\'8\u0001\u0000" +
                    "\u0000\u0000()\n\t\u0000\u0000)*\u0005\t\u0000\u0000*7\u0003\u0002\u0001" +
                    "\n+,\n\b\u0000\u0000,-\u0005\b\u0000\u0000-7\u0003\u0002\u0001\t./\n\u0007" +
                    "\u0000\u0000/0\u0005\u0007\u0000\u000007\u0003\u0002\u0001\b12\n\n\u0000" +
                    "\u000023\u0005\r\u0000\u000034\u0003\u0004\u0002\u000045\u0005\u000e\u0000" +
                    "\u000057\u0001\u0000\u0000\u00006(\u0001\u0000\u0000\u00006+\u0001\u0000" +
                    "\u0000\u00006.\u0001\u0000\u0000\u000061\u0001\u0000\u0000\u00007:\u0001" +
                    "\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000\u0000" +
                    "9\u0003\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0006\u0002" +
                    "\uffff\uffff\u0000<=\u0005\u000f\u0000\u0000=>\u0003\u0004\u0002\u0000" +
                    ">?\u0005\u0010\u0000\u0000?P\u0001\u0000\u0000\u0000@A\u0005\u0004\u0000" +
                    "\u0000AP\u0003\u0004\u0002\u0007BC\u0003\u0002\u0001\u0000CD\u0005\u0012" +
                    "\u0000\u0000DE\u0003\u0002\u0001\u0000EP\u0001\u0000\u0000\u0000FG\u0003" +
                    "\u0002\u0001\u0000GH\u0005\u0011\u0000\u0000HI\u0003\u0002\u0001\u0000" +
                    "IP\u0001\u0000\u0000\u0000JK\u0003\u0002\u0001\u0000KL\u0005\u0011\u0000" +
                    "\u0000LM\u0003\b\u0004\u0000MP\u0001\u0000\u0000\u0000NP\u0003\u0002\u0001" +
                    "\u0000O;\u0001\u0000\u0000\u0000O@\u0001\u0000\u0000\u0000OB\u0001\u0000" +
                    "\u0000\u0000OF\u0001\u0000\u0000\u0000OJ\u0001\u0000\u0000\u0000ON\u0001" +
                    "\u0000\u0000\u0000PY\u0001\u0000\u0000\u0000QR\n\u0006\u0000\u0000RS\u0005" +
                    "\u0005\u0000\u0000SX\u0003\u0004\u0002\u0007TU\n\u0005\u0000\u0000UV\u0005" +
                    "\u0006\u0000\u0000VX\u0003\u0004\u0002\u0006WQ\u0001\u0000\u0000\u0000" +
                    "WT\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000" +
                    "\u0000YZ\u0001\u0000\u0000\u0000Z\u0005\u0001\u0000\u0000\u0000[Y\u0001" +
                    "\u0000\u0000\u0000\\]\u0005\u0013\u0000\u0000]^\u0005\u000f\u0000\u0000" +
                    "^_\u0005\u000b\u0000\u0000_`\u0003\n\u0005\u0000`a\u0005\u000b\u0000\u0000" +
                    "ab\u0005\u0010\u0000\u0000b\u0007\u0001\u0000\u0000\u0000cd\u0005\u000b" +
                    "\u0000\u0000de\u0005\u0014\u0000\u0000ef\u0005\u000b\u0000\u0000f\t\u0001" +
                    "\u0000\u0000\u0000gh\u0005\u0014\u0000\u0000h\u000b\u0001\u0000\u0000" +
                    "\u0000ij\u0005\u0014\u0000\u0000j\r\u0001\u0000\u0000\u0000kl\u0005\u0014" +
                    "\u0000\u0000l\u000f\u0001\u0000\u0000\u0000\u0007\u0018&68OWY";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}