package com.capgemini.quiz.day6;

abstract class demo
{
    public int a;
    demo()
    {
        a = 10;
    }
 
    abstract public void set();
     
    abstract final public void get();
 
}
 
public class Question99 extends demo
{
 
    public void set(int a)
    {
        this.a = a;
    }
 
    final public void get()
    {
        System.out.println("a = " + a);
    }
 
    public static void main(String[] args)
    {
    	Question99 obj = new Question99();
        obj.set(20);
        obj.get();
    }
}