package AbstractFactoryPattern;

public class LocationFactory {
	public static Country createLocation(String countryName) {
		Country country = null;
		if (countryName.equals("Bangladesh")) {
			country = new Bangladesh();
		} else if (countryName.equals("India")) {
			country = new India();
		} else if (countryName.equals("China")) {
			country = new China();
		}
		return country;
	}
}
