package com.capgemini.quiz.day3;

public class Question8 {
	
	public static void main(String[] args) {
		new Test2(5);
		
	}

}

class Test1{
	Test1(int x){
		System.out.println("test1 = "+x);
	}
}

class Test2{
	
	Test1 t1=new Test1(10);
	
	Test2(int i){
		new Test1(i);
		
	}
}


