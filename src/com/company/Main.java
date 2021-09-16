package com.company;

public class Main
{
    public static void main(String[] args)
    {
        for (int n = 1; n < 21; n++)
        {
            System.out.println (sumUpTo(n));
        }
    }

    static int sumUpTo (int n)
    {
        int sum = (n * (n + 1))/2;
        return sum;
    }
}
