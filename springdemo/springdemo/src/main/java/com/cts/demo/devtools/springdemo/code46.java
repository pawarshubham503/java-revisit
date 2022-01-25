package com.cts.demo.devtools.springdemo;

/*Write a program to read a valid email id and extract the username.
Note - user name is the string appearing before @ symbol.
*/
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
