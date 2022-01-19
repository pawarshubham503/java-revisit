package com.cts.demo.devtools.springdemo;

import java.util.StringTokenizer;

/*Write a program to read a string and find the length of the largest chunk in the
string. If there are no chunk print No chunks else print the length.*/
public class code25 {

	public static void main(String[] args) {
		String s1="You are toooo good";
		System.out.println(maxChunk(s1));
	}
	public static int maxChunk(String s1) {
		int max=0;
		StringTokenizer t=new StringTokenizer(s1,"");
		while(t.hasMoreTokens()) {
			String s2=t.nextToken();
			int n=0;
			for(int i=0;i<s2.length()-1;i++) {
				if(s2.charAt(i)==s2.charAt(i+1))
					n++;
				if(n>max)
					max=n;
				
			}
		}
		return (max+1);
	}
}
