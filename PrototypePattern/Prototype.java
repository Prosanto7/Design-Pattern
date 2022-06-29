
package PrototypePattern;

import java.util.ArrayList;

enum category 
{toy, grocery,jewellery,clothing};

enum color
{blue,green,black,red};

public class Prototype implements MakeClone
{
    String Id;
    int number;
    int floor;
    private category category;
    private color color;
    private ArrayList<type> items;
    
    
    Prototype(String Id,int number,int floor,category category,color color)
    {
        this.Id=Id;
        this.number=number;
        this.color=color;
        this.category=category;
        this.floor=floor;
        items=new<type> ArrayList();
             
    }
    public void Setcolor(color color)
    {
        this.color=color;
    }
    public void addItems(type type)
    {
        items.add(type);
    }

    @Override
    public Prototype clone ()
    {
       Prototype p = new Prototype(this.Id, this.number, this.floor, this.category, this.color);
       
       for(type e:items)
       {
           p.addItems(e.clone());
       }
       return p;
    }
    public String  printlist()
    { 
        String output="";
        for(type e:items)
        {
            output += e.name +" " +e.price;
        }
        
    
        return output; 
    }
    public void update(String str)
    {
        for(type e:items)
        {
            if(e.name.equalsIgnoreCase(str))
            {
                e.price=20;
            }
        }
    }
    public String toString()
    {
        return "Id: "+this.Id+" Number: "+this.number+" Floor: "+this.floor+" Color: "+this.color+" Category: "+this.category+" Items:"+printlist();
    }
    
    
}
