package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code44 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	boolean b=verify(s);
	System.out.println(b);
}
public static boolean verify (String s) {
	boolean j=false;
	if(!Character.isDigit(s.charAt(0)))
		j=true;
	else
		j=false;
	return j;
	
}
}
