package angle_statePattern2;

import angle_statePattern2.State;
import angle_statePattern2.Hero;

public  class  HeroRestState extends State{
    public  void startUp(Hero hero){
    	  System.out.println("����BUFFˢ���ˣ�");
          System.out.println("  "+hero.getName()+"����BUFF������");
          hero.setState(hero.getMoveState()); 
    }   
     public  void stop(Hero hero){
    	 System.out.println("�����Ӵ�������ս!");
          System.out.println("  "+hero.getName()+"�������Ӵ�֧Ԯ");
          hero.setState(hero.getMoveState());
    }  
} 
