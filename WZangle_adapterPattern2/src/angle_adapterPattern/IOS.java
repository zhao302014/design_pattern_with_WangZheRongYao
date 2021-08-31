package angle_adapterPattern;

import java.util.Iterator;
import java.util.LinkedList;

public class IOS {
    LinkedList<String> roleData;
    Iterator iterator;
    IOS(Iterator iterator){
    	roleData=new LinkedList<String>();
        this.iterator=iterator; 
    }
    public void setRoleData(){   
       while(iterator.hasNext()){
          String data=(String)iterator.next();
          roleData.add(data);
       }
    }
    public void getRoleData(){
        Iterator<String> iter=roleData.iterator();
        while(iter.hasNext()){
          String data=iter.next();
          System.out.println(data);
       }
       
    }

}
