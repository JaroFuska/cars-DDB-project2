// Generated from sk\shanki\lp\grammar\ClingoOutGrammar.g4 by ANTLR 4.5.3
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
public class ClingoOutGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, NL=7, SMALL_ID=8, NUMBER=9, 
		STRING=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "NL", "SMALL_ID", "ID_LETTER", 
		"DIGIT", "NUMBER", "STRING", "ESC", "WS"
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


	public ClingoOutGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ClingoOutGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\r~\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\5\bC\n\b\3\b\3\b\3\t\3\t\3\t"+
		"\7\tJ\n\t\f\t\16\tM\13\t\3\n\3\n\3\13\3\13\3\f\6\fT\n\f\r\f\16\fU\3\f"+
		"\6\fY\n\f\r\f\16\fZ\3\f\3\f\6\f_\n\f\r\f\16\f`\3\f\3\f\6\fe\n\f\r\f\16"+
		"\ff\5\fi\n\f\3\r\3\r\3\r\7\rn\n\r\f\r\16\rq\13\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\6\17y\n\17\r\17\16\17z\3\17\3\17\3o\2\20\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\2\25\2\27\13\31\f\33\2\35\r\3\2\6\3\2c|\5\2C\\aac|\b\2"+
		"$$^^ddppttvv\4\2\13\13\"\"\u0086\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\27\3\2"+
		"\2\2\2\31\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5+\3\2\2\2\79\3\2\2\2\t;\3"+
		"\2\2\2\13=\3\2\2\2\r?\3\2\2\2\17B\3\2\2\2\21F\3\2\2\2\23N\3\2\2\2\25P"+
		"\3\2\2\2\27h\3\2\2\2\31j\3\2\2\2\33t\3\2\2\2\35x\3\2\2\2\37 \7U\2\2 !"+
		"\7C\2\2!\"\7V\2\2\"#\7K\2\2#$\7U\2\2$%\7H\2\2%&\7K\2\2&\'\7C\2\2\'(\7"+
		"D\2\2()\7N\2\2)*\7G\2\2*\4\3\2\2\2+,\7W\2\2,-\7P\2\2-.\7U\2\2./\7C\2\2"+
		"/\60\7V\2\2\60\61\7K\2\2\61\62\7U\2\2\62\63\7H\2\2\63\64\7K\2\2\64\65"+
		"\7C\2\2\65\66\7D\2\2\66\67\7N\2\2\678\7G\2\28\6\3\2\2\29:\7/\2\2:\b\3"+
		"\2\2\2;<\7*\2\2<\n\3\2\2\2=>\7+\2\2>\f\3\2\2\2?@\7.\2\2@\16\3\2\2\2AC"+
		"\7\17\2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\7\f\2\2E\20\3\2\2\2FK\t\2\2"+
		"\2GJ\5\23\n\2HJ\5\25\13\2IG\3\2\2\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3"+
		"\2\2\2L\22\3\2\2\2MK\3\2\2\2NO\t\3\2\2O\24\3\2\2\2PQ\4\62;\2Q\26\3\2\2"+
		"\2RT\5\25\13\2SR\3\2\2\2TU\3\2\2\2US\3\2\2\2UV\3\2\2\2Vi\3\2\2\2WY\5\25"+
		"\13\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[\\\3\2\2\2\\^\7\60\2\2]"+
		"_\5\25\13\2^]\3\2\2\2_`\3\2\2\2`^\3\2\2\2`a\3\2\2\2ai\3\2\2\2bd\7\60\2"+
		"\2ce\5\25\13\2dc\3\2\2\2ef\3\2\2\2fd\3\2\2\2fg\3\2\2\2gi\3\2\2\2hS\3\2"+
		"\2\2hX\3\2\2\2hb\3\2\2\2i\30\3\2\2\2jo\7$\2\2kn\5\33\16\2ln\13\2\2\2m"+
		"k\3\2\2\2ml\3\2\2\2nq\3\2\2\2op\3\2\2\2om\3\2\2\2pr\3\2\2\2qo\3\2\2\2"+
		"rs\7$\2\2s\32\3\2\2\2tu\7^\2\2uv\t\4\2\2v\34\3\2\2\2wy\t\5\2\2xw\3\2\2"+
		"\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\b\17\2\2}\36\3\2\2\2\16\2"+
		"BIKUZ`fhmoz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}