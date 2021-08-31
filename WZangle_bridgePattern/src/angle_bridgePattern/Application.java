package angle_bridgePattern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Application extends JFrame{
      JButton seeWar;
      WatchWar watchWar;
      Battle battle;
      Application(WatchWar war,Battle battle){
    	   watchWar=war;
           this.battle=battle; 
           add(watchWar,BorderLayout.CENTER);
           seeWar=new JButton("π€’Ω");  
           add(seeWar,BorderLayout.SOUTH);
           seeWar.addActionListener(new ActionListener(){
                                            public void actionPerformed(ActionEvent e){
                                            	watchWar.makeWarContants();
                                            }});
          setVisible(true);
          setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      }
      public static void main(String args[]) {
           Battle  battle=new FriendsBattle();
           WatchWar  war=new FriendsWatchingWar(battle);
           Application  application1=new Application(war,battle);
           application1.setBounds(10,10,200,300);  
           battle=new GreatGodBattle();
           war=new GreatGodWatchingWar(battle);
           Application  application2=new Application(war,battle);
           application2.setBounds(220,10,200,300); 
      }
}   

