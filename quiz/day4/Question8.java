package com.capgemini.quiz.day4;

interface A
{
	void cal(int item);
}

 class B  implements A  {
	
	int x;
	public void cal(int item)
	{
		x=item*item;
	}
}
 
 public class Question8
 {
 	public static void main(String[] args) {
 		B b=new B();
 		b.x=0;
 		b.cal(2);
 		System.out.println(b.x);
 		
 		
 	}
 }
