package angle_responsibility;

/*
            ��ɫ1�������� :��һ���ӿڣ�����涨���崦���ߴ����û�����ķ����Լ����崦�������ú�̶���ķ���
*/

import angle_responsibility.Handler;

public interface Handler {
	   public abstract void handleRequest(int number);   //���崦���û�����60��ʯ��һ�λ���270��ʯ�����
	   public abstract void setNextHandler(Handler handler);  

}
