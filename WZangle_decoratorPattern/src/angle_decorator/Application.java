package angle_decorator;

/*
         Ӧ���� 
*/

import angle_decorator.Application;
import angle_decorator.Hero;
import angle_decorator.SimaYi;
import angle_decorator.SimaYiDecorator;

public class Application {
	public void needSimayiPifu(Hero hero){
		double SimayiAttribute1=hero.attribute1();
		System.out.println("");
		System.out.println("Ӣ��˾��ܲ���ϡ������ʦ��Ƥ�����״̬���ԣ�");
		System.out.println("�����˺�: "+SimayiAttribute1);
		System.out.println("�����˺���179.0");
		System.out.println("�ƶ��ٶȣ�370.0");
		System.out.println("���ټӳɣ�0.0%");
		System.out.println("--------------------------------------------------");
	}
	
	public void needSimayiMingwen(Hero hero){
		double SimayiAttribute1=hero.attribute1();
		double SimayiAttribute2=hero.attribute2();
		double SimayiAttribute3=hero.attribute3();
		System.out.println("");
		System.out.println("Ӣ��˾��ܲ��ӵ��Ƥ���Ļ�������װ��150�����ĺ��״̬���ԣ�");
		System.out.println("�����˺�: "+SimayiAttribute1);
		System.out.println("�����˺���179.0");
		System.out.println("�ƶ��ٶȣ�"+SimayiAttribute2);
		System.out.println("���ټӳɣ�"+SimayiAttribute3+"%");
		System.out.println("--------------------------------------------------");
	}
	public void needSimayiZhuangbei(Hero hero){
		double SimayiAttribute1=hero.attribute1();
		double SimayiAttribute2=hero.attribute2();
		double SimayiAttribute3=hero.attribute3();
		double SimayiAttribute4=hero.attribute4();
		System.out.println("");
		System.out.println("Ӣ��˾��ܲ��ӵ��Ƥ����150�����ĵĻ�������װ��6��װ���״̬���ԣ�");
		System.out.println("�����˺�: "+SimayiAttribute1);
		System.out.println("�����˺���"+SimayiAttribute4);
		System.out.println("�ƶ��ٶȣ�"+SimayiAttribute2);
		System.out.println("���ټӳɣ�"+SimayiAttribute3+"%");
	}

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("Ӣ��˾��ܲ��ʼ״̬���ԣ�");
		System.out.println("�����˺���0.0");
		System.out.println("�����˺���179.0");
		System.out.println("�ƶ��ٶȣ�370.0");
		System.out.println("���ټӳɣ�0.0%");
		System.out.println("---------------------------------------------------");
		Application client=new Application();
		Hero simayi=new SimaYi();                 //˾��ܲ��ʼ״̬����
		Hero simayiDecorator1=new SimaYiDecorator(simayi);     //���ϡ������ʦ��Ƥ�����״̬����		
		client.needSimayiPifu(simayiDecorator1);
		Hero simayiDecorator2=new SimaYiDecoratorMingWen(simayi);     //150�����ĺ��״̬����		
		client.needSimayiMingwen(simayiDecorator2);
		Hero simayiDecorator3=new SimaYiDecoratorZhuangBei(simayi);     //6��װ���״̬����		
		client.needSimayiZhuangbei(simayiDecorator3);

	}

}
