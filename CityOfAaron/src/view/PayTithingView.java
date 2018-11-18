/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import model.Game;
import view.View;
/**
 *
 * @author Stuehser
 */
public class PayTithingView extends ViewBase {
 
        /**
     * The message that will be displayed by this view.
     */

    
    /**
     * Constructor
     */
    public PayTithingView(){
        
    }
    
     @Override
    protected String getMessage() {
        //Probably will throw in a scripture here as part of the intro
        return "It is a commandment to pay tithing on your increase.\n"
                + "Of course, it is a personal choice to follow the commandments.\n"
                + "What percentage of your increase will you give as tithing?\n";
               
    }
    
    
    /**
     * Get the user's input. Keep prompting them until they enter a value.
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a return key)
     * @return 
     */
    @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput(">: ", true);
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        // Create a function for this to call
        
        return inputs;
    }
    
    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we don't have 
     * to type it ourselves.
     * @param prompt
     * @return 
     */

    
    /**
     * Get the set of inputs from the user.
     * @return 
     */

    
        
    @Override
    public boolean doAction(String[] inputs){
        
        int Harvest;
        
     
        Harvest = CityOfAaron.getCurrentGame().getWheatInStorage();
        
        
        int intPut = Integer.parseInt(inputs[0]);
        
        if ((inputs[0] == null) || (inputs[0].equals(""))) {
            System.out.println("That's not a valid input, please try harder.\n");
            return true;
        }        
        
        if(intPut > 100 || intPut < 0){
            System.out.println("Please enter a valid percentage "
                    + "BETWEEN 0% and 100%.\n");
            return true;
        }
        else{
            //This updates the wheat stored.
            PayTithe(intPut);
            }   
        
        return false;
    }
    
    private boolean PayTithe(int percentage){
        int preGrowth = 1000, postGrowth = 0;
        //growth = CityOfAaron.getCurrentGame().
        //HarvestWheat has not been implemented yet, and we need it to find
        //the harvest from last season.
        postGrowth = (preGrowth / percentage) * 100;
        
        if (percentage > 0){
        System.out.println("You will give " + (preGrowth - postGrowth) + " in"
                + "offerings.");
        }
        else {
            System.out.println("Your actions have consequences.");
        }
       
        return true;
    }
    
    
}
