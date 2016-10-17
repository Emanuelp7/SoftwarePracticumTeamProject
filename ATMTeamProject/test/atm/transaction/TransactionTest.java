/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.transaction;

import atm.ATM;
import atm.Session;
import atm.physical.CustomerConsole;
import banking.Card;
import banking.Message;
import banking.Receipt;
import banking.Status;
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
public class TransactionTest {
    
    public TransactionTest() {
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
     * Test of makeTransaction method, of class Transaction.
     */
    @Test
    public void testMakeTransaction() throws Exception {
        System.out.println("makeTransaction");
        ATM atm = null;
        Session session = null;
        Card card = null;
        int pin = 0;
        Transaction expResult = null;
        Transaction result = Transaction.makeTransaction(atm, session, card, pin);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performTransaction method, of class Transaction.
     */
    @Test
    public void testPerformTransaction() throws Exception {
        System.out.println("performTransaction");
        Transaction instance = null;
        boolean expResult = false;
        boolean result = instance.performTransaction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of performInvalidPINExtension method, of class Transaction.
     */
    @Test
    public void testPerformInvalidPINExtension() throws Exception {
        System.out.println("performInvalidPINExtension");
        Transaction instance = null;
        Status expResult = null;
        Status result = instance.performInvalidPINExtension();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSerialNumber method, of class Transaction.
     */
    @Test
    public void testGetSerialNumber() {
        System.out.println("getSerialNumber");
        Transaction instance = null;
        int expResult = 0;
        int result = instance.getSerialNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpecificsFromCustomer method, of class Transaction.
     */
    @Test
    public void testGetSpecificsFromCustomer() throws Exception {
        System.out.println("getSpecificsFromCustomer");
        Transaction instance = null;
        Message expResult = null;
        Message result = instance.getSpecificsFromCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of completeTransaction method, of class Transaction.
     */
    @Test
    public void testCompleteTransaction() throws Exception {
        System.out.println("completeTransaction");
        Transaction instance = null;
        Receipt expResult = null;
        Receipt result = instance.completeTransaction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class TransactionImpl extends Transaction {

        public TransactionImpl() {
            super(null, null, null, 0);
        }

        public Message getSpecificsFromCustomer() throws CustomerConsole.Cancelled {
            return null;
        }

        public Receipt completeTransaction() throws CustomerConsole.Cancelled {
            return null;
        }
    }
    
}
