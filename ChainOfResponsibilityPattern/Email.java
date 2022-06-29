
package ChainOfResponsibilityPattern;

public class Email 
{
    int number;
    String Msg;
    Priority priority;
    
    Email(int number, String Msg, Priority priority)
    {
        this.number = number;
        this.Msg = Msg;
        this.priority = priority;
    }
}
