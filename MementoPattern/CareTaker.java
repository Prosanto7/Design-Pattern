package MementoPattern;

import java.util.List;
import java.util.ArrayList;

public class CareTaker 
{
	List<Memento> mementoList;
	
	public CareTaker()
	{
		mementoList = new ArrayList<Memento>();
	}
	
	public void addMemento(Memento m)
	{
		mementoList.add(m);
	}
	
	public String getLastMemento()
	{
		int index = mementoList.size()-1;
		return mementoList.get(index).getState();
	}
	
	public void getMementos()
	{
		for(Memento m : mementoList)
		{
			System.out.println(m.getState());
		}
	}
	
}
