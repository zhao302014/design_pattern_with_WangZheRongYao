package angle_statePattern1;

import angle_statePattern1.SkillState;
import angle_statePattern1.SkillOneHitTarget;
import angle_statePattern1.SkillTwoHitTarget;
import angle_statePattern1.SkillTwoNotHitTarget;
import angle_statePattern1.SkillOneNotHitTarget;
import angle_statePattern1.HeroJing;

public class Application{
    public static void main(String args[]) {
    	  System.out.println("");
    	  System.out.println("S19赛季新英雄【镜】部分技能释放效果：");
    	  System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
    	  SkillState state=new SkillOneHitTarget(11);
    	  HeroJing  hero=new HeroJing();
    	  hero.setState(state);
    	  hero.showMessage();
    	  state=new SkillOneNotHitTarget(10);
    	  hero=new HeroJing();
    	  hero.setState(state);
    	  hero.showMessage();
          state=new SkillTwoHitTarget(21);
          hero.setState(state);
          hero.showMessage();
          state=new SkillTwoNotHitTarget(20);
          hero.setState(state);
          hero.showMessage();
    }
}
