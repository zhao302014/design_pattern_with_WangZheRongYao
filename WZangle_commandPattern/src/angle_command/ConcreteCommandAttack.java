package angle_command;

public class ConcreteCommandAttack implements Command{
	TeammateRequest1 requests1;
	ConcreteCommandAttack(TeammateRequest1 requests1)
	{
		this.requests1=requests1;
	}
	public void execute(){
		requests1.attack();
	}

}
