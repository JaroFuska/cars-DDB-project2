// Generated from sk\shanki\lp\grammar\LpGrammar.g4 by ANTLR 4.5.3
package sk.shanki.lp.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LpGrammarParser}.
 */
public interface LpGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LpGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LpGrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LpGrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LpGrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rule_statement}
	 * labeled alternative in {@link LpGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRule_statement(LpGrammarParser.Rule_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rule_statement}
	 * labeled alternative in {@link LpGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRule_statement(LpGrammarParser.Rule_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constraint_statement}
	 * labeled alternative in {@link LpGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_statement(LpGrammarParser.Constraint_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constraint_statement}
	 * labeled alternative in {@link LpGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_statement(LpGrammarParser.Constraint_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code weak_constraint_statement}
	 * labeled alternative in {@link LpGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWeak_constraint_statement(LpGrammarParser.Weak_constraint_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code weak_constraint_statement}
	 * labeled alternative in {@link LpGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWeak_constraint_statement(LpGrammarParser.Weak_constraint_statementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preference_statement}
	 * labeled alternative in {@link LpGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPreference_statement(LpGrammarParser.Preference_statementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preference_statement}
	 * labeled alternative in {@link LpGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPreference_statement(LpGrammarParser.Preference_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LpGrammarParser#preference}.
	 * @param ctx the parse tree
	 */
	void enterPreference(LpGrammarParser.PreferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LpGrammarParser#preference}.
	 * @param ctx the parse tree
	 */
	void exitPreference(LpGrammarParser.PreferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LpGrammarParser#lprule}.
	 * @param ctx the parse tree
	 */
	void enterLprule(LpGrammarParser.LpruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LpGrammarParser#lprule}.
	 * @param ctx the parse tree
	 */
	void exitLprule(LpGrammarParser.LpruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LpGrammarParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(LpGrammarParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LpGrammarParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(LpGrammarParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link LpGrammarParser#weak_constraint}.
	 * @param ctx the parse tree
	 */
	void enterWeak_constraint(LpGrammarParser.Weak_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LpGrammarParser#weak_constraint}.
	 * @param ctx the parse tree
	 */
	void exitWeak_constraint(LpGrammarParser.Weak_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link LpGrammarParser#nameannotation}.
	 * @param ctx the parse tree
	 */
	void enterNameannotation(LpGrammarParser.NameannotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LpGrammarParser#nameannotation}.
	 * @param ctx the parse tree
	 */
	void exitNameannotation(LpGrammarParser.NameannotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LpGrammarParser#partialannotation}.
	 * @param ctx the parse tree
	 */
	void enterPartialannotation(LpGrammarParser.PartialannotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link LpGrammarParser#partialannotation}.
	 * @param ctx the parse tree
	 */
	void exitPartialannotation(LpGrammarParser.PartialannotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link LpGrammarParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(LpGrammarParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link LpGrammarParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(LpGrammarParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link LpGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(LpGrammarParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LpGrammarParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(LpGrammarParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positive_nafliteral}
	 * labeled alternative in {@link LpGrammarParser#nafliteral}.
	 * @param ctx the parse tree
	 */
	void enterPositive_nafliteral(LpGrammarParser.Positive_nafliteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positive_nafliteral}
	 * labeled alternative in {@link LpGrammarParser#nafliteral}.
	 * @param ctx the parse tree
	 */
	void exitPositive_nafliteral(LpGrammarParser.Positive_nafliteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negative_nafliteral}
	 * labeled alternative in {@link LpGrammarParser#nafliteral}.
	 * @param ctx the parse tree
	 */
	void enterNegative_nafliteral(LpGrammarParser.Negative_nafliteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative_nafliteral}
	 * labeled alternative in {@link LpGrammarParser#nafliteral}.
	 * @param ctx the parse tree
	 */
	void exitNegative_nafliteral(LpGrammarParser.Negative_nafliteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positive_literal}
	 * labeled alternative in {@link LpGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterPositive_literal(LpGrammarParser.Positive_literalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positive_literal}
	 * labeled alternative in {@link LpGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitPositive_literal(LpGrammarParser.Positive_literalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negative_literal}
	 * labeled alternative in {@link LpGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterNegative_literal(LpGrammarParser.Negative_literalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negative_literal}
	 * labeled alternative in {@link LpGrammarParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitNegative_literal(LpGrammarParser.Negative_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LpGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(LpGrammarParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link LpGrammarParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(LpGrammarParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link LpGrammarParser#terms}.
	 * @param ctx the parse tree
	 */
	void enterTerms(LpGrammarParser.TermsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LpGrammarParser#terms}.
	 * @param ctx the parse tree
	 */
	void exitTerms(LpGrammarParser.TermsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number_term}
	 * labeled alternative in {@link LpGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterNumber_term(LpGrammarParser.Number_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number_term}
	 * labeled alternative in {@link LpGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitNumber_term(LpGrammarParser.Number_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string_term}
	 * labeled alternative in {@link LpGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterString_term(LpGrammarParser.String_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string_term}
	 * labeled alternative in {@link LpGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitString_term(LpGrammarParser.String_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable_term}
	 * labeled alternative in {@link LpGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterVariable_term(LpGrammarParser.Variable_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable_term}
	 * labeled alternative in {@link LpGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitVariable_term(LpGrammarParser.Variable_termContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functional_term}
	 * labeled alternative in {@link LpGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterFunctional_term(LpGrammarParser.Functional_termContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functional_term}
	 * labeled alternative in {@link LpGrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitFunctional_term(LpGrammarParser.Functional_termContext ctx);
}