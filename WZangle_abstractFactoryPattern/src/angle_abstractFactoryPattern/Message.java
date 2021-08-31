package angle_abstractFactoryPattern;

public class Message{
    Goods goods;
    MilitaryExploits exploits; 
    public void giveSuit(Zone zone,int skinNumber,int heroNumber,int winProbability,int totalNumber){
       goods=zone.createGoods(heroNumber,skinNumber);
       exploits=zone.createMilitaryExploits(totalNumber,winProbability);
       showMess();
    }
    private void showMess(){
       System.out.println(goods.getName()+":");
       System.out.println("               Ó¢ÐÛ:"+goods.getHeroNumber());
       System.out.println("               Æ¤·ô:"+goods.getSkinNumber());
       System.out.println(exploits.getName()+":");
       System.out.println("               Ê¤ÂÊ:"+exploits.getWinProbability()+"%");
       System.out.println("               ³¡Êý:"+exploits.getTotalNumber());
    }
}
