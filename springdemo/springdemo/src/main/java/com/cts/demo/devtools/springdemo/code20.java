package com.cts.demo.devtools.springdemo;

import java.util.StringTokenizer;

//34 code to check file extension
public class code20 {

	
	public static void main(String[] args) {
		String s1="sun.gif";
		System.out.println(checkExtension(s1));
	}
	public static String checkExtension(String s1) {
		StringTokenizer t= new StringTokenizer(s1,".");
		t.nextToken();
		String s2=t.nextToken();
		return s2;
	}
}
