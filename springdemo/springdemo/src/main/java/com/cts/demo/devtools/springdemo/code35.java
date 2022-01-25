package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

/*Write a program to read a string array, concatenate the array elements one by on
e separated by comma and return the final string as output.*/
public class code35 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	String[]s=new String[n];
	for(int i=0;i< n;i++)
		s[i]=sc.next();
	System.out.println(concat(s));
		}
public static String concat(String s[]) {
	StringBuffer sbf=new StringBuffer();
	sbf.append(s[0]);
	for (int i=1;i<s.length;i++) {
		sbf.append(",");
		sbf.append(s[i]);
	}return sbf.toString();
}
}
