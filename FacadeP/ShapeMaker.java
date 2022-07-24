package FacadeP;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape triangle;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        triangle = new Triangle();
    }

    public void makeCircle() {
        circle.draw();
    }

    public void makeRectangle() {
        rectangle.draw();
    }

    public void makeTriangle() {
        triangle.draw();
    }

}
