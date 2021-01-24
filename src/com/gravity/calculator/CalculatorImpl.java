package com.gravity.calculator;

class CalculatorImpl implements CalculatorDesign {
    @Override
    public int add(int a, int b)
    {
        return  a+b;
    }
    @Override
    public int sub(int a,int b)
    {
        return a-b;
    }
    @Override
    public int mul(int a,int b)
    {
        return a*b;
    }
    @Override
    public int div(int a,int b)
    {
        try {
            return a / b;
        }
        catch (Exception e)
        {
            return -1;
        }
    }
}
