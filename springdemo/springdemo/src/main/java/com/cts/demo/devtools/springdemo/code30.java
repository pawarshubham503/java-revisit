package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

/*Code Validation Color
Give a String as colour code as input and write code to validate whether the giv
en string is a valid color code or not.
Validation Rule:
String should start with the Character '#'.
Length of String is 7.
It should contain 6 Characters after '#' Symbol.
It should contain Characters between 'A-F' and Digits '0-9'.
If String acceptable the return true otherwise false.*/

public class code30 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String n=sc.next();
	boolean s=colorcode(n);
	if(s==true) {
		System.out.println("valid");
	}	else
			System.out.println("invalid");
	
}

public static boolean colorcode(String s) {
	boolean f=false;
	if(s.matches("[#]{1}[A-F0-9]{6}")) {
		f=true;
	}
	else
		f=false;
	return f;
	
}
}
