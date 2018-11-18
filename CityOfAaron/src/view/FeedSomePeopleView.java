
package view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import model.Game;
import view.View;

/**
 *
 * @author Stuehser
 */
public class FeedSomePeopleView extends ViewBase {
    
    
    /**
     * The message that will be displayed by this view.
     */

    
    /**
     * Constructor
     */
    public FeedSomePeopleView(){
        
    }
    
     @Override
    protected String getMessage() {
        return "You are about to feed the people.\n\n"
                + "They, being people, need food to live.\n"
                + "How much wheat will you give them?\n";
               
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
        
        inputs[0] = getUserInput("Please enter", true);
        
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
        
        int storedWheat;
        
        //Because a game hasn't technically started yet, testing this
        //returns a null value for the wheat in storage.
        storedWheat = CityOfAaron.getCurrentGame().getWheatInStorage();
        
        
        int intPut = Integer.parseInt(inputs[0]);
        
        if ((inputs[0] == null) || (inputs[0].equals(""))) {
            System.out.println("But thou must...");
            return true;
        }        
        
        if(storedWheat < intPut || intPut < 0){
            System.out.println("Apologies, but your grain check bounced.\n"
                    + "Please enter a positive value equal to or less than "
                    + "your current grain in storage.");
            return true;
        }
        else{
            //This updates the wheat stored.
            updateWheat(storedWheat, intPut);
            }   
        
        return false;
    }
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */

    
    
    /**
     * Control this view's display/prompt/action loop until the user
     * chooses and action that causes this view to close.
     *
    public void displayView(){
        
        boolean keepGoing = true;
        
        while(keepGoing == true){
            
            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }
    */
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
      
    private boolean updateWheat(int wheatStored, int wheatFed){
        // Define whatever code you need here to accomplish the action.
        // You can make this a void method if you want. Whatever you need 
        // here, you are free to do.
        //
        // Generally, though, this is where you will call into your Control
        // classes to do the work of the application.
        
        int wheatFinal = wheatStored - wheatFed;
        CityOfAaron.getCurrentGame().setWheatInStorage(wheatFinal); 
        System.out.println("You have " + wheatFinal + " units of"
                            + "wheat remaining in your stores.");
                    
        
     
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayView();
         
         return true;
        
    }
    /*
    private int Game() {
        int storedWheat;
        storedWheat = CityOfAaron.getCurrentGame().getWheatInStorage();
        //storedWheat = m.Game().getWheatInStorage();
        return storedWheat;
    }
    */

}