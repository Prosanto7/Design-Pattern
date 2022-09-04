package AbstractFactoryPatternOnline;

public interface Shape {
    void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle Created");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle Created");
    }
}

class RoundCircle implements Shape {
    @Override
    public void draw() {
        System.out.println("Round Circle Created");
    }
}

class RoundRectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Round Rectangle Created");
    }
}


