package com.capgemini.quiz.day4;

class Profile {
	/*private*/ Profile(int i) // we cannot call private from another class
	{
		System.out.println(i);
	}
	
	public Profile() {
		System.out.println(10);
		
	}
	
	void details() {
		System.out.println(" deytauhs");
	}
}

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Profile p=new Profile(50);
		Profile p1=new Profile();
		p1.details();

	}

}
