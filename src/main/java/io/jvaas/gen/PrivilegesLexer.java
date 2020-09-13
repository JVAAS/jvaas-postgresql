// Generated from /home/vlad/Code/jvaas-platform/jvaas-postgresql/src/main/resources/antlr/Privileges.g4 by ANTLR 4.8
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
public class PrivilegesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, COMMA=3, QUOTE_CHAR=4, Privileges=5, Identifier=6, QuotedIdentifier=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "COMMA", "QUOTE_CHAR", "Privileges", "Identifier", "QuotedIdentifier", 
			"UnterminatedQuotedIdentifier"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'}'", "','", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "COMMA", "QUOTE_CHAR", "Privileges", "Identifier", 
			"QuotedIdentifier"
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


	public PrivilegesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Privileges.g4"; }

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
		case 4:
			Privileges_action((RuleContext)_localctx, actionIndex);
			break;
		case 6:
			QuotedIdentifier_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void Privileges_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			        String __tx = getText();
			        setText(__tx.substring(1, __tx.length() - 1));
			    
			break;
		}
	}
	private void QuotedIdentifier_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:

			            String __tx = getText();
			            setText(__tx.substring(2, __tx.length() - 2)
			                        .replace("\\\"\\\"", "\"")
			                        .replace("\\\\", "\\")
			            );
			        
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tA\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\5\6\37\n\6\6\6!\n\6\r\6\16\6\"\3\6\3\6\3"+
		"\6\3\7\6\7)\n\7\r\7\16\7*\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t=\n\t\f\t\16\t@\13\t\2\2\n\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\2\3\2\5\n\2EFVWZZccefttvvyz\6\2\62;C\\aac|\4\2$$^^\2E\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\3\23\3\2\2\2\5\25\3\2\2\2\7\27\3\2\2\2\t\31\3\2\2\2\13"+
		"\33\3\2\2\2\r(\3\2\2\2\17,\3\2\2\2\21>\3\2\2\2\23\24\7}\2\2\24\4\3\2\2"+
		"\2\25\26\7\177\2\2\26\6\3\2\2\2\27\30\7.\2\2\30\b\3\2\2\2\31\32\7$\2\2"+
		"\32\n\3\2\2\2\33 \7?\2\2\34\36\t\2\2\2\35\37\7,\2\2\36\35\3\2\2\2\36\37"+
		"\3\2\2\2\37!\3\2\2\2 \34\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#$\3"+
		"\2\2\2$%\7\61\2\2%&\b\6\2\2&\f\3\2\2\2\')\t\3\2\2(\'\3\2\2\2)*\3\2\2\2"+
		"*(\3\2\2\2*+\3\2\2\2+\16\3\2\2\2,-\7^\2\2-.\7$\2\2./\3\2\2\2/\60\5\21"+
		"\t\2\60\61\7^\2\2\61\62\7$\2\2\62\63\3\2\2\2\63\64\b\b\3\2\64\20\3\2\2"+
		"\2\65\66\7^\2\2\66\67\7$\2\2\678\7^\2\28=\7$\2\29:\7^\2\2:=\7^\2\2;=\n"+
		"\4\2\2<\65\3\2\2\2<9\3\2\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?"+
		"\22\3\2\2\2@>\3\2\2\2\b\2\36\"*<>\4\3\6\2\3\b\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}