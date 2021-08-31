package angle_mediator;

import angle_mediator.Players;
import angle_mediator.PlayerOne;
import angle_mediator.PlayerTwo;
import angle_mediator.PlayerThree;

/*
             ��ɫ1�������н��� 
 */
public class ChatRoom {
	PlayerOne playerOne;
	PlayerTwo playerTwo;
	PlayerThree playerThree;
    public void registerPlayerOne(PlayerOne playerOne){
       this.playerOne=playerOne;
    }
    public void registerPlayerTwo(PlayerTwo playerTwo){
       this.playerTwo=playerTwo;
    }
    public void registerPlayerThree(PlayerThree playerThree){
       this.playerThree=playerThree;
    }
    public void deliverMess(Players players,String [] mess){
       if(players==playerOne){
    	  System.out.println(mess[0]);
          if(mess.length>=1){
        	  playerThree.receiverMess("���Ҵ��ң���Ҫ����ҫ");
          } 
       }
       else if(players==playerTwo){
    	  System.out.println(mess[0]);
          if(mess.length>=1){
        	  playerOne.receiverMess("�������ң��Ժ�ÿ��һ���ս����");
        	  playerThree.receiverMess("�������ң����Ӳ���������ν������Ҫ�����һ����");
          }  
       }
       else if(players==playerThree){
    	  System.out.println(mess[0]);
          if(mess.length>=1){
        	  playerOne.receiverMess("С��㣬һ������˫�Ų���");
          }  
       }    
    }

}
