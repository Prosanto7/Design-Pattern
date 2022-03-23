package Problem3;

public class IncreaseTemperature implements Command
{
	AirCondition ac;
	
	public IncreaseTemperature(AirCondition ac) 
	{
		this.ac = ac;
	}
	
	@Override
	public void execute() 
	{
		this.ac.increaseTemperature();
		
	}
}


