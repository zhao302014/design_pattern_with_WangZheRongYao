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
              content.add("���ѡ�Ͽ��һ����Ա��ѡ��������ս");
              content.add("���ѡ�Ͽ��һ����Ա��ʹ��������ɱ�з�Ӣ�ۻ��һѪ");
              content.add("���ѡ�Ͽ��һ����Ա��ʹ�������������ܵ���");
              content.add("���ѡ�Ͽ��һ����Ա������ѷ��������ϣ������ҷ�ˮ�����ź�");
              content.add("�����Ծֽ��������ѡ�Ͽ��һ����Ա������ʧ�ܣ�");
              return content;
      }
}