package DecoratorPattern;

public class Main 
{
    public static void main(String[]args)
    {
        Icecream obj= new wafer(new wafer(new Vanila()));
        System.out.println(obj.prepare());
        System.out.println(obj.getPrice());
        
    }
    
}
