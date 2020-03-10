package com.capgemini.quiz.day3;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Derived d = new Derived();
		System.out.println(d.getdata());
	}
}

class Base {
	private int data;

	public Base() {
		data = 5;
	}

	public int getdata() {
		return this.getdata();
	}

}

class Derived extends Base {

	private int data;

	public Derived() {
		data = 6;

	}
	private int getdata() {
		return data;
	}

}
