package angle_statePattern2;

import angle_statePattern2.Hero;

public class Application{
    public static void main(String args[]) {
    	  System.out.println("��Ӣ�ۡ������ͷ������ܿ��Ը�������Ӣ�����ϣ���������Ӣ�۵��ƶ����ƶ���");
    	  System.out.println("���������������������������������������������������");
    	  Hero heroOne=new Hero("Ұ��");
    	  Hero heroTwo=new Hero("������");
    	  heroOne.startUp();
          heroTwo.stop();
          System.out.println("������������������������");
          heroOne.stop();  
    	  heroTwo.startUp();  
    }
}
