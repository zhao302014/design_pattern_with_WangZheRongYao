package angle_mediator;

import angle_mediator.ChatRoom;

/*
            ��ɫ3.2������ͬ�� 
*/
public class PlayerTwo implements Players{
	    ChatRoom room;                //�н���
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
	    	 System.out.print("       "+name+"�յ���Ϣ�ظ���");
		     System.out.println(mess);
	    }

}
