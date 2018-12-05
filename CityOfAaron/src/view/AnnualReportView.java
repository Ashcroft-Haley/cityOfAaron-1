/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.AnnualReport;
import cityofaaron.CityOfAaron;
import control.GameControl;
import model.Game;
import exceptions.GameControlException;

/**
 *
 * @author haleyashcroft
 */
public class AnnualReportView extends ViewBase {
    public AnnualReportView(){
       
   } 

    @Override
   protected String getMessage() {
        return "WELCOME TO LIVING THE YEAR!\n\n"
                + "Are you sure you want to Live the Year?\n"
                + "Y - Yes, live the year"
                + "N - No, go back";
                
    }
   
   @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        inputs[0] = getUserInput("Make your selection:");
        
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
        
        switch (inputs[0].trim().toUpperCase()){
            case "Y":
                AnnualReport calcTheYear = performLiveTheYear();
                int bushelsHarvested = calcTheYear.getBushelsHarvested();
                int endingAcresOwned = calcTheYear.getEndingAcresOwned();
                int endingPop = calcTheYear.getEndingPopulation();
                int endingWheat = calcTheYear.getEndingWheatInStorage();
                int landPrice = calcTheYear.getLandPrice();
                int lostToRats = calcTheYear.getLostToRats();
                int peopleMovedIn = calcTheYear.getPeopleMovedIn();
                int peopleStarved = calcTheYear.getPeopleStarved();
                int tithingAmount = calcTheYear.getTithingAmount();
                
                this.console.println("WELCOME TO LIVING THE YEAR!\n"
                + " = Year Number\n"
                + landPrice + " = Land Price\n"
                + peopleStarved + " = People Who Starved\n"
                + peopleMovedIn + " = People Who Came to the City\n"
                + lostToRats + " = Wheat Lost to Rats\n"
                + endingPop + " = Current Population\n"
                + endingAcresOwned + " = Acres of Crop Land Owned by City\n"
                + bushelsHarvested + " = Bushels Per Acre in Harvest\n"
                + tithingAmount + " = Bushels of Wheat Paid in Offerings\n"
                + endingWheat + " = Bushels of Wheat in Storage\n"
                );
                return false;
                
            case "N":
                this.console.println("Going to Game Menu...");
                return false;
        }
        
        return true;
      
    }

    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.

    public static AnnualReport performLiveTheYear() {

        Game currentGame = CityOfAaron.getCurrentGame();
        AnnualReport calcTheYear = null;
        try{
            calcTheYear = GameControl.liveTheYear(currentGame, -10, 1000, 1000);
        return calcTheYear;
        } catch (GameControlException ie) {
            ErrorView.display("AnnualReportView", ie.getMessage());
            return null;
        }
    }
    
}
