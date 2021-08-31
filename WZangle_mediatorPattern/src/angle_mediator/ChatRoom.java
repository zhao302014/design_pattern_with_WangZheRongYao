package angle_mediator;

import angle_mediator.Players;
import angle_mediator.PlayerOne;
import angle_mediator.PlayerTwo;
import angle_mediator.PlayerThree;

/*
             角色1：具体中介者 
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
        	  playerThree.receiverMess("带我带我，我要上星耀");
          } 
       }
       else if(players==playerTwo){
    	  System.out.println(mess[0]);
          if(mess.length>=1){
        	  playerOne.receiverMess("拉我拉我，以后每周一起打战队赛");
        	  playerThree.receiverMess("拉我拉我，副队不副队无所谓，我主要想和你一起玩");
          }  
       }
       else if(players==playerThree){
    	  System.out.println(mess[0]);
          if(mess.length>=1){
        	  playerOne.receiverMess("小姐姐，一起甜蜜双排不咯");
          }  
       }    
    }

}
