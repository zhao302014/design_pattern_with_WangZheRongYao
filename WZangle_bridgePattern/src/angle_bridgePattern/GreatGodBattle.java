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
              content.add("������ҡ�С�ı�·��ɱ��ѡ�����Ҿ���ս");
              content.add("������ҡ�С�ı�·��ɱ��ʹ�����Ҿ���ɱ�з�Ӣ�ۻ��һѪ");
              content.add("������ҡ�С�ı�·��ɱ��ʹ�����Ҿ�����ɱ��ɱ��");
              content.add("������ҡ�С�ı�·��ɱ������ѷ��������ϣ������з�ˮ�����ź�");
              content.add("�Ծֽ�����������һ��ʤ����");
              return content;
      }
}
