package angle_proxyPattern3;

public class GiveReward implements ChargeMoney{ 
	int a;
    public  GiveReward(int a) {
          this.a=a;
   }
   public void getRewards(){ 
          System.out.println("恭喜您！成功充值"+a+"点券！");
          System.out.println("额外赠送1张荣耀积分抽奖券+3个皮肤碎片");
  }
} 
