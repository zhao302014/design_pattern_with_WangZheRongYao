package angle_decorator;
/*
��ɫ4������װ�� 
*/

import angle_decorator.Hero;
import angle_decorator.Decorator;

public class SimaYiDecoratorZhuangBei extends Decorator{

	SimaYiDecoratorZhuangBei(Hero hero){
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
	      double attackSpeed=0;
	      attackSpeed=eleAttribute3();  
	      return attackSpeed;
	}
	public double attribute4(){
		  double attackPower=0;
		  attackPower=hero.attribute4()+eleAttribute4();  
		  //ί�б�װ����hero����attribute4()��Ȼ���ٵ���eleattribute4()
		  return attackPower;
		}

	public double eleAttribute1(){             //װ��������ӵķ���
		  double AbilityPower=52;
		  double wushufazhangAbilityPower=140;   //��������ʹ��Ӣ�۷��������ӳ�140���˺�
		  double shishenzhishuAbilityPower=180;   //����֮��ʹ��Ӣ�۷��������ӳ�180���˺�
		  double boxuezhezhinuAbilityPower=240;   //��ѧ��֮ŭʹ��Ӣ�۷��������ӳ�240���˺�
		  double xuwufazhangAbilityPower=240;   //��ѧ��֮ŭʹ��Ӣ�۷��������ӳ�240���˺�
		  AbilityPower= AbilityPower+wushufazhangAbilityPower+shishenzhishuAbilityPower+boxuezhezhinuAbilityPower+xuwufazhangAbilityPower;  
	      return AbilityPower;
	}
	public double eleAttribute2(){             //װ��������ӵķ���
		  double MovementSpeed=587.68;
		  double wushufazhangMovementSpeed=0.08;     //��������ʹ��Ӣ���ƶ��ٶȼӳ�8%
		  MovementSpeed=MovementSpeed*(1+wushufazhangMovementSpeed);  
	      return MovementSpeed;
	}
	public double eleAttribute3(){             //װ��������ӵķ���
		  double AttackSpeed=16;
		  double jisuzhanxueAttackSpeed=0.3;     //����սѥʹ��Ӣ�۹����ٶȼӳ�30%
		  AttackSpeed=AttackSpeed*(1+jisuzhanxueAttackSpeed);
	      return AttackSpeed;
	}
	public double eleAttribute4() {
		  double AttackPower=179; 
		  double mingdaosimingAttackSpeed=1.0;     //������˾��ʹ��Ӣ�۹����ٶȼӳ�1.0%
		  AttackPower=AttackPower*(1+mingdaosimingAttackSpeed);    
		  return AttackPower;
	}
	
}

