package angle_chainOfResponsibility;

import angle_chainOfResponsibility.ClientServerFacade;

/*
         Ӧ�ò�����
 */

public class Application {

	public static void main(String[] args) {
		   ClientServerFacade clientFacade,clientFacade1,clientFacade2,clientFacade3,clientFacade4,clientFacade5,clientFacade6;
	       String clientPoint="��Ѷ��Ϸ��Tencent Games��ͼ������С���";
	       clientFacade=new ClientServerFacade(clientPoint);
	       clientFacade.doPoint4();
	       System.out.println("-----------------------------------------");
	       String clientPoint1="����������Ⱥ��TIMI-L1 STUDIO��ͼ������С���";
	       clientFacade1=new ClientServerFacade(clientPoint1);
	       clientFacade1.doPoint5();
	       System.out.println("-----------------------------------------");
	       String clientPoint2="����Ϊ�����汾���¡���";
	       clientFacade2=new ClientServerFacade(clientPoint2);
	       clientFacade2.doPoint();
	       System.out.println("------------------------------------------");
	       String clientPoint3="����Ϊ����ʼ����Դ������";
	       clientFacade3=new ClientServerFacade(clientPoint3);
	       clientFacade3.doPoint3();
	       System.out.println("------------------------------------------");
	       String clientPoint4="����Ϊ��������Ϸ����";
	       clientFacade4=new ClientServerFacade(clientPoint4);
	       clientFacade4.doPoint2();
	       System.out.println("------------------------------------------");
	       String clientPoint6="��ҵ������ʼ��Ϸ�����ɽ�����Ϸ����";
	       clientFacade6=new ClientServerFacade(clientPoint6);
	       clientFacade6.doPoint6();
	       System.out.println("------------------------------------------------------------");
	       String clientPoint5="�������Ҫ�˳���Ϸʱ����";
	       clientFacade5=new ClientServerFacade(clientPoint5);
	       clientFacade5.doPoint1();

	}

}
