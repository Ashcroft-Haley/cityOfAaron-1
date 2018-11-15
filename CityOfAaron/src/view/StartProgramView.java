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
public class StartProgramView extends ViewBase {
    
    
    /**
     * The message that will be displayed by this view.
     */
    public StartProgramView() {
        super();
    }
    
    /**
     * Constructor
     */
    @Override
    protected String getMessage(){
        
        return "Welcome to the City of Aaron!\n\n"
                + "You have been summoned here by the High Priest to assume\n"
                + "your role as ruler of the city. Your responsibility is to buy and sell land, determine how much\n"
                + "wheat to plant each year and how much to set aside to feed your people. In addition, it will be\n"
                + "your job to pay an annual tithe on the wheat that is harvested. If you fail to provide enough\n"
                + "wheat for the people, people will starve, some people will die, and your workforce will be\n"
                + "diminished. Plan carefully. And Oh, there is always a danger of rats eating your wheat.\n";
                
    }

    /**
     * Get the set of inputs from the user.
     * @return 
     */
    @Override
    public String[] getInputs() {
        
        // This view is not interactive. All it does is show
        // the game description
        return null;
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
        startMainMenuView();
        
        return false;
    }
    
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    
    private void startMainMenuView() {
        pause(2000);
        View mainMenu = new MainMenuView();
        mainMenu.displayView();
    }
    
}
