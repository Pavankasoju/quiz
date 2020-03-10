package com.capgemini.quiz.day3;



class Derived {
	
	public void getdetails() {
		System.out.println("derived class");
	}
	
}

class Test extends Derived{
	
	public void getdetails() {
		System.out.println("test class");
		super.getdetails();
	}
}

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Derived d = new Test();
		d.getdetails();
		
		
	}

}
