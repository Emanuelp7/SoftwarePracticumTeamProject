/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.physical;

import banking.Money;
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
public class CustomerConsoleTest {
    
    
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
        String prompt = "2222";
        CustomerConsole instance = new CustomerConsole();
        instance.display("Reading Pin....");
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
        String prompt = "1";
        String[] menu = {"0", "1", "2"};
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
    @Test
    public void testReadAmount() throws Exception {
        System.out.println("readAmount");
        String prompt = "";
        CustomerConsole instance = new CustomerConsole();
        Money expResult = null;
        Money result = instance.readAmount(prompt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
