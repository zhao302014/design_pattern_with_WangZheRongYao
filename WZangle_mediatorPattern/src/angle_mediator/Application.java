package angle_mediator;

import angle_mediator.PlayerOne;
import angle_mediator.PlayerTwo;
import angle_mediator.PlayerThree;
import angle_mediator.ChatRoom;

/*
            Ӧ����/������ 
 */
public class Application {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		   ChatRoom room=new ChatRoom();
		   PlayerOne playerOne=new PlayerOne(room);
		   PlayerTwo playerTwo=new PlayerTwo(room);
		   PlayerThree playerThree=new PlayerThree(room);
		   playerOne.setName("��ҡ������Ͼ��ġ�");
		   playerTwo.setName("��ҡ���ָ���´���");
		   playerThree.setName("��ҡ��Ź������á�");
		   System.out.println("-------------"+playerOne.getName()+"����������---------------------");
		   System.out.println("-------------"+playerTwo.getName()+"����������---------------------");
		   System.out.println("-------------"+playerThree.getName()+"����������---------------------");
		   System.out.println("");
		   System.out.print("����"+playerOne.getName()+"����������Ϣ��");
	       String [] messA={"�Ҹ�����С��㣬�Ҵ����Ϸַ�"};  
	       playerOne.giveMess(messA);
	       System.out.println("");
	       System.out.print("����"+playerTwo.getName()+"����������Ϣ��");
	       String [] messB={"��ʱ����ս�Ӹ������ӡ�"};
	       playerTwo.giveMess(messB);
	       System.out.println("");
		   System.out.print("����"+playerThree.getName()+"����������Ϣ��");
	       String [] messC={"�����ʯ����ҫ"};
	       playerThree.giveMess(messC);
	       System.out.println("");
	       System.out.println("-------------"+playerOne.getName()+"�˳�������---------------------");
		   System.out.println("-------------"+playerTwo.getName()+"�˳�������---------------------");
		   System.out.println("-------------"+playerThree.getName()+"�˳�������---------------------");

	}

}
