package com.cts.demo.devtools.springdemo;

import java.util.Scanner;
import java.util.StringTokenizer;

/*Write a program to read a string and count the number of words present in it.
Include a class UserMainCode with a static method countWord which accepts the st
ring. The return type is the integer giving out the count of words.*/

public class code41 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	System.out.println(count(s));
}
public static int count(String s) {
	StringTokenizer st=new StringTokenizer(s," ");
	int count=st.countTokens();
	return count;
}
}
