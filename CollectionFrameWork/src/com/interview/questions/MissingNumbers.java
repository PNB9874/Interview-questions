package com.interview.questions;

public class MissingNumbers {

	public static void main(String[] args) {
	int [] num = {1,2,3,4,5,6,8};
	  int sum =0;
	  for(int i = 0;i<num.length;i++) {
		  sum = sum + num[i];
	  }
	 int sum1 = 0;
	 for(int j=1;j<=8;j++) {
		 sum1 = sum1 + j;
	 }
	 System.out.println(sum1-sum);	
	 
	 
	 
	 
	 
	 int mum =12345;
	 int rev=0;
	 while(mum!=0) {
		 rev =rev*10 + mum %10;
		 mum = mum/10;		 
	 }
	 System.out.println(rev);
	 int no =654321;
	 
	 StringBuffer sb  = new StringBuffer(String.valueOf(no)).reverse();
	 System.out.println("sb-->"+sb);
	 
	 
	 
	 int nos[] = {1,2,3,4,6,7};
	 int nSum = 0;
	 for(int i = 0;i<nos.length;i++) {
		 nSum =nSum+nos[i];
	 }
	 int nSum2 =0;
	 for(int j=1;j<=7;j++) {
		 nSum2 =nSum2 + j; 
	 }
	System.out.println(nSum2-nSum);
	}

}
