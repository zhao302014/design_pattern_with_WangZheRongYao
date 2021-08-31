package angle_visitorPattern;

import angle_visitorPattern.WantEnterCombatTeamPlayers;
import angle_visitorPattern.Visitor;

public class  CombatTeamLeader implements Visitor{
    public void visit(WantEnterCombatTeamPlayers player){
          int grade=player.getGrade();
          int duan=player.getDuan();
          if(grade>20&&duan>30)
              System.out.println("        同意"+player.getName()+"加入战队！"); 
          else
        	  System.out.println("        不同意"+player.getName()+"加入战队！");
    }
}
