package TemplatePattern;

public abstract class TourPackage {
	/**
	 * This method is final so that any 
	 * child class can not override this
	 * method
	 */
	public final void travel() {
		transport();
		accomodation();
		foodFacility();
	}
	
	protected abstract void transport();
	protected abstract void accomodation();
	protected abstract void foodFacility();
}
