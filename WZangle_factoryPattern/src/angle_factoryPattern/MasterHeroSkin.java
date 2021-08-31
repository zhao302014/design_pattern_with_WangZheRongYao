package angle_factoryPattern;

import angle_factoryPattern.Master;
import angle_factoryPattern.Hero;
import angle_factoryPattern.HeroSkin;

public class MasterHeroSkin implements HeroSkin{
    public Hero getHero(){
       String [] a={"黄金分割率","星航指挥官","武陵仙君","掌控之力"};
       String [] b={"金属狂潮","死亡摇滚","玩趣恶龙"};
       String [] c={"玩偶对对碰","魔法小厨娘","心灵骇客","如懿"};
       Hero hero=new Master("法师类英雄",a,b,c);
       return hero;
    }
}
