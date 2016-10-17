/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.transaction;

import atm.ATM;
import atm.Session;
import atm.physical.CustomerConsole;
import banking.AccountInformation;
import banking.Card;
import banking.Message;
import banking.Money;
import banking.Receipt;
import java.awt.Frame;
import java.util.Enumeration;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import simulation.Simulation;

/**
 *
 * @author Emanuel Peters
 */
public class InquiryTest {
    ATM atm = null;
    Simulation theSimulation;
    Session session;
    Card card;
    int pin =4321;
    public InquiryTest() {
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
        session= new Session(atm);
        card = new Card(65165156);
        mainFrame.add(theSimulation.getGUI());
        mainFrame.setVisible(true);
        System.out.println("Setup Complete!");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSpecificsFromCustomer method, of class Inquiry.
     */
    @Test
    public void testGetSpecificsFromCustomer() throws Exception {
        System.out.println("getSpecificsFromCustomer");
        Inquiry instance = new Inquiry(atm, session, card, pin);
        Message expResult = new Message(Message.INQUIRY,
                card, pin, 1, 0, -1, new Money(0));
        new Thread(new Runnable() {
            public void run() {
                try {
                    //enter checking aoount
                    Thread.sleep(1000);
                    theSimulation.getKeyboard().pressDigit(1);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Error!!!");
                }
            }
        }).start();
        Message result = instance.getSpecificsFromCustomer();
        assertTrue(expResult.toString().equals(result.toString()));
    }

    /**
     * Test of completeTransaction method, of class Inquiry.
     */
    @Test
    public void testCompleteTransaction() {
        System.out.println("completeTransaction");
        Inquiry instance = new Inquiry(atm, session, card, pin);
        new Thread(new Runnable() {
            public void run() {
                try {
                    //enter checking aoount
                    Thread.sleep(1000);
                    theSimulation.getKeyboard().pressDigit(1);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Error!!!");
                }
            }
        }).start();
        Receipt expResult=null;
        Receipt result=null;
        try {
            final Message m = instance.getSpecificsFromCustomer();

            expResult = new Receipt(atm, card, instance, instance.balances) {
                {
                    detailsPortion = new String[2];
                    detailsPortion[0] = "INQUIRY FROM: "
                            + AccountInformation.ACCOUNT_ABBREVIATIONS[m.getFromAccount()];
                    detailsPortion[1] = "";
                }
            };

            result = instance.completeTransaction();
        } catch (CustomerConsole.Cancelled ex) {
            Logger.getLogger(InquiryTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Enumeration exp =expResult.getLines(), r=result.getLines();
        exp.nextElement();//times will very
        r.nextElement();//times will very
        while(exp.hasMoreElements()){
            assertTrue(exp.nextElement().equals(r.nextElement()));
        }
    }
    
}
