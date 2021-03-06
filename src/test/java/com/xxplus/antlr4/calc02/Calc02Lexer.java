// Generated from C:/Users/admin/workspace/xxplus/src/test/java/com/xxplus/antlr4\Calc02.g4 by ANTLR 4.5.1
package com.xxplus.antlr4.calc02;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Calc02Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, MOD=4, MUL=5, DIV=6, ADD=7, SUB=8, ID=9, NUM=10, 
		INT=11, FLT=12, NL=13, WS=14;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "MOD", "MUL", "DIV", "ADD", "SUB", "ID", "NUM", 
		"INT", "FLT", "NL", "WS", "Letter", "Digit"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'('", "')'", "'%'", "'*'", "'/'", "'+'", "'-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, "MOD", "MUL", "DIV", "ADD", "SUB", "ID", "NUM", 
		"INT", "FLT", "NL", "WS"
	};
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


	public Calc02Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calc02.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\20h\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\n"+
		"\67\n\n\f\n\16\n:\13\n\3\13\3\13\5\13>\n\13\3\f\6\fA\n\f\r\f\16\fB\3\r"+
		"\6\rF\n\r\r\r\16\rG\3\r\3\r\7\rL\n\r\f\r\16\rO\13\r\3\r\3\r\6\rS\n\r\r"+
		"\r\16\rT\5\rW\n\r\3\16\5\16Z\n\16\3\16\3\16\3\17\6\17_\n\17\r\17\16\17"+
		"`\3\17\3\17\3\20\3\20\3\21\3\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21"+
		"\n\23\13\25\f\27\r\31\16\33\17\35\20\37\2!\2\3\2\5\4\2\13\13\"\"\5\2C"+
		"\\aac|\3\2\62;o\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3#\3\2\2\2\5%\3\2"+
		"\2\2\7\'\3\2\2\2\t)\3\2\2\2\13+\3\2\2\2\r-\3\2\2\2\17/\3\2\2\2\21\61\3"+
		"\2\2\2\23\63\3\2\2\2\25=\3\2\2\2\27@\3\2\2\2\31V\3\2\2\2\33Y\3\2\2\2\35"+
		"^\3\2\2\2\37d\3\2\2\2!f\3\2\2\2#$\7?\2\2$\4\3\2\2\2%&\7*\2\2&\6\3\2\2"+
		"\2\'(\7+\2\2(\b\3\2\2\2)*\7\'\2\2*\n\3\2\2\2+,\7,\2\2,\f\3\2\2\2-.\7\61"+
		"\2\2.\16\3\2\2\2/\60\7-\2\2\60\20\3\2\2\2\61\62\7/\2\2\62\22\3\2\2\2\63"+
		"8\5\37\20\2\64\67\5\37\20\2\65\67\5!\21\2\66\64\3\2\2\2\66\65\3\2\2\2"+
		"\67:\3\2\2\28\66\3\2\2\289\3\2\2\29\24\3\2\2\2:8\3\2\2\2;>\5\27\f\2<>"+
		"\5\31\r\2=;\3\2\2\2=<\3\2\2\2>\26\3\2\2\2?A\5!\21\2@?\3\2\2\2AB\3\2\2"+
		"\2B@\3\2\2\2BC\3\2\2\2C\30\3\2\2\2DF\5!\21\2ED\3\2\2\2FG\3\2\2\2GE\3\2"+
		"\2\2GH\3\2\2\2HI\3\2\2\2IM\7\60\2\2JL\5!\21\2KJ\3\2\2\2LO\3\2\2\2MK\3"+
		"\2\2\2MN\3\2\2\2NW\3\2\2\2OM\3\2\2\2PR\7\60\2\2QS\5!\21\2RQ\3\2\2\2ST"+
		"\3\2\2\2TR\3\2\2\2TU\3\2\2\2UW\3\2\2\2VE\3\2\2\2VP\3\2\2\2W\32\3\2\2\2"+
		"XZ\7\17\2\2YX\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[\\\7\f\2\2\\\34\3\2\2\2]_\t"+
		"\2\2\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ab\3\2\2\2bc\b\17\2\2c\36"+
		"\3\2\2\2de\t\3\2\2e \3\2\2\2fg\t\4\2\2g\"\3\2\2\2\r\2\668=BGMTVY`\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}