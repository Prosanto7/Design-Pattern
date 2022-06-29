
package ChainOfResponsibilityPattern;

public class CaptainEmailProcessor implements EmailProcessor
{
    EmailProcessor ep;

    CaptainEmailProcessor() {
    }
    CaptainEmailProcessor(EmailProcessor ep) {
        this.ep = ep;
    }

    @Override
    public void processEmail(Email e) 
    {
        if(e.priority == Priority.Low) {
            System.out.println("Email "+e.number+" is processes by captain");
        } else if (e != null) {
            ep.processEmail(e);
        } else {
            System.out.println("Email is not processed");
        }

    }
}
