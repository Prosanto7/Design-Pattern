package MediatorPattern;

import java.util.List;
import java.util.ArrayList;

public class AirTrafficController 
{
	public List<AirPlane> flights;
	public List<Runway> runways;
	
	public AirTrafficController()
	{
		flights = new ArrayList<AirPlane>();
		runways = new ArrayList<Runway>();
	}
	
	public void registerAirplane(AirPlane a)
	{
		this.flights.add(a);
		a.connectATC(this);
	}
	
	public void registerRunway(Runway r)
	{
		this.runways.add(r);
	}
	
	public Runway suggestRunway()
	{
		for(Runway runway: this.runways)
		{
			if(runway.getAvailability())
			{
				return runway;
			}
		}
		
		return null;
	}
	
	public boolean isLandingOkay()
	{
		boolean isOkay = true;
		//Business Logic
		return isOkay;
	}
	
}
