package angle_proxyPattern3;

import angle_proxyPattern3.GiveReward;
import java.util.Scanner;

public class Application{
     public static void main(String args[]) {
            Scanner reader=new Scanner(System.in);
            System.out.println("��Ҫ��ֵ�ĵ�ȯ���ǣ�");
            int a;
            a=reader.nextInt();
            Charge10Money money=new Charge10Money();
            money.setMoney(a);
            money.getRewards();
     }
}

