package angle_strategy;

import angle_strategy.QualifyingCompetition;
import angle_strategy.Hero;
import angle_strategy.StaregyDiaochanJinghua;
import angle_strategy.StaregyHouyiKuangbao;
import angle_strategy.StaregyLibaiChengji;
import angle_strategy.StaregyMachaoJipao;
import angle_strategy.StaregyMingshiyinZhiliao;

public class Application {

	public static void main(String[] args) {
		QualifyingCompetition game=new QualifyingCompetition();     //�����Ķ���
		Hero diaochan=new Hero();
		diaochan.setName("����");         //��������
        diaochan.setSkill("����");
        diaochan.setDialogue("�޾����赸���շ���");
        Hero houyi=new Hero();
		houyi.setName("����");         //�����
        houyi.setSkill("��");
        houyi.setDialogue("���ձ�����Ϩ����,���Խ�������һ");
        Hero libai=new Hero();
		libai.setName("���");         //��׳ͻ�
        libai.setSkill("�ͻ�");
        libai.setDialogue("����������磬�����ĺ������");
        Hero machao=new Hero();
		machao.setName("��");         //������
        machao.setSkill("����");
        machao.setDialogue("�ҵ�ǹȥ�����������������ȥ�޻�");
        Hero mingshiyin=new Hero();
		mingshiyin.setName("������");         //����������
        mingshiyin.setSkill("����");
        mingshiyin.setDialogue("Ѫ����,����������֮ˮ");
        System.out.println("");
        System.out.println("�Ҵ��ĸ�λ�ö����ԣ�������ѡ���Ҳ�λ!");
        System.out.println("-----------------------------------------------");
		game.setStrategy(new StaregyDiaochanJinghua());        //�����Ķ���ʹ�ò���һ
		System.out.println("�����ʣ�ࡾ��ʦ��λʱ��");
		System.out.printf("��ѡ��%s�����Ҵ����ٻ�ʦ�����ǡ�%s��\n",diaochan.getName(),diaochan.getSkill());
		System.out.printf("ѡ��󴥷�Ӣ��̨�ʣ�%s\n",diaochan.getDialogue());
		System.out.println("-----------------------------------------------");
		game.setStrategy(new StaregyHouyiKuangbao());    //�����Ķ���ʹ�ò��Զ�
		System.out.println("�����ʣ�ࡾ���֡�λʱ��");
		System.out.printf("��ѡ��%s�����Ҵ����ٻ�ʦ�����ǡ�%s��\n",houyi.getName(),houyi.getSkill());
		System.out.printf("ѡ��󴥷�Ӣ��̨�ʣ�%s\n",houyi.getDialogue());
		System.out.println("-----------------------------------------------");
		game.setStrategy(new StaregyLibaiChengji());    //�����Ķ���ʹ�ò�����
		System.out.println("�����ʣ�ࡾ��Ұ��λʱ��");
		System.out.printf("��ѡ��%s�����Ҵ����ٻ�ʦ�����ǡ�%s��\n",libai.getName(),libai.getSkill());
		System.out.printf("ѡ��󴥷�Ӣ��̨�ʣ�%s\n",libai.getDialogue());
		System.out.println("-----------------------------------------------");
		game.setStrategy(new StaregyMachaoJipao());    //�����Ķ���ʹ�ò�����
		System.out.println("�����ʣ�ࡾսʿ/̹�ˡ�λʱ��");
		System.out.printf("��ѡ��%s�����Ҵ����ٻ�ʦ�����ǡ�%s��\n",machao.getName(),machao.getSkill());
		System.out.printf("ѡ��󴥷�Ӣ��̨�ʣ�%s\n",machao.getDialogue());
		System.out.println("-----------------------------------------------");
		game.setStrategy(new StaregyMingshiyinZhiliao());    //�����Ķ���ʹ�ò�����
		System.out.println("�����ʣ�ࡾ������λʱ��");
		System.out.printf("��ѡ��%s�����Ҵ����ٻ�ʦ�����ǡ�%s��\n",mingshiyin.getName(),mingshiyin.getSkill());
		System.out.printf("ѡ��󴥷�Ӣ��̨�ʣ�%s\n",mingshiyin.getDialogue());
	    }

	}
	
	class Hero{
		String name,skill,dialogue;
		public void setName(String s){
			name=s;
		}
		public void setSkill(String t){
			skill=t;
		}
		public void setDialogue(String v){
			dialogue=v;
		}
		public String getDialogue(){
			return dialogue;
		}
		public String getName(){
			return name;
		}
		public String getSkill(){
			return skill;
		}
	}
