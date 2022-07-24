package DecoratorPattern;

public abstract class Decorator implements IceCream
{
    private IceCream icecream;
    Decorator(IceCream icecream)
    {
        this.icecream=icecream;
        
    }
   
    public  String prepare()
    {
        return icecream.prepare();
    }
    
    public  int getPrice()
    {
        return icecream.getPrice();
    }
}
class Wafer extends Decorator
{

    public Wafer(IceCream icecream) {
        super(icecream);
    }
    
    @Override
    public String prepare() {
        return super.prepare()+" wafer";
    }

    @Override
    public int getPrice() {
        return super.getPrice()+50;
    }

   
}