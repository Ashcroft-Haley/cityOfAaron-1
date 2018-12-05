/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.StorehouseControl;

/**
 *
 * @author haleyashcroft
 */
public class ListTotalView extends ViewBase {
    public ListTotalView(){
       
   } 

    @Override
   protected String getMessage() {
        return "QUANTITY TOTALS FOR STOREHOUSE ITEMS:\n"
                + "Which type of storehouse item's qunatity total do you want to see?\n"
                + "A - Animals\n"
                + "T - Tools\n"
                + "P - Provisions\n"
                + "B - Back to Reports Menu\n";
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
        // Act on the user's input.
        // This is a "dispatch" function that decides what
        // other functions to call. You can use an if-, if-else,
        // or switch statement.
        
        // return false if you want this view to exit and return
        // to the view that called it.
        //acceptableActionHandler(inputs);
      
        
        switch (inputs[0].trim().toUpperCase()){
            case "A":
                int animalTotal = loadAnimalsQTotal();
                this.console.println("There are " + animalTotal + " total animals in the Storehouse\n");
                break;
            case "T": 
                int toolTotal = loadToolsQTotal();
                this.console.println("There are " + toolTotal + " total tools in the Storehouse\n");
                break;
            case "P": 
                int provisionTotal = loadProvisionsQTotal();
                this.console.println("There are " + provisionTotal + " total provisions in the Storehouse\n");
                break;
            case "B":
                this.console.println("You are now leaving the Qunatity Totals Menu...");
                return false;
        }
        
        return true;
        

    }

    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.


    private static int loadAnimalsQTotal(){
        int total = StorehouseControl.calcAnimalTotal();
        return total;
    }
    
    private static int loadToolsQTotal(){
        int total = StorehouseControl.calcToolTotal();
        return total;
    }
    
    private static int loadProvisionsQTotal(){
        int total = StorehouseControl.calcProvisionTotal();
        return total;
    }
}
