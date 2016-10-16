/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.physical;

import banking.Card;
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
public class CardReaderTest {
    
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
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of readCard method, of class CardReader.
     */
    @Test
    public void testReadCard() {
        System.out.println("readCard");
        CardReader instance = null;
        Card expResult = null;
        Card result = instance.readCard();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ejectCard method, of class CardReader.
     */
    @Test
    public void testEjectCard() {
        System.out.println("ejectCard");
        CardReader instance = null;
        instance.ejectCard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of retainCard method, of class CardReader.
     */
    @Test
    public void testRetainCard() {
        System.out.println("retainCard");
        CardReader instance = null;
        instance.retainCard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
