package com.capgemini.assignments.day2;

public class Double {
	public static void main(String[] args) {
		double[] numbers= {10.2,20.2,35.3,44.5};
		printarrayDetails(numbers);
		double[]num=GetArrayData();
		printarrayDetails(num);
		
		
	}
	static void printarrayDetails(double[] a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	static double[] GetArrayData() {
		double[] values= {22.0,66.2,33.6};
		return values;
	}
	
	
		
	}


