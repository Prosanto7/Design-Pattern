
package ChainOfResponsibilityPattern;

public class Main 
{
    public static void main(String[]args)
    {
        Email a=new Email(121,"yes",Priority.Medium);
        
        EmailProcessor ep=new BoardEmailProcessor();
        
          EmailProcessor ep1=new CaptainEmailProcessor();
          EmailProcessor ep2=new CoachEmailProcessor(new CaptainEmailProcessor(new BoardEmailProcessor() ));
          
        //ep.processEmail(a);
        ep1.processEmail(a);
        ep2.processEmail(a);
        
        
       // EmailProcessor ep1=new CoachEmailProcessor() ;
       
        
    }
    
}
