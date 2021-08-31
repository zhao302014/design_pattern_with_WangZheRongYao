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
		System.out.println("【系统提示】 恭喜您！您的角色数据在安卓、iOS系统互通成功了！");
		System.out.println("------------------------------------------------------------");
	    System.out.println("【系统提示】 您在安卓系统的角色数据成功导入到iOS系统中的数据有:");
		newRoleData.getRoleData();
		   }

	}

