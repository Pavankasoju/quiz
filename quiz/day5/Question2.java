package com.capgemini.quiz.day5;

class E 
{
    public int i;
    private int j;
}    
class W extends E 
{
    void display() 
    {
        super.j = super.i + 1;
        System.out.println(super.i + " " + super.j);
    }
}    
public class Question2 
{
    public static void main(String args[])
    {
        W obj = new W();
        obj.i=1;
        obj.j=2;   
        obj.display();     
    }
}