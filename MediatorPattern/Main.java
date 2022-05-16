package MediatorPattern;

public class Main
{
	public static void main(String[] args)
	{
		AirPlane a1 = new AirPlane("ABC");
		AirPlane a2 = new AirPlane("BCD");
		AirPlane a3 = new AirPlane("CDE");

		
		Runway r1 = new Runway("r1");
		Runway r2 = new Runway("r2");
		Runway r3 = new Runway("r3");
		Runway r4 = new Runway("r4");
		Runway r5 = new Runway("r5");
		
		AirTrafficController atc = new AirTrafficController();
		atc.registerAirplane(a1);
		atc.registerAirplane(a2);
		atc.registerAirplane(a3);
		
		atc.registerRunway(r1);
		atc.registerRunway(r2);
		atc.registerRunway(r3);
		atc.registerRunway(r4);
		atc.registerRunway(r5);
		
		Runway r = a1.requestRunway();
		FlightLanding fl = new FlightLanding(a1,r);
		fl.execute();
		
		r = a2.requestRunway();
		fl = new FlightLanding(a2,r);
		fl.execute();
		
	}
}
