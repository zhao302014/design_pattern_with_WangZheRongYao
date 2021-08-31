package angle_observer;

/*
     ��ɫ4������۲��ߣ���ʵ�ֹ۲��߽ӿ����һ��ʵ���������п��Դ�ž����������õ�����ӿڱ�����
              �þ����������û�ɾ���Լ���ʹ���Լ���Ϊ���������Ĺ۲��� 
*/

import java.io.*;

public class TeammatesReceive implements Observer{   //ʵ�ֹ۲��߽ӿڵĵ�һ����TeammatesReceive
	Subject subject;
	File myFile;
	TeammatesReceive(Subject subject,String fileName){
		this.subject=subject;
		subject.addObserver(this);  //ʹ��ǰʵ����Ϊsubject�����õľ�������Ĺ۲���
		myFile= new File(fileName);
	}
	public void hearMessage(String heardMess){    //TeammatesReceive���ʵ������hearMessage(String heardMess)����
		try{
			RandomAccessFile out=new RandomAccessFile(myFile,"rw");  //���������õ��ַ������浽һ���ļ���
			out.seek(out.length());
			byte[]b=heardMess.getBytes();
			out.write(b);              //�����ļ�����
			System.out.println("��ϵͳ��Ϣ���з����������ݻ�");
			System.out.println("-------------------------------------------");
			System.out.print("���ҷ����ȿ�¶¶"+myFile.getName());
			System.out.println(heardMess);
			System.out.print("���ҷ����Ϲ����"+myFile.getName());
			System.out.println(heardMess);
			System.out.print("���ҷ��������"+myFile.getName());
			System.out.println(heardMess);
			System.out.print("���ҷ�����������"+myFile.getName());
			System.out.println(heardMess);
			System.out.print("���ҷ�����ɲ���"+myFile.getName());
			System.out.println(heardMess);
		}
		catch(IOException exp){
			System.out.println(exp.toString());
		}
	}

}