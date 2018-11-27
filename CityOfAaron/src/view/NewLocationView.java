/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import model.Point;
import cityofaaron.CityOfAaron;
import model.Location;

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
        return "-------------------\n"
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
        
        Location[][] locationArray = cityofaaron.CityOfAaron.getCurrentGame().getTheMap().getLocations();
        System.out.println(locationArray[rowInput][columnInput].getDescription() + "\n"
                + locationArray[rowInput][columnInput].getGameTips() + "\n"
                );
        
//        System.out.println("You are now standing in one of the city's wheat fields.\n"
//        + "There is nothing but wheat as far as the eye can see. We hope to have a\n"
//        + "bountiful harvest this year. It takes 20 bushels of wheat to feed one person.");
        
        
        
        return true;
    }
    

    
    private static boolean getTheCreatedMap() {
        Location[][] locationArray = cityofaaron.CityOfAaron.getCurrentGame().getTheMap().getLocations();
        //locationArray[0][0].getName();
        //System.out.println(locationArray[0][0].getName());
        String firstRow = "";
        String secondRow = "";
        String thirdRow = "";
        String fourthRow = "";
        String fifthRow = "";
        System.out.println("----------------\n"
                + "Get ready to move!\n");
        
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < locationArray[i].length; j++){
                firstRow += locationArray[i][j].getName();
            }
            
        }
        System.out.println(firstRow);
        
        for (int i = 0; i > 0 && i < 2; i++) {
            for (int j = 0; j < locationArray[i].length; j++){
                secondRow += locationArray[i][j].getName();
            }
            
        }
        System.out.println(secondRow);
        
        for (int i = 0; i > 1 && i < 3; i++) {
            for (int j = 0; j < locationArray[i].length; j++){
                thirdRow += locationArray[i][j].getName();
            }
            
        }
        System.out.println(thirdRow);
        
        for (int i = 0; i > 2 && i < 4; i++) {
            for (int j = 0; j < locationArray[i].length; j++){
                fourthRow += locationArray[i][j].getName();
            }
            
        }
        System.out.println(fourthRow);
        
        for (int i = 0; i > 3 && i < 5; i++) {
            for (int j = 0; j < locationArray[i].length; j++){
                fifthRow += locationArray[i][j].getName();
            }
            
        }
        System.out.println(fifthRow);
        
        
        
        
        return true;
    }
    
}
