package angle_chainOfResponsibility;

/*
           1.腾讯游戏图标加载
 */

public class TencentGames {
	String points;
    public TencentGames(String points){
       this.points=points;
    }
    public void tencentGames(){ 
       System.out.println(points);  
       System.out.println("腾讯游戏（Tencent Games）图标加载完毕");
    } 


}
