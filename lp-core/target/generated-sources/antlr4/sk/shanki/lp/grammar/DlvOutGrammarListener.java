// Generated from sk\shanki\lp\grammar\DlvOutGrammar.g4 by ANTLR 4.5.3
package sk.shanki.lp.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DlvOutGrammarParser}.
 */
public interface DlvOutGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DlvOutGrammarParser#out}.
	 * @param ctx the parse tree
	 */
	void enterOut(DlvOutGrammarParser.OutContext ctx);
	/**
	 * Exit a parse tree produced by {@link DlvOutGrammarParser#out}.
	 * @param ctx the parse tree
	 */
	void exitOut(DlvOutGrammarParser.OutContext ctx);
	/**
	 * Enter a parse tree produced by {@link DlvOutGrammarParser#answer_sets}.
	 * @param ctx the parse tree
	 */
	void enterAnswer_sets(DlvOutGrammarParser.Answer_setsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DlvOutGrammarParser#answer_sets}.
	 * @param ctx the parse tree
	 */
	void exitAnswer_sets(DlvOutGrammarParser.Answer_setsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code classical_as}
	 * labeled alternative in {@link DlvOutGrammarParser#as}.
	 * @param ctx the parse tree
	 */
	void enterClassical_as(DlvOutGrammarParser.Classical_asContext ctx);
	/**
	 * Exit a parse tree produced by the {@code classical_as}
	 * labeled alternative in {@link DlvOutGrammarParser#as}.
	 * @param ctx the parse tree
	 */
	void exitClassical_as(DlvOutGrammarParser.Classical_asContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optimal_as}
	 * labeled alternative in {@link DlvOutGrammarParser#as}.
	 * @param ctx the parse tree
	 */
	void enterOptimal_as(DlvOutGrammarParser.Optimal_asContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optimal_as}
	 * labeled alternative in {@link DlvOutGrammarParser#as}.
	 * @param ctx the parse tree
	 */
	void exitOptimal_as(DlvOutGrammarParser.Optimal_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link DlvOutGrammarParser#optimal_answer_set}.
	 * @param ctx the parse tree
	 */
	void enterOptimal_answer_set(DlvOutGrammarParser.Optimal_answer_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link DlvOutGrammarParser#optimal_answer_set}.
	 * @param ctx the parse tree
	 */
	void exitOptimal_answer_set(DlvOutGrammarParser.Optimal_answer_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link DlvOutGrammarParser#answer_set}.
	 * @param ctx the parse tree
	 */
	void enterAnswer_set(DlvOutGrammarParser.Answer_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link DlvOutGrammarParser#answer_set}.
	 * @param ctx the parse tree
	 */
	void exitAnswer_set(DlvOutGrammarParser.Answer_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link DlvOutGrammarParser#cost}.
	 * @param ctx the parse tree
	 */
	void enterCost(DlvOutGrammarParser.CostContext ctx);
	/**
	 * Exit a parse tree produced by {@link DlvOutGrammarParser#cost}.
	 * @param ctx the parse tree
	 */
	void exitCost(DlvOutGrammarParser.CostContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positive_literal}
	 * labeled alternative in {@link DlvOutGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterPositive_literal(DlvOutGrammarParser.Positive_literalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positive_literal}
	 * labeled alternative in {@link DlvOutGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitPositive_literal(DlvOutGrammarParser.Positive_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negative_literal}
	 * labeled alternative in {@link DlvOutGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNegative_literal(DlvOutGrammarParser.Negative_literalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative_literal}
	 * labeled alternative in {@link DlvOutGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNegative_literal(DlvOutGrammarParser.Negative_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link DlvOutGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(DlvOutGrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link DlvOutGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(DlvOutGrammarParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link DlvOutGrammarParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(DlvOutGrammarParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DlvOutGrammarParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(DlvOutGrammarParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number_term}
	 * labeled alternative in {@link DlvOutGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterNumber_term(DlvOutGrammarParser.Number_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number_term}
	 * labeled alternative in {@link DlvOutGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitNumber_term(DlvOutGrammarParser.Number_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_term}
	 * labeled alternative in {@link DlvOutGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterString_term(DlvOutGrammarParser.String_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_term}
	 * labeled alternative in {@link DlvOutGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitString_term(DlvOutGrammarParser.String_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functional_term}
	 * labeled alternative in {@link DlvOutGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFunctional_term(DlvOutGrammarParser.Functional_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functional_term}
	 * labeled alternative in {@link DlvOutGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFunctional_term(DlvOutGrammarParser.Functional_termContext ctx);
}