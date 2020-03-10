package com.capgemini.quiz.day5;

interface inter
{
    int i = 5;
}
 
class Y implements inter 
{
    void f()
    {
    	i = 10;
    	System.out.println("i="+i);
        
    }
}
public class Question1 {

	public static void main(String[] args) {
		
		Y obj = new Y();
		obj.f();	
	}
}