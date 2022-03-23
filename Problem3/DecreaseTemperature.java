package Problem3;

public class DecreaseTemperature implements Command
{
	AirCondition ac;
	
	public DecreaseTemperature(AirCondition ac) 
	{
		this.ac = ac;
	}
	
	@Override
	public void execute() 
	{
		this.ac.decreaseTemperature();
		
	}
}
