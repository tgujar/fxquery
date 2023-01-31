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
		T__0=1, STAR=2, AT=3, AND=4, OR=5, NOT=6, COMMA=7, SL=8, DSL=9, DOT=10, 
		DQ=11, DDOT=12, LSQ=13, RSQ=14, LPR=15, RPR=16, EQ=17, IS=18, DOC=19, 
		ID=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "STAR", "AT", "AND", "OR", "NOT", "COMMA", "SL", "DSL", "DOT", 
			"DQ", "DDOT", "LSQ", "RSQ", "LPR", "RPR", "EQ", "IS", "DOC", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'text()'", "'*'", "'@'", null, null, null, "','", "'/'", "'//'", 
			"'.'", "'\"'", null, "'['", "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "STAR", "AT", "AND", "OR", "NOT", "COMMA", "SL", "DSL", "DOT", 
			"DQ", "DDOT", "LSQ", "RSQ", "LPR", "RPR", "EQ", "IS", "DOC", "ID"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26v\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\22\5\22[\n\22\3\23\3\23\3\23\3\23\5\23a\n\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24n\n\24\3\25\3\25"+
		"\7\25r\n\25\f\25\16\25u\13\25\2\2\26\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26\3\2\16"+
		"\4\2CCcc\4\2PPpp\4\2FFff\4\2QQqq\4\2TTtt\4\2VVvv\4\2EEee\4\2WWww\4\2O"+
		"Ooo\4\2GGgg\4\2C\\c|\7\2/\60\62;C\\aac|\2y\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\3+\3\2\2\2\5\62\3\2\2\2\7\64\3\2\2\2\t\66\3\2\2\2\13:\3\2"+
		"\2\2\r=\3\2\2\2\17A\3\2\2\2\21C\3\2\2\2\23E\3\2\2\2\25H\3\2\2\2\27J\3"+
		"\2\2\2\31L\3\2\2\2\33O\3\2\2\2\35Q\3\2\2\2\37S\3\2\2\2!U\3\2\2\2#Z\3\2"+
		"\2\2%`\3\2\2\2\'m\3\2\2\2)o\3\2\2\2+,\7v\2\2,-\7g\2\2-.\7z\2\2./\7v\2"+
		"\2/\60\7*\2\2\60\61\7+\2\2\61\4\3\2\2\2\62\63\7,\2\2\63\6\3\2\2\2\64\65"+
		"\7B\2\2\65\b\3\2\2\2\66\67\t\2\2\2\678\t\3\2\289\t\4\2\29\n\3\2\2\2:;"+
		"\t\5\2\2;<\t\6\2\2<\f\3\2\2\2=>\t\3\2\2>?\t\5\2\2?@\t\7\2\2@\16\3\2\2"+
		"\2AB\7.\2\2B\20\3\2\2\2CD\7\61\2\2D\22\3\2\2\2EF\7\61\2\2FG\7\61\2\2G"+
		"\24\3\2\2\2HI\7\60\2\2I\26\3\2\2\2JK\7$\2\2K\30\3\2\2\2LM\5\25\13\2MN"+
		"\5\25\13\2N\32\3\2\2\2OP\7]\2\2P\34\3\2\2\2QR\7_\2\2R\36\3\2\2\2ST\7*"+
		"\2\2T \3\2\2\2UV\7+\2\2V\"\3\2\2\2W[\7?\2\2XY\7g\2\2Y[\7s\2\2ZW\3\2\2"+
		"\2ZX\3\2\2\2[$\3\2\2\2\\]\7?\2\2]a\7?\2\2^_\7k\2\2_a\7u\2\2`\\\3\2\2\2"+
		"`^\3\2\2\2a&\3\2\2\2bc\t\4\2\2cd\t\5\2\2dn\t\b\2\2ef\t\4\2\2fg\t\5\2\2"+
		"gh\t\b\2\2hi\t\t\2\2ij\t\n\2\2jk\t\13\2\2kl\t\3\2\2ln\t\7\2\2mb\3\2\2"+
		"\2me\3\2\2\2n(\3\2\2\2os\t\f\2\2pr\t\r\2\2qp\3\2\2\2ru\3\2\2\2sq\3\2\2"+
		"\2st\3\2\2\2t*\3\2\2\2us\3\2\2\2\7\2Z`ms\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}