package com.capgemini.quiz.day3;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base b=new D();
		System.out.println(b.mul(data));

	}

}

class B{
	private int mul(int data) {
		{
			return data*5;
		}
	}
}
 
class D extends B {
	private static int data;
	public D()
	{
		data=25;
	}
}