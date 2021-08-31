package angle_adapter;
/*
         ������Application   :   main���� 
 */
import angle_adapter.Enemy;
import angle_adapter.HeroYuange;
import angle_adapter.KuileiOfYuange;
import angle_adapter.TargetHero;
import angle_adapter.Yuange;

public class Application {

	public static void main(String[] args) {
		   TargetHero enemy;                         //Ŀ��ӿڣ��з���ģ��Ӣ�ۣ�
		   Enemy makeboluo=new Enemy();              //��ģ��Ӣ�ۣ���ɲ���
	       enemy=makeboluo;                          //ԭ�����ڱ�ģ��Ӣ����ɲ��޵ľ���̨��
	       System.out.println("��׼��Ӣ�ۼ�������̨�ʣ�");
	       enemy.beenLearntFromAnEnemyHero();     //��ͨ��������ʼϴ�·�
	       System.out.println("-----------------------------------------------");
	       Yuange yuange=new Yuange();               //Ԫ����Ҫģ������Ӣ�ۼ������̨��
	       KuileiOfYuange kuilei=new KuileiOfYuange(yuange);//Ԫ�費��ֱ��ģ�£���Ҫ������������������
	       enemy=kuilei;                          //Ԫ��Ŀ���ģ�µз�Ӣ����ɲ��޼������̨��
	       System.out.println("��Ԫ�����αװ���Ӣ�ۼ�������̨�ʣ�");
	       yuange.learnFromAnEnemyHero();     //Ԫ�����ʵ��ԭ����������Ӣ�۵�̨��
	    }
	}

	class Enemy implements TargetHero{    //ԭ������Ŀ��Ӣ�ۡ���ɲ��ޡ��ľ���̨��
	    String name;
	    Enemy(){
	       name="��ɲ���";
	    }
	    Enemy(String s){
	       name=s;
	    }
	    public void beenLearntFromAnEnemyHero(){
	       dialogue();
	    }
	    public void dialogue(){
	       System.out.println(name+"�����粻ֻ����ǰ�Ĺ��ң�����ʫ��Զ��");
	    }
	}
	
	class Yuange implements HeroYuange{    //Ԫ���ھ��ڿ���ʵ��ԭ����������Ӣ�۵�̨��
	    String name;
	    Yuange(){
	       name="��Ԫ�衿��ɲ���";
	    }
	    Yuange(String s){
	       name=s;
	    }
	    public void learnFromAnEnemyHero(){
	       simulateDialogue();
	    }
		public void simulateDialogue(){
	       System.out.println(name+"�����粻ֻ����ǰ�Ĺ��ң�����ʫ��Զ��");
	    }
	}
