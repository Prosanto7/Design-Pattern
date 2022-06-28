package BuilderPattern;

public class ServiceProvider {
    private FoodService foodService;

    public ServiceProvider(FoodService foodService) {
        this.foodService = foodService;
    }

    public void serve() {
        foodService.appetizer();
        foodService.mainCourse();
        foodService.desert();
        foodService.drinks();

        print();
    }
    private void print() {
        if(foodService.getClass().getName().equals("BuilderPattern.Beef")) {
            System.out.printf("%10s %20s","Joy", "Bhowmik");
        }
    }
}
