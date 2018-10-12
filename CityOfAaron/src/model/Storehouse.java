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
 * @author haleyashcroft
 */
public class Storehouse implements Serializable {
    
    public Storehouse() {
        //empty constructor for Javabeans
    }
    
    private Author[] authors;
    private Animal[] animals;
    private InventoryItem[] tools;
    private Provision[] provisions;
    
    public Author[] getAuthors() {
        return authors;
    }
    
    public void setAuthors(Author[] authors) {
        this.authors = authors;
    }
    
    public Animal[] getAnimals() {
        return animals;
    }
    
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
    
    public InventoryItem[] getTools() {
        return tools;
    }
    
    public void setTools(InventoryItem[] tools) {
        this.tools = tools;
    }
    
    public Provision[] getProvisions() {
        return provisions;
    }
    
    public void setProvisions(Provision[] provisions) {
        this.provisions = provisions;
    }
    
    
    
    
    
    
    //@Override
    //public String toString() {
    //    return "Storehouse class coming soon!";
    //}

    @Override
    public String toString() {
        return "Storehouse{" 
                + "authors=" + Arrays.toString(authors) 
                + ", animals=" + Arrays.toString(animals) 
                + ", tools=" + Arrays.toString(tools)
                + ", provisions=" + Arrays.toString(provisions) 
                + '}';
    }
}
