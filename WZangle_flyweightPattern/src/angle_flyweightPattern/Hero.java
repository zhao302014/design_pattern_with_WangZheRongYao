package angle_flyweightPattern;

import angle_flyweightPattern.Flyweight;

public class Hero{
    Flyweight  flyweight;    //存放享元对象的引用
    String name,skin,inscription;
    Hero(Flyweight  flyweight,String name,String skin,String inscription){
          this.flyweight=flyweight;
          this.name=name;
          this.skin=skin;
          this.inscription=inscription;
    }
   public void print(){
         System.out.print(" 英雄："+name);
         System.out.print(" 皮肤："+skin);
         System.out.print(" 铭文："+inscription); 
         System.out.print("  一技能："+flyweight.getOneSkill());
         System.out.print("  二技能："+flyweight.getTwoSkill());
         System.out.println("  三技能："+flyweight.getThreeSkill());
        
   }
} 