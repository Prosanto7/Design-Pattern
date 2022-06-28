
package ChainOfResponsibilityPattern;

public class CaptainEmailProcessor extends EmailProcessor
{
    EmailProcessor ep;
    int chain=0;
    CaptainEmailProcessor()
    {
        
    }
    CaptainEmailProcessor(EmailProcessor ep)
    {
        this.ep=ep;
        this.chain=1;
    }

    @Override
    public void processEmail(Email e) 
    {
        if(e.priority == 1)
        {
            System.out.println("Email "+e.number+" is processes by captain");
            
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
