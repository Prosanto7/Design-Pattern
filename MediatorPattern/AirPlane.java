package MediatorPattern;

public class AirPlane implements Command
{
	private String id;
	private AirTrafficController atc;
	
	public AirPlane(String id)
	{
		this.id = id;
	}
	
	@Override
	public void takeoff() 
	{	
		//Business Logic
		System.out.println("Airplane Has Taken Off");	
	}

	@Override
	public void land() 
	{
		//Business Logic
		System.out.println("Airplane "+id+" Has Been Landed");		
	}
	
	public Runway requestRunway()
	{
		return atc.suggestRunway();
	}
	
	public void connectATC(AirTrafficController atc)
	{
		this.atc = atc;
	}

}
