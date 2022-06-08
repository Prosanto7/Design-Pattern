package Revision;

public class Main {
	public static void main(String[] args) {
		Shop shop = new Shop("1010", 5, 10);
		shop.setCategory(Category.Grocery);
		shop.setColor(Color.Blue);
		
		Shop shop2 = shop.getClone();
		shop.setColor(Color.Red);
		
		System.out.println(shop);
		System.out.println(shop2);
	}
}
