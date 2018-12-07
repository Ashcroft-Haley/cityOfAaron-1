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
public class GameMenuView extends ViewBase {
     

    
   public GameMenuView(){
       
   } 

    @Override
   protected String getMessage() {
        return "WELCOME TO: GAME MENU.\n"
                + "V - View the Map\n"
                + "M - Move to a new location\n"
                + "C - Manage the crops\n"
                + "L - Live the Year\n"
                + "R - Reports Menu\n"
                + "S - Save Game\n"
                + "B - Back to Main Menu\n";
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
            case "V":
                loadMapView();
                break;
            case "M": 
                moveToNewLocation();
                break;
            case "C": 
                manageTheCrops();
                break;
            case "L": 
                liveTheYear();
                break;
            case "R": 
                loadMenuForReports();
                break;
            case "S": 
                saveCurrentGame();
                break;
            case "B":
                this.console.println("You are now leaving the Game Menu...");
                return false;
        }
        
        return true;
        

    }

    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.


    private void loadMapView() {
        View view = new MapView();
        view.displayView();
    }
    
    private void moveToNewLocation() {
        View view = new NewLocationView();
        view.displayView();
    }
    
    private void manageTheCrops() {
        View view = new ManageCropsView();
        view.displayView();
    }
    
    private void liveTheYear() {
        View view = new AnnualReportView();
        view.displayView();
    }
    
    private void loadMenuForReports() {
        View view = new ReportsMenuView();
        view.displayView();
    }
    
    private boolean saveCurrentGame() {
    
        View view = new SaveGameView();
        view.displayView();
        return true;
    }
}
