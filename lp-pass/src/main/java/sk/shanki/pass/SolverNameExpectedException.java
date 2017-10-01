/*
 * Copyright shanki. All rights reserved.
 */

package sk.shanki.pass;

/**
 *
 * @author shanki
 */
class SolverNameExpectedException extends Exception {

    public SolverNameExpectedException() {
    }

    @Override
    public String toString() {
        return "Solver name expected after -e";
    }
    
}
