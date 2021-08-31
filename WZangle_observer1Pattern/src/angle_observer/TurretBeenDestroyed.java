package angle_observer;

/*
角色3：具体主题：是实现主题接口类的一个实例（包含可能经常发生变化的数据）
              具体主题需要使用一个集合如ArrayList，存放观察者的引用，以便数据变化时通知具体观察者。 
*/

import java.util.ArrayList;

public class TurretBeenDestroyed implements Subject{
     String mess;               //用来表示队友接收到的消息内容
     boolean changed;
     ArrayList<Observer>informationList;   //存放观察者引用的数组线性表
     TurretBeenDestroyed(){
	        informationList=new ArrayList<Observer>();
	        mess="";
	        changed=false;
       }
     public void addObserver(Observer o){
	      if(!(informationList.contains(o)))
	    	    informationList.add(o);        //把观察者的引用添加到数组线性表
             }
     public void deleteObserver(Observer o){
	      if(informationList.contains(o))
	    	    informationList.remove(o);       
             }
     public void notifyObservers(){
	      if(changed){                  //通知所有的观察者
		        for(int i=0;i<informationList.size();i++){  //遍历具体主题中用来存放观察者引用的集合
			          Observer observer=informationList.get(i);
			          observer.hearMessage(mess);    //让观察者接收系统消息（执行观察者接口规定更新数据的方法）
		           }
		        changed=false;
	        }
         }
     public void giveNewMess(String str){
	       if(str.equals(mess))
		         changed=false;
	       else{
		         mess=str;
		         changed=true;
	           }
           }

   }