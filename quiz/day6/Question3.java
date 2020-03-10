package com.capgemini.quiz.day6;

public class Question3
{
    static int a;
     
    static
    {
        a = 4;
        System.out.println ("inside static blockn");
        System.out.println ("a = " + a);
    }
     
    Question3()
    {
        System.out.println ("ninside constructorn");
        a = 10;
    }
     
    public static void func()
    {
        a = a + 1;
        System.out.println ("a = " + a);
    }
     
    public static void main(String[] args)
    {
 
        Question3 obj = new Question3();
        obj.func();
 
    }
}
