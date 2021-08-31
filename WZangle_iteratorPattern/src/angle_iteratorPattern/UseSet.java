package angle_iteratorPattern;

import java.util.*; 

public class UseSet{
    LinkedList<Players> list;      //ʹ����������Ҷ���
    //��һ��ɢ�б��һ��������������еĶ���
    Hashtable<String,Players> table;    
    TreeSet<Players> tree;          
    UseSet(){
       list=new LinkedList<Players>();
       table=new Hashtable<String,Players>();
       tree=new TreeSet<Players>(); 
    }
    public void addPlayers(Players player){
       list.add(player);
       update();
    }
    
    public void lookPlayers(String names){                 //ʹ��ɢ�б��ѯĳ�����״̬��Ϣ
    	Players players=table.get(names);
    	if(players==null){
    		System.out.println("�������ߣ�����ͨ��QQ�����롿������");
    	}
    	else{
            int minute=players.getMinute();
            System.out.println("����"+minute+"���ӣ��ɡ�ԤԼ��");
        }
    }

    public void printPlayersByMinutes(){              //ͨ����������Ұ�����ʱ������
          Iterator<Players> iterator=tree.iterator();
          while(iterator.hasNext()){
        	    Players player=iterator.next();
                String name=player.getName();
                String level=player.getLevel();
                int minute=player.getMinute();
                System.out.println("����:"+name+"   ��λ:"+level+" ����"+minute+"����");
       }
    }
    private void  update(){
       tree.clear(); 
       Iterator<Players> iterator=list.iterator();
       while(iterator.hasNext()){
    	   Players player=iterator.next();
           String name=player.getName();
           table.put(name,player);
           tree.add(player); 
       }
    }
}

