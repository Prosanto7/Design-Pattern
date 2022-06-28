
package AbstractFactoryPattern;

public abstract class AbstractFactory
{
    /**
     *
     * @return
     */
    Mobile m = null;
    Country c = null;
    public abstract Country createCountry(String str);
    public abstract Mobile createMobile(String str);
    
}
