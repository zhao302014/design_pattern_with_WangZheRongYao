package angle_proxyPattern3;

public class GiveReward implements ChargeMoney{ 
	int a;
    public  GiveReward(int a) {
          this.a=a;
   }
   public void getRewards(){ 
          System.out.println("��ϲ�����ɹ���ֵ"+a+"��ȯ��");
          System.out.println("��������1����ҫ���ֳ齱ȯ+3��Ƥ����Ƭ");
  }
} 
