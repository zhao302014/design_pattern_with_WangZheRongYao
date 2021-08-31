package angle_abstractFactoryPattern;

import angle_abstractFactoryPattern.ZoneOne;
import angle_abstractFactoryPattern.Zone;
import angle_abstractFactoryPattern.ZoneTwo;
import angle_abstractFactoryPattern.Message;

public class Application{
    public static void main(String args[]){
       Message message=new Message();
       System.out.println("某QQ号在不同区中的全部信息：");
       System.out.println("   <手Q273区 制裁神谕>");
       Zone zone=new ZoneOne(); 
       message.giveSuit(zone,80,77,47,1314);
       System.out.println("   <手Q289区 神梦一刀>");
       zone=new ZoneTwo(); 
       message.giveSuit(zone,111,88,56,5200);
    }
}
