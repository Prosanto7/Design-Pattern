package TemplatePattern;

public class BusinessPackage extends TourPackage {

	@Override
	protected void transport() {
		System.out.println("Travelled By Air");	
	}

	@Override
	protected void accomodation() {
		System.out.println("Residence in 5 Star Hotel");
	}

	@Override
	protected void foodFacility() {
		System.out.println("Breakfast - Lunch - Dinner");
	}

}