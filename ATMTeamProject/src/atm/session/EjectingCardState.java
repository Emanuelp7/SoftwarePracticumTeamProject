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
public class EjectingCardState extends SessionState{
    
    public EjectingCardState(SessionState oldState) {
        super(oldState);
    }
    
    public EjectingCardState(ATM atm, Transaction trans, Card card, int pin) {
        super(atm, trans, card, pin);
    }

    @Override
    public void perform(Session session) {
        atm.getCardReader().ejectCard();
        session.setState(null);
    }
    
}
