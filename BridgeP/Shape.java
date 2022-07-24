package BridgeP;

public abstract class Shape {

    Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void drawShape();
}

class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void drawShape() {
        System.out.println("Circle with "+color.showColor());
    }
}

class Rectangle extends Shape {

    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void drawShape() {
        System.out.println("Rectangle with "+color.showColor());
    }
}

