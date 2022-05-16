package CommandPattern;

public class AirCondition 
{
	private boolean on;
	private int temperature;
	
	public AirCondition()
	{
		this.on = false;
		this.temperature = 18;
	}
	
	public void switch_toggle()
	{
		this.on = !this.on;
	}
	
	public void increaseTemperature()
	{
		if(this.temperature == 30) 
		{
			return;
		}
		
		this.temperature = this.temperature + 1;
	}
	
	public void decreaseTemperature()
	{
		if(this.temperature == 10) 
		{
			return;
		}
		
		this.temperature = this.temperature - 1;
	}
	
	public String toString()
	{
		return "Power Status "+this.on+" Temperature "+this.temperature;
	}
	
	
}
