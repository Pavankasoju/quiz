package com.capgemini.assignments.day1;

public class Question4 {

	public static int prime(int prime) {
		int count = 0;
		for (int i = 1; i <= 30; i++)
			if (i % prime == 0)
				count++;
		if (count == 2)
			System.out.println("prime number is " + prime);
		System.out.println("this number is not prime " + prime);
		return prime;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		prime(30);
	}

}
