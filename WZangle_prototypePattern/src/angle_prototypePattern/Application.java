package angle_prototypePattern;

import angle_prototypePattern.Teammates;
import angle_prototypePattern.Enemies;

public class Application{
    public static void main(String args[]){
    	
    	System.out.println("����¡ģʽ��ƥ��ɹ�������ѡ��Ӣ��");
    	System.out.println("");
    	System.out.println("���ҷ�����ѡ��Ӣ�ۡ��������ߡ���ս��");
    	System.out.println("��з�����ѡ��Ӣ�ۡ��ĺ����ս��");
    	System.out.println("----------------------------------------------------");
    	
    	Teammates  teammates=new Teammates();
    	teammates.setSkill(new StringBuffer("����"));
    	teammates.setSkin(new StringBuffer("����֮��"));
    	System.out.println("���ҷ�");
        System.out.println("Ӣ�ۡ��������ߡ�Ĭ���ٻ�ʦ���ܡ�"+teammates.getSkill()+"����Ƥ����"+teammates.getSkin()+"��");
          try{
        	     Teammates  teammatesCopy1=(Teammates)teammates.cloneMe();
        	     Teammates  teammatesCopy2=(Teammates)teammates.cloneMe();
        	     Teammates  teammatesCopy3=(Teammates)teammates.cloneMe();
        	     Teammates  teammatesCopy4=(Teammates)teammates.cloneMe();
        	     Teammates  teammatesCopy5=(Teammates)teammates.cloneMe();
                 teammatesCopy1.setSkill(new StringBuffer("����"));
                 teammatesCopy2.setSkill(new StringBuffer("�ͻ�"));
                 teammatesCopy3.setSkill(new StringBuffer("��"));
                 teammatesCopy4.setSkin(new StringBuffer("����˹��"));
                 teammatesCopy5.setSkin(new StringBuffer("�׻�־"));
                 System.out.println("     ���һ����Ĭ���ٻ�ʦ���ܡ�"+teammates.getSkill()+"����Ƥ����"+teammates.getSkin()+"��");
                 System.out.println("     ��Ҷ����ٻ�ʦ���ܸ�Ϊ��"+teammatesCopy1.getSkill()+"����Ƥ����"+teammatesCopy4.getSkin()+"��");
                 System.out.println("     ��������ٻ�ʦ���ܸ�Ϊ��"+teammatesCopy2.getSkill()+"����Ƥ����"+teammatesCopy5.getSkin()+"��"); 
                 System.out.println("     ����Ľ��ٻ�ʦ���ܸ�Ϊ��"+teammatesCopy3.getSkill()+"����Ƥ������Ĭ�ϡ�"+teammates.getSkin()+"��"); 
                 System.out.println("     ����彫�ٻ�ʦ���ܸ�Ϊ��"+teammatesCopy3.getSkill()+"����Ƥ����"+teammatesCopy4.getSkin()+"��"); 
          }
          catch(CloneNotSupportedException exp){} 
        System.out.println("---------------------------------------------------"); 
        Enemies  enemies=new Enemies();
        enemies.setSkill(new StringBuffer("����"));
        enemies.setSkin(new StringBuffer("���֮��"));
        System.out.println("��з�");
          System.out.println("Ӣ�ۡ��ĺ��Ĭ���ٻ�ʦ���ܡ�"+enemies.getSkill()+"����Ƥ����"+enemies.getSkin()+"��");
            try{
          	       Enemies  enemiesCopy1=(Enemies)enemies.cloneMe();
          	       Enemies  enemiesCopy2=(Enemies)enemies.cloneMe();
          	       Enemies  enemiesCopy3=(Enemies)enemies.cloneMe();
          	       Enemies  enemiesCopy4=(Enemies)enemies.cloneMe();
          	       Enemies  enemiesCopy5=(Enemies)enemies.cloneMe();
          	       Enemies  enemiesCopy6=(Enemies)enemies.cloneMe();
          	       Enemies  enemiesCopy7=(Enemies)enemies.cloneMe();
          	       Enemies  enemiesCopy8=(Enemies)enemies.cloneMe();
        	       enemiesCopy1.setSkill(new StringBuffer("����"));
        	       enemiesCopy2.setSkill(new StringBuffer("�ͻ�"));
        	       enemiesCopy3.setSkill(new StringBuffer("�ս�"));
        	       enemiesCopy4.setSkill(new StringBuffer("ѣ��"));
        	       enemiesCopy5.setSkin(new StringBuffer("˷�絶"));
        	       enemiesCopy6.setSkin(new StringBuffer("�˷�����"));
        	       enemiesCopy7.setSkin(new StringBuffer("ս����ʿ"));
        	       enemiesCopy8.setSkin(new StringBuffer("����쫷��"));
                   System.out.println("     ���һ����Ĭ���ٻ�ʦ���ܡ�"+enemies.getSkill()+"����Ƥ����"+enemies.getSkin()+"��");
                   System.out.println("     ��Ҷ����ٻ�ʦ���ܸ�Ϊ��"+enemiesCopy1.getSkill()+"����Ƥ����"+enemiesCopy6.getSkin()+"��");
                   System.out.println("     ��������ٻ�ʦ���ܸ�Ϊ��"+enemiesCopy3.getSkill()+"����Ƥ����"+enemiesCopy7.getSkin()+"��"); 
                   System.out.println("     ����Ľ��ٻ�ʦ���ܸ�Ϊ��"+enemiesCopy4.getSkill()+"����Ƥ����"+enemiesCopy5.getSkin()+"��"); 
                   System.out.println("     ����彫�ٻ�ʦ���ܸ�Ϊ��"+enemiesCopy2.getSkill()+"����Ƥ����"+enemiesCopy8.getSkin()+"��"); 
            }
            catch(CloneNotSupportedException exp){} 
    }
}
