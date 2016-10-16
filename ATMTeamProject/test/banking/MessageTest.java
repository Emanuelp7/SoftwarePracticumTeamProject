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
public class MessageTest {
    
    public MessageTest() {
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
     * Test of toString method, of class Message.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Message instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPIN method, of class Message.
     */
    @Test
    public void testSetPIN() {
        System.out.println("setPIN");
        int pin = 0;
        Message instance = null;
        instance.setPIN(pin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessageCode method, of class Message.
     */
    @Test
    public void testGetMessageCode() {
        System.out.println("getMessageCode");
        Message instance = null;
        int expResult = 0;
        int result = instance.getMessageCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCard method, of class Message.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        Message instance = null;
        Card expResult = null;
        Card result = instance.getCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPIN method, of class Message.
     */
    @Test
    public void testGetPIN() {
        System.out.println("getPIN");
        Message instance = null;
        int expResult = 0;
        int result = instance.getPIN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSerialNumber method, of class Message.
     */
    @Test
    public void testGetSerialNumber() {
        System.out.println("getSerialNumber");
        Message instance = null;
        int expResult = 0;
        int result = instance.getSerialNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFromAccount method, of class Message.
     */
    @Test
    public void testGetFromAccount() {
        System.out.println("getFromAccount");
        Message instance = null;
        int expResult = 0;
        int result = instance.getFromAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getToAccount method, of class Message.
     */
    @Test
    public void testGetToAccount() {
        System.out.println("getToAccount");
        Message instance = null;
        int expResult = 0;
        int result = instance.getToAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Message.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        Message instance = null;
        Money expResult = null;
        Money result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
