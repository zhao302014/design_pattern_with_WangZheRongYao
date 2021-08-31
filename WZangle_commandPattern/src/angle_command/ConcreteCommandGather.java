package angle_command;

public class ConcreteCommandGather implements Command{
	TeammateRequest2 requests2;
	ConcreteCommandGather(TeammateRequest2 requests2)
	{
		this.requests2=requests2;
	}
	public void execute(){
		requests2.gather();
	}

}
