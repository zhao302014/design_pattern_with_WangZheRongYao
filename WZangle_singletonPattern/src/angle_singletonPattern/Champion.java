package angle_singletonPattern;

import angle_singletonPattern.Champion;

public class Champion  {
    private  static Champion  uniqueChampion;
    String  message;
    private Champion(String message){
         uniqueChampion=this;
         this. message=message;
   }     
    public static synchronized Champion getChampion(String message){   //这是一个同步方法
          if(uniqueChampion==null){
                uniqueChampion=new Champion("恭喜"+message+"获得第一名");
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
