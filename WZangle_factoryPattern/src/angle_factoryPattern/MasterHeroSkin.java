package angle_factoryPattern;

import angle_factoryPattern.Master;
import angle_factoryPattern.Hero;
import angle_factoryPattern.HeroSkin;

public class MasterHeroSkin implements HeroSkin{
    public Hero getHero(){
       String [] a={"�ƽ�ָ���","�Ǻ�ָ�ӹ�","�����ɾ�","�ƿ�֮��"};
       String [] b={"������","����ҡ��","��Ȥ����"};
       String [] c={"��ż�Զ���","ħ��С����","���麧��","��ܲ"};
       Hero hero=new Master("��ʦ��Ӣ��",a,b,c);
       return hero;
    }
}
