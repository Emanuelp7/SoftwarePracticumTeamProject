/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.transaction;

import atm.ATM;
import atm.Session;
import banking.Card;
import banking.Message;
import banking.Money;
import banking.Receipt;
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
public class TransferTest {
    
    Card card;
    int pin, serialNumber, to, from;
    Money amount = new Money(200, 20);
    ATM atm;
    Session session;
    
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
        Transfer instance = new Transfer(atm, session, card, pin);
        Message expResult = new Message(Message.TRANSFER, 
                card, pin, serialNumber, from, to, amount);
        Message result = instance.getSpecificsFromCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
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
        //fail("The test case is a prototype.");
    }
    
}
