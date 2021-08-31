package angle_factoryPattern;

import angle_factoryPattern.Support;
import angle_factoryPattern.Hero;
import angle_factoryPattern.HeroSkin;

public class SupportHeroSkin implements HeroSkin{
    public Hero getHero(){
       String [] a={"鲤鱼之梦","蜃楼王","云端筑梦师","奇妙博物学","玄嵩"};
       String [] b={"英喵野望","绅士熊猫","天才门将"};
       String [] c={"未来旅行","天使之翼","妖精王","归墟梦演"};
       Hero hero=new Support("辅助类英雄",a,b,c);
       return hero;
    }
}