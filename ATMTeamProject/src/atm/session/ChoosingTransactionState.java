/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.session;

import atm.ATM;
import atm.physical.CustomerConsole;
import atm.transaction.Transaction;
import banking.Card;

/**
 *
 * @author Emanuel Peters
 */
public class ChoosingTransactionState extends SessionState{

    public ChoosingTransactionState(SessionState oldState) {
        super(oldState);
    }
    
    public ChoosingTransactionState(ATM atm, Transaction trans, Card card, int pin) {
        super(atm, trans, card, pin);
    }

    @Override
    public void perform(Session session) {
        try
        {
            currentTransaction = 
                Transaction.makeTransaction(atm, session, card, pin);
            session.setState(new PerformingTransactionState(this));
        }
        catch(CustomerConsole.Cancelled e)
        {
           session.setState(new EjectingCardState(this));
        }
    }
    
}
