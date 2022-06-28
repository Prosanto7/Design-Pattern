package BuilderPattern;

public class Veg implements FoodService{
    @Override
    public void appetizer() {
        System.out.println("Appetizer of Veg Manu");
    }

    @Override
    public void mainCourse() {
        System.out.println("Main Course of Veg Manu");
    }

    @Override
    public void drinks() {
        System.out.println("Drinks of Veg Manu");
    }

    @Override
    public void desert() {
        System.out.println("Desert of Veg Manu");
    }
}
