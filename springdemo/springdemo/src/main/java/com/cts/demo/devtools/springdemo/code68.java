package com.cts.demo.devtools.springdemo;

public class code68 {
//reverse string
	
	public static void main(String[] args) {
		String str="rio";
		System.out.println(reverse(str));
	}

public static String reverse(String str) {
	// TODO Auto-generated method stub
	
	if(str == null)
		throw new IllegalArgumentException("null is not valid input");
	StringBuilder out =new StringBuilder();
	char[] chars =str.toCharArray();
	for (int i=chars.length -1;i>=0; i--)
		out.append(chars[i]);
		
	return out.toString();
}
}
