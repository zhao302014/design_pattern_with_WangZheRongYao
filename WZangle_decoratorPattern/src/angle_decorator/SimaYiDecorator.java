package angle_decorator;
/*
           ��ɫ4������װ�� 
*/
import angle_decorator.Hero;
import angle_decorator.Decorator;

public class SimaYiDecorator extends Decorator{
	
	public final double PiFuAddAbilityPower=10;  //���ϡ������ʦ��Ƥ����ķ�������+10���˺�
	
	SimaYiDecorator(Hero hero){
		super(hero);
	}
	
	public double attribute1(){
		double abilityPower=0;
		abilityPower=hero.attribute1()+eleAttribute1();   
		//ί�б�װ����hero����attribute1()��Ȼ���ٵ���eleattribute1()
		return abilityPower;
	}
	
	public double eleAttribute1(){             //װ��������ӵķ���eleAttribute1()
		return PiFuAddAbilityPower;
	}

	@Override
	public double attribute2() {
		// TODO �Զ����ɵķ������
		return 0;
	}

	@Override
	public double attribute3() {
		// TODO �Զ����ɵķ������
		return 0;
	}

	@Override
	public double attribute4() {
		// TODO �Զ����ɵķ������
		return 0;
	}
}
