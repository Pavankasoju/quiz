package com.capgemini.assignments.day1;

public class Question5 {

	public static int palindrome(int num) {
		int temp = num, reminder = 0, reverse = 0;
		while (num > 0) {
			reminder = num % 10;
			reverse = reverse * 10 + reminder;
			num = num / 10;
		}
		if (reverse == temp)
			System.out.println("the number is palindrome");
		else
			System.out.println("given number is not palindrome");
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		palindrome(52525);

	}
}
