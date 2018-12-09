/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.StorehouseControl;
import exceptions.StorehouseControlException;

/**
 *
 * @author Stuehser
 */
public class SaveStorehouseInfoView extends ViewBase{
    public SaveStorehouseInfoView(){
       
   } 

    @Override
   protected String getMessage() {
        return "Enter the file location you want to print the report to. \n";
    }
   
   @Override
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        
        String[] inputs = new String[1];
        inputs[0] = getUserInput("File path: ");
        
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
            ErrorView.display(this.getClass().getName(), "No filepath specified. Leaving to Reports Menu...");
            return false;
        }
        
        String filePath = inputs[0];
        
        try {
            StorehouseControl.loadStorehouseInfo(filePath);
            System.out.println("File successfully written!");
        } catch(StorehouseControlException sce) {
            ErrorView.display(this.getClass().getName(), 
                    "Error printing inventory items." + sce.getMessage());
            return false;
        }
        
        return false;
        }
}