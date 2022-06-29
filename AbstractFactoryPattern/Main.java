
package AbstractFactoryPattern;

public class Main
{
    public static void main(String[]args)
    {
        AbstractFactory factory = FactoryCreator.create("country");
        Country c = factory.createCountry("Bangladesh");
        System.out.println(c);
        
        AbstractFactory factory1 = FactoryCreator.create("Mobile");
        Mobile m = factory1.createMobile("Samsung");
        System.out.println(m);
    }

    
}
