// Generated from ExpressionGrammar.g4 by ANTLR 4.7.2

package edu.ucsd.cse232b.parsers;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressionGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, STAR=2, DOLLAR=3, AT=4, NOT=5, AND=6, OR=7, COMMA=8, SL=9, DSL=10, 
		DOT=11, DQ=12, DDOT=13, LSQ=14, RSQ=15, LPR=16, RPR=17, LAG=18, RAG=19, 
		LCR=20, RCR=21, EQ=22, IS=23, DOC=24, ID=25, MT=26, FOR=27, LET=28, IN=29, 
		ASSIGN=30, WHERE=31, RETURN=32, EMPTY=33, SOME=34, SATISFIES=35, WS=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "STAR", "DOLLAR", "AT", "NOT", "AND", "OR", "COMMA", "SL", "DSL", 
			"DOT", "DQ", "DDOT", "LSQ", "RSQ", "LPR", "RPR", "LAG", "RAG", "LCR", 
			"RCR", "EQ", "IS", "DOC", "ID", "MT", "FOR", "LET", "IN", "ASSIGN", "WHERE", 
			"RETURN", "EMPTY", "SOME", "SATISFIES", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'text()'", "'*'", "'$'", "'@'", null, null, null, "','", "'/'", 
			"'//'", "'.'", "'\"'", null, "'['", "']'", "'('", "')'", "'<'", "'>'", 
			"'{'", "'}'", null, null, null, null, "'makeText'", "'for'", "'let'", 
			"'in'", "':='", "'where'", "'return'", "'empty'", "'some'", "'satisfies'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "STAR", "DOLLAR", "AT", "NOT", "AND", "OR", "COMMA", "SL", 
			"DSL", "DOT", "DQ", "DDOT", "LSQ", "RSQ", "LPR", "RPR", "LAG", "RAG", 
			"LCR", "RCR", "EQ", "IS", "DOC", "ID", "MT", "FOR", "LET", "IN", "ASSIGN", 
			"WHERE", "RETURN", "EMPTY", "SOME", "SATISFIES", "WS"
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
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ExpressionGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u00e0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3"+
		"\27\5\27\u0085\n\27\3\30\3\30\3\30\3\30\5\30\u008b\n\30\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0098\n\31\3\32\3\32\7\32"+
		"\u009c\n\32\f\32\16\32\u009f\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\6%\u00db\n%\r%\16"+
		"%\u00dc\3%\3%\2\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r"+
		"\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33"+
		"\65\34\67\359\36;\37= ?!A\"C#E$G%I&\3\2\17\4\2PPpp\4\2QQqq\4\2VVvv\4\2"+
		"CCcc\4\2FFff\4\2TTtt\4\2EEee\4\2WWww\4\2OOoo\4\2GGgg\4\2C\\c|\7\2/\60"+
		"\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00e4\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3K\3\2\2\2\5R\3\2\2"+
		"\2\7T\3\2\2\2\tV\3\2\2\2\13X\3\2\2\2\r\\\3\2\2\2\17`\3\2\2\2\21c\3\2\2"+
		"\2\23e\3\2\2\2\25g\3\2\2\2\27j\3\2\2\2\31l\3\2\2\2\33n\3\2\2\2\35q\3\2"+
		"\2\2\37s\3\2\2\2!u\3\2\2\2#w\3\2\2\2%y\3\2\2\2\'{\3\2\2\2)}\3\2\2\2+\177"+
		"\3\2\2\2-\u0084\3\2\2\2/\u008a\3\2\2\2\61\u0097\3\2\2\2\63\u0099\3\2\2"+
		"\2\65\u00a0\3\2\2\2\67\u00a9\3\2\2\29\u00ad\3\2\2\2;\u00b1\3\2\2\2=\u00b4"+
		"\3\2\2\2?\u00b7\3\2\2\2A\u00bd\3\2\2\2C\u00c4\3\2\2\2E\u00ca\3\2\2\2G"+
		"\u00cf\3\2\2\2I\u00da\3\2\2\2KL\7v\2\2LM\7g\2\2MN\7z\2\2NO\7v\2\2OP\7"+
		"*\2\2PQ\7+\2\2Q\4\3\2\2\2RS\7,\2\2S\6\3\2\2\2TU\7&\2\2U\b\3\2\2\2VW\7"+
		"B\2\2W\n\3\2\2\2XY\t\2\2\2YZ\t\3\2\2Z[\t\4\2\2[\f\3\2\2\2\\]\t\5\2\2]"+
		"^\t\2\2\2^_\t\6\2\2_\16\3\2\2\2`a\t\3\2\2ab\t\7\2\2b\20\3\2\2\2cd\7.\2"+
		"\2d\22\3\2\2\2ef\7\61\2\2f\24\3\2\2\2gh\7\61\2\2hi\7\61\2\2i\26\3\2\2"+
		"\2jk\7\60\2\2k\30\3\2\2\2lm\7$\2\2m\32\3\2\2\2no\5\27\f\2op\5\27\f\2p"+
		"\34\3\2\2\2qr\7]\2\2r\36\3\2\2\2st\7_\2\2t \3\2\2\2uv\7*\2\2v\"\3\2\2"+
		"\2wx\7+\2\2x$\3\2\2\2yz\7>\2\2z&\3\2\2\2{|\7@\2\2|(\3\2\2\2}~\7}\2\2~"+
		"*\3\2\2\2\177\u0080\7\177\2\2\u0080,\3\2\2\2\u0081\u0085\7?\2\2\u0082"+
		"\u0083\7g\2\2\u0083\u0085\7s\2\2\u0084\u0081\3\2\2\2\u0084\u0082\3\2\2"+
		"\2\u0085.\3\2\2\2\u0086\u0087\7?\2\2\u0087\u008b\7?\2\2\u0088\u0089\7"+
		"k\2\2\u0089\u008b\7u\2\2\u008a\u0086\3\2\2\2\u008a\u0088\3\2\2\2\u008b"+
		"\60\3\2\2\2\u008c\u008d\t\6\2\2\u008d\u008e\t\3\2\2\u008e\u0098\t\b\2"+
		"\2\u008f\u0090\t\6\2\2\u0090\u0091\t\3\2\2\u0091\u0092\t\b\2\2\u0092\u0093"+
		"\t\t\2\2\u0093\u0094\t\n\2\2\u0094\u0095\t\13\2\2\u0095\u0096\t\2\2\2"+
		"\u0096\u0098\t\4\2\2\u0097\u008c\3\2\2\2\u0097\u008f\3\2\2\2\u0098\62"+
		"\3\2\2\2\u0099\u009d\t\f\2\2\u009a\u009c\t\r\2\2\u009b\u009a\3\2\2\2\u009c"+
		"\u009f\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\64\3\2\2"+
		"\2\u009f\u009d\3\2\2\2\u00a0\u00a1\7o\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3"+
		"\7m\2\2\u00a3\u00a4\7g\2\2\u00a4\u00a5\7V\2\2\u00a5\u00a6\7g\2\2\u00a6"+
		"\u00a7\7z\2\2\u00a7\u00a8\7v\2\2\u00a8\66\3\2\2\2\u00a9\u00aa\7h\2\2\u00aa"+
		"\u00ab\7q\2\2\u00ab\u00ac\7t\2\2\u00ac8\3\2\2\2\u00ad\u00ae\7n\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\u00b0\7v\2\2\u00b0:\3\2\2\2\u00b1\u00b2\7k\2\2\u00b2"+
		"\u00b3\7p\2\2\u00b3<\3\2\2\2\u00b4\u00b5\7<\2\2\u00b5\u00b6\7?\2\2\u00b6"+
		">\3\2\2\2\u00b7\u00b8\7y\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba\7g\2\2\u00ba"+
		"\u00bb\7t\2\2\u00bb\u00bc\7g\2\2\u00bc@\3\2\2\2\u00bd\u00be\7t\2\2\u00be"+
		"\u00bf\7g\2\2\u00bf\u00c0\7v\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7t\2\2"+
		"\u00c2\u00c3\7p\2\2\u00c3B\3\2\2\2\u00c4\u00c5\7g\2\2\u00c5\u00c6\7o\2"+
		"\2\u00c6\u00c7\7r\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7{\2\2\u00c9D\3\2"+
		"\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7o\2\2\u00cd\u00ce"+
		"\7g\2\2\u00ceF\3\2\2\2\u00cf\u00d0\7u\2\2\u00d0\u00d1\7c\2\2\u00d1\u00d2"+
		"\7v\2\2\u00d2\u00d3\7k\2\2\u00d3\u00d4\7u\2\2\u00d4\u00d5\7h\2\2\u00d5"+
		"\u00d6\7k\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7u\2\2\u00d8H\3\2\2\2\u00d9"+
		"\u00db\t\16\2\2\u00da\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00da\3"+
		"\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\b%\2\2\u00df"+
		"J\3\2\2\2\b\2\u0084\u008a\u0097\u009d\u00dc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}