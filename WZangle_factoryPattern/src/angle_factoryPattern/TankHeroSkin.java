package angle_factoryPattern;

import angle_factoryPattern.Tank;
import angle_factoryPattern.Hero;
import angle_factoryPattern.HeroSkin;

public class TankHeroSkin implements HeroSkin{
    public Hero getHero(){
       String [] a={"帝国元帅","海滩派对","苍穹之光","职棒王牌","霸王别姬","科学大爆炸"};
       String [] b={"白色死神","无畏之灵·狰","昼夜王子"};
       String [] c={"美梦成真","胖达荣荣"};
       Hero hero=new Tank("坦克类英雄",a,b,c);
       return hero;
    }
}