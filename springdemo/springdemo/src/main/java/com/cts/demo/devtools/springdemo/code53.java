package com.cts.demo.devtools.springdemo;

import java.util.Scanner;
import java.util.StringTokenizer;

/*Max Substring
Write a program to accept two string inputs. The first being a source string and
 second one a delimiter. The source string contains the delimiter at various loc
ations. Your job is to return the substring with maximum number of characters. I
f two or more substrings have maximim number of characters return the substring
which appears first. The size of the delimiter is 1.*/
public class code53 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(extractMax(s1, s2));
	}
	public static String extractMax(String s1,String s2) {
		StringTokenizer st=new StringTokenizer(s1,s2);
		int max=0,c=0;
		String str=null;
		while(st.hasMoreTokens())
		{
			String s=st.nextToken();
			c=s.length();
			if(max<c)
			{
				max=c;
				str=s;
			}
		}return str;
		
		
	}
}
