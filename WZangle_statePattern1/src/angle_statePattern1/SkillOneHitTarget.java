package angle_statePattern1;

import angle_statePattern1.SkillState;

public class SkillOneHitTarget implements SkillState{
    int n;
    SkillOneHitTarget(int n){
         if(n==11)
            this.n=n;
    }
    public void showState(){
           System.out.println("��һ���ܡ���������Ŀ�꣬��������λ��");
    }
}