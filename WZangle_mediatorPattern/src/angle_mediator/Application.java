package angle_mediator;

import angle_mediator.PlayerOne;
import angle_mediator.PlayerTwo;
import angle_mediator.PlayerThree;
import angle_mediator.ChatRoom;

/*
            应用类/测试类 
 */
public class Application {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		   ChatRoom room=new ChatRoom();
		   PlayerOne playerOne=new PlayerOne(room);
		   PlayerTwo playerTwo=new PlayerTwo(room);
		   PlayerThree playerThree=new PlayerThree(room);
		   playerOne.setName("玩家【曜有上镜心】");
		   playerTwo.setName("玩家【纤指绕温唇】");
		   playerThree.setName("玩家【古怪软萌妹】");
		   System.out.println("-------------"+playerOne.getName()+"进入聊天室---------------------");
		   System.out.println("-------------"+playerTwo.getName()+"进入聊天室---------------------");
		   System.out.println("-------------"+playerThree.getName()+"进入聊天室---------------------");
		   System.out.println("");
		   System.out.print("★★★"+playerOne.getName()+"发送需求信息：");
	       String [] messA={"找个辅助小姐姐，我带你上分分"};  
	       playerOne.giveMess(messA);
	       System.out.println("");
	       System.out.print("★★★"+playerTwo.getName()+"发送需求信息：");
	       String [] messB={"限时进我战队给“副队”"};
	       playerTwo.giveMess(messB);
	       System.out.println("");
		   System.out.print("★★★"+playerThree.getName()+"发送需求信息：");
	       String [] messC={"求带钻石上星耀"};
	       playerThree.giveMess(messC);
	       System.out.println("");
	       System.out.println("-------------"+playerOne.getName()+"退出聊天室---------------------");
		   System.out.println("-------------"+playerTwo.getName()+"退出聊天室---------------------");
		   System.out.println("-------------"+playerThree.getName()+"退出聊天室---------------------");

	}

}
