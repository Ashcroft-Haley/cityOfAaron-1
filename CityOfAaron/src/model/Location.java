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
 * @author Stuehser
 */
public class Location implements Serializable {
    
    public Location() {
        //Here's that empty constructor
    }
    
    
    private String name;
    private String description;
    private String mapSymbol;
    private String[] gameTips;
    
    public Location(String name, String description, String mapSymbol, String[] gameTips) {
        setMapSymbol(mapSymbol);
        setName(name);
        setDescription(description);
        setGameTips(gameTips);
    }
    
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getMapSymbol() {
        return mapSymbol;
    }
    
    public void setMapSymbol(String mapSymbol) {
        this.mapSymbol = mapSymbol;
    }
    
    public String[] getGameTips() {
        return gameTips;
    }
    
    public void setGameTips(String[] gameTips) {
        this.gameTips = gameTips;
    }

    @Override
    public String toString() {
        return "Location{" + "name=" + name 
                + ", description=" + description 
                + ", mapSymbol=" + mapSymbol 
                + ", gameTips=" + Arrays.toString(gameTips) 
                + '}';
    }
    
   
                        
           
}
