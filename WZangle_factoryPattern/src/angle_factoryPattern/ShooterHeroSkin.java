package angle_factoryPattern;

import angle_factoryPattern.Shooter;
import angle_factoryPattern.Hero;
import angle_factoryPattern.HeroSkin;

public class ShooterHeroSkin implements HeroSkin{
    public Hero getHero(){
       String [] a={"���ձ�С��","������","������Ů��","����ȸ��"};
       String [] b={"������Ů","�����Ϣ","̫��"};
       String [] c={"������","������С��","�Թ�֮��","�ƽ�������","������"};
       Hero hero=new Shooter("������Ӣ��",a,b,c);
       return hero;
    }
}