package com.capgemini.quiz.day5;

interface inters {
	void f();
}

class Circle implements inters {
	
	public void f() {	
		System.out.println("Interface");
	}
	public void c() {
		System.out.println("class");
	}
}
 class Question5 {

	public static void main(String[] args) {
		
		Question5 obj = new Question5();
		obj.f();	
	}
}