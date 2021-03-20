package com.interview.questions;

public class RevNum {

	public static void revNumber_forloop() {
		int number = 123456;
		int revNumber = 0;

		for (; number != 0; number /= 10) {
			int digit = number % 10;
			revNumber = revNumber * 10 + digit;
		}
		System.out.println("Rev Using For Loop: " + revNumber);
		return;
	}

	public void rev_num_whileLoop() {
		long num1 = 987654321l;
		long rN = 0;
		while (num1 != 0) {
			rN = rN * 10 + num1 % 10;
			num1 = num1 / 10;
		}
		System.out.println("Using while loop: " + rN);
	}

	public void revN() {
		int n = 1202;
		int revnum = 0;
		while (n != 0) {
			revnum = revnum * 10 + n % 10;
			n = n / 10;
		}
		System.out.println("One more while loop: " + revnum);

	}

	public static void main(String[] args) {

		revNumber_forloop();

		RevNum obj = new RevNum();
		obj.rev_num_whileLoop();
		obj.revN();

		int sbnumber = 39916021;
		StringBuffer sb = new StringBuffer(String.valueOf(sbnumber)).reverse();
		System.out.println("Using String Buffer: " + sb);

	}
}
