package angle_statePattern2;

import angle_statePattern2.State;
import angle_statePattern2.Hero;

public  class  HeroRestState extends State{
    public  void startUp(Hero hero){
    	  System.out.println("☆蓝BUFF刷新了！");
          System.out.println("  "+hero.getName()+"在蓝BUFF处打蓝");
          hero.setState(hero.getMoveState()); 
    }   
     public  void stop(Hero hero){
    	 System.out.println("☆龙坑处爆发团战!");
          System.out.println("  "+hero.getName()+"赶向龙坑处支援");
          hero.setState(hero.getMoveState());
    }  
} 
