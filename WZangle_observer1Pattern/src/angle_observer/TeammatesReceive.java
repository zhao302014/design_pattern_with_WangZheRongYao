package angle_observer;

/*
     角色4：具体观察者：是实现观察者接口类的一个实例（包含有可以存放具体主题引用的主题接口变量）
              让具体主题引用或删除自己，使得自己成为或不再是它的观察者 
*/

import java.io.*;

public class TeammatesReceive implements Observer{   //实现观察者接口的第一个类TeammatesReceive
	Subject subject;
	File myFile;
	TeammatesReceive(Subject subject,String fileName){
		this.subject=subject;
		subject.addObserver(this);  //使当前实例成为subject所引用的具体主题的观察者
		myFile= new File(fileName);
	}
	public void hearMessage(String heardMess){    //TeammatesReceive类的实例调用hearMessage(String heardMess)方法
		try{
			RandomAccessFile out=new RandomAccessFile(myFile,"rw");  //将参数引用的字符串保存到一个文件中
			out.seek(out.length());
			byte[]b=heardMess.getBytes();
			out.write(b);              //更新文件内容
			System.out.println("【系统消息】敌方防御塔被摧毁");
			System.out.println("-------------------------------------------");
			System.out.print("【我方】娜可露露"+myFile.getName());
			System.out.println(heardMess);
			System.out.print("【我方】上官婉儿"+myFile.getName());
			System.out.println(heardMess);
			System.out.print("【我方】鬼谷子"+myFile.getName());
			System.out.println(heardMess);
			System.out.print("【我方】百里玄策"+myFile.getName());
			System.out.println(heardMess);
			System.out.print("【我方】马可波罗"+myFile.getName());
			System.out.println(heardMess);
		}
		catch(IOException exp){
			System.out.println(exp.toString());
		}
	}

}