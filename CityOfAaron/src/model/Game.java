/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author haleyashcroft
 */
public class Game implements Serializable {
    private Player thePlayer;
    private Map theMap;
    private Storehouse theStorehouse;
    private int currentPopluation;
    private int acresOwned;
    private int wheatInStorage;
    
    
    public Game() {
        //empty constructor
    }

    
    public Player getThePlayer() {
        return thePlayer;
    }
    
    public void setThePlayer(Player thePlayer) {
        this.thePlayer = thePlayer;
    }
    
    public Map getTheMap() {
        return theMap;
    }
    
    public void setTheMap(Map theMap) {
        this.theMap = theMap;
    }
    
    public Storehouse getTheStorehouse() {
        return theStorehouse;
    }
    
    public void setTheStorehouse(Storehouse theStorehouse) {
        this.theStorehouse = theStorehouse;
    }
    
    public int getCurrentPopulation() {
        return currentPopluation;
    }
    
    public void setCurrentPopulation(int currentPopulation) {
        this.currentPopluation = currentPopulation;
    }
    
    public int getAcresOwned() {
        return acresOwned;
    }
    
    public void setAcresOwned(int acresOwned) {
        this.acresOwned = acresOwned;
    }
    
    public int getWheatInStorage() {
        return wheatInStorage;
    }
    
    public void setWheatInStorage(int wheatInStorage) {
        this.wheatInStorage = wheatInStorage;
    }

    @Override
    public String toString() {
        return "Game{" 
                + "thePlayer=" + thePlayer 
                + ", theMap=" + theMap 
                + ", theStorehouse=" + theStorehouse 
                + ", currentPopluation=" + currentPopluation 
                + ", acresOwned=" + acresOwned 
                + ", wheatInStorage=" + wheatInStorage 
                + '}';
    }
    
    
    
}
