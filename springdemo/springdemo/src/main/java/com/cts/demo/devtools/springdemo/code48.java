package com.cts.demo.devtools.springdemo;

import java.util.Scanner;

//palindrome
public class code48 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(addPalindromes(a,b));
		}
		

		public static int addPalindromes(int a, int b){
		int temp=0,sum=0,r,sum1=0;
		for(int i=a;i<=b;i++)
		{
		 temp=i;
		 sum=0;
		 while(temp>0){
		 r=temp%10;
		sum=sum*10+r;
		 temp=temp/10;
		 }
		 if(i==sum)
		 sum1=sum1+i;
		 }
		return sum1;
		}
		
}

