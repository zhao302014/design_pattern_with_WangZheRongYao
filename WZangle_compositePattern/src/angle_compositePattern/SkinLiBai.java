package angle_compositePattern;

import angle_compositePattern.HeroLiBai;
import java.util.Iterator;
import java.util.LinkedList;

public class SkinLiBai implements HeroLiBai{
      LinkedList<HeroLiBai> list;
      double value;
      String name;
      SkinLiBai(String name,double value){
            this.name=name;
            this.value=value;
            list=new LinkedList<HeroLiBai>();
      } 
      public void add(HeroLiBai node) {}
      public void remove(HeroLiBai node){}
      public HeroLiBai getChild(int index) {
            return null; 
      }
      public Iterator<HeroLiBai>  getAllChildren() {
            return null; 
      }
      public boolean isLeaf(){
           return true;
      } 
      public double getValue(){
            return value;
      }
      public String toString(){
            return name;
      }
}
