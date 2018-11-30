/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cityofaaron;

import view.StartProgramView;
import model.Game;
import view.View;


/**
 *
 * @author haleyashcroft
 */
public class CityOfAaron {
    
    //Keep a copy of the current Game object in the main class.
    public static Game currentGame = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game game) {
        currentGame = game;
    }

    
    
    public static void main(String[] args) {
        
        try{
            
        
        View startProgramView = new StartProgramView();
        startProgramView.displayView();
    }
        catch(Throwable te){
            System.out.println("Exception caught in Main");
            System.out.println(te.getMessage());
            te.printStackTrace();
            System.exit(0);
        }
            
        }
        
}
