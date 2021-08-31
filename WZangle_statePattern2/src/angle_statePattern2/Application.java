package angle_statePattern2;

import angle_statePattern2.Hero;

public class Application{
    public static void main(String args[]) {
    	  System.out.println("【英雄“瑶”释放三技能可以附身到其他英雄身上，跟随其他英雄的移动而移动】");
    	  System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
    	  Hero heroOne=new Hero("野王");
    	  Hero heroTwo=new Hero("瑶宝宝");
    	  heroOne.startUp();
          heroTwo.stop();
          System.out.println("★★★★★★★★★★★★★★★★★★★★★★★");
          heroOne.stop();  
    	  heroTwo.startUp();  
    }
}
