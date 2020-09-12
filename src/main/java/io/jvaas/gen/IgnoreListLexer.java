// Generated from /home/vlad/Code/jvaas-platform/jvaas-postgresql/src/main/resources/antlr/IgnoreList.g4 by ANTLR 4.8
package io.jvaas.gen;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class IgnoreListLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HIDE=1, SHOW=2, ALL=3, CONTENT=4, QUALIFIED=5, REGEX=6, NONE=7, DB=8,
		TYPE=9, Identifier=10, SQstring=11, DQstring=12, COMMA=13, NewLine=14, 
		COMMENT=15, WS=16, BAD=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"HIDE", "SHOW", "ALL", "CONTENT", "QUALIFIED", "REGEX", "NONE", "DB", 
			"TYPE", "Identifier", "SQstring", "DQstring", "COMMA", "NewLine", "COMMENT", 
			"WS", "BAD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'HIDE'", "'SHOW'", "'ALL'", "'CONTENT'", "'QUALIFIED'", "'REGEX'", 
			"'NONE'", "'db='", "'type='", null, null, null, "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "HIDE", "SHOW", "ALL", "CONTENT", "QUALIFIED", "REGEX", "NONE", 
			"DB", "TYPE", "Identifier", "SQstring", "DQstring", "COMMA", "NewLine", 
			"COMMENT", "WS", "BAD"
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


	public IgnoreListLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "IgnoreList.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 10:
			SQstring_action((RuleContext)_localctx, actionIndex);
			break;
		case 11:
			DQstring_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void SQstring_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			    String __tx = getText();
			    setText(__tx.substring(1, __tx.length() - 1).replace("''", "'"));

			break;
		}
	}
	private void DQstring_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			    String __tx = getText();
			    setText(__tx.substring(1, __tx.length() - 1).replace("\"\"", "\""));

			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23\u008f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\13\3\13\7\13]\n\13\f\13\16\13`\13\13\3\f\3\f\3\f\3\f\7\ff\n"+
		"\f\f\f\16\fi\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\rr\n\r\f\r\16\ru\13\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\17\6\17}\n\17\r\17\16\17~\3\20\3\20\7\20\u0083"+
		"\n\20\f\20\16\20\u0086\13\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\2"+
		"\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23\3\2\b\5\2C\\aac|\6\2\62;C\\aac|\5\2\f\f\17\17))\5\2"+
		"\f\f\17\17$$\4\2\f\f\17\17\4\2\13\13\"\"\2\u0095\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5*\3\2"+
		"\2\2\7/\3\2\2\2\t\63\3\2\2\2\13;\3\2\2\2\rE\3\2\2\2\17K\3\2\2\2\21P\3"+
		"\2\2\2\23T\3\2\2\2\25Z\3\2\2\2\27a\3\2\2\2\31m\3\2\2\2\33y\3\2\2\2\35"+
		"|\3\2\2\2\37\u0080\3\2\2\2!\u0089\3\2\2\2#\u008d\3\2\2\2%&\7J\2\2&\'\7"+
		"K\2\2\'(\7F\2\2()\7G\2\2)\4\3\2\2\2*+\7U\2\2+,\7J\2\2,-\7Q\2\2-.\7Y\2"+
		"\2.\6\3\2\2\2/\60\7C\2\2\60\61\7N\2\2\61\62\7N\2\2\62\b\3\2\2\2\63\64"+
		"\7E\2\2\64\65\7Q\2\2\65\66\7P\2\2\66\67\7V\2\2\678\7G\2\289\7P\2\29:\7"+
		"V\2\2:\n\3\2\2\2;<\7S\2\2<=\7W\2\2=>\7C\2\2>?\7N\2\2?@\7K\2\2@A\7H\2\2"+
		"AB\7K\2\2BC\7G\2\2CD\7F\2\2D\f\3\2\2\2EF\7T\2\2FG\7G\2\2GH\7I\2\2HI\7"+
		"G\2\2IJ\7Z\2\2J\16\3\2\2\2KL\7P\2\2LM\7Q\2\2MN\7P\2\2NO\7G\2\2O\20\3\2"+
		"\2\2PQ\7f\2\2QR\7d\2\2RS\7?\2\2S\22\3\2\2\2TU\7v\2\2UV\7{\2\2VW\7r\2\2"+
		"WX\7g\2\2XY\7?\2\2Y\24\3\2\2\2Z^\t\2\2\2[]\t\3\2\2\\[\3\2\2\2]`\3\2\2"+
		"\2^\\\3\2\2\2^_\3\2\2\2_\26\3\2\2\2`^\3\2\2\2ag\7)\2\2bf\n\4\2\2cd\7)"+
		"\2\2df\7)\2\2eb\3\2\2\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2"+
		"\2\2ig\3\2\2\2jk\7)\2\2kl\b\f\2\2l\30\3\2\2\2ms\7$\2\2nr\n\5\2\2op\7$"+
		"\2\2pr\7$\2\2qn\3\2\2\2qo\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2tv\3\2"+
		"\2\2us\3\2\2\2vw\7$\2\2wx\b\r\3\2x\32\3\2\2\2yz\7.\2\2z\34\3\2\2\2{}\t"+
		"\6\2\2|{\3\2\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\36\3\2\2\2\u0080"+
		"\u0084\7%\2\2\u0081\u0083\n\6\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2"+
		"\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\b\20\4\2\u0088 \3\2\2\2\u0089\u008a\t\7\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u008c\b\21\4\2\u008c\"\3\2\2\2\u008d\u008e"+
		"\13\2\2\2\u008e$\3\2\2\2\n\2^egqs~\u0084\5\3\f\2\3\r\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}