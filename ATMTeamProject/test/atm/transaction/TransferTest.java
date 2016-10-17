/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.transaction;

import banking.Message;
import banking.Receipt;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Emanuel Peters
 */
public class TransferTest {
    
    public TransferTest() {
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
     * Test of getSpecificsFromCustomer method, of class Transfer.
     */
    @Test
    public void testGetSpecificsFromCustomer() throws Exception {
        System.out.println("getSpecificsFromCustomer");
        Transfer instance = null;
        Message expResult = null;
        Message result = instance.getSpecificsFromCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completeTransaction method, of class Transfer.
     */
    @Test
    public void testCompleteTransaction() {
        System.out.println("completeTransaction");
        Transfer instance = null;
        Receipt expResult = null;
        Receipt result = instance.completeTransaction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
