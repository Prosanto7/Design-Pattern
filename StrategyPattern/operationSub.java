package StrategyPattern;

public class operationSub implements Strategy
{
    @Override
    public int doOperation(int a, int b){
         return a-b;
    }
}