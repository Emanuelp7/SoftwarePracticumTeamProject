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
public class DebitCard extends Card {

    public DebitCard(int number) {
        this.number = number;
    }
    
    public DebitCard(){
        
    }

    @Override
    public int getNumber() {
        return number;
    }
    
}
