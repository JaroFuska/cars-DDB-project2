/*
 * Copyright shanki. All rights reserved.
 */

package sk.shanki.pass;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import sk.shanki.lp.AnswerSet;
import sk.shanki.lp.AnswerSets;
import sk.shanki.lp.Program;
import sk.shanki.lp.exceptions.SemanticException;
import sk.shanki.lp.exceptions.SolverException;
import sk.shanki.lp.exceptions.UnknownSolverException;
import sk.shanki.lp.parser.ProgramFactory;
import sk.shanki.lp.solvers.Solver;
import sk.shanki.lp.solvers.SolverFactory;

/**
 *
 * @author shanki
 */
public class Main {
    List<String> filenames      = new ArrayList<>();
    List<String> solverNames    = new ArrayList<>();
    boolean debug               = false;
    
    Mode mode                   = Mode.filename;
    
    enum Mode {
        solver,
        filename
    }
    
    public void parseArgs(String[] args) throws NoArgumentsException {
        if (args.length == 0) {
            throw new NoArgumentsException();
        }
        
        int index = 0;
        
        while (index < args.length) {
            String arg = args[index];
            switch (arg) {
                case "-s":
                    mode = Mode.solver;
                    ++index;
                    break;
                case "-d":
                    debug = true;
                    ++index;
                    break;
                default:
                    if (mode == Mode.filename) {
                        filenames.add(arg);
                    } else if (mode == Mode.solver) {
                        solverNames.add(arg);
                    } else {
                        throw new IllegalStateException("unknown parsing mode");
                    }
                    ++index;
                    break;
            }
        }        
    }
    
    public void run() throws IOException, SolverException, UnknownSolverException {
        Solver solver  = new SolverFactory().create(solverNames);

        ProgramFactory factory  = new ProgramFactory();
        Program total           = new Program();

        for (String filename : filenames) {
            Program actual  = factory.fromFile(filename);

            total.add(actual);
        }

        AnswerSets ass = solver.evaluate(total, 0);

        for (AnswerSet set : ass) {
            System.out.println(set);
        }
    }
    
    public void debug() throws IOException, SemanticException, UnknownSolverException {
        Solver solver  = new SolverFactory().create(solverNames);

        ProgramFactory factory  = new ProgramFactory();
        Program total           = new Program();

        for (String filename : filenames) {
            Program actual  = factory.fromFile(filename);

            total.add(actual);
        }

        String out = solver.debug(total);
        
        System.out.println(out);
    }
    
    
    public static void main(String[] args) {
        try {
            Main main = new Main();
            main.parseArgs(args);
            
            if (main.debug) {
                main.debug();
            } else {
                main.run();
            }
            
            System.exit(0);
        } catch (NoArgumentsException|SolverException| UnknownSolverException |IOException ex) {
            
            System.err.println("ERROR: " + ex.toString());
            System.exit(1);
        }
        
    }
}