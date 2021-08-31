package angle_factoryPattern;

import angle_factoryPattern.Tank;
import angle_factoryPattern.Hero;
import angle_factoryPattern.HeroSkin;

public class TankHeroSkin implements HeroSkin{
    public Hero getHero(){
       String [] a={"�۹�Ԫ˧","��̲�ɶ�","���֮��","ְ������","������","��ѧ��ը"};
       String [] b={"��ɫ����","��η֮�顤��","��ҹ����"};
       String [] c={"���γ���","�ִ�����"};
       Hero hero=new Tank("̹����Ӣ��",a,b,c);
       return hero;
    }
}