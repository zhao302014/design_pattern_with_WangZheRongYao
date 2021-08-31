package angle_builderPattern;

import javax.swing.*;

import java.awt.*;
public class ConcreteBuilderThree extends JFrame{
 
	JButton jb1,jb2,jb3;
	JPanel jp1,jp2,jp3;
	public ConcreteBuilderThree(){
		jb1=new JButton("同左/右侧展开地图");
		jb2=new JButton("同左/右侧出装");	
		jb3=new JButton("");
		JLabel label = new JLabel("同左/右侧出装");
		JLabel label1 = new JLabel(" ");
		jp1=new JPanel();
		jp2=new JPanel();	
		jp3=new JPanel();
		jp1.add(jb1);
		jp2.add(label);
		jp3.add(label1);
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp3);
		this.add(jp2,BorderLayout.SOUTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		this.setVisible(true);
	}
 
}
