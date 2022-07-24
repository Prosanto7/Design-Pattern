package FacadeP;

public interface Shape {
    public void draw();
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle Made");
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Rectangle Made");
    }
}

class Triangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Triangle Made");
    }
}
