package Revision;

public class Shop {
	
	private String ID;
	private int number;
	private int floor;
	private Category category;
	private Color color;
	
	public Shop(String ID, int number, int floor){
		this.ID = ID;
		this.number = number;
		this.floor = floor;
	}
	
	public void setCategory(Category category) {
		this.category = category;
	}
	
	public Category getCategory() {
		return category;
	}
	
	public void setColor(Color color) {
		this.color = color;
	}
	
	public Color getColor() {
		return color;
	}
	
	public Shop getClone() {
		Shop shop = new Shop(ID, number, floor);
		shop.setCategory(category);
		shop.setColor(color);
		return shop;
	}
	
	public String toString() {
		return "ID = "+ID+"\nNumber = "+number+"\nFloor = "+floor+"\nCategory = "+category+"\nColor = "+color+"\n"; 
	}
	
}
