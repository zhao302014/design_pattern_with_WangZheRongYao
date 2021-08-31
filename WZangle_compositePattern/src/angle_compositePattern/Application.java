package angle_compositePattern;

import javax.swing.*;
import javax.swing.tree.*;
import javax.swing.event.*;
import java.awt.*;

public class Application  extends JFrame implements TreeSelectionListener{
	  HeroLiBai  hero,skinTypeOne,skinTypeTwo , skin[];
      DefaultMutableTreeNode trunk,branch1,branch2, leaf[] ;
      JTree heroSkin;
      final static int MAX=4;
      JTextArea text;
      public Application() {
    	  hero=new SkinType("���",0);
          trunk=new  DefaultMutableTreeNode(hero);
          skinTypeOne=new SkinType("����Ƥ��",0); 
          branch1=new  DefaultMutableTreeNode(skinTypeOne);
          skinTypeTwo=new SkinType("��ЧƤ��",0);
          branch2=new  DefaultMutableTreeNode(skinTypeTwo); 
          skin=new SkinLiBai[MAX];
          leaf=new DefaultMutableTreeNode[MAX];
          skin[0]=new SkinLiBai("������",288);
          leaf[0]=new DefaultMutableTreeNode(skin[0]);
          skin[1]=new SkinLiBai("����֮��",488);
          leaf[1]=new DefaultMutableTreeNode(skin[1]);
          skin[2]=new SkinLiBai("ǧ��֮��",788);
          leaf[2]=new DefaultMutableTreeNode(skin[2]);
          skin[3]=new SkinLiBai("�����",1788);
          leaf[3]=new DefaultMutableTreeNode(skin[3]);
          hero.add(skinTypeOne);
          trunk.add(branch1);
          hero.add(skinTypeTwo);
          trunk.add(branch2); 
          for(int i=0;i<1;i++){
        	     skinTypeOne.add(skin[i]);
                 branch1.add(leaf[i]);
          }
          for(int i=1;i<MAX;i++){
        	     skinTypeTwo.add(skin[i]);
                 branch2.add(leaf[i]);
          }
          heroSkin =new JTree(trunk);
          heroSkin.addTreeSelectionListener(this);
          text=new JTextArea(20,20);
          text.setFont(new Font("����",Font.BOLD,12));
          text.setLineWrap(true);
          setLayout(new GridLayout(1,2));
          add(new JScrollPane(heroSkin));
          add(new JScrollPane(text)); 
          setBounds(70,80,460,320);
          setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
          setVisible(true);
      }
      public void valueChanged(TreeSelectionEvent e){
           text.setText(null);
           DefaultMutableTreeNode node=(DefaultMutableTreeNode)heroSkin.getLastSelectedPathComponent();
           HeroLiBai  treeComponent=(HeroLiBai)node.getUserObject();
           String allName=Computer.getAllChildrenName(treeComponent);
           double totalValue=Computer.computerValue(treeComponent);
           String mess=null;
           if(treeComponent.isLeaf())
                mess=allName+"�ļ۸�:\n"+totalValue+"��ȯ";
           else
                mess=allName+"����һ��ļ۸�:\n"+totalValue+"��ȯ"; 
           text.append(mess+"\n");
           double unit=1;
           double value=Computer.computerValue(treeComponent,unit);
           String name=treeComponent.toString();
           if(treeComponent.isLeaf())
                mess=name+"�ļ۸�"+value+"��ȯ";
           else
                mess="����"+name+"�ļ۸�"+value+"��ȯ";
           text.append("\n"+mess);
      }
      public static void main(String args[]) {
           new Application();   
      }
}