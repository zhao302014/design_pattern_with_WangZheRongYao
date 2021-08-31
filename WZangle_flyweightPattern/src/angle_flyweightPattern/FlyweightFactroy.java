package angle_flyweightPattern;

import java.util.HashMap;

public class FlyweightFactroy{
       private   HashMap<String,Flyweight>  hashMap;
       static  FlyweightFactroy factroy=new FlyweightFactroy();
       private FlyweightFactroy(){
             hashMap=new HashMap<String,Flyweight>();
       }
       public static FlyweightFactroy getFactroy(){
             return factroy;
       }
       public synchronized Flyweight getFlyweight(String key){
            if(hashMap.containsKey(key))
                       return hashMap.get(key);
            else{ 
            	      String oneSkill,twoSkill,threeSkill;
                      String[] str=key.split("#");
                      oneSkill=str[0];
                      twoSkill=str[1];
                      threeSkill=str[2];
                      Flyweight ft=new ConcreteFlyweight(oneSkill,twoSkill,threeSkill);
                      hashMap.put(key,ft);
                      return ft;
            } 
       }
       class ConcreteFlyweight implements Flyweight{
             private String oneSkill;
             private String twoSkill;
             private String threeSkill; 
             private ConcreteFlyweight(String oneSkill,String twoSkill,String threeSkill){
                   this.oneSkill=oneSkill;
                   this.twoSkill=twoSkill;
                   this.threeSkill=threeSkill;
            }
            public String getOneSkill(){
                   return oneSkill;
            }
            public String getTwoSkill(){
                   return twoSkill;
            }
            public String getThreeSkill(){
                   return threeSkill;
           }
           public void printMess(String mess){
                 System.out.print(mess);        //����ⲿ����mess
                 System.out.print("  һ���ܣ�"+oneSkill);  //����ڲ�����width
                 System.out.print("  �����ܣ�"+twoSkill);
                 System.out.println("  �����ܣ�"+threeSkill);
           }
      }
}

