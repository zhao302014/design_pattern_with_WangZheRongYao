package angle_chainOfResponsibility;

import angle_chainOfResponsibility.ClientServerFacade;

/*
         应用测试类
 */

public class Application {

	public static void main(String[] args) {
		   ClientServerFacade clientFacade,clientFacade1,clientFacade2,clientFacade3,clientFacade4,clientFacade5,clientFacade6;
	       String clientPoint="腾讯游戏（Tencent Games）图标加载中……";
	       clientFacade=new ClientServerFacade(clientPoint);
	       clientFacade.doPoint4();
	       System.out.println("-----------------------------------------");
	       String clientPoint1="天美工作室群（TIMI-L1 STUDIO）图标加载中……";
	       clientFacade1=new ClientServerFacade(clientPoint1);
	       clientFacade1.doPoint5();
	       System.out.println("-----------------------------------------");
	       String clientPoint2="正在为您检查版本更新……";
	       clientFacade2=new ClientServerFacade(clientPoint2);
	       clientFacade2.doPoint();
	       System.out.println("------------------------------------------");
	       String clientPoint3="正在为您初始化资源包……";
	       clientFacade3=new ClientServerFacade(clientPoint3);
	       clientFacade3.doPoint3();
	       System.out.println("------------------------------------------");
	       String clientPoint4="正在为您加载游戏……";
	       clientFacade4=new ClientServerFacade(clientPoint4);
	       clientFacade4.doPoint2();
	       System.out.println("------------------------------------------");
	       String clientPoint6="玩家点击“开始游戏”即可进入游戏……";
	       clientFacade6=new ClientServerFacade(clientPoint6);
	       clientFacade6.doPoint6();
	       System.out.println("------------------------------------------------------------");
	       String clientPoint5="当玩家想要退出游戏时……";
	       clientFacade5=new ClientServerFacade(clientPoint5);
	       clientFacade5.doPoint1();

	}

}
