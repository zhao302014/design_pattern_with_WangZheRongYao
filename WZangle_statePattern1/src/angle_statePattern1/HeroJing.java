package angle_statePattern1;

import angle_statePattern1.SkillState;

public  class  HeroJing{
     SkillState  state;
     public  void  showMessage(){
          System.out.println("");
          state.showState();  
          System.out.println("�����������������������������");
    }
    public void setState(SkillState  state){
          this.state=state;
    }
}
