package com.numberProblems;

public class Xylem {

	public static void main(String[] args) {
		int num=75312;
		int sum=0;
		int first=num%10;//2
		num=num/10;//7531
		while(num>9) {
			 int rem=num%10;//1	
			 sum=sum+rem;
			 num=num/10;
			 }
		int res=first+num;
		if(res==sum) {
			System.out.println("xxylem");
		}
		else {
			System.out.println("phloem");
		
		}
	}

}
