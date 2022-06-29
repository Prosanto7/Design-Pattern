
package ChainOfResponsibilityPattern;

public class CoachEmailProcessor implements EmailProcessor
{
    EmailProcessor ep;
    CoachEmailProcessor() {
    }
    CoachEmailProcessor(EmailProcessor ep) {
        this.ep = ep;
    }
    
    @Override
    public void processEmail(Email e) {
        if(e.priority == Priority.Medium) {
            System.out.println("Email "+e.number+" is processes by coach");
        } else if (ep != null) {
            ep.processEmail(e);
        } else {
           System.out.println("Email "+e.number+" is not processes by coach");
       }
    }
}
