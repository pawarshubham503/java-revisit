package com.cts.demo.devtools.springdemo;

import java.util.HashSet;

public class code65 {
// code to check longest substring
	
	public static void main(String[] args) {

		String str="a,b,c,d,a,b";
		System.out.println(Longest(str)); 
	}

private static String Longest(String str) {
	// TODO Auto-generated method stub
	HashSet<Character> set= new HashSet<>();
	String longestOverall="";
	String longestTillNow="";
	
	for (int i=0;i<str.length();i++)
	{
		char c=str.charAt(i);
		if (set.contains(c))
		{
			longestTillNow="";
			set.clear();
		}
		set.add(c);
		longestTillNow+=c;
		if(longestTillNow.length()>longestOverall.length()) {
			longestOverall=longestTillNow;
		}
	}
	return longestOverall;
	
	
	
}
}
