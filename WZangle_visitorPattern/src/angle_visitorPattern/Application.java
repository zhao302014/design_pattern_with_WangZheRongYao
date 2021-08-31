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
           System.out.println("�������������������������������������������������������");
           System.out.println("��ս�����˹��桿�ȼ�����20���Ҷ�λ������10��֮�ϵ���Ҿ��ӳ�ͬ��󼴿ɼ��룡");
           System.out.println("�������������������������������������������������������");
           System.out.println("  ");
           System.out.println("��������������Ϣ��");
           System.out.println("        �������[AG���������] �ȼ�[30] ��λ[��ǿ����36��]");
           playerList.add(player=new WantEnterCombatTeamPlayers("[AG���������]",30,36));
           System.out.println("        �������[����������]   �ȼ�[25] ��λ[��ǿ����3��]");
           playerList.add(player=new WantEnterCombatTeamPlayers("[����������]",25,3));
           System.out.println("          ����");
           System.out.println("  ");
           System.out.println("��ɹ�����ս����ң�");
           Iterator<Players> iter=playerList.iterator();
           while(iter.hasNext()){
        	   Players players=iter.next();
        	   players.accept(visitor);  
           }
           System.out.println("          ����");
     }
} 

