package com.numberProblems;

public class StrongNum {

	public static void main(String[] args) {
		int num=185;
		int temp=num;
		int sum=0;
		while(num>0) {
			int rem=num%10;//5
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
			
		}
		if(sum==temp) {
			System.out.println("strong");
		}
		else {
			System.out.println("not");
		}

	}

}
