package angle_adapterPattern;

import java.util.Enumeration;
import java.util.Iterator;

public class IteratorAdapter implements Iterator{
    Enumeration heroData;
    IteratorAdapter(Enumeration heroData){
        this.heroData=heroData;
    }
    public boolean hasNext(){
        return heroData.hasMoreElements();
    }
    public Object next(){
        return heroData.nextElement();
    }
    public void remove(){
        System.out.println("枚举器没有删除集合元素的方法");
    }
}

