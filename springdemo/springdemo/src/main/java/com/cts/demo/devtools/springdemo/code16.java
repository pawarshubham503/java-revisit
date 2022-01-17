package com.cts.demo.devtools.springdemo;

import java.util.StringTokenizer;

//a program to get two string inputs and validate the ID as per the specified format.
public class code16 {

	public static void main(String[] args) {
		String s1="CTS-hyd-1234";
		String s2="hyderabad";
		boolean b=formatCheck(s1,s2);
		if(b==true)
			System.out.println("String format valid");
		else
			System.out.println("invalid format");
	}

	private static boolean formatCheck(String s1, String s2) {
		String s3=s2.substring(0,3);
		boolean b=false;
		StringTokenizer t=new StringTokenizer(s1,"-");
		String s4=t.nextToken();
		String s5=t.nextToken();
		String s6=t.nextToken();
		if(s4.equals("CTS") && s5.equals(s3) && s6.matches("[0-9]{4}"))
			b=true;
		else
			b=false;
		return b;
		
	}
}
