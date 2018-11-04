/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author haleyashcroft
 */
public class HelpMenuView {
    
        
    
    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public HelpMenuView(){
        
        message = "Welcome to the Help Menu View.\n\n"
                + "WHAT ARE THE GOALS OF THE GAME?\n"
                + "You will assume the role of the leader over the city of Aaron,\n"
                + "and your job is to survive each year for ten years. You are to\n"
                + "manage the villageswheat crops so that the village can be adaquately\n"
                + "fed while dealing with rats and random crop yields. The city is\n"
                + "The city is blessed when the people pay tithes and offerings.\n"
                + "If too many people die during your term you will be removes from\n"
                + "office and the game ends.\n"
                + "WHERE IS THE CITY OF AARON\n"
                + "The city of Aaron is a Book of Mormon city located somwhere on the\n"
                + "American continent around 200 years before Christ's birth.\n"
                + "HOW DO I MOVE TO ANOTHER LOCATION?\n"
                + "(explanation here)\n"
                + "HOW DO I DISPLAY A LIST OF ANIMALS, PROVISIONS, AND TOOLS IN THE STOREHOUSE?\n"
                + "(explanation here)\n\n"
                + "B - Back to Main Menu";
                
    }
    
    
    /**
     * Get the user's input. Keep prompting them until they enter a value.
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a return key)
     * @return 
     */
    protected String getUserInput(String prompt, boolean allowEmpty){
        
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputReceived = false;
        
        while(inputReceived == false){
            
            System.out.println(prompt);
            input = keyboard.nextLine();
            
            // Make sure we avoid a null-pointer error.
            if (input == null){
                input = "";
            }
            
            // Trim any trailing whitespace, including the carriage return.
            input = input.trim();
            
            if (input.equals("") == false || allowEmpty == true){
                inputReceived = true;
            }
        }
        
        return input;
    }
    
    
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
        
        inputs[0] = getUserInput("Press the 'B' key to return to the Main Manu.");
        
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
        
        switch (inputs[0].trim().toUpperCase()) {
            case "B":
                return false;
        }
        
        return true;
    }
    
    
    /**
     * Control this view's display/prompt/action loop until the user
     * chooses and action that causes this view to close.
     */
    public void displayView(){
        
        boolean keepGoing = true;
        
        while(keepGoing == true){
            
            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }
    
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
//    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    

    
}
