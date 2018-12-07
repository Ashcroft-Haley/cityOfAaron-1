/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.GameControl;
import exceptions.GameControlException;

/**
 *
 * @author Stuehser
 */
public class LoadGameView extends ViewBase {
         

    
   public LoadGameView(){
       
   } 

    @Override
   protected String getMessage() {
        return "Welcome to the grand world of GAME LOADING!\n";
    }
   
   @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        inputs[0] = getUserInput("Enter in the name of the file containing the saved game:");
        
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
      String filePath = inputs[0];
      //openFile(filePath);
      try{ 
          if (filePath == null || filePath.length() < 2){
               throw new GameControlException("Invalid filepath");

            }
            else{
          boolean check = GameControl.GetGame(filePath);
          if (check){
              View view = new GameMenuView();
              view.displayView(); 
              
          }else{
              return false;
          }
          }
      }catch(GameControlException gce){
          ErrorView.display("GameControl", gce.getMessage());
      }
        
        
        return false;
    }

    
    }

    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.

/*
    private boolean openFile(String fileName) {
        this.console.println("Loading a file coming soon! Returning to the Main Menu");
        return true;
    }

}
*/