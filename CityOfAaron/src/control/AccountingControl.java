/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.InventoryItem;

/**
 *
 * @author Stuehser
 */
public class AccountingControl {
    
    
    
    /*
     public static void ToolSort (InventoryItem[] tools){

        InventoryItem[] tool = new InventoryItem[5];
        tool = tools;
        int n = tool.length;
        int k;
        for (int m = n; m >= 0; m--){
            for (int i = 0; i < n - 1; i++){
                k = i + 1;
                if (tool[i].getQuantity() > tool[k].getQuantity()){
                   
                    swapTools(i, k, tool);
                }
            }
        }
        
        
    }
    */
    
    
    
    
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
    /*
    private static void swapTools(int i, int j, InventoryItem[] item){
       int temp; //= new InventoryItem();
        temp = item[i].getQuantity();
        item[i]= item[j];
        item[j].setQuantity(temp);
        
    }
    
    private static void readTools(InventoryItem[] tools){
        for(int ){
            f
        }
    }
    */
}
