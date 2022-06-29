
package ChainOfResponsibilityPattern;

public class BoardEmailProcessor implements EmailProcessor
{
    EmailProcessor ep;

    BoardEmailProcessor() {
    }
    
    BoardEmailProcessor(EmailProcessor ep) {
        this.ep = ep;
    }
    @Override
    public void processEmail(Email e) 
    {
        System.out.println("Email "+e.number+" is processes by board");
    }
    
    
}
