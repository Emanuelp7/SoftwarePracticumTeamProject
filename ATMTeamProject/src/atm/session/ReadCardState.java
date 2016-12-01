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
public class ReadCardState extends SessionState{

    public ReadCardState(ATM atm, Transaction trans, Card card, int pin) {
        super(atm, trans, card, pin);
    }
    public ReadCardState(SessionState oldState) {
        super(oldState);
    }
    
    @Override
    public void perform(Session session) {
        card = atm.getCardReader().readCard();
                    
        if (card != null)
            session.setState(new ReadPinState(this));
        else
        {
            atm.getCustomerConsole().display("Unable to read card");
            session.setState(new EjectingCardState(this));
        }
    }
    
    
}
