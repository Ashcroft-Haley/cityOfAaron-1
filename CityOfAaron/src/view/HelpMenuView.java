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
public class HelpMenuView extends ViewBase {
    
    public HelpMenuView(){
        
    }
    
    /**
     * The message that will be displayed by this view.
     */
    protected String getMessage(){
        return "Welcome to the Help Menu View.\n\n"
                + "G - WHAT ARE THE GOALS OF THE GAME?\n"
                + "W - WHERE IS THE CITY OF AARON\n"
                + "M -HOW DO I MOVE TO ANOTHER LOCATION?\n"
                + "S - HOW DO I DISPLAY A LIST OF ANIMALS, PROVISIONS, AND TOOLS IN THE STOREHOUSE?\n";
    };
    
    
    /**
     * Get the user's input. Keep prompting them until they enter a value.
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a return key)
     * @return 
     */
    
    
    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we don't have 
     * to type it ourselves.
     * @param prompt
     * @return 
     */
    protected String getUserInput(String prompt){
        return getUserInput(prompt, false);
    }
    
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    public String[] getInputs() {
        
        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];
        
        inputs[0] = getUserInput("What do you need help with? Press enter to exit the Help Menu.");
        
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
    public boolean doAction(String[] inputs){
        
        if (inputs[0] == null || inputs[0].equals("")) {
            ErrorView.display(this.getClass().getName(), "No menu item selected. Returning to the Main Menu...");
            return false;
        }
        
        switch (inputs[0].trim().toUpperCase()){
            case "G":
                this.console.println("You will assume the role of the leader over the city of Aaron,\n"
                        + "and your job is to survive each year for ten years. You are to\n"
                        + "manage the villageswheat crops so that the village can be adaquately\n"
                        + "fed while dealing with rats and random crop yields. The city is\n"
                        + "The city is blessed when the people pay tithes and offerings.\n"
                        + "If too many people die during your term you will be removes from\n"
                        + "office and the game ends.\n"
                );
                getInputs();
                break;
            case "W": 
                this.console.println("The city of Aaron is a Book of Mormon city located somwhere on the\n"
                        + "American continent around 200 years before Christ's birth.\n"
                );
                getInputs();
                break;
            case "M": 
                this.console.println("The map of the city of Aaron is a grid of locations.\n"
                        + "To move to a new location, the game will prompt you for the row\n"
                        + "and column number, or the locations coordinates. You'll be able\n"
                        + "see where your current location is as well as relevant tips to win"
                );
                getInputs();
                break;
            case "S": 
                this.console.println("You need to access the Reports Menu. It's located in the\n"
                        + "Game Menu, and you can choose to look at reports for animals, tools\n"
                        + "and provisions. There will be lists of each of these storehouse items."
                );
                getInputs();
                break;
        }
        
        return true;
    }
    
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
//    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    

    
}
