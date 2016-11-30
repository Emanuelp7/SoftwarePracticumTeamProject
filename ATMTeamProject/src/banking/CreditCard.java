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
public class CreditCard extends Card {

    /**Constructor
     * 
     * @param number 
     */
    public CreditCard(int number) {
        this.number  = number;
    }
    
    public CreditCard(){
    
    }
    

    @Override
    public int getNumber() {
        return number;
    }
    
}
