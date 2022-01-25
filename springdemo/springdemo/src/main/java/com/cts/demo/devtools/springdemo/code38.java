package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

/*Write a program to read a integer array and return true if one of the first 4 el
ements in the array is 9 else return false.
Note: The array length may be less than 4.
*/
public class code38 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] s=new int[n];
		for (int i=0;i<n;i++)
			s[i]=sc.nextInt();
		boolean b=scanArray(s);
		System.out.println(b);
	}
	public static boolean scanArray(int s[]) {
		boolean b=false;
		if(s.length>4)
		{
		for(int i=0;i<4;i++)
		{
			if (s[i]==9)
				b=true;
			else
				b=false;
		}
		}else
		{
			for(int i=0;i<s.length;i++)
			{
				if (s[i]==9)
					b=true;
				else
					b=false;
			}
		}return b;
	}
}
