package angle_adapter;

/*
            角色3：适配器：是一个类，该类实现了目标接口并包含有被适配者的引用（适配器的职责是对被适配者接口（抽象类）与目标接口进行适配） 
*/

import angle_adapter.HeroYuange;

public class KuileiOfYuange implements TargetHero{
	
	HeroYuange yuangeKuilei;
	KuileiOfYuange(HeroYuange yuangeKuilei){      //元歌傀儡作为适配器
	       this.yuangeKuilei=yuangeKuilei;
	   }
	public void beenLearntFromAnEnemyHero(){
		   yuangeKuilei.learnFromAnEnemyHero();
	   }

}
