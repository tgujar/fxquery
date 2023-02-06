// Generated from java-escape by ANTLR 4.11.1

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ExpressionGrammarLexer extends Lexer {
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
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "STAR", "AT", "NOT", "AND", "OR", "COMMA", "SL", "DSL", "DOT",
                "DQ", "DDOT", "LSQ", "RSQ", "LPR", "RPR", "EQ", "IS", "DOC", "ID", "WS"
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


    public ExpressionGrammarLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "ExpressionGrammar.g4";
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
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\u0004\u0000\u0015}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
                    "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
                    "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
                    "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b" +
                    "\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002" +
                    "\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002" +
                    "\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001" +
                    "\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001" +
                    "\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001" +
                    "\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001" +
                    "\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001" +
                    "\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001" +
                    "\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r" +
                    "\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010" +
                    "\u0001\u0010\u0003\u0010[\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011" +
                    "\u0001\u0011\u0003\u0011a\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012" +
                    "\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012" +
                    "\u0001\u0012\u0001\u0012\u0003\u0012n\b\u0012\u0001\u0013\u0001\u0013" +
                    "\u0005\u0013r\b\u0013\n\u0013\f\u0013u\t\u0013\u0001\u0014\u0004\u0014" +
                    "x\b\u0014\u000b\u0014\f\u0014y\u0001\u0014\u0001\u0014\u0000\u0000\u0015" +
                    "\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r" +
                    "\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e" +
                    "\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015\u0001\u0000" +
                    "\r\u0002\u0000NNnn\u0002\u0000OOoo\u0002\u0000TTtt\u0002\u0000AAaa\u0002" +
                    "\u0000DDdd\u0002\u0000RRrr\u0002\u0000CCcc\u0002\u0000UUuu\u0002\u0000" +
                    "MMmm\u0002\u0000EEee\u0002\u0000AZaz\u0005\u0000-.09AZ__az\u0003\u0000" +
                    "\t\n\r\r  \u0081\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001" +
                    "\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001" +
                    "\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000" +
                    "\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000" +
                    "\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000" +
                    "\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000" +
                    "\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000" +
                    "\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000" +
                    "\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000" +
                    "%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001" +
                    "\u0000\u0000\u0000\u0001+\u0001\u0000\u0000\u0000\u00032\u0001\u0000\u0000" +
                    "\u0000\u00054\u0001\u0000\u0000\u0000\u00076\u0001\u0000\u0000\u0000\t" +
                    ":\u0001\u0000\u0000\u0000\u000b>\u0001\u0000\u0000\u0000\rA\u0001\u0000" +
                    "\u0000\u0000\u000fC\u0001\u0000\u0000\u0000\u0011E\u0001\u0000\u0000\u0000" +
                    "\u0013H\u0001\u0000\u0000\u0000\u0015J\u0001\u0000\u0000\u0000\u0017L" +
                    "\u0001\u0000\u0000\u0000\u0019O\u0001\u0000\u0000\u0000\u001bQ\u0001\u0000" +
                    "\u0000\u0000\u001dS\u0001\u0000\u0000\u0000\u001fU\u0001\u0000\u0000\u0000" +
                    "!Z\u0001\u0000\u0000\u0000#`\u0001\u0000\u0000\u0000%m\u0001\u0000\u0000" +
                    "\u0000\'o\u0001\u0000\u0000\u0000)w\u0001\u0000\u0000\u0000+,\u0005t\u0000" +
                    "\u0000,-\u0005e\u0000\u0000-.\u0005x\u0000\u0000./\u0005t\u0000\u0000" +
                    "/0\u0005(\u0000\u000001\u0005)\u0000\u00001\u0002\u0001\u0000\u0000\u0000" +
                    "23\u0005*\u0000\u00003\u0004\u0001\u0000\u0000\u000045\u0005@\u0000\u0000" +
                    "5\u0006\u0001\u0000\u0000\u000067\u0007\u0000\u0000\u000078\u0007\u0001" +
                    "\u0000\u000089\u0007\u0002\u0000\u00009\b\u0001\u0000\u0000\u0000:;\u0007" +
                    "\u0003\u0000\u0000;<\u0007\u0000\u0000\u0000<=\u0007\u0004\u0000\u0000" +
                    "=\n\u0001\u0000\u0000\u0000>?\u0007\u0001\u0000\u0000?@\u0007\u0005\u0000" +
                    "\u0000@\f\u0001\u0000\u0000\u0000AB\u0005,\u0000\u0000B\u000e\u0001\u0000" +
                    "\u0000\u0000CD\u0005/\u0000\u0000D\u0010\u0001\u0000\u0000\u0000EF\u0005" +
                    "/\u0000\u0000FG\u0005/\u0000\u0000G\u0012\u0001\u0000\u0000\u0000HI\u0005" +
                    ".\u0000\u0000I\u0014\u0001\u0000\u0000\u0000JK\u0005\"\u0000\u0000K\u0016" +
                    "\u0001\u0000\u0000\u0000LM\u0003\u0013\t\u0000MN\u0003\u0013\t\u0000N" +
                    "\u0018\u0001\u0000\u0000\u0000OP\u0005[\u0000\u0000P\u001a\u0001\u0000" +
                    "\u0000\u0000QR\u0005]\u0000\u0000R\u001c\u0001\u0000\u0000\u0000ST\u0005" +
                    "(\u0000\u0000T\u001e\u0001\u0000\u0000\u0000UV\u0005)\u0000\u0000V \u0001" +
                    "\u0000\u0000\u0000W[\u0005=\u0000\u0000XY\u0005e\u0000\u0000Y[\u0005q" +
                    "\u0000\u0000ZW\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[\"\u0001" +
                    "\u0000\u0000\u0000\\]\u0005=\u0000\u0000]a\u0005=\u0000\u0000^_\u0005" +
                    "i\u0000\u0000_a\u0005s\u0000\u0000`\\\u0001\u0000\u0000\u0000`^\u0001" +
                    "\u0000\u0000\u0000a$\u0001\u0000\u0000\u0000bc\u0007\u0004\u0000\u0000" +
                    "cd\u0007\u0001\u0000\u0000dn\u0007\u0006\u0000\u0000ef\u0007\u0004\u0000" +
                    "\u0000fg\u0007\u0001\u0000\u0000gh\u0007\u0006\u0000\u0000hi\u0007\u0007" +
                    "\u0000\u0000ij\u0007\b\u0000\u0000jk\u0007\t\u0000\u0000kl\u0007\u0000" +
                    "\u0000\u0000ln\u0007\u0002\u0000\u0000mb\u0001\u0000\u0000\u0000me\u0001" +
                    "\u0000\u0000\u0000n&\u0001\u0000\u0000\u0000os\u0007\n\u0000\u0000pr\u0007" +
                    "\u000b\u0000\u0000qp\u0001\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000" +
                    "sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000t(\u0001\u0000\u0000" +
                    "\u0000us\u0001\u0000\u0000\u0000vx\u0007\f\u0000\u0000wv\u0001\u0000\u0000" +
                    "\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000" +
                    "\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0006\u0014\u0000\u0000|*\u0001" +
                    "\u0000\u0000\u0000\u0006\u0000Z`msy\u0001\u0006\u0000\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}