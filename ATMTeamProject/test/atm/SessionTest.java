/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import atm.session.Session;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import simulation.Simulation;


/**
 *
 * @author Emanuel Peters
 */
public class SessionTest {
    ATM atm = null;
    Simulation theSimulation;
    Session instance;
    
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
        atm = new ATM(42, "Gordon College", "First National Bank of Podunk",null);
        theSimulation = new Simulation(atm);
        Frame mainFrame = new Frame("ATM Simulation");
        instance= new Session(atm);
        mainFrame.add(theSimulation.getGUI());
        mainFrame.setVisible(true);
    }
    
    @After
    public void tearDown() {
        atm = null;
    }

    /**
     * Test of performSession method, of class Session.
     * Checks to see if performSession runs without error.
     */
    @Test
    public void testPerformSession() {
        System.out.println("performSession");
       // Session instance = new Session(atm);
      // instance.performSession();
        new Thread(new Runnable(){
            public void run(){
                instance = new Session(atm);
                instance.performSession();
            }
        }).start();
        try {
            Thread.sleep(2000);
            // TODO review the generated test code and remove the default call to fail.
            // fail("The test case is a prototype.");
        } catch (InterruptedException ex) {
            Logger.getLogger(SessionTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        //theSimulation.ejectCard();
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
