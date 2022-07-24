package DecoratorPattern;

public class Main 
{
    public static void main(String[]args)
    {
        IceCream obj= new Wafer(new Wafer(new Vanila()));
        System.out.println(obj.prepare());
        System.out.println(obj.getPrice());
        
    }
    
}
