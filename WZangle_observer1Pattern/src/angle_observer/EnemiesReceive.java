package angle_observer;


/*
     ��ɫ4.2������۲��ߣ���ʵ�ֹ۲��߽ӿ����һ��ʵ���������п��Դ�ž����������õ�����ӿڱ�����
              �þ����������û�ɾ���Լ���ʹ���Լ���Ϊ���������Ĺ۲��� 
*/

import java.io.*;
import java.util.regex.*;

public class EnemiesReceive implements Observer{     //ʵ�ֹ۲��߽ӿڵĵ�һ����EnemiesReceive
	Subject subject;
	File myFile;
	EnemiesReceive(Subject subject,String fileName){
		this.subject=subject;
		subject.addObserver(this);    //ʹ��ǰʵ����Ϊsubject�����õľ�������Ĺ۲���
		myFile=new File(fileName);
	}
	public void hearMessage(String heardMess){  //EnemiesReceive���ʵ������hearMessage(String heardMess)����
		try{
			boolean boo=heardMess.contains("�з�");
			if(boo){
			RandomAccessFile out=new RandomAccessFile(myFile,"rw"); //���������õ��ַ����а����С��з���,�ͽ���Ϣ���浽һ���ļ���
			out.seek(out.length());
			byte[]b=heardMess.getBytes();
			out.write(b);
			System.out.println("-------------------------------------------");
			System.out.print("���з������ܻ�"+myFile.getName());
			System.out.println("���ҷ����������ݻ١�");
			System.out.print("���з�����֪����"+myFile.getName());
			System.out.println("���ҷ����������ݻ١�");
			System.out.print("���з�����ظ"+myFile.getName());
			System.out.println("���ҷ����������ݻ١�");
			System.out.print("���з�����Ԫ��"+myFile.getName());
			System.out.println("���ҷ����������ݻ١�");
			System.out.print("���з�����Τ"+myFile.getName());
			System.out.println("���ҷ����������ݻ١�");
		     }
		}
		catch(IOException exp){
			System.out.println(exp.toString());
		}
	}

}
