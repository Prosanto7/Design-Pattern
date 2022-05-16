package MementoPattern;

public class Editor
{
	private String text = "";
	private String color = "Black";
	
	public void setText(String text)
	{
		this.text = this.text + text;
	}
	
	public String getText()
	{
		return this.text;
	}
	
	public void setColor(String color)
	{
		this.color = color;
	}
	
	public String getColor()
	{
		return this.color;
	}
	
	public String getState()
	{
		return "Text : "+getText()+" Color :"+getColor();
	}
	
	public Editor clone()
	{
		Editor e  = new Editor();
		e.setColor(this.color);
		e.setText(this.text);
		
		return e;
	}
}
