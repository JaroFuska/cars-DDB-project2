/*
 * Copyright shanki. All rights reserved.
 */
package sk.shanki.example;

import java.io.IOException;
import sk.shanki.lp.AnswerSet;
import sk.shanki.lp.Atom;
import sk.shanki.lp.Literal;
import sk.shanki.lp.Program;
import sk.shanki.lp.Rule;
import sk.shanki.lp.StringConstant;
import sk.shanki.lp.exceptions.SemanticException;
import sk.shanki.lp.solvers.ClingoSolver;

/**
 *
 * @author shanki
 */
public class SimpleExample {

    public static void main(String[] args) throws IOException, SemanticException {

        Program facts = new Program();
        facts.add(new Rule(new Atom("greater", new StringConstant("a"), new StringConstant("b"))));
        facts.add(new Rule(new Atom("greater", new StringConstant("b"), new StringConstant("c"))));

        String rules = "greater(X,Y) :- greater(X,Z), greater(Z,Y).";

        StringBuilder sb = new StringBuilder();
        sb.append(facts.toString());
        sb.append(rules);

        ClingoSolver solver = new ClingoSolver();

        AnswerSet as = solver.evaluateRaw(sb.toString(), 0).first();

        for (Literal literal : as) {
            System.out.println(literal);
        }

    }

}
