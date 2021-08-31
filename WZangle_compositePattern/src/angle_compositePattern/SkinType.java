package angle_compositePattern;

import angle_compositePattern.HeroLiBai;

import java.util.Iterator;
import java.util.LinkedList;
public class SkinType implements HeroLiBai{
      LinkedList<HeroLiBai> list;
      double value;
      String name;
      SkinType(String name,double value){
            this.name=name;
            this.value=value;
            list=new LinkedList<HeroLiBai>();
      } 
      public void add(HeroLiBai node) {
            list.add(node);
      }
      public void remove(HeroLiBai node){
            list.remove(node);
      }
      public HeroLiBai getChild(int index) {
            return list.get(index); 
      }
      public Iterator<HeroLiBai>  getAllChildren() {
            return list.iterator(); 
      }
      public boolean isLeaf(){
           return false;
      } 
      public double getValue(){
            return value;
      }
      public String toString(){
            return name;
      }
}
