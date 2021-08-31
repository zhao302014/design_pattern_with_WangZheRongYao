package angle_flyweightPattern;

import angle_flyweightPattern.Flyweight;

public class Hero{
    Flyweight  flyweight;    //�����Ԫ���������
    String name,skin,inscription;
    Hero(Flyweight  flyweight,String name,String skin,String inscription){
          this.flyweight=flyweight;
          this.name=name;
          this.skin=skin;
          this.inscription=inscription;
    }
   public void print(){
         System.out.print(" Ӣ�ۣ�"+name);
         System.out.print(" Ƥ����"+skin);
         System.out.print(" ���ģ�"+inscription); 
         System.out.print("  һ���ܣ�"+flyweight.getOneSkill());
         System.out.print("  �����ܣ�"+flyweight.getTwoSkill());
         System.out.println("  �����ܣ�"+flyweight.getThreeSkill());
        
   }
} 