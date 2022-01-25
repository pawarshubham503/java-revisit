package com.cts.demo.devtools.springdemo;

import java.util.Scanner;
import java.util.StringTokenizer;

public class code46 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	System.out.println("user name is:"+user(s));
}
public static String user(String s) {

	StringTokenizer st=new StringTokenizer(s,"@");
	String name=st.nextToken();
	return name;
}
}
