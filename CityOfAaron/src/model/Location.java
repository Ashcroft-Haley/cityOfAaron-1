/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.io.Serializable;

/**
 *
 * @author Stuehser
 */
public class Location implements Serializable {
    
    public Location() {
        //Here's that empty constructor
    }
    
    private String nameOfLocation;
    private String descritptionOfLocation;
    private String symbolOfLocation;
    private String tipsForLocation;
    
    
    public String getNameOfLocation() {
        return nameOfLocation;
    }
    
    public String getDescriptionOfLocation() {
        return descritptionOfLocation;
    }
    
    public String getSymbolOfLocation() {
        return symbolOfLocation;
    }
    
    public String getTipsForLocation() {
        return tipsForLocation;
    }
    
    @Override
    public String toString() {
        return "Location{"
                + "nameOfLocation= " + nameOfLocation
                + ", descriptionOfLocation= " + descritptionOfLocation
                + ", symbolOfLocation= " + symbolOfLocation
                + ", tipsForLocation= " + tipsForLocation
                + '}';
    }
                        
        
              
    
    
    
    
    
}
