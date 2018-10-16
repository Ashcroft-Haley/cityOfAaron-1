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
public class Player implements Serializable {
    
    public Player() {
        //empty constructor for Javabeans
    }
    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    //    @Override
//    public String toString() {
//        return "Player class coming soon!";
//    }
    
    @Override
    public String toString() {
        return "Player{" 
                + "name=" + name 
                + '}';
    }
}
