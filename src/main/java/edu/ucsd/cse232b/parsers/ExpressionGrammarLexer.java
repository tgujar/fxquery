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
		LCR=20, RCR=21, EQ=22, IS=23, DOC=24, MT=25, FOR=26, LET=27, IN=28, ASSIGN=29, 
		WHERE=30, RETURN=31, EMPTY=32, SOME=33, SATISFIES=34, ID=35, STR=36, WS=37;
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
			"RCR", "EQ", "IS", "DOC", "MT", "FOR", "LET", "IN", "ASSIGN", "WHERE", 
			"RETURN", "EMPTY", "SOME", "SATISFIES", "ID", "STR", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00e9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27"+
		"\3\27\3\27\5\27\u0087\n\27\3\30\3\30\3\30\3\30\5\30\u008d\n\30\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u009a\n\31\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3$\6$\u00d6\n$\r$\16$\u00d7\3%\3%\7%\u00dc\n%\f%\16"+
		"%\u00df\13%\3%\3%\3&\6&\u00e4\n&\r&\16&\u00e5\3&\3&\2\2\'\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'\3\2\17\4\2PPpp\4\2QQqq\4\2VVvv\4\2CCcc\4\2FFff\4\2TTtt\4\2EEee"+
		"\4\2WWww\4\2OOoo\4\2GGgg\7\2/\60\62;C\\aac|\b\2\"#.\60\62=AAC\\c|\5\2"+
		"\13\f\17\17\"\"\2\u00ee\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2"+
		"\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2"+
		"\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3"+
		"\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5T\3\2\2\2\7"+
		"V\3\2\2\2\tX\3\2\2\2\13Z\3\2\2\2\r^\3\2\2\2\17b\3\2\2\2\21e\3\2\2\2\23"+
		"g\3\2\2\2\25i\3\2\2\2\27l\3\2\2\2\31n\3\2\2\2\33p\3\2\2\2\35s\3\2\2\2"+
		"\37u\3\2\2\2!w\3\2\2\2#y\3\2\2\2%{\3\2\2\2\'}\3\2\2\2)\177\3\2\2\2+\u0081"+
		"\3\2\2\2-\u0086\3\2\2\2/\u008c\3\2\2\2\61\u0099\3\2\2\2\63\u009b\3\2\2"+
		"\2\65\u00a4\3\2\2\2\67\u00a8\3\2\2\29\u00ac\3\2\2\2;\u00af\3\2\2\2=\u00b2"+
		"\3\2\2\2?\u00b8\3\2\2\2A\u00bf\3\2\2\2C\u00c5\3\2\2\2E\u00ca\3\2\2\2G"+
		"\u00d5\3\2\2\2I\u00d9\3\2\2\2K\u00e3\3\2\2\2MN\7v\2\2NO\7g\2\2OP\7z\2"+
		"\2PQ\7v\2\2QR\7*\2\2RS\7+\2\2S\4\3\2\2\2TU\7,\2\2U\6\3\2\2\2VW\7&\2\2"+
		"W\b\3\2\2\2XY\7B\2\2Y\n\3\2\2\2Z[\t\2\2\2[\\\t\3\2\2\\]\t\4\2\2]\f\3\2"+
		"\2\2^_\t\5\2\2_`\t\2\2\2`a\t\6\2\2a\16\3\2\2\2bc\t\3\2\2cd\t\7\2\2d\20"+
		"\3\2\2\2ef\7.\2\2f\22\3\2\2\2gh\7\61\2\2h\24\3\2\2\2ij\7\61\2\2jk\7\61"+
		"\2\2k\26\3\2\2\2lm\7\60\2\2m\30\3\2\2\2no\7$\2\2o\32\3\2\2\2pq\5\27\f"+
		"\2qr\5\27\f\2r\34\3\2\2\2st\7]\2\2t\36\3\2\2\2uv\7_\2\2v \3\2\2\2wx\7"+
		"*\2\2x\"\3\2\2\2yz\7+\2\2z$\3\2\2\2{|\7>\2\2|&\3\2\2\2}~\7@\2\2~(\3\2"+
		"\2\2\177\u0080\7}\2\2\u0080*\3\2\2\2\u0081\u0082\7\177\2\2\u0082,\3\2"+
		"\2\2\u0083\u0087\7?\2\2\u0084\u0085\7g\2\2\u0085\u0087\7s\2\2\u0086\u0083"+
		"\3\2\2\2\u0086\u0084\3\2\2\2\u0087.\3\2\2\2\u0088\u0089\7?\2\2\u0089\u008d"+
		"\7?\2\2\u008a\u008b\7k\2\2\u008b\u008d\7u\2\2\u008c\u0088\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008d\60\3\2\2\2\u008e\u008f\t\6\2\2\u008f\u0090\t\3\2"+
		"\2\u0090\u009a\t\b\2\2\u0091\u0092\t\6\2\2\u0092\u0093\t\3\2\2\u0093\u0094"+
		"\t\b\2\2\u0094\u0095\t\t\2\2\u0095\u0096\t\n\2\2\u0096\u0097\t\13\2\2"+
		"\u0097\u0098\t\2\2\2\u0098\u009a\t\4\2\2\u0099\u008e\3\2\2\2\u0099\u0091"+
		"\3\2\2\2\u009a\62\3\2\2\2\u009b\u009c\7o\2\2\u009c\u009d\7c\2\2\u009d"+
		"\u009e\7m\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7V\2\2\u00a0\u00a1\7g\2\2"+
		"\u00a1\u00a2\7z\2\2\u00a2\u00a3\7v\2\2\u00a3\64\3\2\2\2\u00a4\u00a5\7"+
		"h\2\2\u00a5\u00a6\7q\2\2\u00a6\u00a7\7t\2\2\u00a7\66\3\2\2\2\u00a8\u00a9"+
		"\7n\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7v\2\2\u00ab8\3\2\2\2\u00ac\u00ad"+
		"\7k\2\2\u00ad\u00ae\7p\2\2\u00ae:\3\2\2\2\u00af\u00b0\7<\2\2\u00b0\u00b1"+
		"\7?\2\2\u00b1<\3\2\2\2\u00b2\u00b3\7y\2\2\u00b3\u00b4\7j\2\2\u00b4\u00b5"+
		"\7g\2\2\u00b5\u00b6\7t\2\2\u00b6\u00b7\7g\2\2\u00b7>\3\2\2\2\u00b8\u00b9"+
		"\7t\2\2\u00b9\u00ba\7g\2\2\u00ba\u00bb\7v\2\2\u00bb\u00bc\7w\2\2\u00bc"+
		"\u00bd\7t\2\2\u00bd\u00be\7p\2\2\u00be@\3\2\2\2\u00bf\u00c0\7g\2\2\u00c0"+
		"\u00c1\7o\2\2\u00c1\u00c2\7r\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7{\2\2"+
		"\u00c4B\3\2\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7q\2\2\u00c7\u00c8\7o\2"+
		"\2\u00c8\u00c9\7g\2\2\u00c9D\3\2\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7"+
		"c\2\2\u00cc\u00cd\7v\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0"+
		"\7h\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7u\2\2\u00d3"+
		"F\3\2\2\2\u00d4\u00d6\t\f\2\2\u00d5\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2"+
		"\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8H\3\2\2\2\u00d9\u00dd\7"+
		"$\2\2\u00da\u00dc\t\r\2\2\u00db\u00da\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd"+
		"\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00dd\3\2"+
		"\2\2\u00e0\u00e1\7$\2\2\u00e1J\3\2\2\2\u00e2\u00e4\t\16\2\2\u00e3\u00e2"+
		"\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\b&\2\2\u00e8L\3\2\2\2\n\2\u0086\u008c\u0099"+
		"\u00d7\u00db\u00dd\u00e5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}