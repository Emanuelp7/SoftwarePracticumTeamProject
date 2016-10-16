/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import atm.transaction.Transaction;
import banking.Card;
import java.net.InetAddress;
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
public class SessionTest {
    
    int id;
    String place, bankName;
    InetAddress bankAddress;
    
    ATM atm = new ATM(id, place, bankName, bankAddress);
    
    public SessionTest() {
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
     * Test of performSession method, of class Session.
     */
    @Test
    public void testPerformSession() {
        System.out.println("performSession");
        Session instance = new Session(atm);
        Card card = null;
        Transaction currentTransaction = null;
        instance.performSession();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPIN method, of class Session.
     */
    @Test
    public void testSetPIN() {
        System.out.println("setPIN");
        int pin = 0;
        Session instance = new Session(atm);
        instance.setPIN(pin);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
