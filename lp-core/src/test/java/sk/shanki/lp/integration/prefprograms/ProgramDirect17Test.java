/*
 * Copyright shanki. All rights reserved.
 */
package sk.shanki.lp.integration.prefprograms;

import java.io.IOException;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import sk.shanki.lp.AnswerSet;
import sk.shanki.lp.AnswerSets;
import sk.shanki.lp.Atom;
import sk.shanki.lp.Program;
import sk.shanki.lp.solvers.DisjunctiveTransSolver;
import sk.shanki.lp.gsolver.PasGTransSolver;
import sk.shanki.lp.meta.PasBEMetaSolver;
import sk.shanki.lp.meta.PasBEWMetaSolver;
import sk.shanki.lp.meta.PasCnfMetaSolver;
import sk.shanki.lp.meta.PasDMetaSolver;
import sk.shanki.lp.meta.PasDSTMetaSolver;
import sk.shanki.lp.meta.PasNoMetaSolver;
import sk.shanki.lp.meta.PasSMetaSolver;
import sk.shanki.lp.meta.PasWZLMetaSolver;
import sk.shanki.lp.parser.ProgramFactory;
import sk.shanki.lp.solvers.BuiltInSmodelsSolver;
import sk.shanki.lp.solvers.NonGroundSolver;
import sk.shanki.lp.solvers.Solver;
import sk.shanki.lp.exceptions.SolverException;

/**
 *
 * @author shanki
 */
public class ProgramDirect17Test {
    
    private static Program program;
    private static Solver solver;
        
    @BeforeClass
    public static void setUpClass() throws SolverException, IOException {
        program = new ProgramFactory().fromString(
                "@name(r1) a1 :- not a3, not d2." + 
                "@name(r2) d1 :- not a3, not d2." +
                "@name(r3) a2 :- not a1, not d3." +
                "@name(r4) d2 :- not a1, not d3." +                        
                "@name(r5) a3 :- not a2, not d1." +
                "@name(r6) d3 :- not a2, not d1." +
                "r4 < r1." +
                "r6 < r3." +
                "r2 < r5."
        );
        
        solver = new NonGroundSolver(new BuiltInSmodelsSolver());
    }
    
    @AfterClass
    public static void tearDownClass() {
        program = null;
        solver = null;
    }

    public void testAS() throws SolverException {
        AnswerSet as1   = new AnswerSet();
        as1.add(new Atom("a1"));
        as1.add(new Atom("d1"));

        AnswerSet as2   = new AnswerSet();
        as2.add(new Atom("a2"));
        as2.add(new Atom("d2"));

        AnswerSet as3   = new AnswerSet();
        as3.add(new Atom("a3"));
        as3.add(new Atom("d3"));
        
        AnswerSets expected = new AnswerSets();
        expected.add(as1);
        expected.add(as2);
        expected.add(as3);
        
        AnswerSets result   = solver.evaluate(program, 0);
        
        assertEquals(expected, result);
    }

    public void testPAS_BE() throws SolverException {        
        AnswerSets expected = new AnswerSets();        
        AnswerSets result   = new NonGroundSolver(new PasBEMetaSolver(solver)).evaluate(program, 0);
        
        assertEquals(expected, result);
    }    

    public void testPAS_BEW() throws SolverException {
        AnswerSet as1   = new AnswerSet();
        as1.add(new Atom("a1"));
        as1.add(new Atom("d1"));

        AnswerSet as2   = new AnswerSet();
        as2.add(new Atom("a2"));
        as2.add(new Atom("d2"));

        AnswerSet as3   = new AnswerSet();
        as3.add(new Atom("a3"));
        as3.add(new Atom("d3"));
        
        AnswerSets expected = new AnswerSets();
        expected.add(as1);
        expected.add(as2);
        expected.add(as3);
        
        AnswerSets result   = new NonGroundSolver(new PasBEWMetaSolver(new NonGroundSolver(new DisjunctiveTransSolver(solver)))).evaluate(program, 0);
        
        assertEquals(expected, result);
    }    

    public void testPAS_DST() throws SolverException {              
        AnswerSets expected = new AnswerSets();
        AnswerSets result   = new NonGroundSolver(new PasDSTMetaSolver(solver)).evaluate(program, 0);
        
        assertEquals(expected, result);
    }

    public void testPAS_WZL() throws SolverException {
        AnswerSets expected = new AnswerSets();
        AnswerSets result   = new NonGroundSolver(new PasWZLMetaSolver(solver)).evaluate(program, 0);
        
        assertEquals(expected, result);
    }    

    public void testPAS_DIRECT() throws SolverException {
        AnswerSets expected = new AnswerSets();
        AnswerSets result   = new NonGroundSolver(new PasDMetaSolver(solver)).evaluate(program, 0);
        
        assertEquals(expected, result);
    }

//TAKES TOO LONG
   
//    public void testPAS_INDIRECT() throws SolverException {
//        AnswerSets expected = new AnswerSets();
//        AnswerSets result   = new NonGroundSolver(new PasGMetaSolver(solver)).evaluate(program, 0, null);
//        
//        assertEquals(expected, result);
//    }

    public void testPAS_INDIRECT_TRANS() throws SolverException {
        AnswerSets expected = new AnswerSets();
        AnswerSets result   = new NonGroundSolver(new PasGTransSolver(solver,new DisjunctiveTransSolver(solver))).evaluate(program, 0);
        
        assertEquals(expected, result);
    }

    public void testPAS_NO_CONFLICT() throws SolverException {
        AnswerSets expected = new AnswerSets();
        AnswerSets result   = new NonGroundSolver(new PasNoMetaSolver(solver)).evaluate(program, 0);
        
        assertEquals(expected, result);
    }

    public void testPAS_STRICT() throws SolverException {
        AnswerSets expected = new AnswerSets();
        AnswerSets result   = new NonGroundSolver(new PasSMetaSolver(solver)).evaluate(program, 0);
        
        assertEquals(expected, result);
    }    

    public void testPAS_CNF() throws SolverException {
        AnswerSets expected = new AnswerSets();
        AnswerSets result   = new NonGroundSolver(new PasCnfMetaSolver(solver)).evaluate(program, 0);
        
        assertEquals(expected, result);
    }

}