package com.cts.demo.devtools.springdemo;

import java.util.Arrays;
import java.util.Scanner;

/*Write a Program that accepts three integers, and returns the sum of maximum and
minimum numbers.*/

public class code42 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
	System.out.println(calculate(a,b,c));
}
public static int calculate(int a,int b,int c) {
	int sum=0;
	int[] d= {a,b,c};
	Arrays.sort(d);
	sum=d[0]+d[2];
	return sum;
}
}
