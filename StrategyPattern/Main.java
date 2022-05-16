
package StrategyPattern;

public class Main 
{
    public static void main(String[] args) 
    {
        Context context;

        context = new Context(new operationAdd());
        System.out.println(context.execute(3, 4));

        context = new Context(new operationMul());
        System.out.println(context.execute(3, 4));

        context = new Context(new operationSub());
        System.out.println(context.execute(3, 4));
    }
}
