package CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class Remote 
{
	private Command c;
	private List<Command> listOfCommands = new ArrayList<Command>();
	
	public void setCommand(Command c)
	{
		this.c = c;
	}
	
	public void run()
	{
		c.execute();
	}
	
	public void addCommand(Command command)
	{
		listOfCommands.add(command);
	}
	
	public void runAll()
	{
		for(Command c : listOfCommands)
		{
			c.execute();
		}
		
		listOfCommands.clear();
	}
}
