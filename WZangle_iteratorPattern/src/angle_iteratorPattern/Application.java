package angle_iteratorPattern;

import java.util.*;

public class Application {

	    public static void main(String[] args) {
	        System.out.println("");
	    	int friends=10;         //�����б�10��
	        Collection<Online> set=new HashSet<Online>();  //���϶���
	        for(int i=1;i<=friends;i++){
	           if(i==7||i==8||i==9||i==10)
	             set.add(new Online(10,false));
	           else	
	             set.add(new Online(10,true)); 
	        }
	        Iterator<Online> iterator=set.iterator();       //������
	        System.out.println("�����б���"+set.size()+"��");
	        int k=0; 
	        while(iterator.hasNext()){
	        	Online money=iterator.next();
	            k++; 
	            if(money.getIsTrue()==false){
	               iterator.remove();
	               k++;
	            }
	        }
	        System.out.println("�����б�����"+set.size()+"��");  
	        System.out.println("------------------------------------------");  
	        
	        UseSet useSet=new UseSet(); 
	        useSet.addPlayers(new Players("����ˬ����    ","�����           ",2));
	        useSet.addPlayers(new Players("���������а","��ʯ��            ",13));
	        useSet.addPlayers(new Players("ɳ̲����ʿ   ","��ҫ��              ",31));
	        useSet.addPlayers(new Players("����������ѽ","��ǿ����x23 ",16));
	        useSet.addPlayers(new Players("�����Ϸַ�   ","��ʯ��             ",27));
	        useSet.addPlayers(new Players("Ͽ��һ����Ա","�ƽ��             ",9));
	        System.out.println("���ߺ��Ѱ�����ʱ������:");
	        useSet.printPlayersByMinutes();
	        System.out.println("------------------------------------------");  
	        
	        String n="Ͽ��һ����Ա";
	        System.out.println("��������Ϊ��"+n+"�������:");
	        useSet.lookPlayers(n);
	        System.out.println("------------------------------------------");  
	        String s="��ըС�ɰ�";
	        System.out.println("��������Ϊ��"+s+"�������:");
	        useSet.lookPlayers(s);
	    }
	 
}
class Online{            //�������״̬
	   int value;
	   private boolean isTrue;
	   Online(int value,boolean b){
	      this.value=value;
	       isTrue=b;
	   } 
	   public boolean getIsTrue(){
	      return isTrue;
	   }
	   public int getValue(){
	      return value;
	   }
	}
