package com.numberProblems;

public class AutoMNum {

	public static void main(String[] args) {
		int num=29;
		int count =0;
		int temp=num;
		int sqrt=num*num;
		
		while(num>0) {
			count++;//2
			num=num/10;
		}
		int pow=1;
		for(int i=1;i<=count;i++) {
			pow=pow*10;//100
		}
		int res=sqrt%pow;//25
		if(res==temp) {
			System.out.println("Automorphic");
		}
		else {
			System.out.println("not");
		}
	}

}
