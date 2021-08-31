package angle_flyweightPattern;

import angle_flyweightPattern.Hero;
import angle_flyweightPattern.Flyweight;
import angle_flyweightPattern.FlyweightFactroy;

public class Application{
    public static void main(String args[]) {
          FlyweightFactroy  factroy=FlyweightFactroy.getFactroy();
          String oneSkill = "静谧之眼",twoSkill = "狂风之息",threeSkill = "逃脱";
          String key=""+oneSkill+"#"+twoSkill+"#"+threeSkill;
          Flyweight flyweight=factroy.getFlyweight(key);
          Hero audiA6One=new Hero(flyweight,"百里守约","特工魅影 ","百穿铭文");
          Hero audiA6Two=new Hero(flyweight,"百里守约","朱雀志    ","吸血铭文");
          Hero audiA6Three=new Hero(flyweight,"百里守约","朱雀志    ","吸血铭文");
          audiA6One.print();
          audiA6Two.print();
          audiA6Three.print();
          Hero audiA4One=new Hero(flyweight,"百里守约","绝影神枪","百穿铭文");
          Hero audiA4Two=new Hero(flyweight,"百里守约","特工魅影","百穿铭文");
          flyweight.printMess(" 英雄：百里守约 皮肤：绝影神枪  铭文：百穿铭文"); // 向享元传递外部数据
          flyweight.printMess(" 英雄：百里守约 皮肤：朱雀志     铭文：百穿铭文");
    }
} 

