
package ChainOfResponsibilityPattern;

public class BoardEmailProcessor extends EmailProcessor
{
    EmailProcessor ep;
    
    BoardEmailProcessor(EmailProcessor ep)
    {
        this.ep=ep;
        
    }
    BoardEmailProcessor()
    {
        
    }
    @Override
    public void processEmail(Email e) 
    {
        System.out.println("Email "+e.number+" is processes by board");
        
        
    }
    
    
}
