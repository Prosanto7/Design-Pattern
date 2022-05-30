package VisitorPattern;

public interface Visitable {
	public void accept(Visitor visitor);
}

class Book implements Visitable{

	private int price;
	private int unit;
	
	public Book(int price, int unit) {
		this.price = price;
		this.unit = unit;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getUnit() {
		return unit;
	}
	
}


class Fruit implements Visitable{

	private int price;
	private double volume;
	
	public Fruit(int price, double volume) {
		this.price = price;
		this.volume = volume;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public int getPrice() {
		return price;
	}
	
	public double getVolume() {
		return volume;
	}
	
}

class Laptop implements Visitable{

	private int price;
	private int unit;
	
	public Laptop(int price, int unit) {
		this.price = price;
		this.unit = unit;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getUnit() {
		return unit;
	}
	
}

