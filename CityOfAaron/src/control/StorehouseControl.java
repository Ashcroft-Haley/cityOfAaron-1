/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Animal;
import model.InventoryItem;
import model.Provision;
import exceptions.StorehouseControlException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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
    
    
        public static void loadStorehouseInfo(String filePath) 
    throws StorehouseControlException {
        if(filePath == null || filePath == "") {
            new StorehouseControlException("The game or filepath is invalid.");
        }
        
        InventoryItem[] itemArray = cityofaaron.CityOfAaron.getCurrentGame().getTheStorehouse().getTools();
        
        String name = "";
        String quantity = "";
        
        try (PrintWriter out = new PrintWriter(filePath)){
            
            out.println("\n\n            Storehouse Information Report           ");
            out.printf("%n%-20s%-25s", "Name", "Quantity");
            out.printf("%n%-20s%-25s", "----------", "----------");
            
            
            
            for (int i = 0; i < itemArray.length; i++) {
                
                    name = itemArray[i].getName();
                    quantity = Integer.toString(itemArray[i].getQuantity());
                    
                    out.printf("%n%-20s%-30s", name, quantity);
                
            
            }
            
        } catch (IOException ioe1) {
            System.out.println("I/O Error: " + ioe1.getMessage());
        }
    }
    
    
    
}
