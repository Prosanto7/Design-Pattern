

package StrategyPattern;

public class operationAdd implements Strategy
{
    @Override
    public int doOperation(int a, int b){
         return a+b;
    }
}
