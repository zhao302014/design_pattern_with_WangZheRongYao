package angle_prototypePattern;

import angle_prototypePattern.Prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Enemies implements Prototype,Serializable{
       StringBuffer skill,skin;
       public void setSkill(StringBuffer c){
             skill=c;
      }
      public  StringBuffer getSkill(){
            return skill;
      }
      public void setSkin(StringBuffer c){
             skin=c;
      }
      public  StringBuffer getSkin(){
              return skin;
      }
      public Object cloneMe() throws CloneNotSupportedException{ //实现接口中的方法
            Object object=null;
            try{ 
                   ByteArrayOutputStream outOne=new ByteArrayOutputStream();
                   ObjectOutputStream outTwo=new ObjectOutputStream(outOne);
                   outTwo.writeObject(this);     //将原型对象写入对象输出流
                   ByteArrayInputStream  inOne=new ByteArrayInputStream(outOne.toByteArray());
                   ObjectInputStream inTwo=new ObjectInputStream(inOne);
                   object=inTwo.readObject();    //创建新的对象：原型的复制品
           }
           catch(Exception event){
                   System.out.println(event);
           }
           return object;
      }
}
