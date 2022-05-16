package MementoPattern;

public class Memento 
{
	private Editor e;
	
	public Memento(Editor e)
	{
		this.e = e.clone();
	}
	
	public String getState()
	{
		return e.getState();
	}
	
	public Editor getEditor()
	{
		return this.e;
	}
}
