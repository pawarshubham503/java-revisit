package com.cts.demo.devtools.springdemo;
/*Write a program to read a string and return a new string where the first and las
t chars have been interchanged.*/


public class code33 {
public static void main(String[] args) {
	String s1="HelloWorld";
	StringBuffer sb=new StringBuffer();
	char ch=s1.charAt(0);
	String s2=s1.substring(1, s1.length()-1);
	char ch1=s1.charAt(s1.length()-1);
	sb.append(ch1).append(s2).append(ch);
	System.out.println(sb);
}
	
}
