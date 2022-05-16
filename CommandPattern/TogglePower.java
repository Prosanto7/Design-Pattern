package CommandPattern;

public class TogglePower implements Command
{
	AirCondition ac;
	
	public TogglePower(AirCondition ac) 
	{
		this.ac = ac;
	}
	
	@Override
	public void execute() 
	{
		this.ac.switch_toggle();
		
	}
}
