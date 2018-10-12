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
 * @author haleyashcroft
 */
public class Author implements Serializable {
    
    public Author() {
    //empty constructor for JavaBean
    }
    
    
    private String[] name;
    private String[] title;
    
    
    
    public String[] getName() {
        return name;
    }
    
    public void setName(String[] name) {
        this.name = name;
    }
    
    public String[] getTitle() {
        return title;
    }
    
    public void setTitle(String[] title) {
        this.title = title;
    }
    
    
    
    

    
    //@Override
    //public String toString() {
    //    return "Author class coming soon!";
    //}

    @Override
    public String toString() {
        return "Author{" 
                + "name=" + Arrays.toString(name) 
                + ", title=" + Arrays.toString(title) 
                + '}';
    }
    
 
    
}
