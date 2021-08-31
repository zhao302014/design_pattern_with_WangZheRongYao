package angle_proxyPattern3;

import angle_proxyPattern3.ChargeMoney;
import angle_proxyPattern3.GiveReward;

public class Charge10Money implements ChargeMoney{ 
    int a; 
    GiveReward rewards;
    public  void setMoney(int a) {
            this.a=a;
     }
     public void  getRewards(){ 
            if(a==10){
            	rewards=new GiveReward(a);
                rewards.getRewards();  
            }
            else
                {System.out.println("≥‰÷µ ß∞‹£°«Î÷ÿ ‘°≠°≠");}
    }
} 
