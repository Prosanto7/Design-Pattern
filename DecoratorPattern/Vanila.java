package DecoratorPattern;

public class Vanila implements IceCream
{
    @Override
    public int getPrice() {
        return 100;
    }
    @Override
    public String prepare() {
       return "vanila";
    }
}
