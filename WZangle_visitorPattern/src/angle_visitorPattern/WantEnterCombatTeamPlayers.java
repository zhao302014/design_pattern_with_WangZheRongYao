package angle_visitorPattern;

public  class WantEnterCombatTeamPlayers extends Players{
    int grade,duan;    //³É¼¨
    String name;
    WantEnterCombatTeamPlayers(String name,int grade,int duan){
          this.name=name;
          this.grade=grade;
          this.duan=duan;
    } 
    public int getGrade(){
          return grade;
    } 
    public int getDuan(){
          return duan;
    } 
    public String getName(){
          return name;
    }
    public void accept(Visitor v){
         v.visit(this);
    }
}
