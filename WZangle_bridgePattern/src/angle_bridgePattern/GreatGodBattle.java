package angle_bridgePattern;

import angle_bridgePattern.Battle;

import java.util.ArrayList;
public class GreatGodBattle implements Battle{
      ArrayList<String> content;
      GreatGodBattle(){
          content=new ArrayList<String>();
     }
      public  ArrayList<String>  makeBattle(){
              content.clear();
              content.add("大神玩家【小心边路反杀】选择橘右京出战");
              content.add("大神玩家【小心边路反杀】使用橘右京击杀敌方英雄获得一血");
              content.add("大神玩家【小心边路反杀】使用橘右京“大杀特杀”");
              content.add("大神玩家【小心边路反杀】向队友发出“集合，攻击敌方水晶”信号");
              content.add("对局结束！大神玩家获得胜利！");
              return content;
      }
}
