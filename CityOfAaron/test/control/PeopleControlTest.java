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
 * @author Stuehser
 */
public class PeopleControlTest {
    
    public PeopleControlTest() {
    }

    /**
     * Test of calculateNewMoveIns method, of class PeopleControl.
     */
    @Test
    public void testCalculateNewMoveIns() {
        System.out.println("calculateNewMoveIns");
        int currentPopulation = 0;
        int expResult = 0;
        
        FakeRandom fakeRandom = new FakeRandom();
        
        GameControl.setRandomGenerator(fakeRandom);
        
        int result = PeopleControl.calculateNewMoveIns(currentPopulation);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    @Test
    public void testCase1() {
        
        FakeRandom fakeRandom = new FakeRandom();
        GameControl.setRandomGenerator(fakeRandom);
        
        fakeRandom.add(2);
        int result = PeopleControl.calculateNewMoveIns(1000);
   
        assertEquals(30, result);
    }
    
    
    @Test
    public void testCase2() {
        
        FakeRandom fakeRandom = new FakeRandom();
        GameControl.setRandomGenerator(fakeRandom);

        
        fakeRandom.add(2);

        
        int result = PeopleControl.calculateNewMoveIns(-50);
   
        assertEquals(-1, result);
    }
    
    
    @Test
    public void testCase3() {
        
        FakeRandom fakeRandom = new FakeRandom();
        GameControl.setRandomGenerator(fakeRandom);
        
        fakeRandom.add(0);
        
       
        
        int result = PeopleControl.calculateNewMoveIns(200);
   
        assertEquals(2, result);
    }
    @Test
    public void testCase4() {
        
        FakeRandom fakeRandom = new FakeRandom();
        
        GameControl.setRandomGenerator(fakeRandom);
        fakeRandom.add(4);
        
        int result = PeopleControl.calculateNewMoveIns(200);
   
        assertEquals(10, result);
    }
    

    
    
    
}
