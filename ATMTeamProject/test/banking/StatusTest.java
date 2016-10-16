/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

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
public class StatusTest {
    
    public StatusTest() {
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
     * Test of toString method, of class Status.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Status instance = new StatusImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isSuccess method, of class Status.
     */
    @Test
    public void testIsSuccess() {
        System.out.println("isSuccess");
        Status instance = new StatusImpl();
        boolean expResult = false;
        boolean result = instance.isSuccess();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isInvalidPIN method, of class Status.
     */
    @Test
    public void testIsInvalidPIN() {
        System.out.println("isInvalidPIN");
        Status instance = new StatusImpl();
        boolean expResult = false;
        boolean result = instance.isInvalidPIN();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMessage method, of class Status.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        Status instance = new StatusImpl();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class StatusImpl extends Status {

        public boolean isSuccess() {
            return false;
        }

        public boolean isInvalidPIN() {
            return false;
        }

        public String getMessage() {
            return "";
        }
    }
    
}
