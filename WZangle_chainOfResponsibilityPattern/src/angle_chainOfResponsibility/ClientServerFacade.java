package angle_chainOfResponsibility;

/*
         Õ‚π€¿‡
 */

import angle_chainOfResponsibility.CheckUpdate;
import angle_chainOfResponsibility.ExitGame;
import angle_chainOfResponsibility.HaveAGoodGame;
import angle_chainOfResponsibility.InitializeResourcePack;
import angle_chainOfResponsibility.TencentGames;
import angle_chainOfResponsibility.TiMi_L1Studio;
import angle_chainOfResponsibility.StartGames;

public class ClientServerFacade{
	    private CheckUpdate checkUpdate;
	    private ExitGame exitGame;
	    private HaveAGoodGame haveAGoodGame;
	    private InitializeResourcePack initializeResourcePack;
	    private TencentGames tencentGames;
	    private TiMi_L1Studio timi_L1Studio;
	    private StartGames startGames;
	    String point,point1,point2,point3,point4,point5,point6;
	    public ClientServerFacade(String point){
	       this.point=point;
	       checkUpdate=new CheckUpdate(point);
	       this.point=point;
	       haveAGoodGame=new HaveAGoodGame(point);
	       this.point=point;
	       exitGame=new ExitGame(point);
	       this.point=point;
	       initializeResourcePack=new InitializeResourcePack(point);
	       this.point=point;
	       tencentGames=new TencentGames(point);
	       this.point=point;
	       timi_L1Studio=new TiMi_L1Studio(point);
	       this.point=point;
	       startGames=new StartGames(point);
	    }	

	    public void doPoint(){ 
	       checkUpdate.checkUpdate();
	        } 
	    public void doPoint1(){ 
	    	exitGame.exitGame();
		    } 
	    public void doPoint2(){ 
	    	haveAGoodGame.haveAGoodGame();
		    } 
	    public void doPoint3(){ 
	    	initializeResourcePack.initializeResourcePack();
		    } 
	    public void doPoint4(){ 
	    	tencentGames.tencentGames();
		    } 
	    public void doPoint5(){ 
	    	timi_L1Studio.timi_L1Studio();
		    } 
	    public void doPoint6(){ 
	    	startGames.startGames();
		    } 

}
