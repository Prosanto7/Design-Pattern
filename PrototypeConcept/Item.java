package PrototypeConcept;

public class Item implements CopyShop{
	private String name;
	private int price;
	
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return "Name "+name+"\nPrice "+price+"\n";
	}

	@Override
	public Object getClone() {
		return new Item(this.name, this.price);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
