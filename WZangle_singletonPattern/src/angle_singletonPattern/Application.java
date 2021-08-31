package angle_singletonPattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Application extends JFrame implements ActionListener{
       JButton  start;
       Player playerOne,playerTwo,playerThree,playerFore,playerFive;
       JButton  one,two,three,fore,five;
       JTextField showLabel;
       int width=60;
       int height=28;
       int MaxDistance=460;
       public Application(){
           setLayout(null);
           start=new JButton("开始比赛");
           start.addActionListener(this);
           add(start);
           start.setBounds(200,30,90,20);
           showLabel=new JTextField("为所有选手加油！");
           showLabel.setEditable(false);
           add(showLabel);
           showLabel.setBounds(50,30,140,20);
           showLabel.setBackground(Color.orange);
           showLabel.setFont(new Font("隶书",Font.BOLD,16));
           showLabel=new JTextField("第一名是谁让我们拭目以待！");
           showLabel.setEditable(false);
           add(showLabel);
           showLabel.setBounds(300,30,230,20);
           showLabel.setBackground(Color.orange);
           showLabel.setFont(new Font("隶书",Font.BOLD,16));
           one=new JButton("马超"); 
           one.setSize(73,30);
           one.setBackground(Color.yellow); 
           playerOne=new Player(18,2,MaxDistance,one,width,height,showLabel);
           two=new JButton("韩信"); 
           two.setSize(73,30); 
           two.setBackground(Color.cyan);
           playerTwo=new Player(18,2,MaxDistance,two,width,height,showLabel);
           three=new JButton("猪八戒");
           three.setSize(73,30);
           three.setBackground(Color.green); 
           playerThree=new Player(18,2,MaxDistance,three,width,height,showLabel);
           fore=new JButton("李白"); 
           fore.setSize(73,30); 
           fore.setBackground(Color.white);
           playerFore=new Player(18,2,MaxDistance,two,width,height,showLabel);
           five=new JButton("李元芳"); 
           five.setSize(73,30); 
           five.setBackground(Color.pink);
           playerFive=new Player(18,2,MaxDistance,two,width,height,showLabel);
           initPosition();
           setBounds(100,100,600,300);
           setVisible(true);
           setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    private void  initPosition(){
            Champion.initChampion();
            showLabel.setText("为所有选手加油！");
            showLabel.setText("第一名是谁让我们拭目以待！");
            repaint();
            remove(one);
            remove(two);
            remove(three) ;
            remove(fore);
            remove(five) ;
            add(one);
            add(two);
            add(three);
            add(fore);
            add(five);
            one.setLocation(1,60);
            two.setLocation(1,60+height+2);
            three.setLocation(1,60+2*height+4);
            fore.setLocation(1,60+3*height+2);
            five.setLocation(1,60+4*height+3);
    }
    public void actionPerformed(ActionEvent e){
          boolean boo=playerOne.isAlive()||playerTwo.isAlive()||playerThree.isAlive()||playerFore.isAlive()||playerFive.isAlive();
          if(boo==false){
                 initPosition();
                 int m=(int)(Math.random()*2)+19;
                 playerOne=new Player(m,2,MaxDistance,one,width,height,showLabel);
                 m=(int)(Math.random()*3)+18;
                 playerTwo=new Player(m,2,MaxDistance,two,width,height,showLabel);
                 m=(int)(Math.random()*4)+17;
                 playerThree=new Player(m,2,MaxDistance,three,width,height,showLabel);
                 m=(int)(Math.random()*5)+16;
                 playerFore=new Player(m,2,MaxDistance,fore,width,height,showLabel);
                 m=(int)(Math.random()*6)+15;
                 playerFive=new Player(m,2,MaxDistance,five,width,height,showLabel);
          }
          try{
                  playerOne.start();
                  playerTwo.start();
                  playerThree.start();
                  playerFore.start();
                  playerFive.start();
          }
          catch(Exception exp){}
    }
    public void paint(Graphics g){
           super.paint(g);
           g.drawLine(MaxDistance,0,MaxDistance,MaxDistance);
    }
    public static void main(String args[]){
           new Application();
    }
}

