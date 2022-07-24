package BridgeP;

public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        redCircle.drawShape();

        Shape blueCircle = new Circle(new Blue());
        blueCircle.drawShape();

        Shape blueRectangle = new Rectangle (new Blue());
        blueRectangle.drawShape();
    }
}
