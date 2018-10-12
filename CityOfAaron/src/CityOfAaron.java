/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import model.Game;
import model.Map;
import model.Player;
import model.Storehouse;
import model.Author;
import model.Animal;
import model.InventoryItem;
import model.Provision;
import model.ItemType;
import model.Condition;

/**
 *
 * @author haleyashcroft
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Game theGame = new Game();
        theGame.setThePlayer(new Player());
        theGame.setTheMap(new Map());
        theGame.setTheStorehouse(new Storehouse());
        theGame.setCurrentPopulation(105);
        theGame.setAcresOwned(2000);
        theGame.setWheatInStorage(15000);
        
        Author theNames = new Author();
        Author theTitles = new Author();
        
        theNames.setName(new String[] {
            "Haley Ashcroft", "Tyler Tucker", "Macen Stuesher"
        });
        
        theTitles.setTitle(new String[] {
            "Student", "Student", "Student"
        });
     
        
        System.out.println(theGame.toString());
        System.out.println(theNames.toString());
        System.out.println(theTitles.toString());
        //System.out.println(theItemTypes.toString());
        
        for (ItemType items : ItemType.values()) {
            System.out.println(items);
        } 
        
        for (Condition conditions : Condition.values()) {
            System.out.println(conditions);
        } 
      
    }
    
}
