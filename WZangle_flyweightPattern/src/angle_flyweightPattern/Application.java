package angle_flyweightPattern;

import angle_flyweightPattern.Hero;
import angle_flyweightPattern.Flyweight;
import angle_flyweightPattern.FlyweightFactroy;

public class Application{
    public static void main(String args[]) {
          FlyweightFactroy  factroy=FlyweightFactroy.getFactroy();
          String oneSkill = "����֮��",twoSkill = "���֮Ϣ",threeSkill = "����";
          String key=""+oneSkill+"#"+twoSkill+"#"+threeSkill;
          Flyweight flyweight=factroy.getFlyweight(key);
          Hero audiA6One=new Hero(flyweight,"������Լ","�ع���Ӱ ","�ٴ�����");
          Hero audiA6Two=new Hero(flyweight,"������Լ","��ȸ־    ","��Ѫ����");
          Hero audiA6Three=new Hero(flyweight,"������Լ","��ȸ־    ","��Ѫ����");
          audiA6One.print();
          audiA6Two.print();
          audiA6Three.print();
          Hero audiA4One=new Hero(flyweight,"������Լ","��Ӱ��ǹ","�ٴ�����");
          Hero audiA4Two=new Hero(flyweight,"������Լ","�ع���Ӱ","�ٴ�����");
          flyweight.printMess(" Ӣ�ۣ�������Լ Ƥ������Ӱ��ǹ  ���ģ��ٴ�����"); // ����Ԫ�����ⲿ����
          flyweight.printMess(" Ӣ�ۣ�������Լ Ƥ������ȸ־     ���ģ��ٴ�����");
    }
} 

