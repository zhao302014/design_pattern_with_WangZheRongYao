package angle_observer;

import angle_observer.TeammatesReceive;
import angle_observer.TurretBeenDestroyed;

/*
使用了观察者模式中所涉及的类，应用程序在使用观察者模式时，需要创建具体主题和该主题的观察者
当系统消息提示“敌方防御塔被摧毁”时，我方和敌方分别得到内容不同的通知  
*/

public class Application {
public static void main(String args[]){
	TurretBeenDestroyed message=new TurretBeenDestroyed(); //具体主题message
	System.out.println(" ");
	TeammatesReceive teammates=new TeammatesReceive(message,"收到系统消息");  //具体观察者teammates
	EnemiesReceive enemies=new EnemiesReceive(message,"收到系统消息");    //具体观察者enemies
	message.giveNewMess("“敌方防御塔被摧毁”");       //具体主题给出新信息
	message.notifyObservers();                   //具体主题通知信息
}

}
