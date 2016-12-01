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
public abstract class SessionState {
    Card card = null;
    Transaction currentTransaction = null;
    ATM atm;
    int pin;
    
    /**
     * Constructor for state transitions
     * @param oldState 
     */
    public SessionState(SessionState oldState){
        this.atm=oldState.atm;
        this.card=oldState.card;
        this.currentTransaction=oldState.currentTransaction;
        this.pin=oldState.pin;
    }
    
    /**
     * Constructor to initialize state
     * @param oldState 
     */
    public SessionState(ATM atm, Transaction trans, Card card, int pin){
        this.atm=atm;
        this.card=card;
        this.currentTransaction=trans;
        this.pin=pin;
    }
    
    abstract public void perform(Session session);
    
}
