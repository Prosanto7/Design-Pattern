package Revision;

public class Main {
	public static void main(String[] args) {
		
		Shop shop = new Shop("1010", 5, 10);
		shop.setCategory(Category.Grocery);
		shop.setColor(Color.Blue);
		shop.addItem(new Item("Chips", 10));
		shop.addItem(new Item("Cold Drinks", 15));
		shop.addItem(new Item("Frech Fry", 70));
		
		Shop shop2 = shop.getClone();
		shop2.setColor(Color.Red);
		shop2.addItem(new Item("Desert", 100));
		
		shop.updatePrice("Cold Drinks", 20);
		
		System.out.println(shop);                                                                   
		System.out.println(shop2);
		//System.out.println(shop);     
	}
}
