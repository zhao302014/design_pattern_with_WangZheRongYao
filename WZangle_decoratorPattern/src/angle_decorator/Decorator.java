package angle_decorator;
/*
           ��ɫ3��װ�� 
*/
import angle_decorator.Hero;

public abstract class Decorator extends Hero{
	protected Hero hero;
	public Decorator(){
		
	}
	public Decorator(Hero hero){
		this.hero=hero;
	}

}
