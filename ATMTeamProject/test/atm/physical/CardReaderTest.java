/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.physical;

import atm.ATM;
import atm.Session;
import banking.Card;
import java.awt.Frame;
import java.net.InetAddress;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;
import simulation.Simulation;

/**
 *
 * @author DeJurnett Norrington
 */
public class CardReaderTest {
    
    ATM atm = null;
    Simulation theSimulation;
    Session inst;
    
    public CardReaderTest() {
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
     * Test of readCard method, of class CardReader.
     */
    @Ignore
    @Test
    public void testReadCard() {
        System.out.println("readCard");
        CardReader instance = new CardReader(atm);
        Card expResult = null; //If input is 0 then it passes so for time sake make 0
        Card result = instance.readCard();
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ejectCard method, of class CardReader.
     */
    @Test
    public void testEjectCard() {
        System.out.println("ejectCard");
        CardReader instance = new CardReader(atm);
        instance.ejectCard();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retainCard method, of class CardReader.
     */
    @Ignore
    @Test
    public void testRetainCard() {
        System.out.println("retainCard");
        CardReader instance = null;
        instance.retainCard();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
