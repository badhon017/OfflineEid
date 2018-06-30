
package vendingmachine;

/**
 *
 * @author Badhon
 */
public class VendingMachine{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        
        Vender v;
        
        OffDelivery off = new OffDelivery();
        
        v = new Vender(off);
        
        System.out.println("The machine is in " + v.getState().toString());
        v.doAction();
        
        
        OnDelivery on = new OnDelivery();
        
        v = new Vender(on);
        
        System.out.println("The machine is in " + v.getState().toString());
        v.doAction();
    }
    
}
