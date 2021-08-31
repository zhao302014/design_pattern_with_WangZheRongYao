package angle_adapterPattern;

import java.util.Enumeration;
import java.util.Vector;

public class AndroidOS {
	   private Vector<String> vector;
	    private Enumeration roleData;
	    AndroidOS(){
	        vector=new Vector<String>(); 
	    }
	    public void setRoleData(){        
	       vector.add("       【金币】 1314");
	       vector.add("       【钻石】 520");
	       vector.add("       【点券】 521");
	       vector.add("       【英雄】 98");
	       vector.add("       【皮肤】 296");
	       vector.add("       【段位】 荣耀王者101星");
	       vector.add("        ……");
	    }
	    public Enumeration getEnumeration(){
	       return vector.elements();
	    }

}
