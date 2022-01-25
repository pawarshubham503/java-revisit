package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

/*Write a program to read a string and return a new string which is made of every
alternate characters starting with the first character. For example NewYork will
 generate Nwok, and Samurai will generate Smri.
*/
public class code45 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(altString(s));
	}
	public static String altString(String s) {
		StringBuffer sbf=new StringBuffer();
		for(int i=0;i<s.length();i=i+2)
			sbf.append(s.charAt(i));
		return sbf.toString();
		
	}
}
