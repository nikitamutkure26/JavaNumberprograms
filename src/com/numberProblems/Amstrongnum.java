package com.numberProblems;

public class Amstrongnum {

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int sum=0;
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
			
		}
		 num=temp;
		while(num>0) {
			int rem=num%10;//5
			int pow=1;
			for(int i=1;i<=count;i++) {
				pow=pow*rem;//5*5*5
			}
			sum=sum+pow;
			num=num/10;
		}
		if(temp==sum) {
			System.out.println("amstrong");
		}
		else {
			System.out.println("not amstrong");
		}
		
		
	}

}
