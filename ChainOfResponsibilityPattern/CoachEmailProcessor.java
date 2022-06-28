
package ChainOfResponsibilityPattern;

public class CoachEmailProcessor extends EmailProcessor 
{
    EmailProcessor ep;
    int chain =0;
    CoachEmailProcessor(EmailProcessor ep)
    {
        this.ep=ep;
        chain=1;
    }
    CoachEmailProcessor()
    {
        
    }
    
    @Override
    public void processEmail(Email e) 
    {
        if(e.priority == 2)
        {
            System.out.println("Email "+e.number+" is processes by coach");
        }
        else
    {
        if(chain == 1)
        {
        
        
        ep.processEmail(e);
        }
        else
       {
           System.out.println("Email "+e.number+" is not processes by captain");
       }
    }
    }
}
