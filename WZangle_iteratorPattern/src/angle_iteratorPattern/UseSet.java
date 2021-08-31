package angle_iteratorPattern;

import java.util.*; 

public class UseSet{
    LinkedList<Players> list;      //使用链表存放玩家对象
    //用一个散列表和一个树集存放链表中的对象
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
    
    public void lookPlayers(String names){                 //使用散列表查询某个玩家状态信息
    	Players players=table.get(names);
    	if(players==null){
    		System.out.println("此人离线，您可通过QQ【邀请】他上线");
    	}
    	else{
            int minute=players.getMinute();
            System.out.println("开局"+minute+"分钟，可【预约】");
        }
    }

    public void printPlayersByMinutes(){              //通过树集将玩家按开局时长排序
          Iterator<Players> iterator=tree.iterator();
          while(iterator.hasNext()){
        	    Players player=iterator.next();
                String name=player.getName();
                String level=player.getLevel();
                int minute=player.getMinute();
                System.out.println("名字:"+name+"   段位:"+level+" 开局"+minute+"分钟");
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

