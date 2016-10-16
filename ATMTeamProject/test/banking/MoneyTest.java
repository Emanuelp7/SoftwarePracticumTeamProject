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
public class MoneyTest {
    
    int d; //dollars dummy variable
    int c; //cents dummy variable
    
    public MoneyTest() {
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
     * Test of toString method, of class Money.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        d = 20;
        c = 2;
        Money instance = new Money(d, c);
        String expResult = "$20.02"; //Should display the value in normal monetary view
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class Money.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        d = 300;
        c = 20;
        Money amountToAdd = new Money(0, 13); //$3.13 can use d and c
        Money instance = new Money(d, c);
        instance.add(amountToAdd); //only adds cents will have to fix later so it can add dollars
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of subtract method, of class Money.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        d = 200;
        c = 2;
        //gonna make c = 0;
        Money amountToSubtract = new Money(0, c);
        Money instance = new Money(d, c);
        instance.subtract(amountToSubtract);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of lessEqual method, of class Money.
     */
    @Test
    public void testLessEqual() {
        System.out.println("lessEqual");
        //Comparing cents
        d = 100;
        c = 20;
        Money compareTo = new Money(d, c);
        d = 10; // change to see if it works 
        Money instance = new Money(d, c);
        boolean expResult = true; //if true then uh-oh gotta compare dollars too
        boolean result = instance.lessEqual(compareTo);
        assertEquals(expResult, result);
        /*
        guess what it worked. gonna have to make sure that it is able to compare dollars
        */
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
