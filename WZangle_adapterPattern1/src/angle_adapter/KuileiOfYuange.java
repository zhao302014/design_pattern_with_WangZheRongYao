package angle_adapter;

/*
            ��ɫ3������������һ���࣬����ʵ����Ŀ��ӿڲ������б������ߵ����ã���������ְ���ǶԱ������߽ӿڣ������ࣩ��Ŀ��ӿڽ������䣩 
*/

import angle_adapter.HeroYuange;

public class KuileiOfYuange implements TargetHero{
	
	HeroYuange yuangeKuilei;
	KuileiOfYuange(HeroYuange yuangeKuilei){      //Ԫ�������Ϊ������
	       this.yuangeKuilei=yuangeKuilei;
	   }
	public void beenLearntFromAnEnemyHero(){
		   yuangeKuilei.learnFromAnEnemyHero();
	   }

}
