/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.io.Serializable;

/**
 *
 * @author tylertucker
 */
public class Map implements Serializable {
    
    public Map() {
        //empty constructor for Javabeans
    }
    
    private Location[] locations;

    public Location[] getLocations() {
        return locations;
    }

    public void setLocations(Location[] locations) {
        this.locations = locations;
    }

    public Point[] getCurrentlocation() {
        return currentlocation;
    }

    public void setCurrentlocation(Point[] currentlocation) {
        this.currentlocation = currentlocation;
    }
    private Point[] currentlocation;
    
//    @Override
//    public String toString() {
//        return "Map class coming soon!";
//    }
    
    @Override
    public String toString() {
        return "Map{" 
                + "locations=" + Arrays.toString(locations) 
                + ", point=" + Arrays.toString(currentlocation)
                + '}';
    }
    
    
}
