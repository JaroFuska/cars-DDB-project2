// Generated from sk\shanki\lp\grammar\ClingoOutGrammar.g4 by ANTLR 4.5.3
package sk.shanki.lp.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClingoOutGrammarParser}.
 */
public interface ClingoOutGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClingoOutGrammarParser#out}.
	 * @param ctx the parse tree
	 */
	void enterOut(ClingoOutGrammarParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClingoOutGrammarParser#out}.
	 * @param ctx the parse tree
	 */
	void exitOut(ClingoOutGrammarParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClingoOutGrammarParser#answer_sets}.
	 * @param ctx the parse tree
	 */
	void enterAnswer_sets(ClingoOutGrammarParser.Answer_setsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClingoOutGrammarParser#answer_sets}.
	 * @param ctx the parse tree
	 */
	void exitAnswer_sets(ClingoOutGrammarParser.Answer_setsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClingoOutGrammarParser#answer_set}.
	 * @param ctx the parse tree
	 */
	void enterAnswer_set(ClingoOutGrammarParser.Answer_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClingoOutGrammarParser#answer_set}.
	 * @param ctx the parse tree
	 */
	void exitAnswer_set(ClingoOutGrammarParser.Answer_setContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sat_sat}
	 * labeled alternative in {@link ClingoOutGrammarParser#sat}.
	 * @param ctx the parse tree
	 */
	void enterSat_sat(ClingoOutGrammarParser.Sat_satContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sat_sat}
	 * labeled alternative in {@link ClingoOutGrammarParser#sat}.
	 * @param ctx the parse tree
	 */
	void exitSat_sat(ClingoOutGrammarParser.Sat_satContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsat_sat}
	 * labeled alternative in {@link ClingoOutGrammarParser#sat}.
	 * @param ctx the parse tree
	 */
	void enterUnsat_sat(ClingoOutGrammarParser.Unsat_satContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsat_sat}
	 * labeled alternative in {@link ClingoOutGrammarParser#sat}.
	 * @param ctx the parse tree
	 */
	void exitUnsat_sat(ClingoOutGrammarParser.Unsat_satContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positive_literal}
	 * labeled alternative in {@link ClingoOutGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterPositive_literal(ClingoOutGrammarParser.Positive_literalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positive_literal}
	 * labeled alternative in {@link ClingoOutGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitPositive_literal(ClingoOutGrammarParser.Positive_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negative_literal}
	 * labeled alternative in {@link ClingoOutGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNegative_literal(ClingoOutGrammarParser.Negative_literalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative_literal}
	 * labeled alternative in {@link ClingoOutGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNegative_literal(ClingoOutGrammarParser.Negative_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClingoOutGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ClingoOutGrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClingoOutGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ClingoOutGrammarParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClingoOutGrammarParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(ClingoOutGrammarParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClingoOutGrammarParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(ClingoOutGrammarParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number_term}
	 * labeled alternative in {@link ClingoOutGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterNumber_term(ClingoOutGrammarParser.Number_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number_term}
	 * labeled alternative in {@link ClingoOutGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitNumber_term(ClingoOutGrammarParser.Number_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_term}
	 * labeled alternative in {@link ClingoOutGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterString_term(ClingoOutGrammarParser.String_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_term}
	 * labeled alternative in {@link ClingoOutGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitString_term(ClingoOutGrammarParser.String_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functional_term}
	 * labeled alternative in {@link ClingoOutGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFunctional_term(ClingoOutGrammarParser.Functional_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functional_term}
	 * labeled alternative in {@link ClingoOutGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFunctional_term(ClingoOutGrammarParser.Functional_termContext ctx);
}