package angle_command;

public class PlayerRequests {
	Command command;
	public void setCommand(Command command)
	{
		this.command=command;
	}
	public void startExecute(){
		command.execute();
	}

}
