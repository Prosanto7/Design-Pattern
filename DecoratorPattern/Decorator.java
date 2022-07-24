package DecoratorPattern;

public abstract class Decorator implements Icecream
{
    private Icecream icecream;
    Decorator(Icecream icecream)
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
class wafer extends Decorator
{

    public wafer(Icecream icecream) {
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