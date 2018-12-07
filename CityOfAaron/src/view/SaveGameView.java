/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.Game;
import control.GameControl;
import exceptions.GameControlException;

/**
 *
 * @author Stuehser
 */
public class SaveGameView extends ViewBase {
    

    
   public SaveGameView(){
       
   } 

    @Override
   protected String getMessage() {
        return "You are about to Save.\n";
    }
   
   @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        inputs[0] = getUserInput("Please enter the filename or filepath you wish to use:");
        
        // Repeat for each input you need, putting it into its proper slot in the array.
        // Create a function for this to call
        
        return inputs;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs){
        // Act on the user's input.
        // This is a "dispatch" function that decides what
        // other functions to call. You can use an if-, if-else,
        // or switch statement.
        
        // return false if you want this view to exit and return
        // to the view that called it.
        //acceptableActionHandler(inputs);
        String filepath = inputs[0];
        Game game = cityofaaron.CityOfAaron.getCurrentGame();
        try{
            if (filepath == null || filepath.length() < 2){
               throw new GameControlException("Invalid filepath");
            }
            else{
            GameControl.SaveGame(game, filepath);
            }
           }
        catch(GameControlException gce){
            ErrorView.display("GameControl", gce.getMessage());
        }
        
        System.out.println("Game successfully saved to: " + filepath);
        
        return false;
        

    }

    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.



}