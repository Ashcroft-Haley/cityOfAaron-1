/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Location;
import model.Map;
import model.Point;
import model.Game;
import exceptions.MapControlException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author haleyashcroft
 */
public class MapControl {
    public static Map createMap() {

       
        Map map = new Map();
        int noOfRows = 5;
        int noOfColumns = 5;
        
        Location[][] locations = new Location[noOfRows][noOfColumns];
        
        locations[0][0] = new Location("Watchtower", "Fill in a description...", "W", new String[]{});
        locations[0][1] = new Location("Field", "Fill in a description...", "F", new String[]{});
        locations[0][2] = new Location("River", "Fill in a description...", "R", new String[]{});
        locations[0][3] = new Location("Field", "Fill in a description...", "F", new String[]{});
        locations[0][4] = new Location("Watchtower", "Fill in a description...", "W", new String[]{});
        
        locations[1][0] = new Location("Undeveloped Land", "Fill in a description...", "U", new String[]{});
        locations[1][1] = new Location("Temple", "Fill in a description...", "T", new String[]{});
        locations[1][2] = new Location("Granary/ Storehouse", "Fill in a description...", "G", new String[]{});
        locations[1][3] = new Location("River", "Fill in a description...", "R", new String[]{});
        locations[1][4] = new Location("Undeveloped Land", "Fill in a description...", "U", new String[]{});
        
        locations[2][0] = new Location("Field", "Fill in a description...", "F", new String[]{});
        locations[2][1] = new Location("Ruler's Court", "Fill in a description...", "C", new String[]{});
        locations[2][2] = new Location("Village", "Fill in a description...", "V", new String[]{});
        locations[2][3] = new Location("Village", "Fill in a description...", "V", new String[]{});
        locations[2][4] = new Location("River", "Fill in a description...", "R", new String[]{});
        
        locations[3][0] = new Location("Undeveloped Land", "Fill in a description...", "U", new String[]{});
        locations[3][1] = new Location("Village", "Fill in a description...", "V", new String[]{});
        locations[3][2] = new Location("Village", "Fill in a description...", "V", new String[]{});
        locations[3][3] = new Location("Field", "Fill in a description...", "F", new String[]{});
        locations[3][4] = new Location("Field", "Fill in a description...", "F", new String[]{});
        
        locations[4][0] = new Location("Watchtower", "Fill in a description...", "W", new String[]{});
        locations[4][1] = new Location("Undeveloped Land", "Fill in a description...", "U", new String[]{});
        locations[4][2] = new Location("Field", "Fill in a description...", "F", new String[]{});
        locations[4][3] = new Location("Field", "Fill in a description...", "F", new String[]{});
        locations[4][4] = new Location("Watchtower", "Fill in a description...", "W", new String[]{});
        map.setLocations(locations);
        
        Point point = new Point(0, 0);
        map.setCurrentLocation(point);
        
        return map;
        
    }
    
    
    public static void loadMapInfo(String filePath) 
    throws MapControlException {
        if(filePath == null || filePath == "") {
            new MapControlException("The game or filepath is invalid.");
        }
        
        Location[][] locationArray = cityofaaron.CityOfAaron.getCurrentGame().getTheMap().getLocations();
        
        String name = "";
        String description = "";
        String symbol = "";
        
        try (PrintWriter out = new PrintWriter(filePath)){
            
            out.println("\n\n            Map Information Report           ");
            out.printf("%n%-20s%-25s%-10s", "Name", "Description", "Symbol");
            out.printf("%n%-20s%-25s%-10s", "----------", "----------", "----------");
            
            
            
            for (int i = 0; i < locationArray.length; i++) {
                for (int j = 0; j < locationArray[i].length; j++){
                    name = locationArray[i][j].getName();
                    description = locationArray[i][j].getDescription();
                    symbol = locationArray[i][j].getMapSymbol();
                    
                    out.printf("%n%-20s%-30s%-10s", name, description, symbol);
                }
            
            }
            
        } catch (IOException ioe1) {
            System.out.println("I/O Error: " + ioe1.getMessage());
        }
    }
    
}
