/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Stuehser
 */
public class Point {
   
    
    public Point(){
        //JavaBeans constructor, please do not think there is text here.
        //You would be mistaken.  
    }
    
    public Point(int row, int column){
        this.row = row;
        this.column = column;
    }
    
    private int row;
    private int column;
    
    public int getTheRow(){
        return row;
        }
    
    
    public void setTheRow(int row){
        this.row = row;
        
    }
    
    
    public int getTheColumn() {
        return column;
    }
    
    
    public void setTheColumn(int column) {
        this.column = column;
    }
    
    
    @Override
    public String toString() {
        return "Point{{" 
                + "row=" + row 
                + ", column=" + column 
                + '}';
}
    
}
