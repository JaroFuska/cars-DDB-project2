// Generated from sk\shanki\lp\grammar\LpGrammar.g4 by ANTLR 4.5.3
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
public class LpGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, SMALL_ID=16, 
		BIG_ID=17, NUMBER=18, COMMENT=19, MULTILINE_COMMENT=20, WS=21, STRING=22;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_preference = 2, RULE_lprule = 3, 
		RULE_constraint = 4, RULE_weak_constraint = 5, RULE_nameannotation = 6, 
		RULE_partialannotation = 7, RULE_head = 8, RULE_body = 9, RULE_nafliteral = 10, 
		RULE_literal = 11, RULE_atom = 12, RULE_terms = 13, RULE_term = 14;
	public static final String[] ruleNames = {
		"program", "statement", "preference", "lprule", "constraint", "weak_constraint", 
		"nameannotation", "partialannotation", "head", "body", "nafliteral", "literal", 
		"atom", "terms", "term"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'<'", "'.'", "':-'", "':~'", "'['", "'@'", "','", "']'", "'@name('", 
		"')'", "'@partial'", "'v'", "'not'", "'-'", "'('"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "SMALL_ID", "BIG_ID", "NUMBER", "COMMENT", "MULTILINE_COMMENT", 
		"WS", "STRING"
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
	public String getGrammarFileName() { return "LpGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LpGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__8) | (1L << T__10) | (1L << T__12) | (1L << T__13) | (1L << SMALL_ID))) != 0)) {
				{
				{
				setState(30);
				statement();
				}
				}
				setState(35);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Preference_statementContext extends StatementContext {
		public PreferenceContext preference() {
			return getRuleContext(PreferenceContext.class,0);
		}
		public Preference_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterPreference_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitPreference_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitPreference_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Rule_statementContext extends StatementContext {
		public LpruleContext lprule() {
			return getRuleContext(LpruleContext.class,0);
		}
		public Rule_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterRule_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitRule_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitRule_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Constraint_statementContext extends StatementContext {
		public ConstraintContext constraint() {
			return getRuleContext(ConstraintContext.class,0);
		}
		public Constraint_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterConstraint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitConstraint_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitConstraint_statement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Weak_constraint_statementContext extends StatementContext {
		public Weak_constraintContext weak_constraint() {
			return getRuleContext(Weak_constraintContext.class,0);
		}
		public Weak_constraint_statementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterWeak_constraint_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitWeak_constraint_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitWeak_constraint_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(40);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new Rule_statementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				lprule();
				}
				break;
			case 2:
				_localctx = new Constraint_statementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				constraint();
				}
				break;
			case 3:
				_localctx = new Weak_constraint_statementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				weak_constraint();
				}
				break;
			case 4:
				_localctx = new Preference_statementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(39);
				preference();
				}
				break;
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

	public static class PreferenceContext extends ParserRuleContext {
		public Token r1;
		public Token r2;
		public List<TerminalNode> SMALL_ID() { return getTokens(LpGrammarParser.SMALL_ID); }
		public TerminalNode SMALL_ID(int i) {
			return getToken(LpGrammarParser.SMALL_ID, i);
		}
		public PreferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_preference; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterPreference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitPreference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitPreference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PreferenceContext preference() throws RecognitionException {
		PreferenceContext _localctx = new PreferenceContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_preference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			((PreferenceContext)_localctx).r1 = match(SMALL_ID);
			setState(43);
			match(T__0);
			setState(44);
			((PreferenceContext)_localctx).r2 = match(SMALL_ID);
			setState(45);
			match(T__1);
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

	public static class LpruleContext extends ParserRuleContext {
		public HeadContext head() {
			return getRuleContext(HeadContext.class,0);
		}
		public NameannotationContext nameannotation() {
			return getRuleContext(NameannotationContext.class,0);
		}
		public PartialannotationContext partialannotation() {
			return getRuleContext(PartialannotationContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public LpruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lprule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterLprule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitLprule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitLprule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LpruleContext lprule() throws RecognitionException {
		LpruleContext _localctx = new LpruleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_lprule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(47);
				nameannotation();
				}
			}

			setState(51);
			_la = _input.LA(1);
			if (_la==T__10) {
				{
				setState(50);
				partialannotation();
				}
			}

			setState(53);
			head();
			setState(56);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(54);
				match(T__2);
				setState(55);
				body();
				}
			}

			setState(58);
			match(T__1);
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

	public static class ConstraintContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ConstraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterConstraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitConstraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitConstraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintContext constraint() throws RecognitionException {
		ConstraintContext _localctx = new ConstraintContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__2);
			setState(62);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << SMALL_ID))) != 0)) {
				{
				setState(61);
				body();
				}
			}

			setState(64);
			match(T__1);
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

	public static class Weak_constraintContext extends ParserRuleContext {
		public Token weight;
		public Token level;
		public List<TerminalNode> NUMBER() { return getTokens(LpGrammarParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(LpGrammarParser.NUMBER, i);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Weak_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weak_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterWeak_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitWeak_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitWeak_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Weak_constraintContext weak_constraint() throws RecognitionException {
		Weak_constraintContext _localctx = new Weak_constraintContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_weak_constraint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(T__3);
			setState(68);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << SMALL_ID))) != 0)) {
				{
				setState(67);
				body();
				}
			}

			setState(70);
			match(T__1);
			setState(71);
			match(T__4);
			setState(72);
			((Weak_constraintContext)_localctx).weight = match(NUMBER);
			setState(73);
			match(T__5);
			setState(74);
			((Weak_constraintContext)_localctx).level = match(NUMBER);
			setState(77);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(75);
				match(T__6);
				setState(76);
				terms();
				}
			}

			setState(79);
			match(T__7);
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

	public static class NameannotationContext extends ParserRuleContext {
		public Token name;
		public TerminalNode SMALL_ID() { return getToken(LpGrammarParser.SMALL_ID, 0); }
		public NameannotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameannotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterNameannotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitNameannotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitNameannotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameannotationContext nameannotation() throws RecognitionException {
		NameannotationContext _localctx = new NameannotationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_nameannotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__8);
			setState(82);
			((NameannotationContext)_localctx).name = match(SMALL_ID);
			setState(83);
			match(T__9);
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

	public static class PartialannotationContext extends ParserRuleContext {
		public PartialannotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partialannotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterPartialannotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitPartialannotation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitPartialannotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartialannotationContext partialannotation() throws RecognitionException {
		PartialannotationContext _localctx = new PartialannotationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_partialannotation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(T__10);
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

	public static class HeadContext extends ParserRuleContext {
		public List<NafliteralContext> nafliteral() {
			return getRuleContexts(NafliteralContext.class);
		}
		public NafliteralContext nafliteral(int i) {
			return getRuleContext(NafliteralContext.class,i);
		}
		public HeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_head; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitHead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitHead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HeadContext head() throws RecognitionException {
		HeadContext _localctx = new HeadContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_head);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			nafliteral();
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(88);
				match(T__11);
				setState(89);
				nafliteral();
				}
				}
				setState(94);
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

	public static class BodyContext extends ParserRuleContext {
		public List<NafliteralContext> nafliteral() {
			return getRuleContexts(NafliteralContext.class);
		}
		public NafliteralContext nafliteral(int i) {
			return getRuleContext(NafliteralContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			nafliteral();
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(96);
				match(T__6);
				setState(97);
				nafliteral();
				}
				}
				setState(102);
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

	public static class NafliteralContext extends ParserRuleContext {
		public NafliteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nafliteral; }
	 
		public NafliteralContext() { }
		public void copyFrom(NafliteralContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Positive_nafliteralContext extends NafliteralContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Positive_nafliteralContext(NafliteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterPositive_nafliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitPositive_nafliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitPositive_nafliteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Negative_nafliteralContext extends NafliteralContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public Negative_nafliteralContext(NafliteralContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterNegative_nafliteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitNegative_nafliteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitNegative_nafliteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NafliteralContext nafliteral() throws RecognitionException {
		NafliteralContext _localctx = new NafliteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nafliteral);
		try {
			setState(106);
			switch (_input.LA(1)) {
			case T__13:
			case SMALL_ID:
				_localctx = new Positive_nafliteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				literal();
				}
				break;
			case T__12:
				_localctx = new Negative_nafliteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(T__12);
				setState(105);
				literal();
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
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterPositive_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitPositive_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitPositive_literal(this);
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
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterNegative_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitNegative_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitNegative_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_literal);
		try {
			setState(111);
			switch (_input.LA(1)) {
			case SMALL_ID:
				_localctx = new Positive_literalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				atom();
				}
				break;
			case T__13:
				_localctx = new Negative_literalContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				match(T__13);
				setState(110);
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
		public TerminalNode SMALL_ID() { return getToken(LpGrammarParser.SMALL_ID, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((AtomContext)_localctx).predicateSymbol = match(SMALL_ID);
			setState(118);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(114);
				match(T__14);
				setState(115);
				terms();
				setState(116);
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
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterTerms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitTerms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitTerms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermsContext terms() throws RecognitionException {
		TermsContext _localctx = new TermsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_terms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			term();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(121);
				match(T__6);
				setState(122);
				term();
				}
				}
				setState(127);
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
		public TerminalNode STRING() { return getToken(LpGrammarParser.STRING, 0); }
		public String_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterString_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitString_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitString_term(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Variable_termContext extends TermContext {
		public Token variable;
		public TerminalNode BIG_ID() { return getToken(LpGrammarParser.BIG_ID, 0); }
		public Variable_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterVariable_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitVariable_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitVariable_term(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Functional_termContext extends TermContext {
		public Token functionSymbol;
		public TerminalNode SMALL_ID() { return getToken(LpGrammarParser.SMALL_ID, 0); }
		public TermsContext terms() {
			return getRuleContext(TermsContext.class,0);
		}
		public Functional_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterFunctional_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitFunctional_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitFunctional_term(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Number_termContext extends TermContext {
		public TerminalNode NUMBER() { return getToken(LpGrammarParser.NUMBER, 0); }
		public Number_termContext(TermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).enterNumber_term(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LpGrammarListener ) ((LpGrammarListener)listener).exitNumber_term(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LpGrammarVisitor ) return ((LpGrammarVisitor<? extends T>)visitor).visitNumber_term(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_term);
		int _la;
		try {
			setState(138);
			switch (_input.LA(1)) {
			case NUMBER:
				_localctx = new Number_termContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(NUMBER);
				}
				break;
			case STRING:
				_localctx = new String_termContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(129);
				match(STRING);
				}
				break;
			case BIG_ID:
				_localctx = new Variable_termContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				((Variable_termContext)_localctx).variable = match(BIG_ID);
				}
				break;
			case SMALL_ID:
				_localctx = new Functional_termContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(131);
				((Functional_termContext)_localctx).functionSymbol = match(SMALL_ID);
				setState(136);
				_la = _input.LA(1);
				if (_la==T__14) {
					{
					setState(132);
					match(T__14);
					setState(133);
					terms();
					setState(134);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\30\u008f\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\3\3\3\3\3\3\3\5\3+\n\3\3\4\3\4\3\4\3\4\3\4\3\5\5\5\63\n"+
		"\5\3\5\5\5\66\n\5\3\5\3\5\3\5\5\5;\n\5\3\5\3\5\3\6\3\6\5\6A\n\6\3\6\3"+
		"\6\3\7\3\7\5\7G\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7P\n\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\7\n]\n\n\f\n\16\n`\13\n\3\13\3\13\3\13"+
		"\7\13e\n\13\f\13\16\13h\13\13\3\f\3\f\3\f\5\fm\n\f\3\r\3\r\3\r\5\rr\n"+
		"\r\3\16\3\16\3\16\3\16\3\16\5\16y\n\16\3\17\3\17\3\17\7\17~\n\17\f\17"+
		"\16\17\u0081\13\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u008b"+
		"\n\20\5\20\u008d\n\20\3\20\2\2\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36\2\2\u0093\2#\3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b\62\3\2\2\2\n>\3\2\2\2"+
		"\fD\3\2\2\2\16S\3\2\2\2\20W\3\2\2\2\22Y\3\2\2\2\24a\3\2\2\2\26l\3\2\2"+
		"\2\30q\3\2\2\2\32s\3\2\2\2\34z\3\2\2\2\36\u008c\3\2\2\2 \"\5\4\3\2! \3"+
		"\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$\3\3\2\2\2%#\3\2\2\2&+\5\b\5\2\'"+
		"+\5\n\6\2(+\5\f\7\2)+\5\6\4\2*&\3\2\2\2*\'\3\2\2\2*(\3\2\2\2*)\3\2\2\2"+
		"+\5\3\2\2\2,-\7\22\2\2-.\7\3\2\2./\7\22\2\2/\60\7\4\2\2\60\7\3\2\2\2\61"+
		"\63\5\16\b\2\62\61\3\2\2\2\62\63\3\2\2\2\63\65\3\2\2\2\64\66\5\20\t\2"+
		"\65\64\3\2\2\2\65\66\3\2\2\2\66\67\3\2\2\2\67:\5\22\n\289\7\5\2\29;\5"+
		"\24\13\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\4\2\2=\t\3\2\2\2>@\7\5\2\2"+
		"?A\5\24\13\2@?\3\2\2\2@A\3\2\2\2AB\3\2\2\2BC\7\4\2\2C\13\3\2\2\2DF\7\6"+
		"\2\2EG\5\24\13\2FE\3\2\2\2FG\3\2\2\2GH\3\2\2\2HI\7\4\2\2IJ\7\7\2\2JK\7"+
		"\24\2\2KL\7\b\2\2LO\7\24\2\2MN\7\t\2\2NP\5\34\17\2OM\3\2\2\2OP\3\2\2\2"+
		"PQ\3\2\2\2QR\7\n\2\2R\r\3\2\2\2ST\7\13\2\2TU\7\22\2\2UV\7\f\2\2V\17\3"+
		"\2\2\2WX\7\r\2\2X\21\3\2\2\2Y^\5\26\f\2Z[\7\16\2\2[]\5\26\f\2\\Z\3\2\2"+
		"\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_\23\3\2\2\2`^\3\2\2\2af\5\26\f\2bc\7"+
		"\t\2\2ce\5\26\f\2db\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2\2\2g\25\3\2\2\2"+
		"hf\3\2\2\2im\5\30\r\2jk\7\17\2\2km\5\30\r\2li\3\2\2\2lj\3\2\2\2m\27\3"+
		"\2\2\2nr\5\32\16\2op\7\20\2\2pr\5\32\16\2qn\3\2\2\2qo\3\2\2\2r\31\3\2"+
		"\2\2sx\7\22\2\2tu\7\21\2\2uv\5\34\17\2vw\7\f\2\2wy\3\2\2\2xt\3\2\2\2x"+
		"y\3\2\2\2y\33\3\2\2\2z\177\5\36\20\2{|\7\t\2\2|~\5\36\20\2}{\3\2\2\2~"+
		"\u0081\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\35\3\2\2\2\u0081\177"+
		"\3\2\2\2\u0082\u008d\7\24\2\2\u0083\u008d\7\30\2\2\u0084\u008d\7\23\2"+
		"\2\u0085\u008a\7\22\2\2\u0086\u0087\7\21\2\2\u0087\u0088\5\34\17\2\u0088"+
		"\u0089\7\f\2\2\u0089\u008b\3\2\2\2\u008a\u0086\3\2\2\2\u008a\u008b\3\2"+
		"\2\2\u008b\u008d\3\2\2\2\u008c\u0082\3\2\2\2\u008c\u0083\3\2\2\2\u008c"+
		"\u0084\3\2\2\2\u008c\u0085\3\2\2\2\u008d\37\3\2\2\2\22#*\62\65:@FO^fl"+
		"qx\177\u008a\u008c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}