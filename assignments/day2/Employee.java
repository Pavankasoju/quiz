package com.capgemini.assignments.day2;

public class Employee {
	
	public static void main(String[] args) {
	
	Student[] sq=new Student[4];
	Student s1=new Student("chandu",22,97.89);
	Student s2=new Student("farhan",72,96.89);
	Student s3=new Student("juter",56,99.69);
	Student s4=new Student("chandu",22,55.89);
	sq[0]=s1;
	sq[1]=s2;
	sq[2]=s3;
	sq[3]=s4;
	printdetails(sq);
	Student[] se =getdetails();
	printdetails(se);
	

}
	
	static void printdetails(Student[] s) {
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println("name is"+s[i].name);
			System.out.println("id is"+s[i].id);
			System.out.println("percentage is"+s[i].percentage);
		}
	}
	
	static Student[] getdetails()
	{
		Student[] sw=new Student[4];
		Student s1=new Student("chandu",22,97.89);
		Student s2=new Student("farhan",72,96.89);
		Student s3=new Student("juter",56,99.69);
		Student s4=new Student("chandu",22,55.89);
		sw[0]=s1;
		sw[1]=s2;
		sw[2]=s3;
		sw[3]=s4;
		return sw;
	}
}
