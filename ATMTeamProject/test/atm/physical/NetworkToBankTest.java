/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.physical;

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
public class NetworkToBankTest {
    
    public NetworkToBankTest() {
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
     * Test of openConnection method, of class NetworkToBank.
     */
    @Test
    public void testOpenConnection() {
        System.out.println("openConnection");
        NetworkToBank instance = null;
        instance.openConnection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnection method, of class NetworkToBank.
     */
    @Test
    public void testCloseConnection() {
        System.out.println("closeConnection");
        NetworkToBank instance = null;
        instance.closeConnection();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class NetworkToBank.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        Message message = null;
        Balances balances = null;
        NetworkToBank instance = null;
        Status expResult = null;
        Status result = instance.sendMessage(message, balances);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
