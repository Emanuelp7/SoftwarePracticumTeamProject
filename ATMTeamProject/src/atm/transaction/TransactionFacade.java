/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.transaction;

import atm.ATM;
import atm.physical.CustomerConsole;
import atm.session.Session;
import banking.Card;

/**
 *
 * @author Emanuel Peters
 */
public class TransactionFacade {
    private static final String [] TRANSACTION_TYPES_MENU = 
        { "Withdrawal", "Deposit", "Transfer", "Balance Inquiry" };
    
    public static Transaction makeTransaction(ATM atm, Session session,
                                              Card card, int pin)
                                throws CustomerConsole.Cancelled              
    {
        int choice = atm.getCustomerConsole().readMenuChoice(
                "Please choose transaction type", TRANSACTION_TYPES_MENU);
                
        switch(choice)
        {
            case 0:
            
                return new Withdrawal(atm, session, card, pin);
                
            case 1:
            
                return new Deposit(atm, session, card, pin);
                
            case 2:
            
                return new Transfer(atm, session, card, pin);
                
            case 3:
            
                return new Inquiry(atm, session, card, pin);
                
            default:
            
                return null;    // To keep compiler happy - should not happen!
        }
    }
    
}
