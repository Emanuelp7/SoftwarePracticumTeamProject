/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.physical;

import banking.Receipt;
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
public class ReceiptPrinterTest {
    
    public ReceiptPrinterTest() {
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
     * Test of printReceipt method, of class ReceiptPrinter.
     */
    @Test
    public void testPrintReceipt() {
        System.out.println("printReceipt");
        Receipt receipt = null;
        ReceiptPrinter instance = new ReceiptPrinter();
        instance.printReceipt(receipt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
