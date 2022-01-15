package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code2 {
public static int panNumberValidation(String input) {
	int b=0;
	if(input.matches("[0-9]{3}[-]{1}[0-9]{3}[-]{1}[0-9]{4}"))
	{
		b=1;
	}else
		b=0;
	return b;
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String pan=s.next();
	int b=panNumberValidation(pan);
	if(b==1)
		System.out.println("valid");
	else
		System.out.println("invalid");
}
}
