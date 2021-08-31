package angle_compositePattern;

import angle_compositePattern.HeroLiBai;
import java.util.Iterator;

public interface HeroLiBai{
      public void add(HeroLiBai node) ;
      public void remove(HeroLiBai node) ;
      public HeroLiBai getChild(int index); 
      public Iterator<HeroLiBai>  getAllChildren() ;
      public boolean isLeaf();
      public double getValue();
}
