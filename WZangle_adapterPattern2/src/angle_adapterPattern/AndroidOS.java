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
	       vector.add("       ����ҡ� 1314");
	       vector.add("       ����ʯ�� 520");
	       vector.add("       ����ȯ�� 521");
	       vector.add("       ��Ӣ�ۡ� 98");
	       vector.add("       ��Ƥ���� 296");
	       vector.add("       ����λ�� ��ҫ����101��");
	       vector.add("        ����");
	    }
	    public Enumeration getEnumeration(){
	       return vector.elements();
	    }

}
