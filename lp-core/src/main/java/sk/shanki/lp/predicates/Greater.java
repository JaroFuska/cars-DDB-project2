/*
 * Copyright shanki. All rights reserved.
 */

package sk.shanki.lp.predicates;

import java.util.Objects;
import sk.shanki.lp.GroundingPredicate;
import sk.shanki.lp.ObjectConstantMapping;
import sk.shanki.lp.Substitution;
import sk.shanki.lp.exceptions.UnboundVariableException;
import sk.shanki.lp.Term;

/**
 *
 * @author shanki
 */
public class Greater implements GroundingPredicate {

    private final Term left;
    private final Term right;
    
    private int hash;
    
    public Greater(Term left, Term right) {
        this.left   = left;
        this.right  = right;
        
        updateHashCode();
    }

    private void updateHashCode() {
        hash = 7;
        hash = 47 * hash + Objects.hashCode(this.left);
        hash = 47 * hash + Objects.hashCode(this.right);        
    }
    
    @Override
    public int hashCode() {
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Greater other = (Greater) obj;
        
        if (this.hashCode() != other.hashCode()) {
            return false;
        }
        
        if (!Objects.equals(this.left, other.left)) {
            return false;
        }
        return Objects.equals(this.right, other.right);
    }

    @Override
    public boolean evaluate(Substitution sub, ObjectConstantMapping cache) throws UnboundVariableException {
        Term cx = left.fullySubstitute(sub);
        Term cy = right.fullySubstitute(sub);
        
        return cx.compareTo(cy, cache) > 0;
    }

}