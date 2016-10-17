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
import org.junit.Ignore;
import simulation.Simulation;

/**
 *
 * @author DeJurnett Norrington
 */
public class CustomerConsoleTest {
    
    ATM atm = null;
    Simulation theSimulation;
    Session inst;
    
    public CustomerConsoleTest() {
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
     * Test of display method, of class CustomerConsole.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        String message = "Not ready yet";
        CustomerConsole instance = new CustomerConsole();
        instance.display(message);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of readPIN method, of class CustomerConsole.
     */
    @Test
    public void testReadPIN() throws Exception {
        System.out.println("readPIN");
        String prompt = "Please input you pin";
        CustomerConsole instance = new CustomerConsole();
        int expResult = 2222;
        int result = instance.readPIN(prompt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of readMenuChoice method, of class CustomerConsole.
     */
    @Test
    public void testReadMenuChoice() throws Exception {
        System.out.println("readMenuChoice");
        String prompt = "Please select which operation you would like to select";
        String[] menu = {"Withdrawl", "Transfer", "Deposit", "Balance Inquiry"};
        CustomerConsole instance = new CustomerConsole();
        int expResult = 1;
        int result = instance.readMenuChoice(prompt, menu);
        System.out.println(result);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of readAmount method, of class CustomerConsole.
     */
    @Ignore
    @Test
    public void testReadAmount() throws Exception {
        System.out.println("readAmount");
        String prompt = "Give any reasonable amount of money";
        CustomerConsole instance = new CustomerConsole();
        Money expResult = null;
        Money result = instance.readAmount(prompt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
