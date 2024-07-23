package com.numberProblems;

public class SmallestNum {

	public static void main(String[] args) {
		int num=98625;
		int small=9;
		while(num>0) {
			int rem=num%10;//5
			if(small>rem) {
				small=rem;//small=5
				
			
		    }
			num=num/10;//9862
		}
		System.out.println("smallest num ="+ small);
		


	}

}
