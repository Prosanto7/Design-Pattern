
package ChainOfResponsibilityPattern;

public class Main 
{
    public static void main(String[]args)
    {
        Email a = new Email(121,"yes",Priority.Low);
        Email b = new Email(123,"yaa", Priority.Medium);
        Email c = new Email(126,"yaa", Priority.High);

        EmailProcessor emailProcessor = new CaptainEmailProcessor(new CoachEmailProcessor(new BoardEmailProcessor()));
        EmailProcessor emailProcessor1 = new CoachEmailProcessor();

        emailProcessor.processEmail(a);
        emailProcessor.processEmail(b);
        emailProcessor.processEmail(c);

        emailProcessor1.processEmail(a);
        emailProcessor1.processEmail(b);
        emailProcessor1.processEmail(c);
        
    }
    
}
