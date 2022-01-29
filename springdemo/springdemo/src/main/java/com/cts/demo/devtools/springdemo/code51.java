package com.cts.demo.devtools.springdemo;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.ArrayList;

/*Last Letters
Write a program to read a sentence as a string and store only the last letter of
each word of the sentence in capital letters separated by $. Print the final st
ring.*/

public class code51 {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	System.out.println(lastletter(s));
}
 public static String lastletter(String s) {
	 StringTokenizer st=new StringTokenizer(s," ");
	 String s2=st.nextToken();
	 StringBuffer sb=new StringBuffer();
	 String s3=Character.toUpperCase(s2.charAt(s2.length()-1))+"";
	 while(st.hasMoreTokens())
	 {
		 s2=st.nextToken();
		 s3=s3+"$"+Character.toUpperCase(s2.charAt(s2.length()-1));
	 }return s3;
 }
}
