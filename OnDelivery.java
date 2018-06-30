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
public class OnDelivery extends ActionState{
   
    public void doAction(Vender v){
        System.out.println("Deliver the product with or without change.");
        v.setState(this);
    }
    @Override
    public String toString(){
        return "working state";
    }

}
