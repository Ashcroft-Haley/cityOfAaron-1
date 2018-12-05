/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Scanner;
import java.io.BufferedReader;
import cityofaaron.CityOfAaron;
import java.io.PrintWriter;

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
    
    protected final BufferedReader keyboard = CityOfAaron.getInFile();
    protected final PrintWriter console = CityOfAaron.getOutFile();

    public void displayView(){
        boolean keepGoing = true;

        while (keepGoing == true) {
            String message = getMessage();
            if(message != null) {
                this.console.println(getMessage());
            }

            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }

    }
    
    protected String getUserInput(String prompt, boolean allowEmpty){
        String input = "";
        boolean inputRecieved = false;
        
        
        try {
            while(inputRecieved == false) {
                this.console.println(prompt);
                input = this.keyboard.readLine();

                if(input == null) {
                    input = "";
                }

                input = input.trim();

                if (input.equals("") == false || allowEmpty == true){
                    inputRecieved = true;
                }
                break;
            }
        } catch (Exception e) {
            ErrorView.display(this.getClass().getName(), "Error reading input: " + e.getMessage());
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
