package angle_bridgePattern;

import angle_bridgePattern.Battle;

import java.util.ArrayList;
public class FriendsBattle implements Battle{
      ArrayList<String> content;
      FriendsBattle(){
          content=new ArrayList<String>();
     }
      public  ArrayList<String>  makeBattle(){
              content.clear();
              content.add("好友【峡谷一级演员】选择嬴政出战");
              content.add("好友【峡谷一级演员】使用嬴政击杀敌方英雄获得一血");
              content.add("好友【峡谷一级演员】使用嬴政“无人能挡”");
              content.add("好友【峡谷一级演员】向队友发出“集合，保护我方水晶”信号");
              content.add("晋级对局结束！好友【峡谷一级演员】晋级失败！");
              return content;
      }
}