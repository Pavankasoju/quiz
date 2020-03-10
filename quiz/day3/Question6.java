package com.capgemini.quiz.day3;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test111 t=new Test111();
		System.out.println(t.getdata(5, 6,7));

	}

}

    class Test111 {
	private int data=5;
	
	public int getdata()
	{
		return this.data;
	}
	
	public int getdata(int i)
	{
		return (data+1);
	}
	public int getdata(int i,int j,int k)
	{
		return (data+2);
	}
}
