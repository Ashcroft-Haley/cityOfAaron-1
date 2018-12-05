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
public class PlantCropsView extends ViewBase {
    
        public PlantCropsView(){
    
        }
   
    
    @Override
    protected String getMessage() {
        //Probably will throw in a scripture here as part of the intro
        return "This chosen place sits\n"
                + "Free of substance and meaning,\n"
                + "Save for a haiku?\n";
               
    }
    
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
    
            
    @Override
    public boolean doAction(String[] inputs){
       /* 
        int Harvest;
        
     
        Harvest = CityOfAaron.getCurrentGame().getWheatInStorage();
        
        int input = 0;
        try{
            input = Integer.parseInt(inputs[0]);
        } catch(NumberFormatException nfe) {
            ErrorView.display(this.getClass().getName(), "The number entered is not valid. " + nfe.getMessage());
        }
        
        if ((inputs[0] == null) || (inputs[0].equals(""))) {
            ErrorView.display(this.getClass().getName(), "That's not a valid input, please try harder.\n");
            return true;
        }        
        
        if(input > 100 || input < 0){
            ErrorView.display(this.getClass().getName(), "Please enter a valid percentage "
                    + "BETWEEN 0% and 100%.\n");
            return true;
        }
        else{
            //This updates the wheat stored.
            //SomeActionhandler();
            }   
        */
        return false;
    }
    
    private boolean FreeRealEstate(){
    
        return true;
    }
    
}
