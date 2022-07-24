package DecoratorPattern;

public class Vanila implements Icecream
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
