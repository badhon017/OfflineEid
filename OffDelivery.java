/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingmachine;

/**
 *
 * @author Badhon
 */
public class OffDelivery extends ActionState{
    public void doAction(Vender v){
        System.out.println("Deliver no product due to insufficient currency on deposit or inventory depletion.");
        v.setState(this);
    }
    
    @Override
    public String toString(){
        return "stopped state";
    }
}
