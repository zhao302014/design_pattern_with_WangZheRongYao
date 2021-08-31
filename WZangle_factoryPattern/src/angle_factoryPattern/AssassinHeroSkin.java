package angle_factoryPattern;

import angle_factoryPattern.Master;
import angle_factoryPattern.Hero;
import angle_factoryPattern.HeroSkin;

public class AssassinHeroSkin implements HeroSkin{
    public Hero getHero(){
       String [] a={"教廷特使","飞衡","街头霸王","白龙吟","逐梦之影"};
       String [] b={"范海辛","千年之狐","敏锐之力","凤求凰"};
       String [] c={"未来纪元","皇家上将","忍·炎影","嘻哈天王","白执事","引擎之心"};
       Hero hero=new Assassin("刺客类英雄",a,b,c);
       return hero;
    }
}
