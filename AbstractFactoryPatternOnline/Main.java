package AbstractFactoryPatternOnline;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryCreator.getFactory(true);
        Shape shape = abstractFactory.getShape("circle");
        shape.draw();
    }
}
