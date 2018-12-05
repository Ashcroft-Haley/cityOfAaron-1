/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import exceptions.GameControlException;
import exceptions.WheatControlException;
import view.ErrorView;

/**
 *
 * @author haleyashcroft
 */
public class WheatControl {
    
    public static int calculateLossToRats(int tithesPercent, int wheatInStorage)
        throws WheatControlException {
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
            throw new WheatControlException("Wheat in Storage cannot be negative.");
        }
        
        if (tithesPercent < 0 || tithesPercent > 100) {
            throw new WheatControlException("Tithing percentage must greater than 0 and not more than 100.");
        };
        
        int chanceOfRats = 0;
        
        try{
        chanceOfRats = GameControl.getRandomNumber(1,100);
        } catch(GameControlException gce) {
            ErrorView.display("WheatControl", gce.getMessage());
        }
        
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
        
        double percentLost = 0;
        
        try {
            percentLost = GameControl.getRandomNumber(low, high) * 0.01;
        } catch (GameControlException gce){
            ErrorView.display("WheatControl", gce.getMessage());
        }
        double totalRatLoss = wheatInStorage * percentLost;
        double roundedValue = Math.round(totalRatLoss); //Rounds double value so it can be turned into an int
        int intValue = (int) roundedValue; //Converting a double to int using explcit casting
        
        return intValue; //Returns value as an int
        
    }
    
    
    public static int calculateHarvest(int tithesPercent, int wheatInStorage) 
        throws WheatControlException {
        if (wheatInStorage < 0) {
            throw new WheatControlException("Wheat in Storage cannot be negative.");
        }
        
        if (tithesPercent < 0 || tithesPercent > 100) {
            throw new WheatControlException("Tithing percentage must greater than 0 and not more than 100.");
        };
        
        
        int low = 0;
        int high = 0;
        
        if(tithesPercent > 12) {
            low = 2;
            high = 5;
        }
        
        if(tithesPercent > 8 && tithesPercent < 12) {
            low = 2;
            high = 4;
        }
        
        if (tithesPercent < 8) {
            low = 1;
            high = 3;
        }
        
        int bushelsPerAcre = 0;
        
        try {
            bushelsPerAcre = GameControl.getRandomNumber(low, high);
        } catch (GameControlException gce){
            ErrorView.display("WheatControl", gce.getMessage());
        }
        
        return bushelsPerAcre;
    }
    
}
