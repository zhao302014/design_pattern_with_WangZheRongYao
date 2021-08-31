package angle_factoryPattern;

import angle_factoryPattern.Warrior;
import angle_factoryPattern.Hero;
import angle_factoryPattern.HeroSkin;

public class WarriorHeroSkin implements HeroSkin{
    public Hero getHero(){
       String [] a={"������","��Ů��","ˮ��������","�ഺ������","�ھ��ɽ�","����־"};
       String [] b={"�����ִ��","��������","�Ǽ�½ս��","�������","����ͻ��"};
       String [] c={"��������","��������","ʥ������"};
       Hero hero=new Warrior("սʿ��Ӣ��",a,b,c);
       return hero;
    }
}