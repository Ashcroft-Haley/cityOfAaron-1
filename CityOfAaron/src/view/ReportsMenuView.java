/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import control.AccountingControl;

/**
 *
 * @author haleyashcroft
 */
public class ReportsMenuView extends ViewBase {
      

    
   public ReportsMenuView(){
       
   } 

    @Override
   protected String getMessage() {
        return "WELCOME TO: REPORTS MENU.\n"
                + "A - View the animals in the storehouse\n"
                + "T - View the tools in the storehouse\n"
                + "M - View the tool you have the most of\n"
                + "P - View the provisions in the storehouse\n"
                + "Q - View Storehouse Quantity Totals\n"
                + "AU - View the authors of this game\n"
                + "B - Back to Game Menu\n";
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
            case "A":
                loadAnimalsInStorehouse();
                break;
            case "T": 
                loadToolsInStorehouse();
                break;
            case "P": 
                loadProvisionsInStorehouse();
                break;
            case "M":
                loadMaximumTools();
                AccountingControl.ToolMax();
                break;
            case "AU": 
                loadAuthors();
                break;
            case "Q": 
                loadListTotalView();
                break;
            case "B":
                this.console.println("You are now leaving the Reports Menu...");
                return false;
        }
        
        return true;
        

    }

    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.

    private boolean loadAnimalsInStorehouse() {
        this.console.println("Animals in Storehouse coming soon!");
        return true;
    }
    
    private boolean loadToolsInStorehouse() {
        this.console.println("Tools in Storehouse coming soon!");
        return true;
    }
    
    private boolean loadProvisionsInStorehouse() {
        this.console.println("Provisons in Storehouse coming soon!");
        return true;
    }
    
    private boolean loadAuthors() {
        this.console.println("Created by Haley Ashcroft and Macen Steuhser");
        return true;
    }
    
    private boolean loadListTotalView(){
        View view = new ListTotalView();
        view.displayView();
        return true;
    }
    
    private boolean loadMaximumTools(){
        int highSoFar = AccountingControl.ToolMax();
        String tool = AccountingControl.ToolName();
        
        System.out.println("There are more " + tool + "s than any other tool.\n"
                + "Right now there are " + highSoFar + " in storage.");
        return true;
    }
    

    }


