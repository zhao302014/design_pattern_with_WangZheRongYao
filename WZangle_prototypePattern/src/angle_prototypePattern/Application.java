package angle_prototypePattern;

import angle_prototypePattern.Teammates;
import angle_prototypePattern.Enemies;

public class Application{
    public static void main(String args[]){
    	
    	System.out.println("【克隆模式】匹配成功！请您选择英雄");
    	System.out.println("");
    	System.out.println("☆我方最终选定英雄“百里玄策”出战！");
    	System.out.println("☆敌方最终选定英雄“夏侯惇”出战！");
    	System.out.println("----------------------------------------------------");
    	
    	Teammates  teammates=new Teammates();
    	teammates.setSkill(new StringBuffer("治疗"));
    	teammates.setSkin(new StringBuffer("嚣狂之镰"));
    	System.out.println("☆我方");
        System.out.println("英雄“百里玄策”默认召唤师技能【"+teammates.getSkill()+"】、皮肤【"+teammates.getSkin()+"】");
          try{
        	     Teammates  teammatesCopy1=(Teammates)teammates.cloneMe();
        	     Teammates  teammatesCopy2=(Teammates)teammates.cloneMe();
        	     Teammates  teammatesCopy3=(Teammates)teammates.cloneMe();
        	     Teammates  teammatesCopy4=(Teammates)teammates.cloneMe();
        	     Teammates  teammatesCopy5=(Teammates)teammates.cloneMe();
                 teammatesCopy1.setSkill(new StringBuffer("闪现"));
                 teammatesCopy2.setSkill(new StringBuffer("惩击"));
                 teammatesCopy3.setSkill(new StringBuffer("狂暴"));
                 teammatesCopy4.setSkin(new StringBuffer("威尼斯狂欢"));
                 teammatesCopy5.setSkin(new StringBuffer("白虎志"));
                 System.out.println("     玩家一保留默认召唤师技能【"+teammates.getSkill()+"】、皮肤【"+teammates.getSkin()+"】");
                 System.out.println("     玩家二将召唤师技能改为【"+teammatesCopy1.getSkill()+"】、皮肤【"+teammatesCopy4.getSkin()+"】");
                 System.out.println("     玩家三将召唤师技能改为【"+teammatesCopy2.getSkill()+"】、皮肤【"+teammatesCopy5.getSkin()+"】"); 
                 System.out.println("     玩家四将召唤师技能改为【"+teammatesCopy3.getSkill()+"】、皮肤保留默认【"+teammates.getSkin()+"】"); 
                 System.out.println("     玩家五将召唤师技能改为【"+teammatesCopy3.getSkill()+"】、皮肤【"+teammatesCopy4.getSkin()+"】"); 
          }
          catch(CloneNotSupportedException exp){} 
        System.out.println("---------------------------------------------------"); 
        Enemies  enemies=new Enemies();
        enemies.setSkill(new StringBuffer("治疗"));
        enemies.setSkin(new StringBuffer("不羁之风"));
        System.out.println("☆敌方");
          System.out.println("英雄“夏侯惇”默认召唤师技能【"+enemies.getSkill()+"】、皮肤【"+enemies.getSkin()+"】");
            try{
          	       Enemies  enemiesCopy1=(Enemies)enemies.cloneMe();
          	       Enemies  enemiesCopy2=(Enemies)enemies.cloneMe();
          	       Enemies  enemiesCopy3=(Enemies)enemies.cloneMe();
          	       Enemies  enemiesCopy4=(Enemies)enemies.cloneMe();
          	       Enemies  enemiesCopy5=(Enemies)enemies.cloneMe();
          	       Enemies  enemiesCopy6=(Enemies)enemies.cloneMe();
          	       Enemies  enemiesCopy7=(Enemies)enemies.cloneMe();
          	       Enemies  enemiesCopy8=(Enemies)enemies.cloneMe();
        	       enemiesCopy1.setSkill(new StringBuffer("闪现"));
        	       enemiesCopy2.setSkill(new StringBuffer("惩击"));
        	       enemiesCopy3.setSkill(new StringBuffer("终结"));
        	       enemiesCopy4.setSkill(new StringBuffer("眩晕"));
        	       enemiesCopy5.setSkin(new StringBuffer("朔风刀"));
        	       enemiesCopy6.setSkin(new StringBuffer("乘风破浪"));
        	       enemiesCopy7.setSkin(new StringBuffer("战争骑士"));
        	       enemiesCopy8.setSkin(new StringBuffer("无限飓风号"));
                   System.out.println("     玩家一保留默认召唤师技能【"+enemies.getSkill()+"】、皮肤【"+enemies.getSkin()+"】");
                   System.out.println("     玩家二将召唤师技能改为【"+enemiesCopy1.getSkill()+"】、皮肤【"+enemiesCopy6.getSkin()+"】");
                   System.out.println("     玩家三将召唤师技能改为【"+enemiesCopy3.getSkill()+"】、皮肤【"+enemiesCopy7.getSkin()+"】"); 
                   System.out.println("     玩家四将召唤师技能改为【"+enemiesCopy4.getSkill()+"】、皮肤【"+enemiesCopy5.getSkin()+"】"); 
                   System.out.println("     玩家五将召唤师技能改为【"+enemiesCopy2.getSkill()+"】、皮肤【"+enemiesCopy8.getSkin()+"】"); 
            }
            catch(CloneNotSupportedException exp){} 
    }
}
