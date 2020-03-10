package com.capgemini.quiz.day4;

public class Question4 {
	
	public static void main(String[] args) {
		
		int i=1,j=10;
		
		do {
			if(i>j)
			{
				break;
			}j--;
		}
		while(++i<5);
		
		System.out.println(i+j);
	}
}




