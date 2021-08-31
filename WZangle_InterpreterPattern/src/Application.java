public class Application{
     public static void main(String args[]){
    	  System.out.println("①当玩家使用“普通话”向队友发送消息时：");
    	  System.out.println("       【系统提示】正在打开麦克风……");
    	  System.out.println("       【系统提示】语音录入中……");
    	  System.out.println("       【系统提示】正在转换……");
    	  System.out.print("       【系统提示】转换成功：");
          String text="Zhong Lu Yi Bo Le";         
          Context context=new Context(text);
          Node node=new OneTwoNode();
          node.parse(context);
          node.execute();
          System.out.println("");
          System.out.println("");
          System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
          System.out.println("");
          System.out.println("②当玩家使用“方言”向队友发送消息时：");
          System.out.println("       【系统提示】正在打开麦克风……");
    	  System.out.println("       【系统提示】语音录入中……");
    	  System.out.println("       【系统提示】正在转换……");
    	  System.out.print("       【系统提示】转换成功：");
          text="Ji He Jin Gong Zhu Zai";         
          context=new Context(text);
          node=new OneTwoNode();
          node.parse(context);
          node.execute();
     }
}