package angle_responsibility;

/*
             ��ɫ2.3�����崦���� �����崦������ʵ�ִ����߽ӿڵ����ʵ��
                             ���崦����ͨ�����ô����߽ӿڹ涨�ķ����������û�������
                             ���ڽӵ��û�������󣬴����߽����ýӿڹ涨�ķ�������ִ�и÷����Ĺ�����
                             ��������ܴ����û������󣬾ʹ����й�����
                             ����ͷ����޷��������Ϣ���û���Ȼ���û������󴫵ݸ��Լ��ĺ�̶���
*/

public class RareCrystalOfKings implements Handler{
	private Handler handler;      //��ŵ�ǰ�����ߺ�̵�Hander�ӿڱ���
    public void handleRequest(int number){
   	if(number==201){               //������ֵ��201ʱ����ϡ��ˮ��
           System.out.println("��ϡ�С�����ˮ��");
   	}
   	else
            handler.handleRequest(number);      //�����󴫵ݸ���һ��������
       }
     public void setNextHandler(Handler handler){
        this.handler=handler;
   }

}
