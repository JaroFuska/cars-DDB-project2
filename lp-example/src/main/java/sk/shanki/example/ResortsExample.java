/*
 * Copyright shanki. All rights reserved.
 */
package sk.shanki.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import sk.shanki.lp.AnswerSet;
import sk.shanki.lp.Literal;
import sk.shanki.lp.solvers.ClingoSolver;

/**
 *
 * @author shanki
 */
public class ResortsExample {

    public static void main(String[] args) throws IOException {
        String program = Files.lines(Paths.get("resorts.txt")).collect(Collectors.joining(System.lineSeparator()));
        ClingoSolver solver = new ClingoSolver();

        AnswerSet as = solver.evaluateRaw(program, 0).first();

        for (Literal literal : as) {
            if (literal.isOfSymbol("component_id")) {
                System.out.println(literal);
            }
        }

    }

}
