package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code49 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	boolean b=validatePan(s);
	if(b==true)
	System.out.println("valid");
	else
		System.out.println("invalid");
		
}
public static boolean validatePan(String s) {
	boolean h=false;
	if(s.length()==8) {
		if(s.matches("[A-Z]{3}[0-9]{4}[A-Z]{1}"))
			h=true;
			else h=false;
	}return h;
}
}
