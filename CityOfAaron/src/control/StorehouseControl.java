/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Animal;
import model.InventoryItem;
import model.Provision;

/**
 *
 * @author haleyashcroft
 */
public class StorehouseControl {

    public static int calcAnimalTotal() {
        Animal[] animals = cityofaaron.CityOfAaron.getCurrentGame().getTheStorehouse().getAnimals();
        int total = 0;
        
        for(int i = 0; i < animals.length - 1; i++){
            total += animals[i].getQuantity();
        }
        return total;
    }
    
    public static int calcToolTotal() {
        InventoryItem[] tools = cityofaaron.CityOfAaron.getCurrentGame().getTheStorehouse().getTools();
        int total = 0;
        
        for(int i = 0; i < tools.length - 1; i++){
            total += tools[i].getQuantity();
        }
        return total;
    }
    
    public static int calcProvisionTotal() {
        Provision[] provisions = cityofaaron.CityOfAaron.getCurrentGame().getTheStorehouse().getProvisions();
        int total = 0;
        
        for(int i = 0; i < provisions.length - 1; i++){
            total += provisions[i].getQuantity();
        }
        return total;
    }
    
    
}
