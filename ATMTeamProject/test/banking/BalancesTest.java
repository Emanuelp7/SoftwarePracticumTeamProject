/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

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
public class BalancesTest {
    
    public BalancesTest() {
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
     * Test of setBalances method, of class Balances.
     */
    @Test
    public void testSetBalances() {
        System.out.println("setBalances");
        Money total = null;
        Money available = null;
        Balances instance = new Balances();
        instance.setBalances(total, available);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Balances.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Balances instance = new Balances();
        Money expResult = null;
        Money result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAvailable method, of class Balances.
     */
    @Test
    public void testGetAvailable() {
        System.out.println("getAvailable");
        Balances instance = new Balances();
        Money expResult = null;
        Money result = instance.getAvailable();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
