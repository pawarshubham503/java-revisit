package com.cts.demo.devtools.springdemo;

public class code5 {
//code number 6
	public static void main(String[] args) {
		String s1="this";
		int n1=1;
		System.out.println(subString(s1,n1));
	}
	
	
	
	
	public static String subString(String s1,int n1) {
		int n=2*n1;
		String s= new String ();
		if(s1.length()>n) {
			s=s1.substring(0,n1)+s1.substring(s1.length()-n1,s1.length());
			return s;
		}else
			return null;
	}
}
