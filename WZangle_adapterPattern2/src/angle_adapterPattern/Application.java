package angle_adapterPattern;

import angle_adapterPattern.IOS;
import angle_adapterPattern.IteratorAdapter;
import angle_adapterPattern.AndroidOS;

import java.util.Enumeration;

public class Application {

	public static void main(String[] args) {
		AndroidOS androidRoleList=new AndroidOS();
		androidRoleList.setRoleData();
		Enumeration roleData=androidRoleList.getEnumeration();
		IteratorAdapter adapter=new IteratorAdapter(roleData);
		IOS newRoleData=new IOS(adapter);
		newRoleData.setRoleData();
		System.out.println("��ϵͳ��ʾ�� ��ϲ�������Ľ�ɫ�����ڰ�׿��iOSϵͳ��ͨ�ɹ��ˣ�");
		System.out.println("------------------------------------------------------------");
	    System.out.println("��ϵͳ��ʾ�� ���ڰ�׿ϵͳ�Ľ�ɫ���ݳɹ����뵽iOSϵͳ�е�������:");
		newRoleData.getRoleData();
		   }

	}

