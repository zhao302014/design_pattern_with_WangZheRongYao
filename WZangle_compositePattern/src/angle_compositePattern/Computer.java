package angle_compositePattern;

import angle_compositePattern.HeroLiBai;
import java.util.Iterator;

public class Computer{
     public static double computerValue(HeroLiBai node){
           double valueSum=0;
           if(node.isLeaf()==true){
                valueSum=valueSum+node.getValue();
           }
           if(node.isLeaf()==false){
        	   valueSum=valueSum+node.getValue();
                Iterator<HeroLiBai> iterator=node.getAllChildren();
                while(iterator.hasNext()){
                	         HeroLiBai p= iterator.next();
                	         valueSum=valueSum+computerValue(p);;
                }
           }
           return valueSum;
    }
    public static double computerValue(HeroLiBai node,double unit){
           double skinWorth=0;
           if(node.isLeaf()==true){
        	   skinWorth=skinWorth+node.getValue()*unit;
           }
           if(node.isLeaf()==false){
                Iterator<HeroLiBai> iterator=node.getAllChildren();
                while(iterator.hasNext()){
                           	 HeroLiBai p= iterator.next();
                           	 skinWorth=skinWorth+computerValue(p,unit);
                }
           }
           return skinWorth;
    }
    public static String getAllChildrenName(HeroLiBai node){
            StringBuffer mess= new StringBuffer(); 
            if(node.isLeaf()==true){
               mess.append(" "+node.toString());
            }
            if(node.isLeaf()==false){
                  mess.append(" "+node.toString());
                 Iterator<HeroLiBai> iterator=node.getAllChildren();
                  while(iterator.hasNext()){
                	   HeroLiBai p= iterator.next();
                       mess.append(getAllChildrenName(p));
                 }
           }
           return new String(mess);
    }
}
