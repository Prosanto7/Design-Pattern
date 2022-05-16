package MediatorPattern;

public class Runway implements Command
{
	public String id;
	public boolean availabe = true;
	
	public Runway(String id)
	{
		this.id = id;
	}
	
	@Override
	public void takeoff() 
	{	
		availabe = true;
		System.out.println("Runway "+id+" has been Free");
	}

	@Override
	public void land() 
	{
		availabe = false;
		System.out.println("Runway "+id+" has been accumolated");
	}
	
	public boolean getAvailability()
	{
		return availabe;
	}
	
	public String toString()
	{
		return "Runway "+this.id+" is "+this.availabe;
	}
}
