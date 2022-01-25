package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

/*Write a program to read a string and also a number N. Form a new string made up
of n repetitions of the last n characters of the String. You may assume that n i
s between 1 and the length of the string.*/

public class code43 {
public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		int n=sc.nextInt();
		System.out.println(returnLastRepeatedCharacters (s1,n));
		
		}
	
		public static String returnLastRepeatedCharacters (String s1,int n)
		{
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<n;i++)
		sb.append(s1.substring(s1.length()-n));
		 return sb.toString();
		}


}
