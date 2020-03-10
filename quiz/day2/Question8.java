package com.capgemini.quiz.day2;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parameteroised_method q = new Parameteroised_method();
		q.length = 5;
		q.width = 5;
		q.height = 1;
		q.volume(5, 1, 5);
		System.out.println(q.volume);

	}
}

class Parameteroised_method {

	int width;
	int height;
	int length;
	int volume;

	void volume(int height, int length, int width) {

		volume = width / height * length;

	}

}

// a.1 b.5 c.25 d.10