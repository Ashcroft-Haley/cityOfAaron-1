/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author haleyashcroft
 */
public class GameControl {
    
    private static FakeRandom randomGenerator = new FakeRandom();
    
    protected static void setRandomGenerator(FakeRandom random) {
        randomGenerator = random;
    };
    
    public static int getRandomNumber(int lowValue, int highValue){
        
        // If low < 0 or high < 0 then return -1
        if (lowValue < 0 || highValue < 0) {
            return -1;
            
        }
        // If high <= low then return -2
        if (highValue <= lowValue) {
            return -2;
        }
        
        // If high is the maximum value for integers, then return -3
        if (highValue == Integer.MAX_VALUE) {
            return -3;
        }
        
        // Calculate the size of the range: add one so Random() icludes high value
        int range = (highValue - lowValue) + 1;
        
        // Return low + random(range size)
        return lowValue + randomGenerator.nextInt(range);
        
    }
    
}
