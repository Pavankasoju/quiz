package com.capgemini.student.project1;

import java.util.Scanner;

public class StudentForm {
	public static void main(String[] args) {
		String name = null;
		int age = 0;
		long num = 0;
		String email = null;
		String address = null;
		System.out.println("enter details");
		System.out.println("===================");
		System.out.println("press 1 to enter your name");
		System.out.println("press 2 to enter your age");
		System.out.println("press 3 to enter your phone number");
		System.out.println("press 4 to enter your email");
		System.out.println("press 5 to enter your address");
		p: for (int i = 1; i > 0; i++) {
			Scanner sc = new Scanner(System.in);
			int j = sc.nextInt();
			switch (j) {
			case 1:
				System.out.println("enter your name");
				Scanner sc1 = new Scanner(System.in);
				name = sc1.nextLine();
				System.out.println("you entered name is: " + name);
				System.out.println("press 2 to enter/change your age");
				System.out.println("press 3 to enter/change your phone number");
				System.out.println("press 4 to enter/change your email");
				System.out.println("press 5 to enter/change your address");
				System.out.println("enter 6 to see your details");
				break;
			case 2:
				System.out.println("enter age");
				age = sc.nextInt();
				System.out.println("you entered age is: " + age);

				System.out.println("press 1 to enter/change your name");
				System.out.println("press 3 to enter/change your phone number");
				System.out.println("press 4 to enter/change your email");
				System.out.println("press 5 to enter/change your address");
				System.out.println("enter 6 to see your details");
				break;
			case 3:
				System.out.println("enter phone number");
				num = sc.nextLong();
				System.out.println("you entered mobile number is: " + num);

				System.out.println("press 1 to enter/change your name");
				System.out.println("press 2 to enter/change your age");
				System.out.println("press 4 to enter/change your email");
				System.out.println("press 5 to enter/change your address");
				System.out.println("enter 6 for to see your details");
				break;
			case 4:
				System.out.println("enter email");
				Scanner sc2 = new Scanner(System.in);
				email = sc2.nextLine();
				System.out.println("you entered email is: " + email);

				System.out.println("press 1 to enter/change your name");
				System.out.println("press 2 to enter/change your age");
				System.out.println("press 3 to enter/change your phone number");
				System.out.println("press 5 to enter/change your address");
				System.out.println("enter 6 for to see your details");
				break;
			case 5:
				System.out.println("enter address");
				Scanner sc3 = new Scanner(System.in);
				address = sc3.nextLine();
				System.out.println("you entered address is: " + address);

				System.out.println("press 1 to enter/change your name");
				System.out.println("press 2 to enter/change your age");
				System.out.println("press 3 to enter/change your phone number");
				System.out.println("press 4 to enter/change your email");
				System.out.println("enter 6 for to see your details");
				break;
			case 6:

				System.out.println("your details");
				System.out.println("=====================");
				System.out.println("you entered name is " + name);
				System.out.println("you entered age is: " + age);
				System.out.println("you entered mobile number is: " + num);
				System.out.println("you entered email is: " + email);
				System.out.println("you entered address is: " + address);
				System.out.println("Enter 7 for submit");
				System.out.println("==========================");
				System.out.println("press 1 to change your name");
				System.out.println("press 2 to change your age");
				System.out.println("press 3 to change your phone number");
				System.out.println("press 4 to change your email");
				System.out.println("press 5 to change your address");
				break;
			case 7:
				System.out.println(" Thank you --your details submitted successfully--1");
				break p;
			}
		}
	}
}