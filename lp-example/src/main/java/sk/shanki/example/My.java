/*
 * Copyright shanki. All rights reserved.
 */
package sk.shanki.example;

/**
 *
 * @author shanki
 */
public class My {
    private final String val = "hello";
    
    public String getVal() { return val; }

    @Override
    public String toString() {
        return "My{" + "val=" + val + '}';
    }

}