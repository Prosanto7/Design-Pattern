package DecoratorP;

public class Main {
    public static void main(String[] args) {
        Decorator iceCream = new Chocolate(new Wafer(new Vanilla()));
        System.out.println(iceCream.getPrice());
        System.out.println(iceCream.prepare());
    }
}
