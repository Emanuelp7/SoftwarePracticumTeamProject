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
public abstract class ICardFactory {
    public abstract CreditCard CreateCredit(int n);
    public abstract DebitCard CreateDebit(int n);
}
