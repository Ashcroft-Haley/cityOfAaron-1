/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.EnumSet;
import model.Game;
import model.Map;
import model.Player;
import model.Storehouse;
import model.Point;
import model.Location;
import model.Author;
import model.Animal;
import model.InventoryItem;
import model.Provision;
import model.Condition;
import model.ItemType;

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
        
        
        //Author theAuthor = new Author();
        //theAuthor.setName(new String[] {
        //    "Haley Ashcroft", "Tyler Tucker", "Macen Stuesher"
        //});
        //theAuthor.setTitle(new String[] {
        //    "Student", "Student", "Student"
        //});
        
        //Storehouse theStorehouse = new Storehouse();
        //theStorehouse.setAuthors(theAuthor);
        
        
        Author theAuthor = new Author();
        theAuthor.setName(new String(
                "Haley Ashcroft, Tyler Tucker, Macen Stuehser"
        ));
        theAuthor.setTitle(new String(
                "The City of Aaron"
        ));
        
        Storehouse theStorehouse = new Storehouse();
        theStorehouse.setAuthors(new Author[] {
            theAuthor
        });
        
        
        
        InventoryItem theInventoryItem = new InventoryItem();
        theInventoryItem.setItemType(ItemType.Tool);
        theInventoryItem.setCondition(Condition.FAIR);
        theInventoryItem.setQuantity(201);
        
        theStorehouse.setTools(new InventoryItem[] {
            theInventoryItem
        });
        
        
        Location theLocation = new Location();
        theLocation.setGameTips(new String[] {
            "Tip 1", "Tip 2", "Tip 3"
        });
        theLocation.setName(new String(
                "Treasury"
        ));
        theLocation.setDescription(new String(
                "Full of all the riches and wealth of the city of Aaron!"
        ));
        theLocation.setMapSymbol(new String(
                "@"
        ));
        
        Point aPoint = new Point();
        aPoint.setTheColumn(413);
        aPoint.setTheRow(612);
        
        Player myName = new Player();
        myName.setName("Steve?");
        
        Map theMap = new Map();
        theMap.setCurrentLocation(aPoint);
        
        
        
        
        Game theGame = new Game();
        theGame.setThePlayer(myName);
        theGame.setTheMap(theMap);
        theGame.setTheStorehouse(theStorehouse);
        theGame.setCurrentPopulation(105);
        theGame.setAcresOwned(2000);
        theGame.setWheatInStorage(15000);
        
        
        
        //Location aLocation = new Location();
        //aLocation.setDescritptionOfLocation("That sure is a location!");
        //aLocation.setNameOfLocation("Le City de Aaaron");
        //aLocation.setSymbolOfLocation("L");
        //aLocation.setTipsForLocation("Watch out!  It looks out of place.");
                
        
        
   
        //System.out.println(aLocation.toString()); 
        System.out.println(theLocation.toString());
        System.out.println(aPoint.toString());
        System.out.println(myName.getName());
        
     
        
        System.out.println(theGame.toString());
        System.out.println(theAuthor.toString());
        
        //for (ItemType items : ItemType.contents.values()) {
        //    System.out.println(items);
        //} 
        
        for (Condition conditions : Condition.values()) {
            System.out.println(conditions);
        } 
      
    }
    
}
