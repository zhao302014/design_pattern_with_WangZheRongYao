package angle_singletonPattern;

import angle_singletonPattern.Champion;

public class Champion  {
    private  static Champion  uniqueChampion;
    String  message;
    private Champion(String message){
         uniqueChampion=this;
         this. message=message;
   }     
    public static synchronized Champion getChampion(String message){   //����һ��ͬ������
          if(uniqueChampion==null){
                uniqueChampion=new Champion("��ϲ"+message+"��õ�һ��");
          }
          return uniqueChampion;
    }
    public static void initChampion(){
         uniqueChampion=null;
    }
    public String getMess(){
          return message;
    }
}
