
package AbstractFactoryPattern;

public abstract class Mobile
{
    public abstract String getname();
    public abstract String getOS();
    
public String toString()
    {
        return "Mobile brand name :"+this.getname()+" Operarting System: "+this.getOS();
    }    
}

class iphone extends Mobile
{

    @Override
    public String getname() {
       return "Iphone";
    }

    @Override
    public String getOS()
    {
        return "IOS";
        
    }
    
}
class Samsung extends Mobile
{

    @Override
    public String getname() {
       return "Samsung";
    }

    @Override
    public String getOS()
    {
        return "Android";
        
    }
    
}


