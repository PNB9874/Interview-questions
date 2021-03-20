package com.interview.questions;

public class Find_Even_Odd_Numbers {
	
	public static void main(String[] args) {
		
		  
		  //1 way to print even number 
			int num = 52;
			if (num % 2 == 0) {
				System.out.println("This is Even number: " + num);
			} else {
				System.out.println("This is Odd number: " + num);
			}
		   
		  		  
		  // way to print Odd number
		  
			int num2 = 45;
			if (num2 % 2 != 0)
				System.out.println(num2 + " is Odd");
			else
				System.out.println(num2 + " is Even");
		 
		
		
		System.out.println("*********************************************");
		//1 way
		
		int[] number = { 1, 22, 11, 33 };
		for (int i = 0; i < number.length; i++) {
			if (number[i] % 2 == 0) {
				System.out.println(number[i] + " is even number");
			} else {
				System.out.println(number[i] + " is ODD number");
			}
		}
		 
		System.out.println("____________________");
	
		// 2 way
		int[] no = { 2, 3, 4, 5, 6, 7, 8, 9 };
		for (int i = 0; i < no.length; i++) {
			if (no[i] % 2 != 0) {
				System.out.println(no[i] + "is ODD Number");
			} else {
				System.out.println(no[i] + " is Even number");
			}
		}

		
		
	}
}
