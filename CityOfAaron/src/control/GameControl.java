/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.Game;
import model.AnnualReport;
import model.Player;
import cityofaaron.CityOfAaron;
import model.InventoryItem;
import model.Animal;
import model.Provision;
import model.Storehouse;
import java.util.ArrayList;
import model.Condition;
import model.ItemType;


/**
 *
 * @author haleyashcroft
 */
public class GameControl {
    
    private static FakeRandom randomGenerator = new FakeRandom();
    
    protected static void setRandomGenerator(FakeRandom random) {
        randomGenerator = random;
    };
    
    public static int getRandomNumber(int lowValue, int highValue){
        
        // If low < 0 or high < 0 then return -1
        if (lowValue < 0 || highValue < 0) {
            return -1;
            
        }
        // If high <= low then return -2
        if (highValue <= lowValue) {
            return -2;
        }
        
        // If high is the maximum value for integers, then return -3
        if (highValue == Integer.MAX_VALUE) {
            return -3;
        }
        
        // Calculate the size of the range: add one so Random() icludes high value
        int range = (highValue - lowValue) + 1;
        
        // Return low + random(range size)
        return lowValue + randomGenerator.nextInt(range);
        
    }
    
    public static int createNewGame (Player Player){
    
        if(Player == null){
            return -1;
        }
        
        Game game = new Game();
        game.setThePlayer(Player);
        
   
        
    
        
        
        Storehouse storehouse = new Storehouse();
        
        cityofaaron.CityOfAaron.setCurrentGame(game);
        
        Provision[] provisions = {
            new Provision("A Vegetable", true),
            new Provision("Twinkies", false),
            new Provision("Boar", true)
        };
        
    
        storehouse.setProvisions(provisions);
        
        Animal[] animal = {
            
            new Animal("Smokey", 57),
            new Animal("Phill", 23),
            new Animal("ShadowQuacks", 413)
    
    
    
    };
        
        storehouse.setAnimals(animal);
 
        InventoryItem[] inventoryItem = {
            new InventoryItem("Stick", ItemType.Tool, 2, Condition.POOR),
            new InventoryItem("Hammer", ItemType.Tool, 7, Condition.FAIR),
            new InventoryItem("MizziumPestle", ItemType.Tool, 413, Condition.GOOD),
        };
        game.setTheStorehouse(storehouse);
        
        return 1;
        
        
        
        
    }

    
    
    
    
//    public  static AnnualReport liveTheYear(
//            Game game, int tithesPercent,
//            int bushelsForFood, int acresToPlant
//    ){
//        if (game == null || tithesPercent < 0 || tithesPercent > 100 || bushelsForFood < 0 || acresToPlant < 0){
//            return null;
//        }
//        
//        AnnualReport report = new AnnualReport();
//        report.setLandPrice(LandControl.getCurrentLandPrice());
//        
//        int totalWheat = game.getWheatInStorage();
//        
//        int harvested = WheatControl.calculateHarvest(tithesPercent, acresToPlant);
//        int tithingAmount = (int)(double)((tithesPercent/100.0) * harvested);
//        int lostToRats = WheatControl.calculateLossToRats(tithesPercent, totalWheat);
//        
//        int peopleStarved = PeopleControl.calculateMortality(bushelsForFood, game.getCurrentPopulation());
//        int peopleMovedIn = PeopleControl.calculateNewMoveIns(game.getCurrentPopulation());
//        
//        totalWheat = totalWheat + harvested - tithingAmount - lostToRats;
//        game.setWheatInStorage(totalWheat);
//        game.setCurrentPopulation(game.getCurrentPopulation() - peopleStarved + peopleMovedIn);
//        
//        report.setBushelsHarvested(harvested);
//        report.setTithingAmount(tithingAmount);
//        report.setLostToRats(lostToRats);
//        report.setPeopleStarved(peopleStarved);
//        report.setPeopleMovedIn(peopleMovedIn);
//        
//        report.setEndingWheatInStorage(game.getWheatInStorage());
//        report.setEndingPopulation(game.getCurrentPopulation());
//        report.setEndingAcresOwned(game.getAcresOwned());
//    }
    
}
