package angle_responsibility;

/*
          ����Ӧ���� 
*/

import angle_responsibility.Application;
import angle_responsibility.Diamond60DrawAPrize;
import angle_responsibility.Handler;
import angle_responsibility.Diamond270DrawFivePrizes;
import angle_responsibility.RareCrystalOfKings;

public class Application {
	    private Handler diamond60,diamond270,rareDiamond;    //�������ϵĶ���
	    public void createChain(){       //����������
	    	diamond60=new Diamond60DrawAPrize();
	    	diamond270=new Diamond270DrawFivePrizes();
	    	rareDiamond=new RareCrystalOfKings();
	    	diamond60.setNextHandler(diamond270);
	    	diamond270.setNextHandler(rareDiamond);
	    }
	    public void reponseClient(int number){  //��Ӧ�û�������
	    	diamond60.handleRequest(number);
	    }
	    public static void main(String args[]){
	       Application  application=new  Application();
	       application.createChain();
	       System.out.println("�������60��ʯ����һ��ʱ��");
	       System.out.print("[����ɹ�]");
	       application.reponseClient(60);
	       System.out.println("---------------------------");
	       System.out.println("�������270��ʯ�������ʱ��");
	       System.out.print("[����ɹ�]");
	       application.reponseClient(270);
	       System.out.println("---------------------------");
	       System.out.println("����ʯ�齱������ֵ��201ʱ����");
	       System.out.print("[����ɹ�]");
	       application.reponseClient(201);
	    }

	}

