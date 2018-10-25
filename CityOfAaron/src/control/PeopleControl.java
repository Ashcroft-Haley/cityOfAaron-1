/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author haleyashcroft
 */
public class PeopleControl {
    
    public static int calculateNewMoveIns(int currentPopulation) {
        
        if (currentPopulation < 0) {
            return -1;
        }
        
        int low = 1;
        int high = 5;
        
        double percentGrowth = GameControl.getRandomNumber(low, high) * 0.01; //Returns the number as a fraction
        double numberOfNewPeople = currentPopulation * percentGrowth;
        double roundedValue = Math.round(numberOfNewPeople); //Rounds double value so it can be turned into an int
        int intValue = (int) roundedValue; //Converting a double to int using explcit casting
        
        return intValue; //Returns move ins as an int
        
    }
    
}
