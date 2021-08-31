package angle_factoryPattern;

import angle_factoryPattern.Support;
import angle_factoryPattern.Hero;
import angle_factoryPattern.HeroSkin;

public class SupportHeroSkin implements HeroSkin{
    public Hero getHero(){
       String [] a={"����֮��","��¥��","�ƶ�����ʦ","�����ѧ","����"};
       String [] b={"Ӣ��Ұ��","��ʿ��è","����Ž�"};
       String [] c={"δ������","��ʹ֮��","������","��������"};
       Hero hero=new Support("������Ӣ��",a,b,c);
       return hero;
    }
}