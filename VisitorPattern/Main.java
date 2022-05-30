package VisitorPattern;

import java.util.*;

public class Main {
	
	public static List<Visitable> items = new ArrayList<>();
	
	public static void addItems(Visitor visitor) {
		for (Visitable visitable : items) {
			visitable.accept(visitor);
		}
	}
	
	public static void main(String[] args) {
		Visitable book1 = new Book(400, 2);
		Visitable book2 = new Book(100, 2);
		Visitable fruit = new Fruit(800, 3.5);
		Visitable laptop = new Laptop(90000, 1);
		
		items.add(book1);
		items.add(book2);
		items.add(fruit);
		items.add(laptop);
			
		Visitor visitor = new NoakhaliVisitor();
		addItems(visitor);
		System.out.println("Delivery "+visitor.getDeliveryPrice());
		System.out.println("Total Price "+visitor.getPayableAmount());
		
	}
}
