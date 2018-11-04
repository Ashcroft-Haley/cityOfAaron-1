/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.Scanner;

/**
 *
 * @author Stuehser
 */

public class ViewMainMenu {

    protected String message;

    
    
   public ViewMainMenu(){
       
       message = "stuff";
   } 
   




    
    
    protected String getUserInput (String prompt, boolean allowEmpty){
        
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputRecieved = false;
        
        while(inputRecieved == false){
            System.out.println(prompt);
            input = keyboard.nextLine();
            
            
            if(input == null){
                input = "";
            }
            
            input = input.trim();
            
            if (input.equals("") == false || allowEmpty == true){
                inputRecieved = true;
            
                }
            }
            
        return input;
        
    }
    
    protected String getUserInput(String prompt){
        return getUserInput(prompt, false);
    }
    
}
