package angle_statePattern1;

import angle_statePattern1.SkillState;

public class SkillTwoHitTarget implements SkillState{
    int n;
    SkillTwoHitTarget(int n){
         if(n==21)
            this.n=n;
    }
    public void showState(){
           System.out.println("【二技能】触碰到了目标，有回血效果");
    }
}