package angle_factoryPattern;

import angle_factoryPattern.Warrior;
import angle_factoryPattern.Hero;
import angle_factoryPattern.HeroSkin;

public class WarriorHeroSkin implements HeroSkin{
    public Hero getHero(){
       String [] a={"剑舞者","兔女郎","水晶猎龙者","青春决赛季","冠军飞将","麒麟志"};
       String [] b={"华尔街大亨","爱与正义","星际陆战队","功夫厨神","活力突击"};
       String [] c={"功夫老勺","潮流仙人","圣诞老人"};
       Hero hero=new Warrior("战士类英雄",a,b,c);
       return hero;
    }
}