
package ObserverPattern;

/**
 * 
 * @author IIT Prosanto Deb(ASH1925005M)
 * Problem Statement : We want to implement observer technique.
 * Here We want to send a notice to every student or teacher who has subscribed.
 *
 */

public class mainClass 
{
	public static void main(String[] args)
	{
		Notice notice = new Notice();
		
		Person studentA = new Student("Alif");
		Person teacher = new Teacher("Joy");
		Person studentC = new Student("Tahmid");
		
		studentA.subscribe(notice);
		studentC.subscribe(notice);
				
	    notice.update("Tomorrow is holiday");
		System.out.println();
	    
	    teacher.subscribe(notice);

	    notice.update("Tomorrow is Monday");
		System.out.println();

		studentA.unsubscribe(notice);

		notice.update("New Notice Published");
		System.out.println();
		
	}
}
