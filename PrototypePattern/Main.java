
package PrototypePattern;

public class Main 
{
    public static void main(String[]args)
    {
        Prototype p = new Prototype("01",1,4,category.grocery,color.blue);
        
        p.addItems(new type("joy",4));
        Prototype p1=p.clone();
        p.Setcolor(color.red);
       
        //p.update("joy");
        System.out.println(p);
        System.out.println(p1);
    }
    
}
