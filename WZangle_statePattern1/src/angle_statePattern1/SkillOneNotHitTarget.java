package angle_statePattern1;

import angle_statePattern1.SkillState;

public class SkillOneNotHitTarget implements SkillState{
    int n;
    SkillOneNotHitTarget(int n){
         if(n==10)
            this.n=n;
    }
    public void showState(){
           System.out.println("【一技能】空放，只有一段位移");
    }
}
