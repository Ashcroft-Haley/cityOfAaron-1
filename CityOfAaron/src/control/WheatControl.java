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
public class WheatControl {
    
    public static int calculateLossToRats(int tithesPercent, int wheatInStorage) {
        // Calculate the amount of wheat in storage lost to rats, based on
        // the percentage of tithing paid. Assume that GameControl.getRandomNumber(low, high)
        // is available to be called.
        
        //Here is the pseudocode for this function.

        //if wheatInStorage < 0 then return -1
        //if tithingPercent < 0 OR tithingPercent > 100 then return -2

        //chanceOfRats = GameControl.getRandomNumber(1, 100)
        //if chanceOfRats >= 30 then return 0

        //if tithingPercent < 8 then low = 6, high = 10
        //if tithingPercent >= 8 AND tithingPercent <= 12 then low = 3, high = 7
        //if tithingPercent > 12 then low = 3, high = 5

        //percentLost = getRandomNumber(low, high) * 0.01 // turn into a fraction

        //return wheatInStorage * percentLost // will need to be cast back to int

        
        if (wheatInStorage < 0) {
            return -1;
        }
        
        if (tithesPercent < 0 || tithesPercent > 100) {
            return -2;
        };
        
        int chanceOfRats = GameControl.getRandomNumber(1,100);
        if (chanceOfRats >= 30) {
            return 0;
        };
        
        
        
        
        
        int low = 0;
        int high = 0;
        
        if (tithesPercent < 8) {
            low = 6;
            high = 10;
          
            
            
            
            
            
        };
        
        if (tithesPercent >= 8 && tithesPercent <= 12) {
            low = 3;
            high = 7;

        };
        
        if (tithesPercent > 12) {
            low = 3;
            high = 5;
        };
        
        
        double percentLost = GameControl.getRandomNumber(low, high) * 0.01; //Returns the number as a fraction
        double totalRatLoss = wheatInStorage * percentLost;
        double roundedValue = Math.round(totalRatLoss); //Rounds double value so it can be turned into an int
        int intValue = (int) roundedValue; //Converting a double to int using explcit casting
        
        return intValue; //Returns value as an int
        
    }
    
    
    
    
}
