/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author DeJurnett Norrington
 */
public class CardFactory extends ICardFactory{

    private CreditCard cCard;
    private DebitCard dCard;
    
    @Override
    public CreditCard CreateCredit(int n) {
        cCard = new CreditCard(n);
        return cCard;
    }

    @Override
    public DebitCard CreateDebit(int n) {
        dCard = new DebitCard(n);
        return dCard;
    }
    
}
