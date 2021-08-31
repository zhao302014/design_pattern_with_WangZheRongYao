package angle_command;

public class ConcreteCommandRetreat implements Command{
	TeammateRequest3 requests3;
	ConcreteCommandRetreat(TeammateRequest3 requests3)
	{
		this.requests3=requests3;
	}
	public void execute(){
		requests3.retreat();
	}

}
