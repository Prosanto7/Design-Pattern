package ObserverPattern;

public class Teacher extends Person
{
	public Teacher(String name)
	{
		this.name = name;
	}
	
	public void notify(String str)
	{
		System.out.println(this.name+" Notify Via SMS: "+str);
	}
}