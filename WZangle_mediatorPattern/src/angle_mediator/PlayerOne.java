package angle_mediator;

import angle_mediator.ChatRoom;

/*
       ��ɫ3.1������ͬ�� 
 */
public class PlayerOne implements Players{
	ChatRoom room;                //�н���
    String name;
    PlayerOne(ChatRoom room){
       this.room=room;
       room.registerPlayerOne(this);
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
