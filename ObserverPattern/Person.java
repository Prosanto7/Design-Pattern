package ObserverPattern;

public abstract class Person 
{
	protected String name;
	
	public void subscribe(Notice n)
	{
		n.attach(this);
	}
	
	public abstract void notify(String str);
	
	public void unsubscribe(Notice n)
	{
		n.detach(this);
	}
}
