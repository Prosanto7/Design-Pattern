package AbstractFactoryPatternOnline;

public interface AbstractFactory {
    abstract Shape getShape(String type);
}

class ShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equals("circle")) {
            return new Circle();
        } else {
            return new Rectangle();
        }
    }
}

class RoundedShapeFactory implements AbstractFactory {
    @Override
    public Shape getShape(String type) {
        if (type.equals("circle")) {
            return new RoundCircle();
        } else {
            return new RoundRectangle();
        }
    }
}
