package angle_iteratorPattern;

import java.util.*;

public class Application {

	    public static void main(String[] args) {
	        System.out.println("");
	    	int friends=10;         //好友列表共10人
	        Collection<Online> set=new HashSet<Online>();  //集合对象
	        for(int i=1;i<=friends;i++){
	           if(i==7||i==8||i==9||i==10)
	             set.add(new Online(10,false));
	           else	
	             set.add(new Online(10,true)); 
	        }
	        Iterator<Online> iterator=set.iterator();       //迭代器
	        System.out.println("好友列表共有"+set.size()+"人");
	        int k=0; 
	        while(iterator.hasNext()){
	        	Online money=iterator.next();
	            k++; 
	            if(money.getIsTrue()==false){
	               iterator.remove();
	               k++;
	            }
	        }
	        System.out.println("好友列表在线"+set.size()+"人");  
	        System.out.println("------------------------------------------");  
	        
	        UseSet useSet=new UseSet(); 
	        useSet.addPlayers(new Players("爱喝爽歪歪    ","铂金Ⅳ           ",2));
	        useSet.addPlayers(new Players("韩信了你的邪","钻石Ⅲ            ",13));
	        useSet.addPlayers(new Players("沙滩、绅士   ","星耀Ⅰ              ",31));
	        useSet.addPlayers(new Players("崽种来打我呀","最强王者x23 ",16));
	        useSet.addPlayers(new Players("我想上分分   ","钻石Ⅴ             ",27));
	        useSet.addPlayers(new Players("峡谷一级演员","黄金Ⅱ             ",9));
	        System.out.println("在线好友按开局时长排列:");
	        useSet.printPlayersByMinutes();
	        System.out.println("------------------------------------------");  
	        
	        String n="峡谷一级演员";
	        System.out.println("查找名字为“"+n+"”的玩家:");
	        useSet.lookPlayers(n);
	        System.out.println("------------------------------------------");  
	        String s="油炸小可爱";
	        System.out.println("查找名字为“"+s+"”的玩家:");
	        useSet.lookPlayers(s);
	    }
	 
}
class Online{            //玩家在线状态
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
