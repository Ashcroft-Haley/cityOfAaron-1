/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author haleyashcroft
 */
public class BuyLandView extends ViewBase {
     

    
   public BuyLandView(){
       
   } 

    @Override
   protected String getMessage() {
        return "BUYING THE LAND:\n"
                + "How much land would you like to buy?";
    }
   
   @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        inputs[0] = getUserInput("Land in acres:");
        
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
      
        
        if (inputs[0] == null || inputs[0].equals("")) {
            ErrorView.display(this.getClass().getName(), "No acres entered. Returning to the Main Menu...");
            return false;
        }
        int acreInput = 0;
        try{
            acreInput = Integer.parseInt(inputs[0]);
        } catch(NumberFormatException nfe) {
            ErrorView.display("BuyLandView", nfe.getMessage());
        }
        
        if (acreInput < 0) {
            ErrorView.display("BuyLandView", "Acre value must be positive. Try again.");
            getInputs();
        }
        
        buyLand(acreInput);
        
        return false;
        

    }

    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.


    private boolean buyLand(int acreInput) {
        this.console.println("LandControl class coming soon!");
        return true;
    }

}
