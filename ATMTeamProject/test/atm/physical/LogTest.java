/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.physical;

import atm.ATM;
import atm.Session;
import banking.Card;
import banking.Message;
import banking.Money;
import banking.Status;
import java.awt.Frame;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import simulation.Simulation;

/**
 *
 * @author DeJurnett Norrington
 */
public class LogTest {
    
    ATM atm;
    Simulation theSimulation;
    Session inst;
    
    int mCode;
    Card card;
    int pin;
    int sNum;
    int fAcc;
    int tAcc;
    Money amt;
    
    public LogTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        atm = new ATM(42, "Gordon College", "First National Bank of Podunk",null);
        theSimulation = new Simulation(atm);
        Frame mainFrame = new Frame("ATM Simulation");
        inst = new Session(atm);
        mainFrame.add(theSimulation.getGUI());
        mainFrame.setVisible(true);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of logSend method, of class Log.
     */
    @Test
    public void testLogSend() {
        System.out.println("logSend");
        mCode = 2;
        card = new Card(20);
        pin = 4424;
        sNum = 33324;
        tAcc = 2;
        fAcc = 2;
        amt = new Money(200);
        Message message = new Message(mCode, card, pin, sNum, fAcc, tAcc, amt);
        Log instance = new Log();
        instance.logSend(message);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of logResponse method, of class Log.
     */
    @Test
    public void testLogResponse() {
        System.out.println("logResponse");
        Status response = null;
        Log instance = new Log();
        instance.logResponse(response);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of logCashDispensed method, of class Log.
     */
    @Test
    public void testLogCashDispensed() {
        System.out.println("logCashDispensed");
        Money amount = new Money(30);
        Log instance = new Log();
        instance.logCashDispensed(amount);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of logEnvelopeAccepted method, of class Log.
     */
    @Test
    public void testLogEnvelopeAccepted() {
        System.out.println("logEnvelopeAccepted");
        Log instance = new Log();
        instance.logEnvelopeAccepted();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
