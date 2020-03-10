package com.capgemini.assignments.day2;
	
	public class ObjectClass {

		public static void main(String[] args) {
			
			Object[] o= {"df",56,"sfs",6,23.56,"58"};
			printdetails(o);
			Object[] w=getdetails();
			printdetails(w);
			
			}
		
		static void printdetails(Object[] s) {
			for(int i=0;i<4;i++)
			{
				System.out.print(s[i]+" ");
			}
			System.out.println();
		}
			
			static Object[] getdetails() {
				
			Object[] q= {54,89,53.66,34.26,74.55};
			return q;
				
			}
		}

