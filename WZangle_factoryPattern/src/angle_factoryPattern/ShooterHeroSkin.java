package angle_factoryPattern;

import angle_factoryPattern.Shooter;
import angle_factoryPattern.Hero;
import angle_factoryPattern.HeroSkin;

public class ShooterHeroSkin implements HeroSkin{
    public Hero getHero(){
       String [] a={"加勒比小姐","霸王别姬","凯尔特女王","云霓雀翎"};
       String [] b={"花见巫女","箭雨风息","太华"};
       String [] c={"精灵王","阿尔法小队","辉光之辰","黄金射手座","如梦令"};
       Hero hero=new Shooter("射手类英雄",a,b,c);
       return hero;
    }
}