package com.cts.demo.devtools.springdemo;

import java.util.ArrayList;
import java.util.Scanner;

/*Max Admissions
Write a program that reads details about number of admissions per year of a part
icular college, return the year which had maximum admissions. The details are st
ored in an arraylist with the first index being year and next being admissions c
ount.*/

public class code57 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();
		for (int i=0;i<n*2;i++)
			a.add(sc.nextInt());
		System.out.println(getYear(a));
	}
	
	public  static int getYear(ArrayList<Integer>a) {
		int year=0;
		int max=0;
		for(int i=1;i<a.size();i=i+2)
		{
			int x=a.get(i);
			if(x>max)
			{
				max=x;
				year=a.get(i-1);
			}
		}return year;
	}
}
