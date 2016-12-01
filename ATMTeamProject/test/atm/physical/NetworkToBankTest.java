/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.physical;

import atm.ATM;
import atm.session.Session;
import banking.Balances;
import banking.Card;
import banking.Message;
import banking.Money;
import banking.Status;
import java.awt.Frame;
import java.net.InetAddress;
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
public class NetworkToBankTest {
    
    Log log = new Log();
    InetAddress bankAddress;
    int mCode;
    Card card;
    int pin;
    int sNum;
    int fAcc;
    int tAcc;
    Money amt;
    
    ATM atm = null;
    Simulation theSimulation;
    Session inst;
    
    public NetworkToBankTest() {
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
     * Test of openConnection method, of class NetworkToBank.
     */
    @Test
    public void testOpenConnection() {
        System.out.println("openConnection");
        NetworkToBank instance = new NetworkToBank(log, bankAddress);
        instance.openConnection();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of closeConnection method, of class NetworkToBank.
     */
    @Test
    public void testCloseConnection() {
        System.out.println("closeConnection");
        NetworkToBank instance = new NetworkToBank(log, bankAddress);
        instance.closeConnection();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of sendMessage method, of class NetworkToBank.
     */
    @Test
    public void testSendMessage() {
        System.out.println("sendMessage");
        mCode = 2;
        card = new Card(20);
        pin = 3234;
        sNum = 20103;
        fAcc = 1;
        tAcc = 1;
        amt = new Money(20);
        Message message = new Message(mCode, card, pin, sNum, fAcc, tAcc, amt);
        Balances balances = new Balances();
        NetworkToBank instance = new NetworkToBank(log, bankAddress);
        Status expResult = null;
        Status result = instance.sendMessage(message, balances);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
