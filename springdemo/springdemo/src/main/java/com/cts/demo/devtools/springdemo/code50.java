package com.cts.demo.devtools.springdemo;

import java.util.Scanner;
import java.util.StringTokenizer;

/*Reverse Split
Write a program to read a string and a character, and reverse the string and con
vert it in a format such that each character is separated by the given character
. Print the final string.*/
public class code50 {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(reverseSplit(s1, s2));
	}
	
	public static String reverseSplit(String s1,String s2) {
		StringTokenizer st=new StringTokenizer(s1,s2);
		StringBuffer sb=new StringBuffer();
		String s=s1.substring(s1.length()-1);
		sb.append(s);
		for(int i=s1.length()-2;i>=0;i--)
		{
			sb.append(s2);
			sb.append(s1.charAt(i));
		}return sb.toString();
	}
}
