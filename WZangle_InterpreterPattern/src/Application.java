public class Application{
     public static void main(String args[]){
    	  System.out.println("�ٵ����ʹ�á���ͨ��������ѷ�����Ϣʱ��");
    	  System.out.println("       ��ϵͳ��ʾ�����ڴ���˷硭��");
    	  System.out.println("       ��ϵͳ��ʾ������¼���С���");
    	  System.out.println("       ��ϵͳ��ʾ������ת������");
    	  System.out.print("       ��ϵͳ��ʾ��ת���ɹ���");
          String text="Zhong Lu Yi Bo Le";         
          Context context=new Context(text);
          Node node=new OneTwoNode();
          node.parse(context);
          node.execute();
          System.out.println("");
          System.out.println("");
          System.out.println("����������������������������������");
          System.out.println("");
          System.out.println("�ڵ����ʹ�á����ԡ�����ѷ�����Ϣʱ��");
          System.out.println("       ��ϵͳ��ʾ�����ڴ���˷硭��");
    	  System.out.println("       ��ϵͳ��ʾ������¼���С���");
    	  System.out.println("       ��ϵͳ��ʾ������ת������");
    	  System.out.print("       ��ϵͳ��ʾ��ת���ɹ���");
          text="Ji He Jin Gong Zhu Zai";         
          context=new Context(text);
          node=new OneTwoNode();
          node.parse(context);
          node.execute();
     }
}