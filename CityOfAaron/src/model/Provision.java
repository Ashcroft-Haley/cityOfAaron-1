/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Arrays;

/**
 *
 * @author tylertucker
 */
public class Provision implements Serializable {
    
    public Provision() {
        //empty constructor for JavaBeans
    }
    
    private String name;
    private boolean perishable;
    private ItemType itemType;
    private int quantity;
    private Condition condition;
    
    public Provision(ItemType itemType, int quantity, Condition condition, String name, boolean perishable) {
        this.itemType = itemType;
        this.quantity = quantity;
        this.condition = condition;
        this.name = name;
        this.perishable = perishable;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPerishable() {
        return perishable;
    }

    public void setPerishable(boolean perishable) {
        this.perishable = perishable;
    }
    
    //    @Override
//    public String toString() {
//        return "Provisions class coming soon!";
//    }
    
    @Override
    public String toString() {
        return "Player{" 
                + "name=" + name 
                + "perishable=" + perishable
                + '}';
    }

    
}
