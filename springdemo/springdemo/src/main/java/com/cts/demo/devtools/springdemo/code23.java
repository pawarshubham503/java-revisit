package com.cts.demo.devtools.springdemo;
//Write a program to input a String and swap the every 2 characters in the string.
//If size is an odd number then keep the last letter as it is. Print the final sw
//apped string.

public class code23  {
public static void main(String[] args) {
	String s1="TRAINEWR";
	getValues(s1);
}
public static void getValues(String s1) throws IndexOutOfBoundsException {
	StringBuffer sb=new StringBuffer();
	int l=s1.length();
	if(l%2==0) {
		for(int i=0;i<=s1.length()-1;i=i+2) {
			char a=s1.charAt(i);
			char b=s1.charAt(i+1);
			sb.append(b).append(a);
		}System.out.println(sb);
	}else
	{
		for(int i=0;i<=s1.length()-1;i=i+2) {
			char a=s1.charAt(i);
			char b=s1.charAt(i+1);
			sb.append(b).append(a);	
	}
		sb.append(s1.charAt(l-1));
		System.out.println(sb);
	}
}
}
