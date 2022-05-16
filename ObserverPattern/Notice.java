package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Notice 
{
	private List<Person> subscribers = new ArrayList<>();
	
	public void update(String str)
	{
	    for (Person p: getSubscribers())
	    {
	    	p.notify(str);
	    }
	}
	
    public void attach(Person p)
    {
    	subscribers.add(p);
    }
	
    public void detach(Person p)
    {
    	subscribers.remove(p);
    }
	

	public List<Person> getSubscribers() 
	{
		return subscribers;
	}

	public void setPersonList(List<Person> subscribers)
	{
		this.subscribers = subscribers;
	}
	
	
}
