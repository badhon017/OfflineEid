
package vendingmachine;

/**
 *
 * @author Badhon
 */
public class Vender{
    private ActionState state;

    
    public ActionState getState(){
        return state;
    }
    
    public void setState(ActionState state){
        this.state = state;
    }
    
    public Vender(ActionState state){
        this.state = state;
    }
    public void doAction(){
        state.doAction(this);
    }
    


}
