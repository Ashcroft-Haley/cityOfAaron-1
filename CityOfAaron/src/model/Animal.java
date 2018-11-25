/*
 * Animal class: Displays list of animals and their ages and returns it.
 */
package model;

import java.util.Arrays;
import java.io.Serializable;

/**
 *
 * @author tylertucker
 */
public class Animal implements Serializable {
    public Animal() {
    //empty constructor for JavaBeans
    }
    
    private ItemType itemType;
    private int quantity;
    private Condition condition;
    private String name;
    private int age;
    
    public Animal(ItemType itemType, int quantity, Condition condition, String name, int age) {
        this.itemType = itemType;
        this.quantity = quantity;
        this.condition = condition;
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    
//    @Override
//    public String toString() {
//        return "Animal class coming soon!";
//    }
    
    @Override
    public String toString() {
        return "Animal{" 
                + "name=" + name 
                + ", age=" + age 
                + '}';
    }
}
