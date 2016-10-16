/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.physical;

import banking.Money;
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
public class CashDispenserTest {
    
    public CashDispenserTest() {
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
     * Test of setInitialCash method, of class CashDispenser.
     */
    @Test
    public void testSetInitialCash() {
        System.out.println("setInitialCash");
        Money initialCash = null;
        CashDispenser instance = null;
        instance.setInitialCash(initialCash);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCashOnHand method, of class CashDispenser.
     */
    @Test
    public void testCheckCashOnHand() {
        System.out.println("checkCashOnHand");
        Money amount = null;
        CashDispenser instance = null;
        boolean expResult = false;
        boolean result = instance.checkCashOnHand(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dispenseCash method, of class CashDispenser.
     */
    @Test
    public void testDispenseCash() {
        System.out.println("dispenseCash");
        Money amount = null;
        CashDispenser instance = null;
        instance.dispenseCash(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
