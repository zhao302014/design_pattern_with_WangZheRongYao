package angle_statePattern1;

import angle_statePattern1.SkillState;

public class SkillTwoNotHitTarget implements SkillState{
    int n;
    SkillTwoNotHitTarget(int n){
         if(n==20)
            this.n=n;
    }
    public void showState(){
           System.out.println("�������ܡ��շţ��޻�ѪЧ��");
    }
}
