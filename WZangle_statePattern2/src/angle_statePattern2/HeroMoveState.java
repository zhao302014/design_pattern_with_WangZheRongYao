package angle_statePattern2;

import angle_statePattern2.State;
import angle_statePattern2.Hero;

public  class  HeroMoveState extends State{
    public  void startUp(Hero hero){
          System.out.println("  "+hero.getName()+"也跟随野王赶向龙坑处支援");
          hero.setState(hero.getRestState()); 
    }   
     public  void stop(Hero hero){
          System.out.println("  "+hero.getName()+"也在蓝BUFF处辅助野王打蓝");
          hero.setState(hero.getRestState()); 
    }  
} 
