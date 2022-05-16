package ObserverPattern;

public class Student extends Person
{
	public Student(String name)
	{
		this.name = name;
	}
	
	public void notify(String str)
	{
		System.out.println(this.name+" Notify Via Mail: "+str);
	}
}
