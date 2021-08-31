package angle_bridgePattern;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public  class  FriendsWatchingWar extends WatchWar implements Runnable{
     JLabel showWar;
     Thread thread;
     ArrayList<String> content;
     FriendsWatchingWar(Battle battle){
    	   battleMaker=battle;  
           setLayout(new BorderLayout());
           showWar=new JLabel("∫√”—π€’Ω");
           showWar.setFont(new Font("",Font.BOLD,39));
           add(showWar,BorderLayout.CENTER);
           thread=new Thread(this);
    } 
     public void makeWarContants (){
           content=battleMaker.makeBattle();
           if(!thread.isAlive()){
                thread=new Thread(this);
                thread.start();  
           }
     }
     public void run(){
           for(int i=0;i<content.size();i++){
        	    showWar.setText(content.get(i)); 
                try{  Thread.sleep(1500);
                }
                catch(InterruptedException exp){}
           }
     }
}