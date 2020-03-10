package com.capgemini.assignments.day1;

public class Question3 {

	public static int factorial(int factorial) {
		int a = factorial;
		for (int i = factorial - 1; i > 0; i--)

			factorial = factorial * i;

		System.out.println("factorial of " + a + " is " + factorial);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		factorial(5);

	}

}
