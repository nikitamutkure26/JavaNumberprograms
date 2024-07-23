package com.numberProblems;

public class NeivenNum {

	public static void main(String[] args) {
		int num=77;
		int temp=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(temp%sum==0) {
			System.out.println("neiven");
		}
		else {
			System.out.println("not");
		}
	}

}
