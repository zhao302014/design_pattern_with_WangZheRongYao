package angle_observer;

import angle_observer.TeammatesReceive;
import angle_observer.TurretBeenDestroyed;

/*
ʹ���˹۲���ģʽ�����漰���࣬Ӧ�ó�����ʹ�ù۲���ģʽʱ����Ҫ������������͸�����Ĺ۲���
��ϵͳ��Ϣ��ʾ���з����������ݻ١�ʱ���ҷ��͵з��ֱ�õ����ݲ�ͬ��֪ͨ  
*/

public class Application {
public static void main(String args[]){
	TurretBeenDestroyed message=new TurretBeenDestroyed(); //��������message
	System.out.println(" ");
	TeammatesReceive teammates=new TeammatesReceive(message,"�յ�ϵͳ��Ϣ");  //����۲���teammates
	EnemiesReceive enemies=new EnemiesReceive(message,"�յ�ϵͳ��Ϣ");    //����۲���enemies
	message.giveNewMess("���з����������ݻ١�");       //���������������Ϣ
	message.notifyObservers();                   //��������֪ͨ��Ϣ
}

}
