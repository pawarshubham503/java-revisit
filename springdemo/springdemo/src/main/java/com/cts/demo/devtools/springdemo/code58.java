package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

/*Sum Non Prime Numbers
Write a program to calculate the sum of all the non prime positive numbers less
than or equal to the given number.*/
public class code58 {

	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(addNumbers(n));
	}
	public static int addNumbers(int n) {
		int c=0,sum=0;
		for (int i=1;i<=n;i++)
		{
			c=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)//modulus
					c++;
			}
			if(c==2);
			else
				sum=sum+i;
		}return sum;
	}
}
