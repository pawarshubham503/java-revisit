package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

public class code13 {

	public static boolean colorCode(String s) {
		boolean f=false;
		if(s.matches("[#]{1}[A-F0-9]{6}")) {
			f=true;
		}else
			f=false;
		return f;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);String n=sc.next();
		boolean s=colorCode(n);
		if(s==true){
			System.out.println("valid");
			
		}else
			System.out.println("invalid");
	}
}
