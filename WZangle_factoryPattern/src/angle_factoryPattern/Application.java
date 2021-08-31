package angle_factoryPattern;

import angle_factoryPattern.Hero;
import angle_factoryPattern.HeroSkin;
import angle_factoryPattern.Master;
import angle_factoryPattern.MasterHeroSkin;
import angle_factoryPattern.Shooter;
import angle_factoryPattern.ShooterHeroSkin;
import angle_factoryPattern.Support;
import angle_factoryPattern.SupportHeroSkin;
import angle_factoryPattern.Tank;
import angle_factoryPattern.TankHeroSkin;
import angle_factoryPattern.Warrior;
import angle_factoryPattern.WarriorHeroSkin;

public class Application{
    public static void main(String args[]){
    	HeroSkin skin=new MasterHeroSkin();
        Hero hero=skin.getHero();
        System.out.println(hero.getName()+"及其皮肤举例:");
        System.out.println(hero.getConstitute());
        System.out.println("");
        skin=new ShooterHeroSkin();
        hero=skin.getHero();
        System.out.println(hero.getName()+"及其皮肤举例:");
        System.out.println(hero.getConstitute());
        System.out.println("");
        skin=new SupportHeroSkin();
        hero=skin.getHero();
        System.out.println(hero.getName()+"及其皮肤举例:");
        System.out.println(hero.getConstitute());
        System.out.println("");
        skin=new TankHeroSkin();
        hero=skin.getHero();
        System.out.println(hero.getName()+"及其皮肤举例:");
        System.out.println(hero.getConstitute());
        System.out.println("");
        skin=new WarriorHeroSkin();
        hero=skin.getHero();
        System.out.println(hero.getName()+"及其皮肤举例:");
        System.out.println(hero.getConstitute());
        System.out.println("");
        skin=new AssassinHeroSkin();
        hero=skin.getHero();
        System.out.println(hero.getName()+"及其皮肤举例:");
        System.out.println(hero.getConstitute());
    }
}