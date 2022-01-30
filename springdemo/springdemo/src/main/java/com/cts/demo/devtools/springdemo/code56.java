package com.cts.demo.devtools.springdemo;

import java.util.ArrayList;
import java.util.Scanner;

/*Vowels, Arrays & ArrayLists
Write a program to read an array of strings and return an arraylist which consis
ts of words whose both first and last characters are vowels. Assume all inputs a
re in lowecase.*/
public class code56 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s[]=new String [n];
		for (int i=0;i<n;i++)
			s[i]=sc.next();
		System.out.println(matchCatcher(s));
	}
	public static ArrayList<String> matchCatcher(String[]s){
		ArrayList<String>a=new ArrayList<String>();
		for(int i=0;i<s.length;i++)
		{
		System.out.println(s[i].charAt(0));
		System.out.println(s[i].charAt(s[i].length()-1));
		
		if(s[i].charAt(0)=='a'|| s[i].charAt(0)=='e'
				|| s[i].charAt(0)=='i'
				|| s[i].charAt(0)=='o'
				|| s[i].charAt(0)=='u'
				&&
				s[i].charAt(s[i].length()-1)=='a'
				||s[i].charAt(s[i].length()-1)=='e'
				||s[i].charAt(s[i].length()-1)=='i'
				||s[i].charAt(s[i].length()-1)=='o'
				||s[i].charAt(s[i].length()-1)=='u')
		{
			a.add(s[i]);
		}
		
		}
		return a;
	}
}
