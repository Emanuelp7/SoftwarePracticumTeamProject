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
import org.junit.Ignore;

/**
 *
 * @author DeJurnett Norrington
 */
public class MessageTest {
    /*
    For the message constructor
    Need dummy variables
    */
    int mCode = 3; //messageCode Transfer = 3 in Message.java
    Card card = new Card(30); //card
    int pin; //pin number
    int sNum; //serialNumber
    int fAcc; //fromAccount
    int tAcc; //toAccount
    Money amt; //amount
    
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
        /*
        For time sake set tAcc and fAcc to -1
        so that they will not be added to the toString
        and will need NO FROM and NO TO in the expResult
        */
        fAcc = -1; 
        tAcc = -1;
        
        //Serial Number and Card # are also added to result in toString method
        sNum = 30;
        amt = new Money(2);
        Message instance = new Message(mCode, card, pin, sNum, fAcc, tAcc, amt);
        String expResult = "TRANSFER" +" CARD# " + card.getNumber() + " TRANS# " 
                + sNum + " NO FROM NO TO " + amt;
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPIN method, of class Message.
     */
    @Test
    public void testSetPIN() {
        System.out.println("setPIN");
        //Declare instance first then we will set new pin
        Message instance = new Message(mCode, card, pin, sNum, fAcc, tAcc, amt);
        pin = 30;
        instance.setPIN(pin);
        //assertEquals(instance.getPIN(), pin); //Don't need this but just to make sure it works
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getMessageCode method, of class Message.
     */
    @Test
    public void testGetMessageCode() {
        System.out.println("getMessageCode");
        mCode = 20; //set mCode to 20 just to see if this works
        Message instance = new Message(mCode, card, pin, sNum, fAcc, tAcc, amt);
        int expResult = mCode; //Should get mCode's value
        int result = instance.getMessageCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCard method, of class Message.
     */
    @Test
    public void testGetCard() {
        System.out.println("getCard");
        //Card is already declared at the top so just use it here
        Message instance = new Message(mCode, card, pin, sNum, fAcc, tAcc, amt);
        Card expResult = card; //make sure that card is what we are getting
        Card result = instance.getCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPIN method, of class Message.
     */
    @Test
    public void testGetPIN() {
        System.out.println("getPIN");
        pin = 2234; //Set pin to some number
        Message instance = new Message(mCode, card, pin, sNum, fAcc, tAcc, amt);
        int expResult = pin;
        int result = instance.getPIN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSerialNumber method, of class Message.
     */
    @Test
    public void testGetSerialNumber() {
        System.out.println("getSerialNumber");
        sNum = 3212604; //set a fake serial number
        Message instance = new Message(mCode, card, pin, sNum, fAcc, tAcc, amt);
        int expResult = sNum; //We want sNum to be the expected value
        int result = instance.getSerialNumber(); //return the serial number of the instance
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFromAccount method, of class Message.
     */
    @Test
    public void testGetFromAccount() {
        System.out.println("getFromAccount");
        fAcc = 2;
        Message instance = new Message(mCode, card, pin, sNum, fAcc, tAcc, amt);
        int expResult = fAcc;
        int result = instance.getFromAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of getToAccount method, of class Message.
     */
    @Test
    public void testGetToAccount() {
        System.out.println("getToAccount");
        tAcc = 4;
        Message instance = new Message(mCode, card, pin, sNum, fAcc, tAcc, amt);
        int expResult = tAcc;
        int result = instance.getToAccount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAmount method, of class Message.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        amt = new Money(200); //$200
        Message instance = new Message(mCode, card, pin, sNum, fAcc, tAcc, amt);
        Money expResult = amt;
        Money result = instance.getAmount();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
