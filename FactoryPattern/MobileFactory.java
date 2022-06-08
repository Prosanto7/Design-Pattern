package FactoryPattern;

public class MobileFactory {
	public static Mobile createMobile(String company) {
		Mobile mobile = null;
		if (company.equals("Nokia")) {
			mobile = new Nokia();
		} else if (company.equals("Samsung")) {
			mobile = new Samsung();
		} else if (company.equals("IPhone")) {
			mobile = new IPhone();
		}
		return mobile;
	}

}
