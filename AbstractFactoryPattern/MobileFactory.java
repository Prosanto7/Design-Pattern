/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractFactoryPattern;

public class MobileFactory extends AbstractFactory {

    @Override
    public Country createCountry(String str)
    {
        c=null;
        return c;
    }

    public Mobile createMobile(String str) 
    {
        m = null;
        
        if(str.equalsIgnoreCase("Iphone"))
        {
            m = new iphone();
        }
        if(str.equalsIgnoreCase("Samsung"))
        {
            m = new Samsung();
        }
        return m;
        
    }
    
}
