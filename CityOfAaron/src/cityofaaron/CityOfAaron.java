/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cityofaaron;

import view.StartProgramView;
import model.Game;
import view.View;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.InputStreamReader;
import java.io.IOException;


/**
 *
 * @author haleyashcroft
 */
public class CityOfAaron {
    
    //Keep a copy of the current Game object in the main class.
    public static Game currentGame = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    
    public static Game getCurrentGame() {
        return currentGame;
    }
    
    public static void setCurrentGame(Game game) {
        currentGame = game;
    }

    private static PrintWriter logFile = null;
    
    public static void main(String[] args) { 
        
        try{
            CityOfAaron.inFile = new BufferedReader(new InputStreamReader(System.in));
            CityOfAaron.outFile = new PrintWriter(System.out, true);
            logFile = new PrintWriter("logFile.txt");

            View startProgramView = new StartProgramView();
            startProgramView.displayView();
        } catch(Throwable te) {
                System.out.println("Exception caught in Main: " + te.toString() +
                        "\nCause: " + te.getCause() +
                        "\nMessage: " + te.getMessage());
                te.printStackTrace();
        } finally {
            try{
                if (CityOfAaron.inFile != null)
                    CityOfAaron.inFile.close();

                if (CityOfAaron.outFile != null)
                    CityOfAaron.outFile.close();
                
                if (logFile != null) {
                    logFile.close();
                }
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
        }
            
    }
    
    public static PrintWriter getOutFile() {
        return outFile;
    }
    
    public static void setOutFile(PrintWriter outFile) {
        CityOfAaron.outFile = outFile;
    }
    
    public static BufferedReader getInFile() {
        return inFile;
    }
    
    public static void setInFile(BufferedReader inFile) {
        CityOfAaron.inFile = inFile;
    }
    
    public static PrintWriter getLogFile() {
        return logFile;
    }
    
    public static void setLogFile(PrintWriter logFile) {
        CityOfAaron.logFile = logFile;
    }
    
        
}
