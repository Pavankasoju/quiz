package com.capgemini.quiz.day2;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Equal e = new Equal();
		e.x = 5;
		e.y = 5;
		System.out.println(e.isequal());

	}

}

class Equal {
	int x;
	int y;
	boolean isequal()
	{
		return (x == y);
	}
}