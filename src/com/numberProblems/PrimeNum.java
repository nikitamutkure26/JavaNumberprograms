package com.numberProblems;

public class PrimeNum {

	public static void main(String[] args) {
		int num=10;
		int count=0;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				count++;
			}}
			if(count==0) {
				System.out.println("prime num");
			}
			else {
				System.out.println("not");
			}
			
		

	}

}
