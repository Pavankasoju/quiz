package com.capgemini.assignments.day2;

public class Long {
	
	public static void main(String[] args) {
		
		long[] numbers= {75,85,65,95,12,75};
		printdetails(numbers);
		long[] num=getdetails();
		printdetails(num);
		
	}
		
		public static void printdetails(long[] numbers)  {
			for(int i=0;i<numbers.length;i++)
			{
				System.out.print(numbers[i]+" ");
			}}
			
			    static long[] getdetails()
			{
				long[] values= {85,69,75,48,25,36};
				return values;
			}
		 
	}


