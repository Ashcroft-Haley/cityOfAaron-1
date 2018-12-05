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
    
    
    
  
    
    
    public static int ToolMax (){
        InventoryItem[] tools = cityofaaron.CityOfAaron.getCurrentGame().getTheStorehouse().getTools();
        String tool = tools[0].getName();
        int highSoFar = tools[0].getQuantity();
        int n;
        n = tools.length - 1;
        int counted;

        for (int count = n; count>=0; count--){
            counted = tools[count].getQuantity();
            if (counted > highSoFar){
                highSoFar = tools[count].getQuantity();
                return highSoFar;
            }
        }
        return highSoFar;
    } 
    
    public static String ToolName (){
        InventoryItem[] tools = cityofaaron.CityOfAaron.getCurrentGame().getTheStorehouse().getTools();
        String tool = tools[0].getName();
        int highSoFar = tools[0].getQuantity();
        int n;
        n = tools.length - 1;
        int counted;

        for (int count = n; count>=0; count--){
            counted = tools[count].getQuantity();
            if (counted > highSoFar){
                highSoFar = tools[count].getQuantity();
                tool = tools[count].getName();
                return tool;
                
            }
        }
        return tool;
        
    }

}
