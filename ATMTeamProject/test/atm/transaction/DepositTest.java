/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.transaction;

import atm.ATM;
import atm.session.Session;
import banking.AccountInformation;
import banking.Card;
import banking.Message;
import banking.Money;
import banking.Receipt;
import java.awt.Frame;
import java.util.Enumeration;
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
public class DepositTest {
    
    ATM atm = null;
    Simulation theSimulation;
    Session session;
    Card card;
    int pin =4321;
    public DepositTest() {
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
     * Test of getSpecificsFromCustomer method, of class Deposit.
     */
    @Test
    public void testGetSpecificsFromCustomer() throws Exception { 
        Deposit instance = new Deposit(atm, session, card, pin);
        new Thread(new Runnable() {
            public void run() {
                try {
                    //enter checking aoount
                    Thread.sleep(1000);
                    theSimulation.getKeyboard().pressDigit(1);
                    Thread.sleep(1000);
                    //type $15.69 on keyboard
                    theSimulation.getKeyboard().pressDigit(1);
                    theSimulation.getKeyboard().pressDigit(5);
                    theSimulation.getKeyboard().pressDigit(6);
                    theSimulation.getKeyboard().pressDigit(9);
                    theSimulation.getKeyboard().pressEnter();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Error!!!");
                }
            }
        }).start();
        System.out.println("getSpecificsFromCustomer");
        Message expResult = new Message(Message.INITIATE_DEPOSIT,
                           card, pin, 1, -1, 0, new Money(15,69));
        Message result = instance.getSpecificsFromCustomer();
        System.out.println(expResult);
        System.out.println(result);
        assertTrue(expResult.toString().equals(result.toString()));
       
    }

    /**
     * Test of completeTransaction method, of class Deposit.
     */
    @Test
    public void testCompleteTransaction() throws Exception {
        Deposit instance = new Deposit(atm, session, card, pin);
        //runs a full transaction
        new Thread(new Runnable() {
          

            public void run() {
                try {
                    //enter checking aoount
                    Thread.sleep(1000);
                    theSimulation.getKeyboard().pressDigit(1);
                    Thread.sleep(1000);
                    //type $15.69 on keyboard
                    theSimulation.getKeyboard().pressDigit(1);
                    theSimulation.getKeyboard().pressDigit(5);
                    theSimulation.getKeyboard().pressDigit(6);
                    theSimulation.getKeyboard().pressDigit(9);
                    theSimulation.getKeyboard().pressEnter();
                    Thread.sleep(1000);
                    theSimulation.getEnvelopeAcceptor().insertEnvelope();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("Error!!!");
                }
            }
        }).start();
        final Message m = instance.getSpecificsFromCustomer();//sets up the transaction
        Receipt expResult = new Receipt(atm, card, instance, instance.balances) {
            {
                detailsPortion = new String[2];
                detailsPortion[0] = "DEPOSIT TO: "
                        + AccountInformation.ACCOUNT_ABBREVIATIONS[m.getToAccount()];
                detailsPortion[1] = "AMOUNT: " + m.getAmount().toString();
            }
        };
        Receipt result = instance.completeTransaction();
        System.out.println("completeTransaction");
        //assertTrue(((String)expResult.getLines().nextElement()).equals(((String)result.getLines().nextElement())));
        Enumeration exp =expResult.getLines(), r=result.getLines();
        exp.nextElement();//times will very
        r.nextElement();//times will very
        while(exp.hasMoreElements()){
            assertTrue(exp.nextElement().equals(r.nextElement()));
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
