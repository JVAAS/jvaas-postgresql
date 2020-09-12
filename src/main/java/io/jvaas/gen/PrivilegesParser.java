// Generated from /home/vlad/Code/jvaas-platform/jvaas-postgresql/src/main/resources/antlr/Privileges.g4 by ANTLR 4.8
package io.jvaas.gen;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PrivilegesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, COMMA=3, QUOTE_CHAR=4, Privileges=5, Identifier=6, QuotedIdentifier=7;
	public static final int
		RULE_privileges = 0, RULE_privilege = 1, RULE_identifier = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"privileges", "privilege", "identifier"
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

	@Override
	public String getGrammarFileName() { return "Privileges.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PrivilegesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class PrivilegesContext extends ParserRuleContext {
		public PrivilegeContext privilege;
		public List<PrivilegeContext> acls = new ArrayList<PrivilegeContext>();
		public TerminalNode EOF() { return getToken(PrivilegesParser.EOF, 0); }
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PrivilegesParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PrivilegesParser.COMMA, i);
		}
		public PrivilegesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privileges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrivilegesListener ) ((PrivilegesListener)listener).enterPrivileges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrivilegesListener ) ((PrivilegesListener)listener).exitPrivileges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrivilegesVisitor ) return ((PrivilegesVisitor<? extends T>)visitor).visitPrivileges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegesContext privileges() throws RecognitionException {
		PrivilegesContext _localctx = new PrivilegesContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_privileges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(T__0);
			setState(7);
			((PrivilegesContext)_localctx).privilege = privilege();
			((PrivilegesContext)_localctx).acls.add(((PrivilegesContext)_localctx).privilege);
			setState(12);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(8);
				match(COMMA);
				setState(9);
				((PrivilegesContext)_localctx).privilege = privilege();
				((PrivilegesContext)_localctx).acls.add(((PrivilegesContext)_localctx).privilege);
				}
				}
				setState(14);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(15);
			match(T__1);
			setState(16);
			match(EOF);
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

	public static class PrivilegeContext extends ParserRuleContext {
		public Token name;
		public Token priv;
		public Token grantor;
		public IdentifierContext qname;
		public IdentifierContext qgrantor;
		public TerminalNode Privileges() { return getToken(PrivilegesParser.Privileges, 0); }
		public List<TerminalNode> Identifier() { return getTokens(PrivilegesParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(PrivilegesParser.Identifier, i);
		}
		public List<TerminalNode> QUOTE_CHAR() { return getTokens(PrivilegesParser.QUOTE_CHAR); }
		public TerminalNode QUOTE_CHAR(int i) {
			return getToken(PrivilegesParser.QUOTE_CHAR, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public PrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilege; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrivilegesListener ) ((PrivilegesListener)listener).enterPrivilege(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrivilegesListener ) ((PrivilegesListener)listener).exitPrivilege(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrivilegesVisitor ) return ((PrivilegesVisitor<? extends T>)visitor).visitPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeContext privilege() throws RecognitionException {
		PrivilegeContext _localctx = new PrivilegeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_privilege);
		int _la;
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Privileges:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(18);
					((PrivilegeContext)_localctx).name = match(Identifier);
					}
				}

				setState(21);
				((PrivilegeContext)_localctx).priv = match(Privileges);
				setState(22);
				((PrivilegeContext)_localctx).grantor = match(Identifier);
				}
				break;
			case QUOTE_CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(23);
				match(QUOTE_CHAR);
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier || _la==QuotedIdentifier) {
					{
					setState(24);
					((PrivilegeContext)_localctx).qname = identifier();
					}
				}

				setState(27);
				((PrivilegeContext)_localctx).priv = match(Privileges);
				setState(28);
				((PrivilegeContext)_localctx).qgrantor = identifier();
				setState(29);
				match(QUOTE_CHAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(PrivilegesParser.Identifier, 0); }
		public TerminalNode QuotedIdentifier() { return getToken(PrivilegesParser.QuotedIdentifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PrivilegesListener ) ((PrivilegesListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PrivilegesListener ) ((PrivilegesListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PrivilegesVisitor ) return ((PrivilegesVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_la = _input.LA(1);
			if ( !(_la==Identifier || _la==QuotedIdentifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t&\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\3\2\3\2\3\2\3\2\7\2\r\n\2\f\2\16\2\20\13\2\3\2\3\2\3\2\3\3"+
		"\5\3\26\n\3\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\4\3"+
		"\4\3\4\2\2\5\2\4\6\2\3\3\2\b\t\2&\2\b\3\2\2\2\4!\3\2\2\2\6#\3\2\2\2\b"+
		"\t\7\3\2\2\t\16\5\4\3\2\n\13\7\5\2\2\13\r\5\4\3\2\f\n\3\2\2\2\r\20\3\2"+
		"\2\2\16\f\3\2\2\2\16\17\3\2\2\2\17\21\3\2\2\2\20\16\3\2\2\2\21\22\7\4"+
		"\2\2\22\23\7\2\2\3\23\3\3\2\2\2\24\26\7\b\2\2\25\24\3\2\2\2\25\26\3\2"+
		"\2\2\26\27\3\2\2\2\27\30\7\7\2\2\30\"\7\b\2\2\31\33\7\6\2\2\32\34\5\6"+
		"\4\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\7\7\2\2\36\37\5\6"+
		"\4\2\37 \7\6\2\2 \"\3\2\2\2!\25\3\2\2\2!\31\3\2\2\2\"\5\3\2\2\2#$\t\2"+
		"\2\2$\7\3\2\2\2\6\16\25\33!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}