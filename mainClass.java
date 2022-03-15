
public class mainClass 
{
	public static void main(String[] args)
	{
		Notice notice = new Notice();
		
		Person studentA = new Student("Alif");
		Person studentB = new Student("Joy");
		Person studentC = new Student("Tahmid");
		
		studentA.subscribe(notice);
		studentC.subscribe(notice);
				
	    notice.update("Tomorrow is holiday");
		
	}
}
