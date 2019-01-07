// Generated from sk\shanki\lp\grammar\DlvOutGrammar.g4 by ANTLR 4.5.3
package sk.shanki.lp.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DlvOutGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DlvOutGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DlvOutGrammarParser#out}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOut(DlvOutGrammarParser.OutContext ctx);
	/**
	 * Visit a parse tree produced by {@link DlvOutGrammarParser#answer_sets}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer_sets(DlvOutGrammarParser.Answer_setsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classical_as}
	 * labeled alternative in {@link DlvOutGrammarParser#as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassical_as(DlvOutGrammarParser.Classical_asContext ctx);
	/**
	 * Visit a parse tree produced by the {@code optimal_as}
	 * labeled alternative in {@link DlvOutGrammarParser#as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimal_as(DlvOutGrammarParser.Optimal_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link DlvOutGrammarParser#optimal_answer_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimal_answer_set(DlvOutGrammarParser.Optimal_answer_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link DlvOutGrammarParser#answer_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnswer_set(DlvOutGrammarParser.Answer_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link DlvOutGrammarParser#cost}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCost(DlvOutGrammarParser.CostContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positive_literal}
	 * labeled alternative in {@link DlvOutGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositive_literal(DlvOutGrammarParser.Positive_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negative_literal}
	 * labeled alternative in {@link DlvOutGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative_literal(DlvOutGrammarParser.Negative_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link DlvOutGrammarParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(DlvOutGrammarParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link DlvOutGrammarParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(DlvOutGrammarParser.TermsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number_term}
	 * labeled alternative in {@link DlvOutGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_term(DlvOutGrammarParser.Number_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_term}
	 * labeled alternative in {@link DlvOutGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_term(DlvOutGrammarParser.String_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functional_term}
	 * labeled alternative in {@link DlvOutGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctional_term(DlvOutGrammarParser.Functional_termContext ctx);
}