/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulation;

import java.awt.Insets;
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
public class SimDisplayTest {
    
    public SimDisplayTest() {
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
     * Test of clearDisplay method, of class SimDisplay.
     */
    @Test
    public void testClearDisplay() {
        System.out.println("clearDisplay");
        SimDisplay instance = new SimDisplay();
        instance.clearDisplay();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of display method, of class SimDisplay.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        String text = "";
        SimDisplay instance = new SimDisplay();
        instance.display(text);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEcho method, of class SimDisplay.
     */
    @Test
    public void testSetEcho() {
        System.out.println("setEcho");
        String echo = "";
        SimDisplay instance = new SimDisplay();
        instance.setEcho(echo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInsets method, of class SimDisplay.
     */
    @Test
    public void testGetInsets() {
        System.out.println("getInsets");
        SimDisplay instance = new SimDisplay();
        Insets expResult = null;
        Insets result = instance.getInsets();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
