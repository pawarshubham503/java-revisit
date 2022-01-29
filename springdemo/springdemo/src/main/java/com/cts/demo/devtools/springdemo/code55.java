package com.cts.demo.devtools.springdemo;

import java.util.Scanner;
import java.util.StringTokenizer;

/*Simple String Manipulation - II
Write a program to read a string and return an integer based on the following ru
les.
If the first word and the last word in the String match, then return the number
of characters in the word else return sum of the characters in both words. Assum
e the Strings to be case - sensitive.*/

public class code55 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(calculateWordSum(s));
	}
	public static int calculateWordSum(String s) {
		int sum=0,i=0;
		StringTokenizer st=new StringTokenizer(s);
		String[]s1=new String [st.countTokens()];
		while(st.hasMoreTokens())
		{
			s1[i]=st.nextToken();
			i++;
		}
		if(s1[0].equals(s1[s1.length-1]))
		sum=s1[0].length();
		else
			sum=s1[0].length()+s1[s1.length-1].length();
		return sum;
	}
}
