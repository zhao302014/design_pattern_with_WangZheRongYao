package angle_adapter;
/*
         测试类Application   :   main函数 
 */
import angle_adapter.Enemy;
import angle_adapter.HeroYuange;
import angle_adapter.KuileiOfYuange;
import angle_adapter.TargetHero;
import angle_adapter.Yuange;

public class Application {

	public static void main(String[] args) {
		   TargetHero enemy;                         //目标接口（敌方被模仿英雄）
		   Enemy makeboluo=new Enemy();              //被模仿英雄：马可波罗
	       enemy=makeboluo;                          //原本属于被模仿英雄马可波罗的局内台词
	       System.out.println("标准的英雄及其所属台词：");
	       enemy.beenLearntFromAnEnemyHero();     //接通电流，开始洗衣服
	       System.out.println("-----------------------------------------------");
	       Yuange yuange=new Yuange();               //元歌想要模仿其他英雄及其局内台词
	       KuileiOfYuange kuilei=new KuileiOfYuange(yuange);//元歌不能直接模仿，需要借助适配器——傀儡
	       enemy=kuilei;                          //元歌的傀儡模仿敌方英雄马可波罗及其局内台词
	       System.out.println("被元歌傀儡伪装后的英雄及其所属台词：");
	       yuange.learnFromAnEnemyHero();     //元歌局内实现原本属于其他英雄的台词
	    }
	}

	class Enemy implements TargetHero{    //原本属于目标英雄“马可波罗”的局内台词
	    String name;
	    Enemy(){
	       name="马可波罗";
	    }
	    Enemy(String s){
	       name=s;
	    }
	    public void beenLearntFromAnEnemyHero(){
	       dialogue();
	    }
	    public void dialogue(){
	       System.out.println(name+"：世界不只有眼前的苟且，还有诗和远方");
	    }
	}
	
	class Yuange implements HeroYuange{    //元歌在局内可以实现原本属于其他英雄的台词
	    String name;
	    Yuange(){
	       name="【元歌】马可波罗";
	    }
	    Yuange(String s){
	       name=s;
	    }
	    public void learnFromAnEnemyHero(){
	       simulateDialogue();
	    }
		public void simulateDialogue(){
	       System.out.println(name+"：世界不只有眼前的苟且，还有诗和远方");
	    }
	}
