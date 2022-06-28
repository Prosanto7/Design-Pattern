
package AbstractFactoryPattern;

public abstract class Country {
    public abstract String getName();
    public abstract double getPrice();
    
    public String toString()
    {
        return "Country name :"+this.getName()+" Price: "+this.getPrice();
    }
}

class BD extends Country {
    @Override
    public String getName() {
        return "Bangladesh";
    }
    @Override
    public double getPrice() {
        return 12000.5;
    }
}

class India extends Country {
    @Override
    public String getName() {
        return "India";
        
    }
    @Override
    public double getPrice() {
        return 8000.5;
        
    }
}
