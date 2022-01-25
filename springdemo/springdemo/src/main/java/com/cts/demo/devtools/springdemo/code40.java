package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

/*Word Count
Given a string array (s) and non negative integer (n) and return the number of e
lements in the array which have same number of characters as the givent int N.
Include a class UserMainCode with a static method countWord which accepts the st
ring array and integer. The return type is the string formed based on rules.
Create a Class Main which would be used to accept the string and integer and cal
l the static method present in UserMainCode.*/

public class code40 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[]s= new String[n];
		for(int i=0;i<n;i++) {
			s[i]=sc.next();}
	    int n1=sc.nextInt();
		System.out.println(findop(s,n1));
		
	}
	public static int findop(String s[],int n1) {
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].length()==n1)
count++;
		}
		return count;
	}
}
