package FactoryPattern;

public abstract class Mobile {
	public abstract String getComapnyName();
	public abstract String display();
	public String toString() {
		return "Company : "+this.getComapnyName()+"\nDisplay : "+this.display();
	}
}

class Nokia extends Mobile{

	@Override
	public String getComapnyName() {
		return "Nokia";
	}

	@Override
	public String display() {
		return "30*50";
	}
	
}

class Samsung extends Mobile{

	@Override
	public String getComapnyName() {
		return "Samsung";
	}

	@Override
	public String display() {
		return "70*50";
	}
	
}

class IPhone extends Mobile{

	@Override
	public String getComapnyName() {
		return "IPhone";
	}

	@Override
	public String display() {
		return "40*50";
	}
	
}