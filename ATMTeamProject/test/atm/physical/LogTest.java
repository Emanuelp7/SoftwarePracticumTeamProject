/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.physical;

import banking.Message;
import banking.Money;
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
public class LogTest {
    
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
        Message message = null;
        Log instance = new Log();
        instance.logSend(message);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
    }

    /**
     * Test of logCashDispensed method, of class Log.
     */
    @Test
    public void testLogCashDispensed() {
        System.out.println("logCashDispensed");
        Money amount = null;
        Log instance = new Log();
        instance.logCashDispensed(amount);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        fail("The test case is a prototype.");
    }
    
}
