package com.capgemini.assignments.day1;

public class Question1 {

	public static int circumference(int diameter) {
		double pie = 3.17;
		int radius = diameter / 2;
		System.out.println(2 * pie * radius);
		return radius;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circumference(30);

	}

}
