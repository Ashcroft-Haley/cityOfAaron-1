/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.Game;
import model.AnnualReport;
import model.Player;
import model.Map;
import model.Animal;
import model.InventoryItem;
import model.Storehouse;
import model.Author;
import model.Condition;
import model.ItemType;
import model.Provision;
import exceptions.WheatControlException;
import exceptions.GameControlException;
import view.ErrorView;

/**
 *
 * @author haleyashcroft
 */
public class GameControl {
    
    private static FakeRandom randomGenerator = new FakeRandom();
    
    protected static void setRandomGenerator(FakeRandom random){
        randomGenerator = random;
    };
    
    public static int getRandomNumber (int lowValue, int highValue)
    throws GameControlException{
        
        // If low < 0 or high < 0 then return -1
        if (lowValue < 0 || highValue < 0) {
            throw new GameControlException("Low value or high value is below zero.");
            
        }
        // If high <= low then return -2
        if (highValue <= lowValue) {
            throw new GameControlException("High value cannot be less than or equal to the low value.");
        }
        
        // If high is the maximum value for integers, then return -3
        if (highValue == Integer.MAX_VALUE) {
            throw new GameControlException("High value is the maximum value for integers.");
        }
        
        // Calculate the size of the range: add one so Random() icludes high value
        int range = (highValue - lowValue) + 1;
        
        // Return low + random(range size)
        return lowValue + randomGenerator.nextInt(range);
        
    }
    
    public  static AnnualReport liveTheYear(
            Game game, int tithesPercent,
            int bushelsForFood, int acresToPlant
    ) throws GameControlException {
        if (game == null || tithesPercent < 0 || tithesPercent > 100 || bushelsForFood < 0 || acresToPlant < 0){
            throw new GameControlException("Tithes percent, bushels for food, or acres to plant are incorrect.");
        }
        
        AnnualReport report = new AnnualReport();
        report.setLandPrice(LandControl.getCurrentLandPrice());
        
        int totalWheat = game.getWheatInStorage();
        
        int harvested = 0;
        int lostToRats = 0;
        int peopleStarved = 0;
        int peopleMovedIn = 0;
        
        try {
            harvested = WheatControl.calculateHarvest(tithesPercent, acresToPlant);
        } catch (WheatControlException ie){
            ErrorView.display("GameControl", 
                    "Error calculating harvest" + ie.getMessage());
            throw new GameControlException("Cannot calculate harvest.");
        }
        int tithingAmount = (int)(double)((tithesPercent/100.0) * harvested);
        
        
        
        try {
            lostToRats = WheatControl.calculateLossToRats(tithesPercent, totalWheat);
        } catch(WheatControlException ie) {
            ErrorView.display("GameControl", ie.getMessage());
            throw new GameControlException("Cannot calculate the amount of wheat lost to rats.");
        }
        
        peopleStarved = PeopleControl.calculateMortality(bushelsForFood, game.getCurrentPopulation());
        peopleMovedIn = PeopleControl.calculateNewMoveIns(game.getCurrentPopulation());
        
        totalWheat = totalWheat + harvested - tithingAmount - lostToRats;
        game.setWheatInStorage(totalWheat);
        game.setCurrentPopulation(game.getCurrentPopulation() - peopleStarved + peopleMovedIn);
        
        report.setBushelsHarvested(harvested);
        report.setTithingAmount(tithingAmount);
        report.setLostToRats(lostToRats);
        report.setPeopleStarved(peopleStarved);
        report.setPeopleMovedIn(peopleMovedIn);
        
        report.setEndingWheatInStorage(game.getWheatInStorage());
        report.setEndingPopulation(game.getCurrentPopulation());
        report.setEndingAcresOwned(game.getAcresOwned());
        
        return report;
    }
    
    public static Game createNewGame(String playerName) 
    {
        
        Player player = new Player();
        player.setName(playerName);
        
        Game game = new Game();
        game.setThePlayer(player);
        
        game.setCurrentPopulation(100);
        game.setAcresOwned(1000);
        game.setWheatInStorage(2700);
        
        Map map = MapControl.createMap();
        Provision[] provisions = createProvisions();
        Animal[] animals = createAnimals();
        InventoryItem[] inventoryItems = createTools();
        game.setTheMap(map);
        
        Storehouse storehouse = new Storehouse();
        Author[] author = {
            new Author("Haley Ashcroft", "Programmer"),
            new Author("Macen Steuhser", "Programmer")
        };
        storehouse.setAuthors(author);
        storehouse.setAnimals(animals);
        storehouse.setProvisions(provisions);
        storehouse.setTools(inventoryItems);
        
        game.setTheStorehouse(storehouse);
        
        return game;
    }
    
    public static Provision[] createProvisions() 
    {
        Provision[] provisions = new Provision[5];
        provisions[0] = new Provision(ItemType.Provision, 100, Condition.FAIR, "Honey", true);
        provisions[1] = new Provision(ItemType.Provision, 100, Condition.GOOD, "Tent", false);
        provisions[2] = new Provision(ItemType.Provision, 100, Condition.POOR, "rope", false);
        provisions[3] = new Provision(ItemType.Provision, 100, Condition.FAIR, "Blankets", false);
        provisions[4] = new Provision(ItemType.Provision, 100, Condition.FAIR, "Water", true);
        return provisions;
    }
    
    public static Animal[] createAnimals() 
    {
        Animal[] animals = new Animal[5];
        animals[0] = new Animal(ItemType.Animal, 50, Condition.FAIR, "Horse", 3);
        animals[1] = new Animal(ItemType.Animal, 52, Condition.FAIR, "Cow", 4);
        animals[2] = new Animal(ItemType.Animal, 54, Condition.FAIR, "Sheep", 6);
        animals[3] = new Animal(ItemType.Animal, 55, Condition.FAIR, "Duck", 5);
        animals[4] = new Animal(ItemType.Animal, 56, Condition.FAIR, "Donkey", 2);
        return animals;
    }
    
    public static InventoryItem[] createTools() 
    {
        InventoryItem[] items = new InventoryItem[5];
        items[0] = new InventoryItem(ItemType.Tool, 20, Condition.GOOD, "Axe");
        items[1] = new InventoryItem(ItemType.Tool, 5, Condition.GOOD, "Hammer");
        items[2] = new InventoryItem(ItemType.Tool, 200, Condition.GOOD, "Nail");
        items[3] = new InventoryItem(ItemType.Tool, 10, Condition.GOOD, "Saw");
        items[4] = new InventoryItem(ItemType.Tool, 50, Condition.GOOD, "Hoe");
        return items;
    }
    
  }
