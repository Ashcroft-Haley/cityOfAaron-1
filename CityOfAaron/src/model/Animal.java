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
    
    public Animal(String name, int age){
        setName(name);
        setAge(age);
        
    }    
    private String name;
    private int age;
    
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
