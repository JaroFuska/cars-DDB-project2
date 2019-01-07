// Generated from sk\shanki\lp\grammar\ClingoOutGrammar.g4 by ANTLR 4.5.3
package sk.shanki.lp.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ClingoOutGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NL=7, SMALL_ID=8, NUMBER=9, 
		STRING=10, WS=11;
	public static final int
		RULE_out = 0, RULE_answer_sets = 1, RULE_answer_set = 2, RULE_sat = 3, 
		RULE_literal = 4, RULE_atom = 5, RULE_terms = 6, RULE_term = 7;
	public static final String[] ruleNames = {
		"out", "answer_sets", "answer_set", "sat", "literal", "atom", "terms", 
		"term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'SATISFIABLE'", "'UNSATISFIABLE'", "'-'", "'('", "')'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "NL", "SMALL_ID", "NUMBER", 
		"STRING", "WS"
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

	@Override
	public String getGrammarFileName() { return "ClingoOutGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClingoOutGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OutContext extends ParserRuleContext {
		public Answer_setsContext answer_sets() {
			return getRuleContext(Answer_setsContext.class,0);
		}
		public SatContext sat() {
			return getRuleContext(SatContext.class,0);
		}
		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).enterOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).exitOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClingoOutGrammarVisitor ) return ((ClingoOutGrammarVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_out);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			answer_sets();
			setState(17);
			sat();
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

	public static class Answer_setsContext extends ParserRuleContext {
		public List<Answer_setContext> answer_set() {
			return getRuleContexts(Answer_setContext.class);
		}
		public Answer_setContext answer_set(int i) {
			return getRuleContext(Answer_setContext.class,i);
		}
		public List<TerminalNode> NL() { return getTokens(ClingoOutGrammarParser.NL); }
		public TerminalNode NL(int i) {
			return getToken(ClingoOutGrammarParser.NL, i);
		}
		public Answer_setsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer_sets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).enterAnswer_sets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).exitAnswer_sets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClingoOutGrammarVisitor ) return ((ClingoOutGrammarVisitor<? extends T>)visitor).visitAnswer_sets(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Answer_setsContext answer_sets() throws RecognitionException {
		Answer_setsContext _localctx = new Answer_setsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_answer_sets);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << NL) | (1L << SMALL_ID))) != 0)) {
				{
				{
				setState(19);
				answer_set();
				setState(20);
				match(NL);
				}
				}
				setState(26);
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

	public static class Answer_setContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public Answer_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).enterAnswer_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).exitAnswer_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClingoOutGrammarVisitor ) return ((ClingoOutGrammarVisitor<? extends T>)visitor).visitAnswer_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Answer_setContext answer_set() throws RecognitionException {
		Answer_setContext _localctx = new Answer_setContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_answer_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2 || _la==SMALL_ID) {
				{
				{
				setState(27);
				literal();
				}
				}
				setState(32);
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

	public static class SatContext extends ParserRuleContext {
		public SatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sat; }
	 
		public SatContext() { }
		public void copyFrom(SatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Unsat_satContext extends SatContext {
		public TerminalNode NL() { return getToken(ClingoOutGrammarParser.NL, 0); }
		public Unsat_satContext(SatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).enterUnsat_sat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).exitUnsat_sat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClingoOutGrammarVisitor ) return ((ClingoOutGrammarVisitor<? extends T>)visitor).visitUnsat_sat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Sat_satContext extends SatContext {
		public TerminalNode NL() { return getToken(ClingoOutGrammarParser.NL, 0); }
		public Sat_satContext(SatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).enterSat_sat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).exitSat_sat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClingoOutGrammarVisitor ) return ((ClingoOutGrammarVisitor<? extends T>)visitor).visitSat_sat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SatContext sat() throws RecognitionException {
		SatContext _localctx = new SatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sat);
		try {
			setState(37);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new Sat_satContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				match(T__0);
				setState(34);
				match(NL);
				}
				break;
			case T__1:
				_localctx = new Unsat_satContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				match(T__1);
				setState(36);
				match(NL);
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

	public static class LiteralContext extends ParserRuleContext {
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	 
		public LiteralContext() { }
		public void copyFrom(LiteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Positive_literalContext extends LiteralContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Positive_literalContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).enterPositive_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).exitPositive_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClingoOutGrammarVisitor ) return ((ClingoOutGrammarVisitor<? extends T>)visitor).visitPositive_literal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Negative_literalContext extends LiteralContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public Negative_literalContext(LiteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).enterNegative_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).exitNegative_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClingoOutGrammarVisitor ) return ((ClingoOutGrammarVisitor<? extends T>)visitor).visitNegative_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_literal);
		try {
			setState(42);
			switch (_input.LA(1)) {
			case SMALL_ID:
				_localctx = new Positive_literalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				atom();
				}
				break;
			case T__2:
				_localctx = new Negative_literalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(40);
				match(T__2);
				setState(41);
				atom();
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

	public static class AtomContext extends ParserRuleContext {
		public Token predicateSymbol;
		public TerminalNode SMALL_ID() { return getToken(ClingoOutGrammarParser.SMALL_ID, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClingoOutGrammarVisitor ) return ((ClingoOutGrammarVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			((AtomContext)_localctx).predicateSymbol = match(SMALL_ID);
			setState(49);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(45);
				match(T__3);
				setState(46);
				terms();
				setState(47);
				match(T__4);
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

	public static class TermsContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public TermsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClingoOutGrammarVisitor ) return ((ClingoOutGrammarVisitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			term();
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(52);
				match(T__5);
				setState(53);
				term();
				}
				}
				setState(58);
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

	public static class TermContext extends ParserRuleContext {
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	 
		public TermContext() { }
		public void copyFrom(TermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class String_termContext extends TermContext {
		public TerminalNode STRING() { return getToken(ClingoOutGrammarParser.STRING, 0); }
		public String_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).enterString_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).exitString_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClingoOutGrammarVisitor ) return ((ClingoOutGrammarVisitor<? extends T>)visitor).visitString_term(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Functional_termContext extends TermContext {
		public Token functionSymbol;
		public TerminalNode SMALL_ID() { return getToken(ClingoOutGrammarParser.SMALL_ID, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Functional_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).enterFunctional_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).exitFunctional_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClingoOutGrammarVisitor ) return ((ClingoOutGrammarVisitor<? extends T>)visitor).visitFunctional_term(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Number_termContext extends TermContext {
		public TerminalNode NUMBER() { return getToken(ClingoOutGrammarParser.NUMBER, 0); }
		public Number_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).enterNumber_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ClingoOutGrammarListener ) ((ClingoOutGrammarListener)listener).exitNumber_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClingoOutGrammarVisitor ) return ((ClingoOutGrammarVisitor<? extends T>)visitor).visitNumber_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_term);
		int _la;
		try {
			setState(68);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new Number_termContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new String_termContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(STRING);
				}
				break;
			case SMALL_ID:
				_localctx = new Functional_termContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				((Functional_termContext)_localctx).functionSymbol = match(SMALL_ID);
				setState(66);
				_la = _input.LA(1);
				if (_la==T__3) {
					{
					setState(62);
					match(T__3);
					setState(63);
					terms();
					setState(64);
					match(T__4);
					}
				}

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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\rI\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\7\3\31\n\3\f\3\16\3\34\13\3\3\4\7\4\37\n\4\f\4\16\4\"\13\4\3\5\3"+
		"\5\3\5\3\5\5\5(\n\5\3\6\3\6\3\6\5\6-\n\6\3\7\3\7\3\7\3\7\3\7\5\7\64\n"+
		"\7\3\b\3\b\3\b\7\b9\n\b\f\b\16\b<\13\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"E\n\t\5\tG\n\t\3\t\2\2\n\2\4\6\b\n\f\16\20\2\2I\2\22\3\2\2\2\4\32\3\2"+
		"\2\2\6 \3\2\2\2\b\'\3\2\2\2\n,\3\2\2\2\f.\3\2\2\2\16\65\3\2\2\2\20F\3"+
		"\2\2\2\22\23\5\4\3\2\23\24\5\b\5\2\24\3\3\2\2\2\25\26\5\6\4\2\26\27\7"+
		"\t\2\2\27\31\3\2\2\2\30\25\3\2\2\2\31\34\3\2\2\2\32\30\3\2\2\2\32\33\3"+
		"\2\2\2\33\5\3\2\2\2\34\32\3\2\2\2\35\37\5\n\6\2\36\35\3\2\2\2\37\"\3\2"+
		"\2\2 \36\3\2\2\2 !\3\2\2\2!\7\3\2\2\2\" \3\2\2\2#$\7\3\2\2$(\7\t\2\2%"+
		"&\7\4\2\2&(\7\t\2\2\'#\3\2\2\2\'%\3\2\2\2(\t\3\2\2\2)-\5\f\7\2*+\7\5\2"+
		"\2+-\5\f\7\2,)\3\2\2\2,*\3\2\2\2-\13\3\2\2\2.\63\7\n\2\2/\60\7\6\2\2\60"+
		"\61\5\16\b\2\61\62\7\7\2\2\62\64\3\2\2\2\63/\3\2\2\2\63\64\3\2\2\2\64"+
		"\r\3\2\2\2\65:\5\20\t\2\66\67\7\b\2\2\679\5\20\t\28\66\3\2\2\29<\3\2\2"+
		"\2:8\3\2\2\2:;\3\2\2\2;\17\3\2\2\2<:\3\2\2\2=G\7\13\2\2>G\7\f\2\2?D\7"+
		"\n\2\2@A\7\6\2\2AB\5\16\b\2BC\7\7\2\2CE\3\2\2\2D@\3\2\2\2DE\3\2\2\2EG"+
		"\3\2\2\2F=\3\2\2\2F>\3\2\2\2F?\3\2\2\2G\21\3\2\2\2\n\32 \',\63:DF";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}