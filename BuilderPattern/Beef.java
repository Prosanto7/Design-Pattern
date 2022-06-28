package BuilderPattern;

public class Beef implements FoodService{
    @Override
    public void appetizer() {
        System.out.println("Appetizer of Beef Manu");
    }

    @Override
    public void mainCourse() {
        System.out.println("Main Course of Beef Manu");
    }

    @Override
    public void drinks() {
        System.out.println("Drinks of Beef Manu");
    }

    @Override
    public void desert() {
        System.out.println("Desert of Desert Manu");
    }
}
