package MementoPattern;

public class Main 
{
	public static void main(String[] args)
	{
		Editor e = new Editor();
		e.setText("My Name");
		CareTaker c = new CareTaker();
		c.addMemento(new Memento(e));
		e.setText(" is Joy");
		c.addMemento(new Memento(e));
		e.setColor("Red");
		c.addMemento(new Memento(e));
		
		//System.out.println(e.getState());
		
		c.getMementos();
		
	}
}
