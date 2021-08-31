package angle_decorator;
/*
           ½ÇÉ«3£º×°ÊÎ 
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
