package angle_statePattern2;

import angle_statePattern2.State;
import angle_statePattern2.HeroMoveState;
import angle_statePattern2.HeroRestState;

public  class  Hero{
    static State  moveState,restState;
    static State  state;  
    String name;   
    Hero(String name){
            this.name=name;
            moveState=new HeroMoveState();
            restState=new HeroRestState();
            state=restState;                   
    }
    public  void  startUp(){
         state.startUp(this);  
   }
   public void stop(){
         state.stop(this);
   }
   public void setState(State state){
        this.state=state;
   }
   public  State getMoveState(){
        return moveState;
   }
   public  State getRestState(){
        return restState;
   }
   public String getName(){
        return name;
   }
}
