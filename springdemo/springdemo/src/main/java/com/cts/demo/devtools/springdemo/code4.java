package com.cts.demo.devtools.springdemo;

import java.util.StringTokenizer;

public class code4 {

	public static int checkForFirstAndLastChar(String input) {
		StringTokenizer t=new StringTokenizer(input,"");
		String s=t.nextToken();
		String s1="";
		while(t.hasMoreTokens()) {
			s1=t.nextToken();
			
		}
		if(s.charAt(0)==s1.charAt(s1.length()-1))
		return 1;
		else return 0;
	}
	public static void main(String[] args) {
		String input="grades";
		System.out.println(checkForFirstAndLastChar(input));
	}
}
