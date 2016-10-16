/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import banking.Balances;
import banking.Message;
import banking.Status;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DeJurnett Norrington
 */
public class SimulatedBankTest {
    
    public SimulatedBankTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of handleMessage method, of class SimulatedBank.
     */
    @Test
    public void testHandleMessage() {
        System.out.println("handleMessage");
        Message message = null;
        Balances balances = null;
        SimulatedBank instance = new SimulatedBank();
        Status expResult = null;
        Status result = instance.handleMessage(message, balances);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
