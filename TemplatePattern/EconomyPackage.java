package TemplatePattern;

public class EconomyPackage extends TourPackage {

	@Override
	protected void transport() {
		System.out.println("Travelled By Bus");	
	}

	@Override
	protected void accomodation() {
		System.out.println("Residence in 3 Star Hotel");
	}

	@Override
	protected void foodFacility() {
		System.out.println("Lunch");
	}

}
