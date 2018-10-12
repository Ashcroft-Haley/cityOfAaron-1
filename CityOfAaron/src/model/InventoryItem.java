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
public class InventoryItem implements Serializable {
    
    public InventoryItem() {
        //empty constructor for JavaBeans
    }
    
    private ItemType itemType;
    private int quantity;
    private Condition condition;
    
    
    public ItemType getItemType() {
        return itemType;
    }
    
    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public Condition getCondition() {
        return condition;
    }
    
    public void setCondition(Condition condition) {
        this.condition = condition;
    }
    
    
    
    
    //@Override
    //public String toString() {
    //    return "InventoryItem class coming soon!";
    //}

    @Override
    public String toString() {
        return "InventoryItem{" 
                + "itemType=" + itemType 
                + ", quantity=" + quantity 
                + ", condition=" + condition 
                + '}';
    }
    
}
