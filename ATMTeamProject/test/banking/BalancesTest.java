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
import org.junit.Ignore;

/**
 *
 * @author DeJurnett Norrington
 */
public class BalancesTest {
    
    public BalancesTest() {
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
     * Test of setBalances method, of class Balances.
     */
    @Test
    public void testSetBalances() {
        System.out.println("setBalances");
        Money total = new Money(20, 50); //$20.50
        Money available = new Money(300); //$300.00
        Balances instance = new Balances();
        instance.setBalances(total, available);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class Balances.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Balances instance = new Balances();
        Money total = new Money(300); //$300
        Money available = new Money(100); //$200
        instance.setBalances(total, available); //set values
        Money expResult = total; //Should get total's value
        Money result = instance.getTotal(); //get total's value
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAvailable method, of class Balances.
     */
    @Test
    public void testGetAvailable() {
        System.out.println("getAvailable");
        Balances instance = new Balances();
        Money total = new Money(30);
        Money available = new Money(20);
        instance.setBalances(total, available); //set balance
        Money expResult = available; // should return availables value
        Money result = instance.getAvailable(); //get available
        assertEquals(expResult, result);
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
