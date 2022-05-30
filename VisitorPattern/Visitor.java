package VisitorPattern;

public interface Visitor {
	public void visit(Book book);
	public void visit(Fruit fruit);
	public void visit(Laptop laptop);
	public double getPayableAmount();
	public double getDeliveryPrice();
}

class NoakhaliVisitor implements Visitor{
	private double payableAmount = 0.0;
	private double totalDeliveryPrice = 0.0;

	@Override
	public void visit(Book book) {
		payableAmount += book.getUnit() * book.getPrice();
		if (book.getPrice() < 200) {
			totalDeliveryPrice += book.getUnit() * 10.0;
			payableAmount += book.getUnit() * 10.0;
		}
		
	}

	@Override
	public void visit(Fruit fruit) {
		payableAmount += fruit.getVolume() * fruit.getPrice();
		if (fruit.getPrice() < 500) {
			totalDeliveryPrice += fruit.getVolume() * 5.0;
			payableAmount += fruit.getVolume() * 5.0;
		}
	}

	@Override
	public void visit(Laptop laptop) {
		payableAmount += laptop.getUnit() * laptop.getPrice();
		if (laptop.getPrice() < 70000) {
			totalDeliveryPrice += laptop.getUnit() * 500.0;
			payableAmount += laptop.getUnit() * 500.0;
		}
	}
	
	public double getPayableAmount() {
		return payableAmount;
	}
	
	public double getDeliveryPrice() {
		return totalDeliveryPrice;
	}
	
}

class DhakaVisitor implements Visitor{
	private double payableAmount = 0.0;
	private double totalDeliveryPrice = 0.0;

	@Override
	public void visit(Book book) {
		payableAmount += book.getUnit() * book.getPrice();
		if (book.getPrice() < 700) {
			totalDeliveryPrice += book.getUnit() * 15.0;
			payableAmount += book.getUnit() * 15.0;
		}
		
	}

	@Override
	public void visit(Fruit fruit) {
		payableAmount += fruit.getVolume() * fruit.getPrice();
		if (fruit.getPrice() < 1500) {
			totalDeliveryPrice += fruit.getVolume() * 7.0;
			payableAmount += fruit.getVolume() * 7.0;
		}
	}

	@Override
	public void visit(Laptop laptop) {
		payableAmount += laptop.getUnit() * laptop.getPrice();
		if (laptop.getPrice() < 70000) {
			totalDeliveryPrice += laptop.getUnit() * 800.0;
			payableAmount += laptop.getUnit() * 800.0;
		}
	}
	
	public double getPayableAmount() {
		return payableAmount;
	}
	
	public double getDeliveryPrice() {
		return totalDeliveryPrice;
	}
	
}