/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.InventoryItem;
import exceptions.AccountingControlException;

/**
 *
 * @author Stuehser
 */
public class AccountingControl {
    
    
    
  
    
    
    public static void ToolMax (){
        InventoryItem[] tools = cityofaaron.CityOfAaron.getCurrentGame().getTheStorehouse().getTools();
        String tool = tools[0].getName();
        int highSoFar = tools[0].getQuantity();
        int n;
        n = tools.length - 1;
        //System.out.println(n);
        int counted;

        for (int count = n; count>=0; count--){
            counted = tools[count].getQuantity();
            if (counted > highSoFar){
                highSoFar = tools[count].getQuantity();
                tool = tools[count].getName();
                
            }
        }
        
        System.out.println("There are more " + tool + "s than any other tool.\n"
                + "Right now there are " + highSoFar + " in storage.");
    } 

}
