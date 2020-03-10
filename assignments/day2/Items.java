package com.capgemini.assignments.day2;

public class Items {

	public static void main(String[] args) {
		
		String[] s= {"jug","mug","bug","lag"};
		printdetails(s);
		String[] w=getdetails();
		printdetails(w);
		
		}
	
	static void printdetails(String[] s) {
		for(int i=0;i<4;i++)
		{
			System.out.print(s[i]+" ");
		}
		System.out.println();
	}
		
		static String[] getdetails() {
			
		String[] q= {"sdfd","erere","sdsds","yuuyuu"};
		return q;
			
		}
	}

