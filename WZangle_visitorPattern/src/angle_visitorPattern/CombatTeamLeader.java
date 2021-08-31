package angle_visitorPattern;

import angle_visitorPattern.WantEnterCombatTeamPlayers;
import angle_visitorPattern.Visitor;

public class  CombatTeamLeader implements Visitor{
    public void visit(WantEnterCombatTeamPlayers player){
          int grade=player.getGrade();
          int duan=player.getDuan();
          if(grade>20&&duan>30)
              System.out.println("        ͬ��"+player.getName()+"����ս�ӣ�"); 
          else
        	  System.out.println("        ��ͬ��"+player.getName()+"����ս�ӣ�");
    }
}
