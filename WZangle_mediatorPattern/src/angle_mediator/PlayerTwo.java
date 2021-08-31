package angle_mediator;

import angle_mediator.ChatRoom;

/*
            角色3.2：具体同事 
*/
public class PlayerTwo implements Players{
	    ChatRoom room;                //中介者
	    String name;
	    PlayerTwo(ChatRoom room){
	       this.room=room;
	       room.registerPlayerTwo(this);
	    }
	    public void setName(String name){
	       this.name=name;
	    }
	    public String getName(){
	        return name;
	    } 
	   public void giveMess(String [] mess){
	        room.deliverMess(this,mess);
	    }
	    public void receiverMess(String mess){
	    	 System.out.print("       "+name+"收到信息回复：");
		     System.out.println(mess);
	    }

}
