package angle_chainOfResponsibility;

/*
         4.正在为您初始化资源包
 */

public class InitializeResourcePack {
	 String points;
	    public InitializeResourcePack(String points){
	       this.points=points;
	    }
	    public void initializeResourcePack(){ 
	       System.out.println(points);
	       System.out.println("资源包初始化完毕");
	    } 


}
