// Generated from sk\shanki\lp\grammar\ClingoOutGrammar.g4 by ANTLR 4.5.3
package sk.shanki.lp.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClingoOutGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClingoOutGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClingoOutGrammarParser#out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(ClingoOutGrammarParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClingoOutGrammarParser#answer_sets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer_sets(ClingoOutGrammarParser.Answer_setsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClingoOutGrammarParser#answer_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer_set(ClingoOutGrammarParser.Answer_setContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sat_sat}
	 * labeled alternative in {@link ClingoOutGrammarParser#sat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSat_sat(ClingoOutGrammarParser.Sat_satContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsat_sat}
	 * labeled alternative in {@link ClingoOutGrammarParser#sat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsat_sat(ClingoOutGrammarParser.Unsat_satContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positive_literal}
	 * labeled alternative in {@link ClingoOutGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositive_literal(ClingoOutGrammarParser.Positive_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negative_literal}
	 * labeled alternative in {@link ClingoOutGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative_literal(ClingoOutGrammarParser.Negative_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClingoOutGrammarParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ClingoOutGrammarParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClingoOutGrammarParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(ClingoOutGrammarParser.TermsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number_term}
	 * labeled alternative in {@link ClingoOutGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_term(ClingoOutGrammarParser.Number_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_term}
	 * labeled alternative in {@link ClingoOutGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_term(ClingoOutGrammarParser.String_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functional_term}
	 * labeled alternative in {@link ClingoOutGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctional_term(ClingoOutGrammarParser.Functional_termContext ctx);
}