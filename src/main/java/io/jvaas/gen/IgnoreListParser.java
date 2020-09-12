// Generated from /home/vlad/Code/jvaas-platform/jvaas-postgresql/src/main/resources/antlr/IgnoreList.g4 by ANTLR 4.8
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
public class IgnoreListParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		HIDE=1, SHOW=2, ALL=3, CONTENT=4, QUALIFIED=5, REGEX=6, NONE=7, DB=8, 
		TYPE=9, Identifier=10, SQstring=11, DQstring=12, COMMA=13, NewLine=14, 
		COMMENT=15, WS=16, BAD=17;
	public static final int
		RULE_compileUnit = 0, RULE_rule_list = 1, RULE_white = 2, RULE_black = 3, 
		RULE_hide_rule = 4, RULE_show_rule = 5, RULE_rule_rest = 6, RULE_flags = 7, 
		RULE_flag = 8, RULE_identifier = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"compileUnit", "rule_list", "white", "black", "hide_rule", "show_rule", 
			"rule_rest", "flags", "flag", "identifier"
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

	@Override
	public String getGrammarFileName() { return "IgnoreList.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public IgnoreListParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompileUnitContext extends ParserRuleContext {
		public Rule_listContext rule_list() {
			return getRuleContext(Rule_listContext.class,0);
		}
		public TerminalNode EOF() { return getToken(IgnoreListParser.EOF, 0); }
		public List<TerminalNode> NewLine() { return getTokens(IgnoreListParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(IgnoreListParser.NewLine, i);
		}
		public CompileUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compileUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).enterCompileUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).exitCompileUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IgnoreListVisitor ) return ((IgnoreListVisitor<? extends T>)visitor).visitCompileUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompileUnitContext compileUnit() throws RecognitionException {
		CompileUnitContext _localctx = new CompileUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compileUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(20);
				match(NewLine);
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			rule_list();
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NewLine) {
				{
				{
				setState(27);
				match(NewLine);
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
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

	public static class Rule_listContext extends ParserRuleContext {
		public WhiteContext white() {
			return getRuleContext(WhiteContext.class,0);
		}
		public BlackContext black() {
			return getRuleContext(BlackContext.class,0);
		}
		public Rule_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).enterRule_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).exitRule_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IgnoreListVisitor ) return ((IgnoreListVisitor<? extends T>)visitor).visitRule_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_listContext rule_list() throws RecognitionException {
		Rule_listContext _localctx = new Rule_listContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_rule_list);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HIDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				white();
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				black();
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

	public static class WhiteContext extends ParserRuleContext {
		public TerminalNode HIDE() { return getToken(IgnoreListParser.HIDE, 0); }
		public TerminalNode ALL() { return getToken(IgnoreListParser.ALL, 0); }
		public List<Show_ruleContext> show_rule() {
			return getRuleContexts(Show_ruleContext.class);
		}
		public Show_ruleContext show_rule(int i) {
			return getRuleContext(Show_ruleContext.class,i);
		}
		public List<TerminalNode> NewLine() { return getTokens(IgnoreListParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(IgnoreListParser.NewLine, i);
		}
		public WhiteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_white; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).enterWhite(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).exitWhite(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IgnoreListVisitor ) return ((IgnoreListVisitor<? extends T>)visitor).visitWhite(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhiteContext white() throws RecognitionException {
		WhiteContext _localctx = new WhiteContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_white);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(HIDE);
			setState(40);
			match(ALL);
			setState(49);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(42); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(41);
						match(NewLine);
						}
						}
						setState(44); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NewLine );
					setState(46);
					show_rule();
					}
					} 
				}
				setState(51);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class BlackContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(IgnoreListParser.SHOW, 0); }
		public TerminalNode ALL() { return getToken(IgnoreListParser.ALL, 0); }
		public List<Hide_ruleContext> hide_rule() {
			return getRuleContexts(Hide_ruleContext.class);
		}
		public Hide_ruleContext hide_rule(int i) {
			return getRuleContext(Hide_ruleContext.class,i);
		}
		public List<TerminalNode> NewLine() { return getTokens(IgnoreListParser.NewLine); }
		public TerminalNode NewLine(int i) {
			return getToken(IgnoreListParser.NewLine, i);
		}
		public BlackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_black; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).enterBlack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).exitBlack(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IgnoreListVisitor ) return ((IgnoreListVisitor<? extends T>)visitor).visitBlack(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlackContext black() throws RecognitionException {
		BlackContext _localctx = new BlackContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_black);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(SHOW);
			setState(53);
			match(ALL);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(55); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(54);
						match(NewLine);
						}
						}
						setState(57); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==NewLine );
					setState(59);
					hide_rule();
					}
					} 
				}
				setState(64);
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
			exitRule();
		}
		return _localctx;
	}

	public static class Hide_ruleContext extends ParserRuleContext {
		public TerminalNode HIDE() { return getToken(IgnoreListParser.HIDE, 0); }
		public Rule_restContext rule_rest() {
			return getRuleContext(Rule_restContext.class,0);
		}
		public Hide_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hide_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).enterHide_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).exitHide_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IgnoreListVisitor ) return ((IgnoreListVisitor<? extends T>)visitor).visitHide_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hide_ruleContext hide_rule() throws RecognitionException {
		Hide_ruleContext _localctx = new Hide_ruleContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_hide_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(HIDE);
			setState(66);
			rule_rest();
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

	public static class Show_ruleContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(IgnoreListParser.SHOW, 0); }
		public Rule_restContext rule_rest() {
			return getRuleContext(Rule_restContext.class,0);
		}
		public Show_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_show_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).enterShow_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).exitShow_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IgnoreListVisitor ) return ((IgnoreListVisitor<? extends T>)visitor).visitShow_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Show_ruleContext show_rule() throws RecognitionException {
		Show_ruleContext _localctx = new Show_ruleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_show_rule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(SHOW);
			setState(69);
			rule_rest();
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

	public static class Rule_restContext extends ParserRuleContext {
		public IdentifierContext obj;
		public IdentifierContext db;
		public IdentifierContext identifier;
		public List<IdentifierContext> type = new ArrayList<IdentifierContext>();
		public FlagsContext flags() {
			return getRuleContext(FlagsContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DB() { return getToken(IgnoreListParser.DB, 0); }
		public TerminalNode TYPE() { return getToken(IgnoreListParser.TYPE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(IgnoreListParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IgnoreListParser.COMMA, i);
		}
		public Rule_restContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rule_rest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).enterRule_rest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).exitRule_rest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IgnoreListVisitor ) return ((IgnoreListVisitor<? extends T>)visitor).visitRule_rest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Rule_restContext rule_rest() throws RecognitionException {
		Rule_restContext _localctx = new Rule_restContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_rule_rest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			flags();
			setState(72);
			((Rule_restContext)_localctx).obj = identifier();
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DB) {
				{
				setState(73);
				match(DB);
				setState(74);
				((Rule_restContext)_localctx).db = identifier();
				}
			}

			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(77);
				match(TYPE);
				setState(78);
				((Rule_restContext)_localctx).identifier = identifier();
				((Rule_restContext)_localctx).type.add(((Rule_restContext)_localctx).identifier);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(79);
					match(COMMA);
					setState(80);
					((Rule_restContext)_localctx).identifier = identifier();
					((Rule_restContext)_localctx).type.add(((Rule_restContext)_localctx).identifier);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
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

	public static class FlagsContext extends ParserRuleContext {
		public List<FlagContext> flag() {
			return getRuleContexts(FlagContext.class);
		}
		public FlagContext flag(int i) {
			return getRuleContext(FlagContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(IgnoreListParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(IgnoreListParser.COMMA, i);
		}
		public FlagsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flags; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).enterFlags(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).exitFlags(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IgnoreListVisitor ) return ((IgnoreListVisitor<? extends T>)visitor).visitFlags(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlagsContext flags() throws RecognitionException {
		FlagsContext _localctx = new FlagsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_flags);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			flag();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(89);
				match(COMMA);
				setState(90);
				flag();
				}
				}
				setState(95);
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

	public static class FlagContext extends ParserRuleContext {
		public TerminalNode CONTENT() { return getToken(IgnoreListParser.CONTENT, 0); }
		public TerminalNode REGEX() { return getToken(IgnoreListParser.REGEX, 0); }
		public TerminalNode NONE() { return getToken(IgnoreListParser.NONE, 0); }
		public TerminalNode QUALIFIED() { return getToken(IgnoreListParser.QUALIFIED, 0); }
		public FlagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).enterFlag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).exitFlag(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IgnoreListVisitor ) return ((IgnoreListVisitor<? extends T>)visitor).visitFlag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FlagContext flag() throws RecognitionException {
		FlagContext _localctx = new FlagContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_flag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CONTENT) | (1L << QUALIFIED) | (1L << REGEX) | (1L << NONE))) != 0)) ) {
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(IgnoreListParser.Identifier, 0); }
		public TerminalNode SQstring() { return getToken(IgnoreListParser.SQstring, 0); }
		public TerminalNode DQstring() { return getToken(IgnoreListParser.DQstring, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof IgnoreListListener ) ((IgnoreListListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof IgnoreListVisitor ) return ((IgnoreListVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_identifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Identifier) | (1L << SQstring) | (1L << DQstring))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\23g\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\7\2\30\n\2\f\2\16\2\33\13\2\3\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2"+
		"\3\2\3\3\3\3\5\3(\n\3\3\4\3\4\3\4\6\4-\n\4\r\4\16\4.\3\4\7\4\62\n\4\f"+
		"\4\16\4\65\13\4\3\5\3\5\3\5\6\5:\n\5\r\5\16\5;\3\5\7\5?\n\5\f\5\16\5B"+
		"\13\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\bN\n\b\3\b\3\b\3\b\3\b"+
		"\7\bT\n\b\f\b\16\bW\13\b\5\bY\n\b\3\t\3\t\3\t\7\t^\n\t\f\t\16\ta\13\t"+
		"\3\n\3\n\3\13\3\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\4\3\2\6\t\3\2"+
		"\f\16\2g\2\31\3\2\2\2\4\'\3\2\2\2\6)\3\2\2\2\b\66\3\2\2\2\nC\3\2\2\2\f"+
		"F\3\2\2\2\16I\3\2\2\2\20Z\3\2\2\2\22b\3\2\2\2\24d\3\2\2\2\26\30\7\20\2"+
		"\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2"+
		"\2\33\31\3\2\2\2\34 \5\4\3\2\35\37\7\20\2\2\36\35\3\2\2\2\37\"\3\2\2\2"+
		" \36\3\2\2\2 !\3\2\2\2!#\3\2\2\2\" \3\2\2\2#$\7\2\2\3$\3\3\2\2\2%(\5\6"+
		"\4\2&(\5\b\5\2\'%\3\2\2\2\'&\3\2\2\2(\5\3\2\2\2)*\7\3\2\2*\63\7\5\2\2"+
		"+-\7\20\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\62"+
		"\5\f\7\2\61,\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\7\3"+
		"\2\2\2\65\63\3\2\2\2\66\67\7\4\2\2\67@\7\5\2\28:\7\20\2\298\3\2\2\2:;"+
		"\3\2\2\2;9\3\2\2\2;<\3\2\2\2<=\3\2\2\2=?\5\n\6\2>9\3\2\2\2?B\3\2\2\2@"+
		">\3\2\2\2@A\3\2\2\2A\t\3\2\2\2B@\3\2\2\2CD\7\3\2\2DE\5\16\b\2E\13\3\2"+
		"\2\2FG\7\4\2\2GH\5\16\b\2H\r\3\2\2\2IJ\5\20\t\2JM\5\24\13\2KL\7\n\2\2"+
		"LN\5\24\13\2MK\3\2\2\2MN\3\2\2\2NX\3\2\2\2OP\7\13\2\2PU\5\24\13\2QR\7"+
		"\17\2\2RT\5\24\13\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VY\3\2\2\2"+
		"WU\3\2\2\2XO\3\2\2\2XY\3\2\2\2Y\17\3\2\2\2Z_\5\22\n\2[\\\7\17\2\2\\^\5"+
		"\22\n\2][\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\21\3\2\2\2a_\3\2\2\2"+
		"bc\t\2\2\2c\23\3\2\2\2de\t\3\2\2e\25\3\2\2\2\r\31 \'.\63;@MUX_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}