package com.capgemini.quiz.day5;

class T {
	public T() {
		System.out.println("1");
		new T(10);
		System.out.println("5");
	}

	public T(int a) {
		System.out.println("2");
		new T(10, 15);
		System.out.println("4");

	}

	public T(int a, int b) {
		System.out.println("3");
	}
}

class Question9 {
	public static void main(String[] args) {
		Question9 q = new Question9();
	}
}