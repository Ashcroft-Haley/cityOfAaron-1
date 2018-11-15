/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;

/**
 *
 * @author haleyashcroft
 */
public abstract class ViewBase implements View {
    public ViewBase(){

    }

    protected abstract String getMessage();

    protected abstract String[] getInputs();

    public abstract boolean doAction(String[] inputs);

    public void displayView(){
        boolean keepGoing = true;

        while (keepGoing == true) {
            String message = getMessage();
            if(message != null) {
                System.out.println(getMessage());
            }

            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }

    }
    
    protected String getUserInput(String prompt, boolean allowEmpty){
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputRecieved = false;
        
        while(inputRecieved == false) {
            System.out.println(prompt);
            input = keyboard.nextLine();
            
            if(input == null) {
                input = "";
            }
            
            input = input.trim();
            
            if (input.equals("") == false || allowEmpty == true){
                inputRecieved = true;
            }
        }
        return input;
    }
    
    protected String getUserInput(String prompt) {
        return getUserInput(prompt, false);
    }
    
    protected static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exception) {
            //do nothing
        }
    }
}
