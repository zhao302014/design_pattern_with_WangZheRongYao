package angle_observer;


/*
     角色4.2：具体观察者：是实现观察者接口类的一个实例（包含有可以存放具体主题引用的主题接口变量）
              让具体主题引用或删除自己，使得自己成为或不再是它的观察者 
*/

import java.io.*;
import java.util.regex.*;

public class EnemiesReceive implements Observer{     //实现观察者接口的第一个类EnemiesReceive
	Subject subject;
	File myFile;
	EnemiesReceive(Subject subject,String fileName){
		this.subject=subject;
		subject.addObserver(this);    //使当前实例成为subject所引用的具体主题的观察者
		myFile=new File(fileName);
	}
	public void hearMessage(String heardMess){  //EnemiesReceive类的实例调用hearMessage(String heardMess)方法
		try{
			boolean boo=heardMess.contains("敌方");
			if(boo){
			RandomAccessFile out=new RandomAccessFile(myFile,"rw"); //若参数引用的字符串中包含有“敌方”,就将信息保存到一个文件中
			out.seek(out.length());
			byte[]b=heardMess.getBytes();
			out.write(b);
			System.out.println("-------------------------------------------");
			System.out.print("【敌方】裴擒虎"+myFile.getName());
			System.out.println("“我方防御塔被摧毁”");
			System.out.print("【敌方】不知火舞"+myFile.getName());
			System.out.println("“我方防御塔被摧毁”");
			System.out.print("【敌方】钟馗"+myFile.getName());
			System.out.println("“我方防御塔被摧毁”");
			System.out.print("【敌方】李元芳"+myFile.getName());
			System.out.println("“我方防御塔被摧毁”");
			System.out.print("【敌方】典韦"+myFile.getName());
			System.out.println("“我方防御塔被摧毁”");
		     }
		}
		catch(IOException exp){
			System.out.println(exp.toString());
		}
	}

}
