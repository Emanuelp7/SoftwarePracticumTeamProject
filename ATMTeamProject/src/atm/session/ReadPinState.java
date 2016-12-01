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
public class ReadPinState extends SessionState{

    public ReadPinState(ATM atm, Transaction trans, Card card, int pin) {
        super(atm, trans, card, pin);
    }

    public ReadPinState(SessionState oldState) {
        super(oldState);
    }

    @Override
    public void perform(Session session) {
        try
        {
            pin = atm.getCustomerConsole().readPIN(
                "Please enter your PIN\n" +
                "Then press ENTER");
            session.setState(new ChoosingTransactionState(this));
        }
        catch(CustomerConsole.Cancelled e)
        {
             session.setState(new EjectingCardState(this));
        }
    }
    
}
