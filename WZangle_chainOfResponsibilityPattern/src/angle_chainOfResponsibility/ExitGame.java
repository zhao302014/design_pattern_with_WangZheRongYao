package angle_chainOfResponsibility;

/*
          7.退出游戏
 */

public class ExitGame {
	    String points;
	    public ExitGame(String points){
		       this.points=points;
		    }
	    public void exitGame(){ 
	       System.out.println(points); 
	       System.out.println(" *******************************");
	       System.out.println("*              提示                        *");
	       System.out.println("*                               *");
	       System.out.println("*          是否退出游戏 ？             *");
	       System.out.println("*                               *");
	       System.out.println("*       【取消】  【确定】              *");
	       System.out.println(" ********************************");
	    } 

}
