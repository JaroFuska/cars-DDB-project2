// Generated from sk\shanki\lp\grammar\LpGrammar.g4 by ANTLR 4.5.3
package sk.shanki.lp.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LpGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LpGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LpGrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(LpGrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rule_statement}
	 * labeled alternative in {@link LpGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_statement(LpGrammarParser.Rule_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constraint_statement}
	 * labeled alternative in {@link LpGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_statement(LpGrammarParser.Constraint_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code weak_constraint_statement}
	 * labeled alternative in {@link LpGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeak_constraint_statement(LpGrammarParser.Weak_constraint_statementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preference_statement}
	 * labeled alternative in {@link LpGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreference_statement(LpGrammarParser.Preference_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LpGrammarParser#preference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreference(LpGrammarParser.PreferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link LpGrammarParser#lprule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLprule(LpGrammarParser.LpruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LpGrammarParser#constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint(LpGrammarParser.ConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link LpGrammarParser#weak_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeak_constraint(LpGrammarParser.Weak_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link LpGrammarParser#nameannotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameannotation(LpGrammarParser.NameannotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LpGrammarParser#partialannotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartialannotation(LpGrammarParser.PartialannotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link LpGrammarParser#head}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHead(LpGrammarParser.HeadContext ctx);
	/**
	 * Visit a parse tree produced by {@link LpGrammarParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(LpGrammarParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positive_nafliteral}
	 * labeled alternative in {@link LpGrammarParser#nafliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositive_nafliteral(LpGrammarParser.Positive_nafliteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negative_nafliteral}
	 * labeled alternative in {@link LpGrammarParser#nafliteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative_nafliteral(LpGrammarParser.Negative_nafliteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positive_literal}
	 * labeled alternative in {@link LpGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositive_literal(LpGrammarParser.Positive_literalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negative_literal}
	 * labeled alternative in {@link LpGrammarParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative_literal(LpGrammarParser.Negative_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LpGrammarParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(LpGrammarParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link LpGrammarParser#terms}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerms(LpGrammarParser.TermsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number_term}
	 * labeled alternative in {@link LpGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber_term(LpGrammarParser.Number_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string_term}
	 * labeled alternative in {@link LpGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_term(LpGrammarParser.String_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable_term}
	 * labeled alternative in {@link LpGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_term(LpGrammarParser.Variable_termContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functional_term}
	 * labeled alternative in {@link LpGrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctional_term(LpGrammarParser.Functional_termContext ctx);
}