package angle_statePattern1;

import angle_statePattern1.SkillState;

public class SkillTwoHitTarget implements SkillState{
    int n;
    SkillTwoHitTarget(int n){
         if(n==21)
            this.n=n;
    }
    public void showState(){
           System.out.println("�������ܡ���������Ŀ�꣬�л�ѪЧ��");
    }
}