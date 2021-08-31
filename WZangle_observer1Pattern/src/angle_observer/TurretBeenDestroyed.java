package angle_observer;

/*
��ɫ3���������⣺��ʵ������ӿ����һ��ʵ�����������ܾ��������仯�����ݣ�
              ����������Ҫʹ��һ��������ArrayList����Ź۲��ߵ����ã��Ա����ݱ仯ʱ֪ͨ����۲��ߡ� 
*/

import java.util.ArrayList;

public class TurretBeenDestroyed implements Subject{
     String mess;               //������ʾ���ѽ��յ�����Ϣ����
     boolean changed;
     ArrayList<Observer>informationList;   //��Ź۲������õ��������Ա�
     TurretBeenDestroyed(){
	        informationList=new ArrayList<Observer>();
	        mess="";
	        changed=false;
       }
     public void addObserver(Observer o){
	      if(!(informationList.contains(o)))
	    	    informationList.add(o);        //�ѹ۲��ߵ�������ӵ��������Ա�
             }
     public void deleteObserver(Observer o){
	      if(informationList.contains(o))
	    	    informationList.remove(o);       
             }
     public void notifyObservers(){
	      if(changed){                  //֪ͨ���еĹ۲���
		        for(int i=0;i<informationList.size();i++){  //��������������������Ź۲������õļ���
			          Observer observer=informationList.get(i);
			          observer.hearMessage(mess);    //�ù۲��߽���ϵͳ��Ϣ��ִ�й۲��߽ӿڹ涨�������ݵķ�����
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