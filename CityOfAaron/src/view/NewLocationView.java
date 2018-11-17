/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Point;
import cityofaaron.CityOfAaron;
/**
 *
 * @author haleyashcroft
 */
public class NewLocationView extends ViewBase {
    
     /**
     * Constructor
     */
    public NewLocationView(){
      
    }
    
    /**
     * The message that will be displayed by this view.
     */
    @Override
    protected String getMessage() {
        return "Get ready to move!\n"
                + "-------------------\n"
                + "Below is a grid of places you can go in the city:\n"
                + "[W][F][R][F][W]\n"
                + "[U][T][G][R][U]\n"
                + "[F][C][V][V][R]\n"
                + "[U][V][V][F][F]\n"
                + "[W][U][F][F][W]\n"
                + "-------------------\n"
                + "Map Key:\n"
                + "W = Watchtower\n"
                + "F = Field\n"
                + "R = River\n"
                + "T = Temple\n"
                + "G = Granary/Storehouse\n"
                + "C = Ruler's Court\n"
                + "U = Undeveloped Land\n"
                + "V = Village\n\n";
    }
    
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[2];
        
        inputs[0] = getUserInput("Please enter the row coordinate:");
        inputs[1] = getUserInput("Please enter the column coordinate:");
        
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
        if ((inputs[0] == null && inputs[1] == null) || (inputs[0].equals("") && inputs[1].equals(""))) {
            System.out.println("No coordinates entered. Returning to the Game Menu...");
            return false;
        }
        
        int rowInput = Integer.parseInt(inputs[0]);
        int columnInput = Integer.parseInt(inputs[0]);
        moveToNewLocation(rowInput, columnInput);
        
        return false;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    private boolean moveToNewLocation(int rowInput, int columnInput){
        // Define whatever code you need here to accomplish the action.
        // You can make this a void method if you want. Whatever you need 
        // here, you are free to do.
        //
        // Generally, though, this is where you will call into your Control
        // classes to do the work of the application.
        Point coordinates = new Point();
        coordinates.setTheColumn(columnInput);
        coordinates.setTheRow(rowInput);
        
        CityOfAaron.getCurrentGame().getTheMap().setCurrentLocation(coordinates);
        
        System.out.println("You are now standing in one of the city's wheat fields.\n"
        + "There is nothing but wheat as far as the eye can see. We hope to have a\n"
        + "bountiful harvest this year. It takes 20 bushels of wheat to feed one person.");
        
        
        
        return true;
    }
    

    
}
