package PrototypeConcept;

import java.util.List;
import java.util.ArrayList;

public class Shop implements CopyShop{
	
	private String ID;
	private int number;
	private int floor;
	private Category category;
	private Color color;
	private List<Item> itemList;
	
	public Shop(String ID, int number, int floor){
		this.ID = ID;
		this.number = number;
		this.floor = floor;
		itemList = new ArrayList<>();
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
	
	public void addItem(Item item) {
		itemList.add(item);
	}
	
	public Shop getClone() {
		Shop shop = new Shop(ID, number, floor);
		shop.setCategory(category);
		shop.setColor(color);
		
		for(Item item : itemList) {
			shop.addItem((Item) item.getClone());
		}
		
		return shop;
	}
	
	public void updatePrice(String name, int price) {
		for (Item item : itemList) {
			if(item.getName().equals(name)) {
				item.setPrice(price);
			}
		}
	}
	
	public String itemListPrint() {
		String output = "";
		for(Item item : itemList) {
			output += item.toString();
		}
		return output;
	}
	
	public String toString() {
		return "ID = "+ID+"\nNumber = "+number+"\nFloor = "+floor+"\nCategory = "+category+"\nColor = "+color+"\n"+"Items\n"+itemListPrint(); 
	}
	
}
