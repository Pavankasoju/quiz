package com.capgemini.quiz.day3;

public class Question99 {
	public static void main(String[] args)
{
	Person p=new Kid();
	p.whoare();
	p.whoareyou();

}
}

class Person
{
	private void who()
	{
		System.out.println("who method");
	}
	
	public static void whoare()
	{
		System.out.println("whoare method");
	}
	
	public void whoareyou()
	{
		who();
		System.out.println("whoareyou method");
	}
}

class Kid extends Person{
	private void who()
	{
		System.out.println("kid method");
	}
	
	
	
	public void whoareyou()
	{
		who();
		System.out.println("kid areyou method");
	}	
}
