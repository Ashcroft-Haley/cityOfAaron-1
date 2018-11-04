/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author Stuehser
 */
public class MainMenuView {
    
     protected String message;

    

    
    
   public MainMenuView(){
       
       message = "WELCOME TO: MAIN MENU.\n"
                + "Four paths lie in front of you.\n"
               + "Which path do you choose to walk:\n"
                + "1 - Start a New game!\n"
                + "2 - Load a Saved Game.\n"
                + "3 - Help!\n"
                + "4 - Quit\n";
   } 
   




    
    
    protected String getUserInput (String prompt, boolean allowEmpty){
        
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputRecieved = false;
        
        while(inputRecieved == false){
            System.out.println(prompt);
            input = keyboard.nextLine();
            
            
            if(input == null){
                input = "";
            }
            
            input = input.trim();
            
            if (input.equals("") == false || allowEmpty == true){
                inputRecieved = true;
            
                }
            }
            
        return input;
    }
        
    
    
    protected String getUserInput (String prompt){
        return getUserInput(prompt, false);
    }
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
    public boolean doAction(String[] inputs){
        // Act on the user's input.
        // This is a "dispatch" function that decides what
        // other functions to call. You can use an if-, if-else,
        // or switch statement.
        
        // return false if you want this view to exit and return
        // to the view that called it.
        //acceptableActionHandler(inputs);
        
                char input;
         input = inputs[0].trim().charAt(0);
        
        switch (input){
            case 1: GameView.displayView();
                break;
                
            case 2: input = 2;
                loadSavedGame();
                break;
                
            case 3: HelpView.displayView();
                break;
                
            case 4: input = 4;
                System.out.println("Thanks for playing!");
                return false;
            default: System.out.println("Whoops!  It looks like that input is"
                    + "invalid.  Look more closely at the menu and please"
                    + "try again!");
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
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    



    private static NewGameView GameView = new NewGameView();
    private static HelpMenuView HelpView = new HelpMenuView();
    private void loadSavedGame(){
        System.out.println("Huh, it seems like this feature has not"
                        + "been implementated yet.");
}
}