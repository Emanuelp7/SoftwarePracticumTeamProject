/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.physical;

import atm.ATM;
import atm.session.Session;
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
public class EnvelopeAcceptorTest {
    
    Log log = new Log();
    ATM atm;
    Session inst;
    Simulation theSimulation;
    
    public EnvelopeAcceptorTest() {
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
     * Test of acceptEnvelope method, of class EnvelopeAcceptor.
     */
    @Test
    public void testAcceptEnvelope() throws Exception {
        System.out.println("acceptEnvelope");
        EnvelopeAcceptor instance = new EnvelopeAcceptor(log);
        instance.acceptEnvelope();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
