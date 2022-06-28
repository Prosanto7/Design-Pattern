package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        new ServiceProvider(new Beef()).serve();
    }
}
