/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import model.Player;
import model.Game;
import view.View;

/**
 *
 * @author haleyashcroft
 */
public class NewGameView extends ViewBase {
    
    /**
     * Constructor
     */
    public NewGameView(){
         
    }
    
    @Override
    protected String getMessage() {
        return "Starting a new game...\n";
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
        
        inputs[0] = getUserInput("Please enter your name, or press Enter to return to the Main Menu", true);
        
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
        
        if (inputs[0] == null || inputs[0].equals("")) {
            System.out.println("No player name entered. Returning to the Main Menu...");
            return false;
        }
        
        String playerName = inputs[0];
        createAndStartGame(playerName);
        
        return false;
    }

    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    private boolean createAndStartGame(String playerName){
        // Eventually we will do this:
        // Game game = GameControl.createNewGame(playerName);
        //
        // but for this week, we'll just do this:
        
        Player player = new Player();
        player.setName(playerName);
        
        Game game = new Game();
        game.setThePlayer(player);
        
        CityOfAaron.setCurrentGame(game);
        
        //System.out.println();
        //System.out.println("Welcome to the game, " + CityOfAaron.getCurrentGame().getThePlayer().getName() + "!\n"
        //        + "Next week we will have a GameView that you will see. But for now,\n"
        //        + "we're just going to send you back to the Main Menu.\n");
        
        
        //Once the GameMenuView is created we will call it here.
         GameMenuView gameMenu = new GameMenuView();
         gameMenu.displayView();
        
        return true;
        
    }
    
}
