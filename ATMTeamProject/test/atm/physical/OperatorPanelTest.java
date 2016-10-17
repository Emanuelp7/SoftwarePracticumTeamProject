/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.physical;

import atm.ATM;
import atm.Session;
import banking.Money;
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
public class OperatorPanelTest {
    
    ATM atm;
    Simulation theSimulation;
    Session inst;
    Money amt = new Money(20);
    
    public OperatorPanelTest() {
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
     * Test of getInitialCash method, of class OperatorPanel.
     */
    @Test
    public void testGetInitialCash() {
        System.out.println("getInitialCash");
        OperatorPanel instance = new OperatorPanel(atm);
        Money result = instance.getInitialCash();
        Money expResult = result;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
