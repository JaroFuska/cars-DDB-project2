// Generated from sk\shanki\lp\grammar\DlvOutGrammar.g4 by ANTLR 4.5.3
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
public class DlvOutGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, HEADER=11, SMALL_ID=12, NUMBER=13, STRING=14, WS=15;
	public static final int
		RULE_out = 0, RULE_answer_sets = 1, RULE_as = 2, RULE_optimal_answer_set = 3, 
		RULE_answer_set = 4, RULE_cost = 5, RULE_literal = 6, RULE_atom = 7, RULE_terms = 8, 
		RULE_term = 9;
	public static final String[] ruleNames = {
		"out", "answer_sets", "as", "optimal_answer_set", "answer_set", "cost", 
		"literal", "atom", "terms", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "','", "'}'", "'Cost ([Weight:Level]):'", "'<['", "':'", 
		"']>'", "'-'", "'('", "')'", "'Best model:'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "HEADER", 
		"SMALL_ID", "NUMBER", "STRING", "WS"
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
	public String getGrammarFileName() { return "DlvOutGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DlvOutGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class OutContext extends ParserRuleContext {
		public Answer_setsContext answer_sets() {
			return getRuleContext(Answer_setsContext.class,0);
		}
		public OutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_out; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).enterOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).exitOut(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DlvOutGrammarVisitor ) return ((DlvOutGrammarVisitor<? extends T>)visitor).visitOut(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutContext out() throws RecognitionException {
		OutContext _localctx = new OutContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_out);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			answer_sets();
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
		public List<AsContext> as() {
			return getRuleContexts(AsContext.class);
		}
		public AsContext as(int i) {
			return getRuleContext(AsContext.class,i);
		}
		public Answer_setsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_answer_sets; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).enterAnswer_sets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).exitAnswer_sets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DlvOutGrammarVisitor ) return ((DlvOutGrammarVisitor<? extends T>)visitor).visitAnswer_sets(this);
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
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==HEADER) {
				{
				{
				setState(22);
				as();
				}
				}
				setState(27);
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

	public static class AsContext extends ParserRuleContext {
		public AsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_as; }
	 
		public AsContext() { }
		public void copyFrom(AsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Optimal_asContext extends AsContext {
		public Optimal_answer_setContext optimal_answer_set() {
			return getRuleContext(Optimal_answer_setContext.class,0);
		}
		public Optimal_asContext(AsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).enterOptimal_as(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).exitOptimal_as(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DlvOutGrammarVisitor ) return ((DlvOutGrammarVisitor<? extends T>)visitor).visitOptimal_as(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Classical_asContext extends AsContext {
		public Answer_setContext answer_set() {
			return getRuleContext(Answer_setContext.class,0);
		}
		public Classical_asContext(AsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).enterClassical_as(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).exitClassical_as(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DlvOutGrammarVisitor ) return ((DlvOutGrammarVisitor<? extends T>)visitor).visitClassical_as(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsContext as() throws RecognitionException {
		AsContext _localctx = new AsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_as);
		try {
			setState(30);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new Classical_asContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				answer_set();
				}
				break;
			case HEADER:
				_localctx = new Optimal_asContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				optimal_answer_set();
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

	public static class Optimal_answer_setContext extends ParserRuleContext {
		public TerminalNode HEADER() { return getToken(DlvOutGrammarParser.HEADER, 0); }
		public Answer_setContext answer_set() {
			return getRuleContext(Answer_setContext.class,0);
		}
		public CostContext cost() {
			return getRuleContext(CostContext.class,0);
		}
		public Optimal_answer_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optimal_answer_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).enterOptimal_answer_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).exitOptimal_answer_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DlvOutGrammarVisitor ) return ((DlvOutGrammarVisitor<? extends T>)visitor).visitOptimal_answer_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Optimal_answer_setContext optimal_answer_set() throws RecognitionException {
		Optimal_answer_setContext _localctx = new Optimal_answer_setContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_optimal_answer_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(HEADER);
			setState(33);
			answer_set();
			setState(34);
			cost();
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
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).enterAnswer_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).exitAnswer_set(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DlvOutGrammarVisitor ) return ((DlvOutGrammarVisitor<? extends T>)visitor).visitAnswer_set(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Answer_setContext answer_set() throws RecognitionException {
		Answer_setContext _localctx = new Answer_setContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_answer_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			match(T__0);
			setState(45);
			_la = _input.LA(1);
			if (_la==T__7 || _la==SMALL_ID) {
				{
				setState(37);
				literal();
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(38);
					match(T__1);
					setState(39);
					literal();
					}
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(47);
			match(T__2);
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

	public static class CostContext extends ParserRuleContext {
		public List<TerminalNode> NUMBER() { return getTokens(DlvOutGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(DlvOutGrammarParser.NUMBER, i);
		}
		public CostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cost; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).enterCost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).exitCost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DlvOutGrammarVisitor ) return ((DlvOutGrammarVisitor<? extends T>)visitor).visitCost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CostContext cost() throws RecognitionException {
		CostContext _localctx = new CostContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cost);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(T__3);
			setState(50);
			match(T__4);
			setState(51);
			match(NUMBER);
			setState(52);
			match(T__5);
			setState(53);
			match(NUMBER);
			setState(54);
			match(T__6);
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
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).enterPositive_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).exitPositive_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DlvOutGrammarVisitor ) return ((DlvOutGrammarVisitor<? extends T>)visitor).visitPositive_literal(this);
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
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).enterNegative_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).exitNegative_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DlvOutGrammarVisitor ) return ((DlvOutGrammarVisitor<? extends T>)visitor).visitNegative_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_literal);
		try {
			setState(59);
			switch (_input.LA(1)) {
			case SMALL_ID:
				_localctx = new Positive_literalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				atom();
				}
				break;
			case T__7:
				_localctx = new Negative_literalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(T__7);
				setState(58);
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
		public TerminalNode SMALL_ID() { return getToken(DlvOutGrammarParser.SMALL_ID, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DlvOutGrammarVisitor ) return ((DlvOutGrammarVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			((AtomContext)_localctx).predicateSymbol = match(SMALL_ID);
			setState(66);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(62);
				match(T__8);
				setState(63);
				terms();
				setState(64);
				match(T__9);
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
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DlvOutGrammarVisitor ) return ((DlvOutGrammarVisitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			term();
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(69);
				match(T__1);
				setState(70);
				term();
				}
				}
				setState(75);
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
		public TerminalNode STRING() { return getToken(DlvOutGrammarParser.STRING, 0); }
		public String_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).enterString_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).exitString_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DlvOutGrammarVisitor ) return ((DlvOutGrammarVisitor<? extends T>)visitor).visitString_term(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Functional_termContext extends TermContext {
		public Token functionSymbol;
		public TerminalNode SMALL_ID() { return getToken(DlvOutGrammarParser.SMALL_ID, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Functional_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).enterFunctional_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).exitFunctional_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DlvOutGrammarVisitor ) return ((DlvOutGrammarVisitor<? extends T>)visitor).visitFunctional_term(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Number_termContext extends TermContext {
		public TerminalNode NUMBER() { return getToken(DlvOutGrammarParser.NUMBER, 0); }
		public Number_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).enterNumber_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DlvOutGrammarListener ) ((DlvOutGrammarListener)listener).exitNumber_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DlvOutGrammarVisitor ) return ((DlvOutGrammarVisitor<? extends T>)visitor).visitNumber_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_term);
		int _la;
		try {
			setState(85);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new Number_termContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new String_termContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				match(STRING);
				}
				break;
			case SMALL_ID:
				_localctx = new Functional_termContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				((Functional_termContext)_localctx).functionSymbol = match(SMALL_ID);
				setState(83);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(79);
					match(T__8);
					setState(80);
					terms();
					setState(81);
					match(T__9);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21Z\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\3\7\3\32\n\3\f\3\16\3\35\13\3\3\4\3\4\5\4!\n\4\3\5\3\5\3\5\3"+
		"\5\3\6\3\6\3\6\3\6\7\6+\n\6\f\6\16\6.\13\6\5\6\60\n\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b>\n\b\3\t\3\t\3\t\3\t\3\t\5\tE\n\t"+
		"\3\n\3\n\3\n\7\nJ\n\n\f\n\16\nM\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\5\13V\n\13\5\13X\n\13\3\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2Y\2\26\3"+
		"\2\2\2\4\33\3\2\2\2\6 \3\2\2\2\b\"\3\2\2\2\n&\3\2\2\2\f\63\3\2\2\2\16"+
		"=\3\2\2\2\20?\3\2\2\2\22F\3\2\2\2\24W\3\2\2\2\26\27\5\4\3\2\27\3\3\2\2"+
		"\2\30\32\5\6\4\2\31\30\3\2\2\2\32\35\3\2\2\2\33\31\3\2\2\2\33\34\3\2\2"+
		"\2\34\5\3\2\2\2\35\33\3\2\2\2\36!\5\n\6\2\37!\5\b\5\2 \36\3\2\2\2 \37"+
		"\3\2\2\2!\7\3\2\2\2\"#\7\r\2\2#$\5\n\6\2$%\5\f\7\2%\t\3\2\2\2&/\7\3\2"+
		"\2\',\5\16\b\2()\7\4\2\2)+\5\16\b\2*(\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3"+
		"\2\2\2-\60\3\2\2\2.,\3\2\2\2/\'\3\2\2\2/\60\3\2\2\2\60\61\3\2\2\2\61\62"+
		"\7\5\2\2\62\13\3\2\2\2\63\64\7\6\2\2\64\65\7\7\2\2\65\66\7\17\2\2\66\67"+
		"\7\b\2\2\678\7\17\2\289\7\t\2\29\r\3\2\2\2:>\5\20\t\2;<\7\n\2\2<>\5\20"+
		"\t\2=:\3\2\2\2=;\3\2\2\2>\17\3\2\2\2?D\7\16\2\2@A\7\13\2\2AB\5\22\n\2"+
		"BC\7\f\2\2CE\3\2\2\2D@\3\2\2\2DE\3\2\2\2E\21\3\2\2\2FK\5\24\13\2GH\7\4"+
		"\2\2HJ\5\24\13\2IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2L\23\3\2\2\2M"+
		"K\3\2\2\2NX\7\17\2\2OX\7\20\2\2PU\7\16\2\2QR\7\13\2\2RS\5\22\n\2ST\7\f"+
		"\2\2TV\3\2\2\2UQ\3\2\2\2UV\3\2\2\2VX\3\2\2\2WN\3\2\2\2WO\3\2\2\2WP\3\2"+
		"\2\2X\25\3\2\2\2\13\33 ,/=DKUW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}