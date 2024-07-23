package com.numberProblems;

public class Fibo {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		
		for(int i=1;i<=10;i++) {
			System.out.println(a);//0
			int c=a+b;
			a=b;//1
			b=c;//1
		}
	}

}
