package angle_abstractFactoryPattern;

import angle_abstractFactoryPattern.ZoneOne;
import angle_abstractFactoryPattern.Zone;
import angle_abstractFactoryPattern.ZoneTwo;
import angle_abstractFactoryPattern.Message;

public class Application{
    public static void main(String args[]){
       Message message=new Message();
       System.out.println("ĳQQ���ڲ�ͬ���е�ȫ����Ϣ��");
       System.out.println("   <��Q273�� �Ʋ�����>");
       Zone zone=new ZoneOne(); 
       message.giveSuit(zone,80,77,47,1314);
       System.out.println("   <��Q289�� ����һ��>");
       zone=new ZoneTwo(); 
       message.giveSuit(zone,111,88,56,5200);
    }
}
