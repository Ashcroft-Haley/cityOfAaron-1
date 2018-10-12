/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author haleyashcroft
 */
public enum Condition {
    GOOD("Good"),
    FAIR("Fair"),
    POOR("Poor");
    
    private final String textRepresentation;
    
    private Condition(String textRepresentation) {
        this.textRepresentation = textRepresentation;
    }
    
    
    @Override public String toString() {
        return textRepresentation;
    }
}
