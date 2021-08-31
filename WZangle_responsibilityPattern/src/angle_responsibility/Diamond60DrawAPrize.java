package angle_responsibility;

/*
              ��ɫ2.1�����崦���� �����崦������ʵ�ִ����߽ӿڵ����ʵ��
                              ���崦����ͨ�����ô����߽ӿڹ涨�ķ����������û�������
                              ���ڽӵ��û�������󣬴����߽����ýӿڹ涨�ķ�������ִ�и÷����Ĺ�����
                              ��������ܴ����û������󣬾ʹ����й�����
                              ����ͷ����޷��������Ϣ���û���Ȼ���û������󴫵ݸ��Լ��ĺ�̶���
*/

import angle_responsibility.Handler;

public class Diamond60DrawAPrize implements Handler{
	 private Handler handler;      //��ŵ�ǰ�����ߺ�̵�Hander�ӿڱ���
     public void handleRequest(int number){
    	if(number==60){              //60��ʯ��һ��
    		String random = "";
            String[] doc = {"����", "�ĺ", "�缧", "���288","С����5","������Ƭ1600", "������Ƭ400","������Ƭ100", "������Ƭ25", "��������3�գ�", "����õ��","��ʯ48","�����������鿨"};
            int index = (int) (Math.random() * doc.length);         //���ѡȡ��һ���
            random = doc[index];
            System.out.println(random);
    	}
    	else
    		handler.handleRequest(number);     //�����󴫵ݸ���һ��������
        }
      public void setNextHandler(Handler handler){
         this.handler=handler;
    }

}
