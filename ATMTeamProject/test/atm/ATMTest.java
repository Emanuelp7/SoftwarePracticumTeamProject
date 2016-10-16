/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import atm.physical.CardReader;
import atm.physical.CashDispenser;
import atm.physical.CustomerConsole;
import atm.physical.EnvelopeAcceptor;
import atm.physical.Log;
import atm.physical.NetworkToBank;
import atm.physical.OperatorPanel;
import atm.physical.ReceiptPrinter;
import java.net.InetAddress;
import java.net.UnknownHostException;
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
public class ATMTest {
    
    int id;
    String place = "Gotham";
    String bankName = "Gotham National";
    InetAddress bankAddress = InetAddress.getByName("swan.clayton.edu");
    Log log;
    
    public ATMTest() throws UnknownHostException {
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
     * Test of run method, of class ATM.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        System.out.println(bankAddress);
        ATM instance = new ATM(id, place, bankName, bankAddress);
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of switchOn method, of class ATM.
     */
    @Test
    public void testSwitchOn() {
        System.out.println("switchOn");
        ATM instance = new ATM(id, place, bankName, bankAddress);
        instance.switchOn();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of switchOff method, of class ATM.
     */
    @Test
    public void testSwitchOff() {
        System.out.println("switchOff");
        ATM instance = new ATM(id, place, bankName, bankAddress);
        instance.switchOff();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of cardInserted method, of class ATM.
     */
    @Test
    public void testCardInserted() {
        System.out.println("cardInserted");
        ATM instance = new ATM(id, place, bankName, bankAddress);
        instance.cardInserted();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getID method, of class ATM.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        ATM instance = new ATM(id, place, bankName, bankAddress);
        int expResult = 0;
        int result = instance.getID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPlace method, of class ATM.
     */
    @Test
    public void testGetPlace() {
        System.out.println("getPlace");
        ATM instance = new ATM(id, place, bankName, bankAddress);
        String expResult = place;
        String result = instance.getPlace();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getBankName method, of class ATM.
     */
    @Test
    public void testGetBankName() {
        System.out.println("getBankName");
        ATM instance = new ATM(id, place, bankName, bankAddress);
        String expResult = bankName;
        String result = instance.getBankName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCardReader method, of class ATM.
     */
    @Test
    public void testGetCardReader() {
        System.out.println("getCardReader");
        ATM instance = new ATM(id, place, bankName, bankAddress);
        CardReader expResult = instance.getCardReader();
        CardReader result = instance.getCardReader();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCashDispenser method, of class ATM.
     */
    @Test
    public void testGetCashDispenser() {
        System.out.println("getCashDispenser");
        ATM instance = new ATM(id, place, bankName, bankAddress);
        CashDispenser expResult = instance.getCashDispenser();
        CashDispenser result = instance.getCashDispenser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerConsole method, of class ATM.
     */
    @Test
    public void testGetCustomerConsole() {
        System.out.println("getCustomerConsole");
        ATM instance = new ATM(id, place, bankName, bankAddress);
        CustomerConsole expResult = instance.getCustomerConsole();
        CustomerConsole result = instance.getCustomerConsole();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEnvelopeAcceptor method, of class ATM.
     */
    @Test
    public void testGetEnvelopeAcceptor() {
        System.out.println("getEnvelopeAcceptor");
        ATM instance = new ATM(id, place, bankName, bankAddress);
        EnvelopeAcceptor expResult = instance.getEnvelopeAcceptor();
        EnvelopeAcceptor result = instance.getEnvelopeAcceptor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLog method, of class ATM.
     */
    @Test
    public void testGetLog() {
        System.out.println("getLog");
        ATM instance = new ATM(id, place, bankName, bankAddress);
        Log expResult = instance.getLog();
        Log result = instance.getLog();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNetworkToBank method, of class ATM.
     */
    @Test
    public void testGetNetworkToBank() {
        System.out.println("getNetworkToBank");
        ATM instance = new ATM(id, place, bankName, bankAddress);
        NetworkToBank expResult = instance.getNetworkToBank();
        NetworkToBank result = instance.getNetworkToBank();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOperatorPanel method, of class ATM.
     */
    @Test
    public void testGetOperatorPanel() {
        System.out.println("getOperatorPanel");
        ATM instance = new ATM(id, place, bankName, bankAddress);
        OperatorPanel expResult = instance.getOperatorPanel();
        OperatorPanel result = instance.getOperatorPanel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getReceiptPrinter method, of class ATM.
     */
    @Test
    public void testGetReceiptPrinter() {
        System.out.println("getReceiptPrinter");
        ATM instance = new ATM(id, place, bankName, bankAddress);
        ReceiptPrinter expResult = instance.getReceiptPrinter();
        ReceiptPrinter result = instance.getReceiptPrinter();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
