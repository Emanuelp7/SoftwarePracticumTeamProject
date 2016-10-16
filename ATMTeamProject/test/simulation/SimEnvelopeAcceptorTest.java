/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

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
public class SimEnvelopeAcceptorTest {
    
    public SimEnvelopeAcceptorTest() {
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
     * Test of acceptEnvelope method, of class SimEnvelopeAcceptor.
     */
    @Test
    public void testAcceptEnvelope() {
        System.out.println("acceptEnvelope");
        SimEnvelopeAcceptor instance = new SimEnvelopeAcceptor();
        boolean expResult = false;
        boolean result = instance.acceptEnvelope();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cancelRequested method, of class SimEnvelopeAcceptor.
     */
    @Test
    public void testCancelRequested() {
        System.out.println("cancelRequested");
        SimEnvelopeAcceptor instance = new SimEnvelopeAcceptor();
        instance.cancelRequested();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
