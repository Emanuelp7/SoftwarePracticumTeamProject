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
public class WithdrawalTest {
    ATM atm = null;
    Simulation theSimulation;
    Session session;
    Card card;
    int pin =4321;
    public WithdrawalTest() {
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
        atm.getCashDispenser().setInitialCash(new Money(2000));
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
     * Test of getSpecificsFromCustomer method, of class Withdrawal.
     */
    @Test
    public void testGetSpecificsFromCustomer() throws Exception {
        System.out.println("getSpecificsFromCustomer");
        Withdrawal instance = new Withdrawal(atm, session, card, pin);
        new Thread(new Runnable() {
            public void run() {
                try {
                    //enter checking aoount
                    Thread.sleep(1000);
                    theSimulation.getKeyboard().pressDigit(1);
                    Thread.sleep(1000);
                    theSimulation.getKeyboard().pressDigit(4);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Error!!!");
                }
            }
        }).start();
        Message expResult =new Message(Message.WITHDRAWAL,
                           card, pin, 1, 0, -1, new Money(100));
        Message result = instance.getSpecificsFromCustomer();
        assertTrue(expResult.toString().equals(result.toString()));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of completeTransaction method, of class Withdrawal.
     */
    @Test
    public void testCompleteTransaction() {
        System.out.println("completeTransaction");
        Withdrawal instance = new Withdrawal(atm, session, card, pin);
        new Thread(new Runnable() {
            public void run() {
                try {
                    //enter checking aoount
                    Thread.sleep(1000);
                    theSimulation.getKeyboard().pressDigit(1);
                    Thread.sleep(1000);
                    theSimulation.getKeyboard().pressDigit(4);
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Error!!!");
                }
            }
        }).start();
        Receipt expResult=null;
        
        try {
           final Message m = instance.getSpecificsFromCustomer();
       
       expResult = new Receipt(atm, card, instance, instance.balances) {
            {
                detailsPortion = new String[2];
                detailsPortion[0] = "WITHDRAWAL FROM: " + 
                                    AccountInformation.ACCOUNT_ABBREVIATIONS[m.getFromAccount()];
                detailsPortion[1] = "AMOUNT: " + m.getAmount().toString();
            }
        };
         } catch (CustomerConsole.Cancelled ex) {
            Logger.getLogger(WithdrawalTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        Receipt result = instance.completeTransaction();
        Enumeration exp =expResult.getLines(), r=result.getLines();
        exp.nextElement();//times will very
        r.nextElement();//times will very
        while(exp.hasMoreElements()){
            assertTrue(exp.nextElement().equals(r.nextElement()));
        }
    }
    
}
