package angle_visitorPattern;

import angle_visitorPattern.Players;
import angle_visitorPattern.CombatTeamLeader;
import angle_visitorPattern.WantEnterCombatTeamPlayers;
import angle_visitorPattern.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
public class Application{
     public static void main(String args[]) {
           Visitor visitor=new CombatTeamLeader();
           ArrayList<Players>  playerList=new  ArrayList<Players>();
           Players player=null;
           System.out.println("  ");
           System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
           System.out.println("【战队招人公告】等级大于20级且段位在王者10星之上的玩家经队长同意后即可加入！");
           System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
           System.out.println("  ");
           System.out.println("☆申请入队玩家信息：");
           System.out.println("        玩家名字[AG超玩会靓荣] 等级[30] 段位[最强王者36星]");
           playerList.add(player=new WantEnterCombatTeamPlayers("[AG超玩会靓荣]",30,36));
           System.out.println("        玩家名字[瑶宝宝上我]   等级[25] 段位[最强王者3星]");
           playerList.add(player=new WantEnterCombatTeamPlayers("[瑶宝宝上我]",25,3));
           System.out.println("          ……");
           System.out.println("  ");
           System.out.println("☆成功加入战队玩家：");
           Iterator<Players> iter=playerList.iterator();
           while(iter.hasNext()){
        	   Players players=iter.next();
        	   players.accept(visitor);  
           }
           System.out.println("          ……");
     }
} 

