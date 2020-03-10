package com.capgemini.quiz.day3;

public class Question2 {

	
	static int fun() { 
		int x=0;    //variable can not be static
		return ++x;  //when writing return method should be specific data type
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fun());
		

	}
	
	

}
