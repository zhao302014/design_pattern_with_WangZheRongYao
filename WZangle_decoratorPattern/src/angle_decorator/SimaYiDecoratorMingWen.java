package angle_decorator;

/*
      ��ɫ4������װ�� 
*/

import angle_decorator.Hero;
import angle_decorator.Decorator;

public class SimaYiDecoratorMingWen extends Decorator{
	SimaYiDecoratorMingWen(Hero hero){
	      super(hero);
	}

	public double attribute1(){
	    double abilityPower=0;
	    abilityPower=hero.attribute1()+eleAttribute1();  
	    //ί�б�װ����hero����attribute1()��Ȼ���ٵ���eleattribute1()
	    return abilityPower;
	}
	public double attribute2(){
	    double movementSpeed=0;
	    movementSpeed=hero.attribute2()+eleAttribute2();   
	    //ί�б�װ����hero����attribute2()��Ȼ���ٵ���eleattribute2()
	    movementSpeed = (double)(Math.round(movementSpeed*10)/10.0);   //���������롱����С�����1λ
	    return movementSpeed;
	}
	public double attribute3(){
	    double AttackSpeed=0;
	    AttackSpeed=eleAttribute3();  
	    return AttackSpeed;
	}

	public double eleAttribute1(){             //װ��������ӵķ���eleAttribute1()
		double AbilityPower=10;
		double mengyanAbilityPower=4.2;   //1��5����������ʹ��Ӣ�۷��������ӳ�4.2���˺�
		AbilityPower+=mengyanAbilityPower*10;   //10��5���������ʵķ��������ӳ�
	    return AbilityPower;
	}
	public double eleAttribute2(){             //װ��������ӵķ���eleAttribute2()
		double MovementSpeed=370;
		double shoulieMovementSpeed=0.01;     //1��5����������ʹ��Ӣ���ƶ��ٶȼӳ�1.0%
		int i;
		for(i=1;i<=10;i++){
			MovementSpeed=MovementSpeed*(1+shoulieMovementSpeed);    //�ۼӵüӳɺ������
		}
		 //10��5���������Ե����ټӳ�
		return  MovementSpeed;
	}
	public double eleAttribute3(){             //װ��������ӵķ���eleAttribute3()
		double xinyanAttackSpeed=0.6;     //1��5����������ʹ��Ӣ�۹����ٶȼӳ�0.6%
		double shoulieAttackSpeed=1.0;     //1��5����������ʹ��Ӣ�۹����ٶȼӳ�1.0%
		double AttackSpeed=(xinyanAttackSpeed+shoulieAttackSpeed)*10;    //10��5���������ۺ�10��5���������ԵĹ��ټӳ�
	    return AttackSpeed;
	}

	@Override
	public double attribute4() {
		// TODO �Զ����ɵķ������
		return 0;
	}
}



