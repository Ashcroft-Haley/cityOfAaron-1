/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.GameControl;
import cityofaaron.CityOfAaron;
import model.Location;


/**
 *
 * @author haleyashcroft
 */
public class MapView extends ViewBase {

    /**
     * Constructor
     */
    public MapView(){

    }
    
    /**
     * The message that will be displayed by this view.
     */
    @Override
    protected String getMessage() {
        getTheCreatedMap();
        return "-------------------\n"
                + "Map Key:\n"
                + "W = Watchtower\n"
                + "F = Field\n"
                + "R = River\n"
                + "T = Temple\n"
                + "G = Granary/Storehouse\n"
                + "C = Ruler's Court\n"
                + "U = Undeveloped Land\n"
                + "V = Village\n\n"
                + "-------------------\n"
                + "What do you want to do?\n"
                + "M = Move to location on the map\n"
                + "E = Leave the Map Menu\n"
                ;
    }
    
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("Select where you want to go:");
        
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
       switch (inputs[0].trim().toUpperCase()){
            case "M":
                moveLocations();
                break;
            case "E":
                this.console.println("You are now exiting the Map.\n");
                return false;
        }
        
        return true;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    private boolean moveLocations(){
        NewLocationView view = new NewLocationView();
        view.displayView();
        
        return true;
    }
    
    private boolean getTheCreatedMap() {
        Location[][] locationArray = cityofaaron.CityOfAaron.getCurrentGame().getTheMap().getLocations();
        //locationArray[0][0].getName();
        //this.console.println(locationArray[0][0].getName());
        String firstRow = "";
        String secondRow = "";
        String thirdRow = "";
        String fourthRow = "";
        String fifthRow = "";
        this.console.println("----------------\n"
                + "Welcome to the Map of the city of Aaron!\n");
        
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < locationArray[i].length; j++){
                firstRow += locationArray[i][j].getName();
            }
            
        }
        this.console.println(firstRow);
        
        for (int i = 1; i > 0 && i < 2; i++) {
            for (int j = 0; j < locationArray[i].length; j++){
                secondRow += locationArray[i][j].getName();
            }
            
        }
        this.console.println(secondRow);
        
        for (int i = 2; i > 1 && i < 3; i++) {
            for (int j = 0; j < locationArray[i].length; j++){
                thirdRow += locationArray[i][j].getName();
            }
            
        }
        this.console.println(thirdRow);
        
        for (int i = 3; i > 2 && i < 4; i++) {
            for (int j = 0; j < locationArray[i].length; j++){
                fourthRow += locationArray[i][j].getName();
            }
            
        }
        this.console.println(fourthRow);
        
        for (int i = 4; i > 3 && i < 5; i++) {
            for (int j = 0; j < locationArray[i].length; j++){
                fifthRow += locationArray[i][j].getName();
            }
            
        }
        this.console.println(fifthRow);
        
        
        
        
        return true;
    }
    
}
