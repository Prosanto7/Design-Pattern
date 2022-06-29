
package AbstractFactoryPattern;

public class CountryFactory extends AbstractFactory {
    @Override
    public Country createCountry(String str) 
    {
        c = null;
        
        if(str.equalsIgnoreCase("Bangladesh"))
        {
            c = new BD();
        }
        if(str.equalsIgnoreCase("India"))
        {
            c = new India();
        }
        return c;
    }

    public Mobile createMobile(String str) 
    {
        m = null;
        return m;
        
    }
    
}
