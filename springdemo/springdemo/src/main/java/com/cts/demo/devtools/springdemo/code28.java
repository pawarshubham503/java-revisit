package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

/*Unique Number
Write a program that accepts an Integer as input and finds whether the number is
 Unique or not. Print Unique if the number is Unique , else print Not Unique .
*/
public class code28 {
	public static void main(String[]args)
	{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int []a=new int[100];
	int i=0,count=0;
	while(n!=0)
	{
	int num=n%10;
	a[i]=num;
	i++;
	n=n/10;
	}
	for(int j=0;j<i-1;j++)
	{
	for(int k=j+1;k<=i-1;k++)
	{
	if(a[j]==a[k]){
	count++;
	}
	}}
	if(count>0)
	{
	System.out.println("Invalid");
	}
	else
	{
	System.out.println("valid");
	}
	}
}
