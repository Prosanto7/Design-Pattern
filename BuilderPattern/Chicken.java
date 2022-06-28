package BuilderPattern;

public class Chicken implements FoodService{
    @Override
    public void appetizer() {
        System.out.println("Appetizer of Chicken Manu");
    }

    @Override
    public void mainCourse() {
        System.out.println("Main Course of Chicken Manu");
    }

    @Override
    public void drinks() {
        System.out.println("Drinks of Chicken Manu");
    }

    @Override
    public void desert() {
        System.out.println("Desert of Chicken Manu");
    }
}
