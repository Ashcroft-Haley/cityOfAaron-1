/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Location;
import model.Map;
import model.Point;

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
        
        locations[0][0] = new Location("W", "Watchtower", "Fill in a description...", new String[]{});
        locations[0][1] = new Location("F", "Field", "Fill in a description...", new String[]{});
        locations[0][2] = new Location("R", "River", "Fill in a description...", new String[]{});
        locations[0][3] = new Location("F", "Field", "Fill in a description...", new String[]{});
        locations[0][4] = new Location("W", "Watchtower", "Fill in a description...", new String[]{});
        
        locations[1][0] = new Location("U", "Undeveloped Land", "Fill in a description...", new String[]{});
        locations[1][1] = new Location("T", "Temple", "Fill in a description...", new String[]{});
        locations[1][2] = new Location("G", "Granary/ Storehouse", "Fill in a description...", new String[]{});
        locations[1][3] = new Location("R", "River", "Fill in a description...", new String[]{});
        locations[1][4] = new Location("U", "Undeveloped Land", "Fill in a description...", new String[]{});
        
        locations[2][0] = new Location("F", "Field", "Fill in a description...", new String[]{});
        locations[2][1] = new Location("C", "Ruler's Court", "Fill in a description...", new String[]{});
        locations[2][2] = new Location("V", "Village", "Fill in a description...", new String[]{});
        locations[2][3] = new Location("V", "Village", "Fill in a description...", new String[]{});
        locations[2][4] = new Location("R", "River", "Fill in a description...", new String[]{});
        
        locations[3][0] = new Location("U", "Undeveloped Land", "Fill in a description...", new String[]{});
        locations[3][1] = new Location("V", "Village", "Fill in a description...", new String[]{});
        locations[3][2] = new Location("V", "Village", "Fill in a description...", new String[]{});
        locations[3][3] = new Location("F", "Field", "Fill in a description...", new String[]{});
        locations[3][4] = new Location("F", "Field", "Fill in a description...", new String[]{});
        
        locations[4][0] = new Location("W", "Watchtower", "Fill in a description...", new String[]{});
        locations[4][1] = new Location("U", "Undeveloped Land", "Fill in a description...", new String[]{});
        locations[4][2] = new Location("F", "Field", "Fill in a description...", new String[]{});
        locations[4][3] = new Location("F", "Field", "Fill in a description...", new String[]{});
        locations[4][4] = new Location("W", "Watchtower", "Fill in a description...", new String[]{});
        map.setLocations(locations);
        
        Point point = new Point(0, 0);
        map.setCurrentLocation(point);
        
        return map;
        
    }
    
}
