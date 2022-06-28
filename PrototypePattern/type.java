
package PrototypePattern;

public class type
{
    String name;
    int price;
    
    type(String name,int price)
    {
        this.name=name;
        this.price=price;
    }
    
    public type clone()
    {
        return new type(name,price);
    }
}
