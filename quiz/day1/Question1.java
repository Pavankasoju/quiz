package com.capgemini.quiz.day1;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loop1:
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=5;j++)
			{
				if(i==3)
				{
					break loop1;
				}
				System.out.println("sample");
			}
		}
	}

}
