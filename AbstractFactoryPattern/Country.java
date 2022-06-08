package AbstractFactoryPattern;

public abstract class Country {
	public abstract String getCountryName();
	public abstract double getImportCost();
	
	public String toString() {
		return "Country Name : "+this.getCountryName()+"\nImport Cost : "+this.getImportCost();
	}
}

class Bangladesh extends Country {

	@Override
	public String getCountryName() {
		return "Bangladesh";
	}

	@Override
	public double getImportCost() {
		return 1000.00;
	}
}

class India extends Country {

	@Override
	public String getCountryName() {
		return "India";
	}

	@Override
	public double getImportCost() {
		return 1500.00;
	}
}

class China extends Country {

	@Override
	public String getCountryName() {
		return "China";
	}

	@Override
	public double getImportCost() {
		return 1800.00;
	}
}

