package MementoPattern;

public class Main 
{
	public static void main(String[] args)
	{
		Editor e = new Editor();
		CareTaker c = new CareTaker();

		e.setText("My Name");
		c.addMemento(new Memento(e));

		e.setText(" is Joy");
		c.addMemento(new Memento(e));

		System.out.println(c.getLastMemento());

		e.setColor("Red");
		c.addMemento(new Memento(e));

		System.out.println(c.getLastMemento());

	}
}
