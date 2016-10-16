/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import banking.Balances;
import banking.Card;
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
public class SimulationTest {
    
    public SimulationTest() {
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
     * Test of getInstance method, of class Simulation.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Simulation expResult = null;
        Simulation result = Simulation.getInstance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getInitialCash method, of class Simulation.
     */
    @Test
    public void testGetInitialCash() {
        System.out.println("getInitialCash");
        Simulation instance = null;
        Money expResult = null;
        Money result = instance.getInitialCash();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of readCard method, of class Simulation.
     */
    @Test
    public void testReadCard() {
        System.out.println("readCard");
        Simulation instance = null;
        Card expResult = null;
        Card result = instance.readCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of ejectCard method, of class Simulation.
     */
    @Test
    public void testEjectCard() {
        System.out.println("ejectCard");
        Simulation instance = null;
        instance.ejectCard();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of retainCard method, of class Simulation.
     */
    @Test
    public void testRetainCard() {
        System.out.println("retainCard");
        Simulation instance = null;
        instance.retainCard();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of clearDisplay method, of class Simulation.
     */
    @Test
    public void testClearDisplay() {
        System.out.println("clearDisplay");
        Simulation instance = null;
        instance.clearDisplay();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class Simulation.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        String text = "";
        Simulation instance = null;
        instance.display(text);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of readInput method, of class Simulation.
     */
    @Test
    public void testReadInput() {
        System.out.println("readInput");
        int mode = 0;
        int maxValue = 0;
        Simulation instance = null;
        String expResult = "";
        String result = instance.readInput(mode, maxValue);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dispenseCash method, of class Simulation.
     */
    @Test
    public void testDispenseCash() {
        System.out.println("dispenseCash");
        Money amount = null;
        Simulation instance = null;
        instance.dispenseCash(amount);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of acceptEnvelope method, of class Simulation.
     */
    @Test
    public void testAcceptEnvelope() {
        System.out.println("acceptEnvelope");
        Simulation instance = null;
        boolean expResult = false;
        boolean result = instance.acceptEnvelope();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of printReceiptLine method, of class Simulation.
     */
    @Test
    public void testPrintReceiptLine() {
        System.out.println("printReceiptLine");
        String text = "";
        Simulation instance = null;
        instance.printReceiptLine(text);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of printLogLine method, of class Simulation.
     */
    @Test
    public void testPrintLogLine() {
        System.out.println("printLogLine");
        String text = "";
        Simulation instance = null;
        instance.printLogLine(text);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class Simulation.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        Message message = null;
        Balances balances = null;
        Simulation instance = null;
        Status expResult = null;
        Status result = instance.sendMessage(message, balances);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of switchChanged method, of class Simulation.
     */
    @Test
    public void testSwitchChanged() {
        System.out.println("switchChanged");
        boolean on = false;
        Simulation instance = null;
        instance.switchChanged(on);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cardInserted method, of class Simulation.
     */
    @Test
    public void testCardInserted() {
        System.out.println("cardInserted");
        Simulation instance = null;
        instance.cardInserted();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getGUI method, of class Simulation.
     */
    @Test
    public void testGetGUI() {
        System.out.println("getGUI");
        Simulation instance = null;
        GUI expResult = null;
        GUI result = instance.getGUI();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getSimulatedBank method, of class Simulation.
     */
    @Test
    public void testGetSimulatedBank() {
        System.out.println("getSimulatedBank");
        Simulation instance = null;
        SimulatedBank expResult = null;
        SimulatedBank result = instance.getSimulatedBank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
