/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm.session;

import atm.ATM;
import atm.transaction.Transaction;
import banking.Card;

/**
 *
 * @author Emanuel Peters
 */
public class PerformingTransactionState extends SessionState{

    public PerformingTransactionState(ATM atm, Transaction trans, Card card, int pin) {
        super(atm, trans, card, pin);
    }
    
    public PerformingTransactionState(SessionState oldState) {
        super(oldState);
    }
    
    @Override
    public void perform(Session session) {
        try
        {
            boolean doAgain = 
                currentTransaction.performTransaction();
            if (doAgain)
                session.setState(new ChoosingTransactionState(this));
            else
                session.setState(new EjectingCardState(this));
        }
        catch(Transaction.CardRetained e)
        {
            session.setState(new EjectingCardState(this));
        }
    }
    
}
