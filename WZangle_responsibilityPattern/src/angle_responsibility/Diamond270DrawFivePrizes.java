package angle_responsibility;

/*
              ��ɫ2.2�����崦���� �����崦������ʵ�ִ����߽ӿڵ����ʵ��
                              ���崦����ͨ�����ô����߽ӿڹ涨�ķ����������û�������
                              ���ڽӵ��û�������󣬴����߽����ýӿڹ涨�ķ�������ִ�и÷����Ĺ�����
                              ��������ܴ����û������󣬾ʹ����й�����
                              ����ͷ����޷��������Ϣ���û���Ȼ���û������󴫵ݸ��Լ��ĺ�̶���
*/

public class Diamond270DrawFivePrizes implements Handler{
	private Handler handler;      //��ŵ�ǰ�����ߺ�̵�Hander�ӿڱ���
    public void handleRequest(int number){
   	if(number==270){               //270��ʯ�����
   		   String random,random1,random2,random3,random4 = "";
           String[] doc = {"����", "�ĺ", "�缧", "���288","С����5","������Ƭ1600", "������Ƭ400","������Ƭ100", "������Ƭ25", "��������3�գ�", "����õ��","��ʯ48","�����������鿨"};
           int index = (int) (Math.random() * doc.length);      //���ѡȡ�������
           random = doc[index];
           System.out.print(random+"��");
           int index1 = (int) (Math.random() * doc.length);
           random1 = doc[index1];
           System.out.print(random1+"��");
           int index2 = (int) (Math.random() * doc.length);
           random2 = doc[index2];
           System.out.print(random2+"��");
           int index3 = (int) (Math.random() * doc.length);
           random3 = doc[index3];
           System.out.print(random3+"��");
           int index4 = (int) (Math.random() * doc.length);
           random4 = doc[index4];
           System.out.println(random4);
   	}
   	else
            handler.handleRequest(number);      //�����󴫵ݸ���һ��������
       }
     public void setNextHandler(Handler handler){
        this.handler=handler;
   }

}
