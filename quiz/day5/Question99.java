package com.capgemini.quiz.day5;

interface X
{   
	void f();
}
interface Z extends X
{
	void g();
}
 
class C implements Z 
{	
	public void f() {	
		System.out.println("Hello");
	}	
	public void g() {		
		System.out.println("World");
	}   
}

public class Question99 {

	public static void main(String[] args) {
		
		C o = new C();
		o.f();
		o.g();
	}
}