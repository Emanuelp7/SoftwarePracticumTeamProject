/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.physical;

import atm.ATM;
import atm.session.Session;
import banking.Money;
import java.awt.Frame;
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
public class CashDispenserTest {
    
    Log log = new Log();
    ATM atm = null;
    Simulation theSimulation;
    Session inst;
    
    public CashDispenserTest() {
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
     * Test of setInitialCash method, of class CashDispenser.
     */
    @Test
    public void testSetInitialCash() {
        System.out.println("setInitialCash");
        Money initialCash = new Money(20);
        CashDispenser instance = new CashDispenser(log);
        instance.setInitialCash(initialCash);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkCashOnHand method, of class CashDispenser.
     */
    @Test
    public void testCheckCashOnHand() {
        System.out.println("checkCashOnHand");
        Money amount = new Money(300);
        CashDispenser instance = new CashDispenser(log);
        instance.setInitialCash(amount);
        boolean expResult = true;
        boolean result = instance.checkCashOnHand(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of checkCashOnHand method, of class CashDispenser.
     * When the initial cash is not set
     */
    @Test
    public void testCheckCashOnHand2() {
        System.out.println("checkCashOnHand");
        Money amount = new Money(300);
        CashDispenser instance = new CashDispenser(log);
        boolean expResult = false;
        boolean result = instance.checkCashOnHand(amount);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dispenseCash method, of class CashDispenser.
     */
    @Test
    public void testDispenseCash() {
        System.out.println("dispenseCash");
        Money amount = new Money(2000);
        Money amt = new Money(30);
        CashDispenser instance = new CashDispenser(log);
        instance.setInitialCash(amount);
        instance.dispenseCash(amt);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
