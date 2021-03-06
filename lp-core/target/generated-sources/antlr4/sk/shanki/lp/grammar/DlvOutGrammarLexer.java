// Generated from sk\shanki\lp\grammar\DlvOutGrammar.g4 by ANTLR 4.5.3
package sk.shanki.lp.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DlvOutGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, HEADER=11, SMALL_ID=12, NUMBER=13, STRING=14, WS=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "HEADER", "SMALL_ID", "ID_LETTER", "DIGIT", "NUMBER", "STRING", 
		"ESC", "WS"
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


	public DlvOutGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DlvOutGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u0096\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\7\rb\n\r\f\r\16\re\13\r\3\16"+
		"\3\16\3\17\3\17\3\20\6\20l\n\20\r\20\16\20m\3\20\6\20q\n\20\r\20\16\20"+
		"r\3\20\3\20\6\20w\n\20\r\20\16\20x\3\20\3\20\6\20}\n\20\r\20\16\20~\5"+
		"\20\u0081\n\20\3\21\3\21\3\21\7\21\u0086\n\21\f\21\16\21\u0089\13\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\6\23\u0091\n\23\r\23\16\23\u0092\3\23\3\23"+
		"\3\u0087\2\24\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16"+
		"\33\2\35\2\37\17!\20#\2%\21\3\2\6\3\2c|\5\2C\\aac|\b\2$$^^ddppttvv\5\2"+
		"\13\f\17\17\"\"\u009d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2%\3\2\2\2"+
		"\3\'\3\2\2\2\5)\3\2\2\2\7+\3\2\2\2\t-\3\2\2\2\13D\3\2\2\2\rG\3\2\2\2\17"+
		"I\3\2\2\2\21L\3\2\2\2\23N\3\2\2\2\25P\3\2\2\2\27R\3\2\2\2\31^\3\2\2\2"+
		"\33f\3\2\2\2\35h\3\2\2\2\37\u0080\3\2\2\2!\u0082\3\2\2\2#\u008c\3\2\2"+
		"\2%\u0090\3\2\2\2\'(\7}\2\2(\4\3\2\2\2)*\7.\2\2*\6\3\2\2\2+,\7\177\2\2"+
		",\b\3\2\2\2-.\7E\2\2./\7q\2\2/\60\7u\2\2\60\61\7v\2\2\61\62\7\"\2\2\62"+
		"\63\7*\2\2\63\64\7]\2\2\64\65\7Y\2\2\65\66\7g\2\2\66\67\7k\2\2\678\7i"+
		"\2\289\7j\2\29:\7v\2\2:;\7<\2\2;<\7N\2\2<=\7g\2\2=>\7x\2\2>?\7g\2\2?@"+
		"\7n\2\2@A\7_\2\2AB\7+\2\2BC\7<\2\2C\n\3\2\2\2DE\7>\2\2EF\7]\2\2F\f\3\2"+
		"\2\2GH\7<\2\2H\16\3\2\2\2IJ\7_\2\2JK\7@\2\2K\20\3\2\2\2LM\7/\2\2M\22\3"+
		"\2\2\2NO\7*\2\2O\24\3\2\2\2PQ\7+\2\2Q\26\3\2\2\2RS\7D\2\2ST\7g\2\2TU\7"+
		"u\2\2UV\7v\2\2VW\7\"\2\2WX\7o\2\2XY\7q\2\2YZ\7f\2\2Z[\7g\2\2[\\\7n\2\2"+
		"\\]\7<\2\2]\30\3\2\2\2^c\t\2\2\2_b\5\33\16\2`b\5\35\17\2a_\3\2\2\2a`\3"+
		"\2\2\2be\3\2\2\2ca\3\2\2\2cd\3\2\2\2d\32\3\2\2\2ec\3\2\2\2fg\t\3\2\2g"+
		"\34\3\2\2\2hi\4\62;\2i\36\3\2\2\2jl\5\35\17\2kj\3\2\2\2lm\3\2\2\2mk\3"+
		"\2\2\2mn\3\2\2\2n\u0081\3\2\2\2oq\5\35\17\2po\3\2\2\2qr\3\2\2\2rp\3\2"+
		"\2\2rs\3\2\2\2st\3\2\2\2tv\7\60\2\2uw\5\35\17\2vu\3\2\2\2wx\3\2\2\2xv"+
		"\3\2\2\2xy\3\2\2\2y\u0081\3\2\2\2z|\7\60\2\2{}\5\35\17\2|{\3\2\2\2}~\3"+
		"\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080k\3\2\2\2\u0080p"+
		"\3\2\2\2\u0080z\3\2\2\2\u0081 \3\2\2\2\u0082\u0087\7$\2\2\u0083\u0086"+
		"\5#\22\2\u0084\u0086\13\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2"+
		"\u0086\u0089\3\2\2\2\u0087\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a"+
		"\3\2\2\2\u0089\u0087\3\2\2\2\u008a\u008b\7$\2\2\u008b\"\3\2\2\2\u008c"+
		"\u008d\7^\2\2\u008d\u008e\t\4\2\2\u008e$\3\2\2\2\u008f\u0091\t\5\2\2\u0090"+
		"\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2"+
		"\2\2\u0093\u0094\3\2\2\2\u0094\u0095\b\23\2\2\u0095&\3\2\2\2\r\2acmrx"+
		"~\u0080\u0085\u0087\u0092\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}