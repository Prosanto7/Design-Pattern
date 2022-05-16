package MediatorPattern;

public class FlightTakingOff
{
	public AirPlane flight;
	public Runway runway;
	
	public FlightTakingOff(AirPlane flight,Runway runway)
	{
		this.flight = flight;
		this.runway = runway;
	}
	
	public void execute()
	{
		flight.takeoff();
		runway.takeoff();
	}
}
