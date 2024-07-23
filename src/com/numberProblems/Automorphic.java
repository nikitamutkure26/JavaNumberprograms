package com.numberProblems;

public class Automorphic {

	public static void main(String[] args) {
		String s="abc";
		display (s,0,2);
		

	}
	
	static void display(String s,int start,int end)
	
	{
		if(start==end)
		{
			System.out.println(s);
			return;
		}
		for(int i=start;i<=end;i++)
		{
			String s1=swap(s,start,i);
			display(s1,start+1,end);
		}
	}
	
	static String swap(String s,int i,int j)
	{
		char[] c=s.toCharArray();
		char t=c[i];
		c[i]=c[j];
		c[j]=t;
		return new String(c);
	}

}
