package StrategyPattern;

public class operationMul implements Strategy
{
    @Override
    public int doOperation(int a, int b){
         return a*b;
    }
}