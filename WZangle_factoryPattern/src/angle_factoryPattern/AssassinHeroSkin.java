package angle_factoryPattern;

import angle_factoryPattern.Master;
import angle_factoryPattern.Hero;
import angle_factoryPattern.HeroSkin;

public class AssassinHeroSkin implements HeroSkin{
    public Hero getHero(){
       String [] a={"��͢��ʹ","�ɺ�","��ͷ����","������","����֮Ӱ"};
       String [] b={"������","ǧ��֮��","����֮��","�����"};
       String [] c={"δ����Ԫ","�ʼ��Ͻ�","�̡���Ӱ","��������","��ִ��","����֮��"};
       Hero hero=new Assassin("�̿���Ӣ��",a,b,c);
       return hero;
    }
}
