package com.interview.questions;

public class Palindrome {
	
	public static void m1(int num) {
		int rev =0, sum=0;
		int t;
		t=num;
		while(num>0) {
			rev = num % 10;
			sum = (sum*10)+rev;
			num = num / 10;			
		}
		if(t==sum) {
			System.out.println(" This is palindrome number");
		}else {
			System.out.println(" It is not a palindrome number");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public static void palindrome(int num) {
		int rev = 0;
		int sum=0;
		int t;
		t=num;
		while(num>0) {
			rev = num % 10;
			sum = (sum*10)+rev;
			num = num/10;
		}
		if(t==sum) {
			System.out.println("This is palindrome number");
		}else {
			System.out.println("this is not a palindrome number");
		}
			
		
		
		
	}
	public static void main(String[] args) {
		palindrome(151);
		palindrome(454);
		palindrome(565);

		palindrome(155);
		palindrome(154);
		
		
		m1(11);
		m1(21212);
		m1(989);
		
		m1(233);
        m1(020);
	
	}
	
	
	
	
	
	
	
	
	
	
	

}
