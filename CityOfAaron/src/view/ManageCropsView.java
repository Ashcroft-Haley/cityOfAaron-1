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
public class ManageCropsView extends ViewBase {
          

    
   public ManageCropsView(){
       
   } 

    @Override
   protected String getMessage() {
        return "WELCOME TO: MANAGE THE CROPS MENU.\n"
                + "B - Buy Land\n"
                + "S - Sell Land\n"
                + "F - Feed the People\n"
                + "P - Plant Crops\n"
                + "T - Pay Tithes and Offerings\n"
                + "R - Back to Game Menu\n";
    }
   
   @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        inputs[0] = getUserInput("Please make your selection.");
        
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
      
        
        switch (inputs[0].trim().toUpperCase()){
            case "B":
                loadBuyLandView();
                break;
            case "S": 
                loadSellLandView();
                break;
            case "F": 
                loadFeedSomePeopleView();
                break;
            case "P": 
                loadPlantCropsView();
                break;
            case "T": 
                loadPayTithingView();
                break;
            case "R":
                System.out.println("You are now leaving the Manage Crops Menu...");
                return false;
        }
        
        return true;
        

    }

    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.

    private void loadBuyLandView() {
        View view = new BuyLandView();
        view.displayView();
    }
    
    private boolean loadSellLandView() {
        View view = new SellLandView();
        view.displayView();
        return true;
    }
    
    private boolean loadFeedSomePeopleView() {
        View view = new FeedSomePeopleView();
        view.displayView();
        return true;
    }
    
    private boolean loadPlantCropsView() {
        View view = new PlantCropsView();
        view.displayView();
        return true;
    }
    
    private boolean loadPayTithingView() {
        View view = new PayTithingView();
        view.displayView();
        return true;
    }

}
