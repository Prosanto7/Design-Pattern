
package AbstractFactoryPattern;

public class FactoryCreator
{
    AbstractFactory factory;
    
    public static AbstractFactory create(String type)
    {
        if(type.equalsIgnoreCase("Country"))
            return new CountryFactory();
        
        if(type.equalsIgnoreCase("Mobile"))
            return new MobileFactory();
        
        return null;
    }
    
}
