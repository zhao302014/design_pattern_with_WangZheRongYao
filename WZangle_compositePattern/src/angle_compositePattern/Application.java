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
    	  hero=new SkinType("李白",0);
          trunk=new  DefaultMutableTreeNode(hero);
          skinTypeOne=new SkinType("伴生皮肤",0); 
          branch1=new  DefaultMutableTreeNode(skinTypeOne);
          skinTypeTwo=new SkinType("特效皮肤",0);
          branch2=new  DefaultMutableTreeNode(skinTypeTwo); 
          skin=new SkinLiBai[MAX];
          leaf=new DefaultMutableTreeNode[MAX];
          skin[0]=new SkinLiBai("范海辛",288);
          leaf[0]=new DefaultMutableTreeNode(skin[0]);
          skin[1]=new SkinLiBai("敏锐之力",488);
          leaf[1]=new DefaultMutableTreeNode(skin[1]);
          skin[2]=new SkinLiBai("千年之狐",788);
          leaf[2]=new DefaultMutableTreeNode(skin[2]);
          skin[3]=new SkinLiBai("凤求凰",1788);
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
          text.setFont(new Font("宋体",Font.BOLD,12));
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
                mess=allName+"的价格:\n"+totalValue+"点券";
           else
                mess=allName+"加在一起的价格:\n"+totalValue+"点券"; 
           text.append(mess+"\n");
           double unit=1;
           double value=Computer.computerValue(treeComponent,unit);
           String name=treeComponent.toString();
           if(treeComponent.isLeaf())
                mess=name+"的价格"+value+"点券";
           else
                mess="所有"+name+"的价格"+value+"点券";
           text.append("\n"+mess);
      }
      public static void main(String args[]) {
           new Application();   
      }
}