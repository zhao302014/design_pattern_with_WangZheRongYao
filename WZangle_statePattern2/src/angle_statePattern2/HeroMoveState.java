package angle_statePattern2;

import angle_statePattern2.State;
import angle_statePattern2.Hero;

public  class  HeroMoveState extends State{
    public  void startUp(Hero hero){
          System.out.println("  "+hero.getName()+"Ҳ����Ұ���������Ӵ�֧Ԯ");
          hero.setState(hero.getRestState()); 
    }   
     public  void stop(Hero hero){
          System.out.println("  "+hero.getName()+"Ҳ����BUFF������Ұ������");
          hero.setState(hero.getRestState()); 
    }  
} 
