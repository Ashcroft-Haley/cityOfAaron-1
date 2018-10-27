/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author haleyashcroft
 */
public class WheatControlTest {
    
    public WheatControlTest() {
    }

    /**
     * Test of calculateLossToRats method, of class WheatControl.
     */
    @Test
    public void testCalculateLossToRats() {
        System.out.println("calculateLossToRats");
        int tithesPercent = 0;
        int wheatInStorage = 0;
        int expResult = 0;
        int result = WheatControl.calculateLossToRats(tithesPercent, wheatInStorage);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testForPositiveWheat() {
        FakeRandom fakeRandom = new FakeRandom();
        GameControl.setRandomGenerator(fakeRandom);
        fakeRandom.add(20);
        fakeRandom.add(4);
        assertEquals(-1, WheatControl.calculateLossToRats(10, -20), 0.0);
    }
    
    @Test
    public void testTithingOverage() {
        FakeRandom fakeRandom = new FakeRandom();
        GameControl.setRandomGenerator(fakeRandom);
        fakeRandom.add(20);
        fakeRandom.add(4);
        assertEquals(-2, WheatControl.calculateLossToRats(101, 1000), 0.0);
    }
    
    @Test
    public void testTithingShortage() {
        FakeRandom fakeRandom = new FakeRandom();
        GameControl.setRandomGenerator(fakeRandom);
        fakeRandom.add(20);
        fakeRandom.add(4);
        assertEquals(-2, WheatControl.calculateLossToRats(-2, 1000), 0.0);
    }
    
}
